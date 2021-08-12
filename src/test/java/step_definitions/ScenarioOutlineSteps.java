package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineSteps {

    @Given("^Я как пользоватль должен зайти на \"([^\"]*)\"$")
    public void я_как_пользоватль_должен_зайти_на(String facebook)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я зашел на сайт Facebook");
    }
    @Given("^В поле email вводим \"([^\"]*)\"$")
    public void в_поле_email_вводим(String emails)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("В поле email я ввел "+emails);
    }
    @When("^в поле пароль вводим \"([^\"]*)\"$")
    public void вПолеПарольВводим(String passwords)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("В поле passwords ввожу"+passwords);
    }



    @Then("^Я должен нажать на кнопку войти в систему$")
    public void я_должен_нажать_на_кнопку_войти_в_систему()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я нажал на кнопку");
    }

    @Then("^Система должна вывести ошибку \"([^\"]*)\"$")
    public void система_должна_вывести_ошибку(String errorMessage)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Вы ввели не правильные данные");
    }

    @Given("^Я как пользователь должен зайти на сайт AliExpress\\.com$")
    public void я_как_пользователь_должен_зайти_на_сайт_AliExpress_com()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я зашел на сайт");
    }

    @Given("^В поле поиска должен найти свой товар$")
    public void в_поле_поиска_должен_найти_свой_товар()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я нашел свой товар");
    }

    @When("^Товар стоит \"([^\"]*)\"$")
    public void товарСтоит(String Price) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Товар стоит"+Price);
    }

    @And("^Я имею \"([^\"]*)\" денег$")
    public void яИмеюДенег(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Я имею "+arg0);
    }
    @Then("^Я должен нажать на кнопку \"([^\"]*)\"$")
    public void я_должен_нажать_на_кнопку(String buy)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я нажал на кнопку"+buy);
    }

    @Then("^Система должна снять столько \"([^\"]*)\"$")
    public void системаДолжнаСнятьСтолько(String arg0)  {
        // Write code here thaPt turns the phrase above into concrete actions
        System.out.println("система сняла "+arg0);
    }
    @Given("^Я как пользователь должен зайти на сайт Fixprice\\.com$")
    public void я_как_пользователь_должен_зайти_на_сайт_Fixprice_com()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("зошел на сайт");

    }

    @Given("^В поле поиска ввести товар$")
    public void в_поле_поиска_ввести_товар()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("ввел товар в поиск");

    }

    @When("^Цена товара (\\d+.\\d)$")
    public void цена_товара(double Price)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" цена товара "+Price);
    }

    @When("^У меня (\\d+.\\d)$")
    public void у_меня(double arg1)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("у меня "+ arg1);

    }

    @Then("^Я должен нажать на кнопку купить$")
    public void я_должен_нажать_на_кнопку_купить()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("  я нажал на кнопку купить");

    }

    @Then("^Система снимет  \"([^\"]*)\"$")
    public void система_снимет(String STRINGPrice) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("система сняла "+STRINGPrice);

    }



}
