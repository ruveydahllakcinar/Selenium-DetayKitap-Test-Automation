@ProductToCartFeature
Feature: feature to Detay Kitap site adding product to cart
  @producttocart
Scenario: Detay kitap site add product to cart
  Given open in detaykitap pages
  When click search box
  When Write the name of the book
  When click search button
  Then add product to cart


    @allfillpaymentpages
    Scenario: Detay kitap site payment page
      Given go to payment pages
      When enter name input
      When enter surname input
      When enter address input
      When enter zipcode
      When enter district
      When enter city
      When enter phone number
      When enter emailaddress
      When agree terms and conditions
      Then click accept order


