package step_definitions.Lexus;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LexusSteps {

    @Given("^Я зашел на сайт \"([^\"]*)\"$")
    public void я_зашел_на_сайт(String LexusWebsite)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я зашел на сайт"+LexusWebsite);
    }

    @Given("^Я должен пролистать вниз и должен увидеть \"([^\"]*)\"$")
    public void я_должен_пролистать_вниз_и_должен_увидеть(String expectedText)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я пролистал вниз и увидел"+expectedText);
    }

    @Given("^Я должен выбрать \"([^\"]*)\"$")
    public void я_должен_выбрать(String LxModel)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я выбрал модель"+LxModel);
    }

    @Given("^Я жлджен увидеть последнюю модель \"([^\"]*)\"$")
    public void я_жлджен_увидеть_последнюю_модель(String LastModel)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я увидел последнюю модель"+LastModel);
    }

    @Given("^Цена должна начинаться от (\\d+) долларов$")
    public void цена_должна_начинаться_от_долларов(int startingPrice)  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Цена начинается с"+startingPrice);
    }

    @When("^Когда я нажал на кнопку build$")
    public void когда_я_нажал_на_кнопку_build()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Сайт должен запросить у меня zipCode$")
    public void сайт_должен_запросить_у_меня_zipCode()  {


    }

    @When("^Я должен ввести zipcode (\\d+)$")
    public void я_должен_ввести_zipcode(int code)  {

    }

    @When("^Я должен выбрать модель \"([^\"]*)\"$")
    public void я_должен_выбрать_модель(String name)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Во вкладке \"([^\"]*)\" я должен выбрать \"([^\"]*)\"$")
    public void во_вкладке_я_должен_выбрать(String color, String LxColor)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Цена \"([^\"]*)\" должна поменяться с (\\d+) на (\\d+)$")
    public void цена_должна_поменяться_с_на(String Lx579, int price, int newPrice)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Я должен нажать на кнопку Summery$")
    public void я_должен_нажать_на_кнопку_Summery ()  {

    }

    @When("^Я должен увидеть \"([^\"]*)\"такой текст$")
    public void я_должен_увидеть_такой_текст(String expectedText)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Сайт выдал анкету для заполнения$")
    public void сайт_выдал_анкету_для_заполнения()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^В поле First name я должен ввести \"([^\"]*)\"$")
    public void в_поле_First_name_я_должен_ввести(String name)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^В поле Last name я должен ввести \"([^\"]*)\"$")
    public void в_поле_Last_name_я_должен_ввести(String lastName)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^В поле email я должен ввести \"([^\"]*)\"$")
    public void в_поле_email_я_должен_ввести(String email)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^В поле Phone number должен ввести (\\d+)$")
    public void в_поле_Phone_number_должен_ввести(int name)  {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @And("^Я должен нажать на кнопку Send to dealer$")
    public void яДолженНажатьНаКнопкуSendToDealer() {
    }

    @Then("^Я должен нажать кнопку Submit$")
    public void яДолженНажатьКнопкуSubmit() {
    }


    @Then("^Я должен увидеть \"([^\"]*)\" текст$")
    public void яДолженУвидетьТекст(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
}
