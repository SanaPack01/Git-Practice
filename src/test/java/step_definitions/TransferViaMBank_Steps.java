package step_definitions;

import bankApp.Account;
import bankApp.Bank;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TransferViaMBank_Steps {

    private Bank cbk;
    private final List<Account> accountList=new ArrayList<>();

    @Given("^У нас есть банк \"([^\"]*)\"$")
    public void у_нас_есть_банк(String bankName)  {
        // Write code here that turns the phrase above into concrete actions

        cbk = new Bank(bankName);
        System.out.println("Создаем банк"+bankName);

    }

    @Given("^Пользователь с номером счета (\\d+) и с email \"([^\"]*)\" и с балансом на счету \\$(\\d+) зарегистрирована в банке \"([^\"]*)\"$")
    public void пользователь_с_номером_счета_и_с_email_и_с_балансом_на_счету_$_зарегистрирована_в_банке(int accNum , String email, int balance, String bankName)  {
        // Write code here that turns the phrase above into concrete ac
        System.out.println("Регистрируем "+ accNum + " email "+ email + " to "+bankName);
        Account sanirasAccaunt = new Account(accNum,email,balance);
        cbk.registerAccount(sanirasAccaunt);
        accountList.add(sanirasAccaunt);
    }

    @When("^Пользователь с номерои счета (\\d+) должен отправить \\$(\\d+) на email \"([^\"]*)\" в \"([^\"]*)\"$")
    public void пользователь_с_номерои_счета_должен_отправить_$_на_счет_на_email_в(int accNum, int transferAmount,  String email, String bankName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Перевод на счет "+accNum + " на email "+ email +" сумма перевода "+transferAmount);
        for (Account account : accountList){
            if (accNum==account.getAccountNum()){
                account.transferViaMbank(email,transferAmount,cbk);
            }
        }
    }

    @Then("^У пользователя с номером счета (\\d+) должно остаться на балансе \\$(\\d+)$")
    public void у_пользователя_с_номером_счета_должно_остаться_на_балансе_$(int accNum, int expectedBalance)  {
        // Write code here that turns the phrase above into concrete actions

        for (Account account :accountList){
            if (account.getAccountNum()==accNum){
                Assert.assertEquals(expectedBalance,account.getBalance(),0);
            }
        }
        System.out.println(" у пользователя c номером  счета "+ accNum+ " осталось " +expectedBalance);

    }

}
