package StepDefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver;

    @Dado("acessar a pagina do site")
    public void acessar_a_pagina_do_site() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://site.getnet.com.br/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Quando("navegar pelo site")
    public void navegar_pelo_site() {
        driver.findElement(By.id("u-depth1__item-15214")).click();
        driver.findElement(By.id("u-depth3__item-15218")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/a[5]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Entao("validar que o modal foi mostrado corretamente")
    public void validar_que_o_modal_foi_mostrado_corretamente() {
        WebElement resultsearch = driver.findElement(By.xpath("/html/body/div[2]/div/section/div[2]/a[1]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Modal verificado com sucesso");
        driver.close();
    }
}


