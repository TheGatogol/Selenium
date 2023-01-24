package org.selenide.automation.googleSearch.steps;

import io.cucumber.java.en.Given;
import org.selenide.automation.googleSearch.pom.HomePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public class HomePageSteps {
    @Given("Ingresamos a Google")
    public void ingresamosAGoogle() {
        open("https://google.com");
    }
    @Given("Hacemos la busqueda")
    public void hacemosLaBusqueda(List<List<String>> login) {
        HomePage.search(login.get(0).get(0));
    }
}
