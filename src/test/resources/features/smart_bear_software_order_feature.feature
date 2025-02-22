Feature:As a user i should be able to successfully create an order in smartbearsoftware

@orderSmartBearTest
Scenario Outline: :user should be able to place order and order should be seen in page
Given user is already logged in and navigated to order page
When user selects product type "<productType>"
And user enters quantity "<quantity>"
And user enters customer name "<customerName>"
And user enters street "<street>"
And user enters city "<city>"
And user enters state "<state>"
And user enters zip "<zip>"
And user selects credit card type "<cardType>"
And user enters credit card number "<cardNumber>"
And user enters expiration date "<expirationDate>"
And user enters process order button
Then user should see "<customerName>" in the first row of the table
  Examples:
    | productType | quantity |  | customerName | street           | city      | state    | zip   | cardType         | cardNumber       | expirationDate |
    | FamilyAlbum | 2        |  | Chuck Norris | 1100 Long way dr | Chantilly | Virginia | 22011 | American Express | 1111222233334444 | 12/25          |
    | MyMoney     | 3        |  | James Bond   | 123 Test dr      | Bethesda  | Maryland | 23450 | Master Card      | 1234234534564567 | 05/29          |
    | ScreenSaver | 10       |  | Tom Jerry    | 837 Old rd       | Miami     | Florida  | 11234 | Visa             | 1234567891234567 | 10/27          |