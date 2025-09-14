@wip
Feature: US1001 Kullanici useinsider sayfasinda test yapar

  Scenario: TC01 kullanici Careers sekmesi testlerini yapar
    Given kullanici useinsider anasayfaya gider
    When Company menusu secilir
    Then Careers sekmesi acilir
    When locations gorunebililirligi test edilir
    When life at insider gorunebilirligi test edilir
    When teams gorunebilirligi test edilir


  Scenario: TC02  view rol click ve test
    Given useInseder anasayfaya gider
    When See all QA jobs butonuna tiklar
    When byLocation ve Department gorunurlugu test edilir
    When All dropdown menusu acilir
    When ıstanbulTurkey bulundugu test edilir
    Then view rol click ve test edilir



