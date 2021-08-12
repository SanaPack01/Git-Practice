Feature:

  Scenario: пользователь должен зарегестрироваться с разными данными
    Given Пользователь на странице регистрации
    When Пользователь должен ввести данные
    |John|doe|1990|john@gmail.com|USA|
    Then Пользователь должен на кнопку регистрации
    Then пользователь должен успешно зарегаться

    Scenario: Пользователь должен зарегаться с разными данными
      Given Пользователь на странице регистрации
      When Пользователь должен ввести данные с таблички
      |firstName|LastName|dob|email|country|
      |John|doe|1990|john@gmail.com|USA|
      |Elon|Musk|1978|musk@gmail.com|USA|
      | Mark   |Jobs    |1899    |  mark@gmail.com            |  KGZ |
      |Jimin   |Park    |1995    |bt.jm@gmail.com             |KOR   |
      |Tramp   |Donalde |1985    |trampE@gmail.com            |USA   |
      Then пользователь должен успешно зарегаться

  Scenario: Пользователь должен зарегаться с разными данными
    Given Пользователь на странице регистрации
    When Пользователь должен ввести данные с таблицы
      |firstName|LastName|dob|email|country| ID|Job|
      |John|doe|1990|john@gmail.com|USA| 111   |doctor|
      |Elon|Musk|1978|musk@gmail.com|USA|222|FootballGamer|
      | Mark   |Jobs    |1899    |  mark@gmail.com            |  KGZ |333|non|
      |Jimin   |Park    |1995    |bt.jm@gmail.com             |KOR   |0001|Aidol|
      |Tramp   |Donalde |1985    |trampE@gmail.com            |USA   |555|President|
    Then пользователь должен успешно зарегаться



