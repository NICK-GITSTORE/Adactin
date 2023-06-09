Feature: To Run Test Cases in Adactin Hotel Application

Background: 
Given User Launch Browser "browser1"
And User Navigate to Url "url1"
Then User Enter UserName "username1"
And User Enter Password "password1"
Then Click Login Button
Then User Verify logedin Page 


@TC-101  @tag01
Scenario: Login-Verification

Then User Close the Browser


@TC-102 @tag02
Scenario: Search Hotel - Wrong Checkin and Checkout

And User Select Location "location2"
And User Select Hotel "hotelname2"
And User Select Roomtype "roomtype2"
And User Select No of rooms "noofrooms2"
Then User Enter Checkin Date "checkin2"
Then User Enter Checkout Date "checkout2"
And User Click the Search Button
Then User Verify Error Message


@TC-103
Scenario: Search Hotel - Checkout before today

And User Select Location "location2"
And User Select Hotel "hotelname2"
And User Select Roomtype "roomtype2"
And User Select No of rooms "noofrooms2"
Then User Enter Checkout Date "checkout_bfr_tdy"
And User Click the Search Button
Then User Verify Error Message


@TC-104
Scenario: Select Hotel -Verification

And User Select Location "location2"
And User Select Hotel "hotelname2"
And User Select Roomtype "roomtype2"
And User Select No of rooms "noofrooms2"
Then User Enter Checkin Date "checkin_crt"
Then User Enter Checkout Date "checkout_crt"
Then User Select Adults Per Room "adult_perroom"
Then User Select Childrens Per Room "child_perroom"
And User Click the Search Button
Then User Verify Select Hotel page 
Then User Verify Hotel Name "hotelname2"
Then User Verify Checkin date "checkin_crt"
Then User Verify Checkout date "checkout_crt"
Then User Verify No of Rooms "noofrooms3"
Then User Verify Room Type "roomtype2"
Then User Verify Price



@TC-105
Scenario: Book Hotel

And User Select Location "Sydney"
And User Select Hotel "Hotel Sunshine"
And User Select Roomtype "Standard"
And User Select No of rooms "2 - Two"
Then User Enter Checkout Date "10/04/2023"
Then User Select Adults Per Room "1 - One"
Then User Select Childrens Per Room "0 - None"
And User Click the Search Button
Then User Verify Select Hotel page
Then User Verify Hotel Name "hotelname2"
Then User Verify Checkin date "checkin_crt"
Then User Verify Checkout date "checkout_crt"
Then User Verify No of Rooms "noofrooms3"
Then User Verify Room Type "roomtype2"
Then User Verify Price
And User Click Radio Button
And User Click Continue Button
Then User Enter First Name "NITHISH"
Then User Enter Last Name "KUMAR"
Then User Enter Billing Address "ANAGAPUTHUR"
And User Enter Credit Card No "1234567891234567"
Then User Select Credit Card Type "VISA"
Then User Select Expiry Month "November"
And User Select Expiry Year "2022"
Then User Enter CVV "123"
Then User Click Book Now
Then User Click Logout


@TC-110 @tag02
Scenario: Final billed price _Verfification

And User Select Location "Sydney"
And User Select Hotel "Hotel Sunshine"
And User Select Roomtype "Standard"
And User Select No of rooms "2 - Two"
Then User Enter Checkout Date "10/04/2023"
Then User Select Adults Per Room "1 - One"
Then User Select Childrens Per Room "0 - None"
And User Click the Search Button
Then User Verify Select Hotel page
Then User Verify Hotel Name
Then User Verify Checkin date
Then User Verify Checkout date
Then User Verify No of Rooms
Then User Verify Room Type
Then User Verify Price
And User Click Radio Button
And User Click Continue Button
And User Verify Billed Price










