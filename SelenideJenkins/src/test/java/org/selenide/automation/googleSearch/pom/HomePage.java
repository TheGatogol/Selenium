package org.selenide.automation.googleSearch.pom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
   public static final SelenideElement inputSearch = $(By.name("q"));

   public static void search(String searchValue){
      inputSearch.shouldBe(Condition.enabled, Duration.ofSeconds(10));
      inputSearch.setValue(searchValue);
   }
}


