Feature:




    Scenario: Покупка Lexus LxS70
      Given Я зашел на сайт "Lexus.com"
      And Я должен пролистать вниз и должен увидеть "Explore your lexus"
      And  Я должен выбрать "Lx"
      And Я жлджен увидеть последнюю модель "Lx570"
      And Цена должна начинаться от 86930 долларов
      When Когда я нажал на кнопку build
      And Сайт должен запросить у меня zipCode
      And Я должен ввести zipcode 0312
      And Я должен выбрать модель "2021 lX 570 THREE-ROW"
      And Во вкладке "EXTERIOR COLORS" я должен выбрать "Black Onyx"
      And Цена "lx570" должна поменяться с 93700 на 93275
      And Я должен нажать на кнопку Summery
      And Я должен увидеть "YOU'LL TURN HEADS"такой текст
      And Я должен нажать на кнопку Send to dealer
      And Сайт выдал анкету для заполнения
      And В поле First name я должен ввести "Мurat"
      And В поле Last name я должен ввести "Shorukov"
      And В поле email я должен ввести "mura@gmail.com"
      And В поле Phone number должен ввести 996551111222
      Then Я должен нажать кнопку Submit
      Then Я должен увидеть "THANK YOU. WE'LL BE IN TOUCH SHORTLY" текст