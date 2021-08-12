@Transactions

Feature: Transfer with MBank

  Scenario: Перевод денег с аккаунта А на аккаунт В positive
    Given У нас есть банк "Commercial BAnk of Kyrgystan"
    And Пользователь с номером счета 12345 и с email "sanira@gmail.com" и с балансом на счету $1000 зарегистрирована в банке "Commercial BAnk of Kyrgystan"
    And Пользователь с номером счета 11111 и с email "aidana@gmail.com" и с балансом на счету $2000 зарегистрирована в банке "Commercial BAnk of Kyrgystan"
    When Пользователь с номерои счета 12345 должен отправить $200 на email "aidana@gmail.com" в "Commercial BAnk of Kyrgystan"
    Then У пользователя с номером счета 12345 должно остаться на балансе $800
    And У пользователя с номером счета 11111 должно остаться на балансе $2200


