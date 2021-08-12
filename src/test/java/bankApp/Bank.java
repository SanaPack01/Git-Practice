package bankApp;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private  String name;
    private Map<String,Account> accountsMap = new HashMap<>();

    public Bank (String name){
        this.name=name;
    }

    public void registerAccount (Account account){
        accountsMap.put(account.getEmail(),account);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Map<String, Account> getAccountsMap() {
        return accountsMap;
    }
    public void setAccountsMap(Map<String, Account> accountsMap) {
        this.accountsMap = accountsMap;
    }





}
