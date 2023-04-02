Feature: To Run Test Cases in Adactin Hotel Application

Background: 
Given User Launch Browser "edge"
And User Navigate to Url "http://adactinhotelapp.com/"
Then User Enter UserName "vnvnvnvnvn "
And User Enter Password "123456"
Then Click Login Button
Then User Verify logedin Page 


@TC-101
Scenario: Login-Verification


Then User Close the Browser

@TC-102
Scenario: Search Hotel - Wrong Checkin and Checkout

And User Select Location "Sydney"
And User Select Hotel "Hotel Creek"
And User Select Roomtype "Standard"
And User Select No of rooms "1 - One"
Then User Enter Checkin Date "01/04/2023"
Then User Enter Checkout Date "30/03/2023"
And User Click the Search Button
Then User Verify Error Message
Then User Close the Browser

@TC-103
Scenario: Search Hotel - Checkout before today

And User Select Location "Sydney"
And User Select Hotel "Hotel Creek"
And User Select Roomtype "Standard"
And User Select No of rooms "1 - One"
Then User Enter Checkout Date "22/03/2023"
And User Click the Search Button
Then User Verify Error Message
Then User Close the Browser

@TC-104
Scenario: Select Hotel -Verification

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
Then User Close the Browser


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
Then User Verify Hotel Name
Then User Verify Checkin date
Then User Verify Checkout date
Then User Verify No of Rooms
Then User Verify Room Type
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
Then User Close the Browser

@TC-110
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










