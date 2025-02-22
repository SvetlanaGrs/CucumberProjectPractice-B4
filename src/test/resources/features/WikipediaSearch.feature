Feature: Wikipedia Search Functionality
Background: this is for navigating Wikipedia home page
  Given the user is on the Wikipedia home page
  When the user types "Steve Jobs" in the search box
  And clicks the search button

  @test1
  Scenario:Title verification
  #Given the user is on the Wikipedia home page,
  # When the user types "Steve Jobs" in the search box
   #And clicks the search button
Then the user see "Steve Jobs" in the wiki title.

  @test2
  Scenario: Header Verification
    #Given the user is on the Wikipedia home page
    #When the user types "Steve Jobs" in the search box
    #And clicks the search button
    Then the user see "Steve Jobs" is in the main header

  @test3
  Scenario: Image Verification
    #Given the user is on the Wikipedia home page,
    #When the user types "Steve Jobs" in the search box
    #And clicks the search button
    Then the user see "Steve Jobs" is in the image header


