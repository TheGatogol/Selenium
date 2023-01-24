package org.selenide.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/org/selenide"},
        plugin = {"json:reports/cucumber_report.json"},
        glue = {"org.selenide"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@selenide or @cypress or @selenium"
)
public class Testrunner {
    @AfterClass
    public static void finish(){

        try {
            System.out.println("Generando reporte");

            //Configuración de Windows
            String[] cmd = {"cmd.exe", "/c", "npm run reports"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("¡Reporte generado satisfactoriamente!");

            //Configuración de MAC
            //Runtime.getRuntime().exec("npm run report");

            //System.out.println("¡Reporte generado satisfactoriamente!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
