Feature: POST Request

Scenario: Check if user able to create a program with valid endpoint and request body 
	Given user creates POST request for LMS API endpoint
	When user sends HTTPS	request and request body with mandatory ,additional fields. 
	Then user receives 201 created status with response body
	