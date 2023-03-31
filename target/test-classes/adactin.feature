Feature: To Run Test Cases in Adactin Hotel Application

Background: 
Given User Launch Browser "edge"
And User Navigate to Url "http://adactinhotelapp.com/"
Then User Enter UserName "vnvnvnvnvn "
And User Enter Password "123456"
Then Click Login Button
Then User Verify logedin Page 


@TC-101
Scenario: To verify Login 


Then User close the Browser

@TC-102
Scenario: Search Hotel with Wrong Checkina and Checkout date

And User Select Location "Sydney"
And User Select Hotel "Hotel Creek"
And User Select Roomtype "Standard"
And User Select No of rooms "1 - One"
Then User Enter Checkin Date "01/04/2023"
Then User Enter Checkout Date "30/03/2023"
And User Click the Search Button
Then User Verify Error Message

@TC-103
Scenario: Search Hotel With Checkout date before today

And User Select Location "Sydney"
And User Select Hotel "Hotel Creek"
And User Select Roomtype "Standard"
And User Select No of rooms "1 - One"
Then User Enter Checkout Date "22/03/2023"
And User Click the Search Button
Then User Verify Error Message

@TC-104
Scenario: Search Hotel to Verify Hotel name selected vs searched

And User Select Location "Sydney"
And User Select Hotel "Hotel Creek"
And User Select Roomtype "Standard"
And User Select No of rooms "1 - One"
Then User Enter Checkout Date "29/03/2023"
Then User Enter Adults Per Room "1 - One"
Then User Enter Childrens Per Room "0 - None"
And User Click the Search Button
Then User Verify Select Hotel page
Then User Verify Hotel Name
Then User Verify Checkin date
Then User Verify Checkout date
Then User Verify No of Rooms
Then User Verify Room Type
Then User Verify Price










