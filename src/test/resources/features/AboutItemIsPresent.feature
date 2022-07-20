Feature: About information is present for specific item

  # Background not needed for this assignment

Scenario: Information about Item should be present
  Given user navigate to Amazon ".in"
  When user finds item he likes using sort "Price: High to Low"
# for this particular testcase additional steps explanation not needed, since we are checking different functionality.
  Then user able to see "About this item"