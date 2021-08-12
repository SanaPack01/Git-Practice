Feature: Scenario Outline Feature

  Scenario Outline: Проверка Логин функции
    Given Я как пользоватль должен зайти на "fb.com"
    And В поле email вводим "<email>"
    When в поле пароль вводим "<password>"
    Then Я должен нажать на кнопку войти в систему
    Then Система должна вывести ошибку "Вы ввели не правильные данные"


    Examples:
      | email |password |
    |test@test.com|123456|
    | test123@gmail.com|Hello321|
    |john@@yahoo.com   |password|

    Scenario Outline: Покупка на AliExpress
      Given Я как пользователь должен зайти на сайт AliExpress.com
      And В поле поиска должен найти свой товар
      When Товар стоит "<Price>"
      And Я имею "<Cash>" денег
      Then Я должен нажать на кнопку "Buy"
      Then Система должна снять столько "<Price>"
      Examples:
        |Price  |Cash|
      | 12300      |30000    |
      |    35.800        |    45.750     |
      |25                |         15      |

      Scenario Outline: Fixprice.com
        Given Я как пользователь должен зайти на сайт Fixprice.com
        And В поле поиска ввести товар
        When Цена товара <Price>
        And У меня <Cash>
        Then Я должен нажать на кнопку купить
        Then Система снимет  "<Price>"


        Examples:
          |Price  |Cash|
        |  25.500     |30.000    |


