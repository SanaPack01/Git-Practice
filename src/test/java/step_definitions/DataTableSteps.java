package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @Given("^Пользователь на странице регистрации$")
    public void пользователь_на_странице_регистрации() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("я зашел на страницу Регистрация");

    }

    @When("^Пользователь должен ввести данные$")
    public void пользователь_должен_ввести_данные(DataTable table) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<List<String>> userList = table.asLists(String.class);
       for (List<String> e : userList){
        System.out.println(e);
    }}

    @When("^Пользователь должен ввести данные с таблички$")
    public void пользователь_должен_ввести_данные_с_таблички(DataTable table)  {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<Map<String,String>> userList = table.asMaps(String.class,String.class);
        for (Map<String,String> e : userList){
            System.out.println(e.get("firstName"));
            System.out.println(e.get("LastName"));
            System.out.println(e.get("dob"));
            System.out.println("this is Elon"+userList.get(1).get("firstName"));
        }
    }

    @Then("^Пользователь должен на кнопку регистрации$")
    public void пользователь_должен_на_кнопку_регистрации() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Пользователь нажал кнопку регистрации");
    }

    @Then("^пользователь должен успешно зарегаться$")
    public void пользователь_должен_успешно_зарегаться() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("пользователь успешно зарегистрировался");
    }





}
