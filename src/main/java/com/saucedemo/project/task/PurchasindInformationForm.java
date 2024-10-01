package com.saucedemo.project.task;

import com.saucedemo.project.models.PurchasingDataInformationFormDTO;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

import static com.saucedemo.project.ui.PurchasindInformationFormUI.*;

@AllArgsConstructor
@Slf4j
public class PurchasindInformationForm implements Task {

    private String pathFile;
    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            PurchasingDataInformationFormDTO dataInformationFormDTO = objectMapper.readValue
                    (data(pathFile), PurchasingDataInformationFormDTO.class);

            String firstNames = dataInformationFormDTO.getFirstName();
            String lastNames = dataInformationFormDTO.getLastName();
            String zipPostal = String.valueOf(dataInformationFormDTO.getPostalCode());

            actor.attemptsTo(
                    Enter.theValue(firstNames).into(INPUT_NAMES),
                    Enter.theValue(lastNames).into(INPUT_LAST_NAME),
                    Enter.theValue(zipPostal).into(INPUT_CODE_POSTAL),
                    Click.on(BTN_CONTINUE)
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PurchasindInformationForm withParams(String pathFile) {
        return Tasks.instrumented(PurchasindInformationForm.class, pathFile);
    }

    public static String data(String pathFile) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File fileTemplate = new File(pathFile);
        JsonNode jsonNode = objectMapper.readTree(fileTemplate);

        String name = String.valueOf(faker.name().firstName());
        String lastName = faker.name().lastName();
        String codePostal = faker.address().zipCode();

        String jsonModified = jsonNode.toString()
                .replace("${firstNames}", name)
                .replace("${lastNames}", lastName)
                .replace("${postalCode}", codePostal);

        log.info(jsonModified);

        return jsonModified;
    }
}