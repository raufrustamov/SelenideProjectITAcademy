Feature: Website submenu checking


  Scenario: Displaying categories in a car goods submenu
    Given The user is on the main page of the site
    When The user hovers over the Car menu  item
    Then A submenu with categories (by prices, by city and brand) appears

  Scenario: Displaying categories in a Houses and apartments.
    Given The user is on the main page of the site
    When The user hovers over the Houses and apartments  item
    Then A submenu with categories (cities, number of rooms, price range) appears



