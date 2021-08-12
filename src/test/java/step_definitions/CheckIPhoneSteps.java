package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckIPhoneSteps {
    @Given("^Я как пользователь должен открыть сайт Facebook\\.com$")
    public void я_как_пользователь_должен_открыть_сайт_Facebook_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я открыл сайт Facebook_com");

    }

    @Given("^Пользователь должен ввести в поле email свой email address$")
    public void пользователь_должен_ввести_в_поле_email_свой_email_address() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Я ввел свой email");

    }

    @Given("^Пользователь должен ввести в поле Пароль свой пароль$")
    public void пользователь_должен_ввести_в_поле_Пароль_свой_пароль() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Password");

    }

    @When("^Пользователь нажмет на кнопку Логин$")
    public void пользователь_нажмет_на_кнопку_Логин() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login");

    }

    @Then("^Пользователь должен благополучно войти в систему$")
    public void пользователь_должен_благополучно_войти_в_систему() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Пользователь должен ввести некоректный пароль$")
    public void пользователь_должен_ввести_некоректный_пароль() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я ввел свой пароль");

    }

    @Given("^Пользователь долежн ввести корректный email$")
    public void пользователь_долежн_ввести_корректный_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


    }

    @When("^Пользователь нажмет на кнопку Войти$")
    public void пользователь_нажмет_на_кнопку_Войти() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^Пользователь не должен авторизироваться в системе$")
    public void пользователь_не_должен_авторизироваться_в_системе() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Пользователь должен ввести некоректный email$")
    public void пользователь_должен_ввести_некоректный_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Пользователь долежн ввести корректный пароль$")
    public void пользователь_долежн_ввести_корректный_пароль() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Пользователь должен оставить строку email$")
    public void пользователь_должен_оставить_строку_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("^Пользователь долежн оставить строку пароль$")
    public void пользователь_долежн_оставить_строку_пароль() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Пользователь должен ввести корректный email$")
    public void пользователь_должен_ввести_корректный_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Пользователь долежн ввести корректныйпароль$")
    public void пользователь_долежн_ввести_корректныйпароль() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Пользователь должен ввести коректным email$")
    public void пользователь_должен_ввести_коректным_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^Пользователь долежн ввести некорректный пароль$")
    public void пользователь_долежн_ввести_некорректный_пароль() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("^Я должен зайти на сайт Svetofor\\.kg$")
    public void я_должен_зайти_на_сайт_Svetofor_kg() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я зашел на сайт Svetofor_kg ");
    }

    @Given("^Я должен найти наушники для iphone$")
    public void я_должен_найти_наушники_для_iphone() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я ввел в поиск");
    }

    @Given("^у меня на карте (\\d+) usd$")
    public void у_меня_на_карте_usd(int budget) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" у меня на балансе "+budget);
    }

    @Given("^Наушники стоят (\\d+)usd$")
    public void наушники_стоят_usd(int headPhonePrice) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" наушники стоят"+ headPhonePrice);
    }

    @When("^я нажимаю кнопку купить$")
    public void я_нажимаю_кнопку_купить() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" я нажал кнопку купить");
    }

    @When("^Сайт должен снять с моей карты (\\d+) usd$")
    public void сайт_должен_снять_с_моей_карты_usd(int withDraw) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Сайт снял с моей карты "+withDraw);
    }

    @Then("^У меня на карте должен остаться (\\d+) usd$")
    public void у_меня_на_карте_должен_остаться_usd(int remainingBalance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("у меня на карте осталось "+remainingBalance);
    }

    @Given("^Я должен зайти на сайт Aliexpress\\.com$")
    public void я_должен_зайти_на_сайт_Aliexpress_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я зашел на сайт Aliexpress_com");
    }

    @Given("^Я должен найти памперсы для взрослых$")
    public void я_должен_найти_памперсы_для_взрослых() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("поиск");
    }

    @Given("^У меня на карте (\\d+) kgz$")
    public void у_меня_на_карте_kgz(int balance) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("у меня на карте "+balance);
    }

    @Given("^Памперсы стоят (\\d+) kgz$")
    public void памперсы_стоят_kgz(int sum) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("памперсы стоят "+sum);
    }

    @When("^Сайт должен снять с моей карты (\\d+) kgz$")
    public void сайт_должен_снять_с_моей_карты_kgz(int check) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я потратил "+ check);
    }

    @Then("^У меня на карте должен остаться (\\d+) kgz$")
    public void у_меня_на_карте_должен_остаться_kgz(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("у меня осталось "+arg1);
    }






}
