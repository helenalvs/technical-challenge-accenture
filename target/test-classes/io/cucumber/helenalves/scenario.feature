# language: en

Feature: Access the Tricentis site and fill in all fields in the Enter Vehicle Data, Enter Insurance Data, Enter Product Data, Select Price Option, and Send Quote sections

	Scenario: Fill in fields in the Enter Vehicle Data tab
		When I access the Tricentis site: "http://sampleapp.tricentis.com/101/app.php"
		Given I click on Automobile
		And I select Make: "Audi"
		And I fill in the Engine Performance [kW]: "20"
		And I fill in the Date of Manufacture: "06/15/2020"
		And I select Number of Seats: "5"
		And I select Fuel Type: "Electric Power"
		And I fill in the List Price [$]: "5000"
		And I fill in the License Plate Number: "ABC 123"
		And I fill in the Annual Mileage [mi]: "2000"
		Then Finish vehicle step

	Scenario: Fill in Enter Insurance Data fields
		Given I enter First Name "Helen"
		And I enter Last Name "Alves"
		And I fill in Date of Birth "10/08/1996"
		And I specify Gender "Female"
		And I fill in Street Address "Av. Janga"
		And I select Country: "Brazil"
		And I fill in Zip Code "53080500"
		And I fill in City "Recife"
		And I click on Occupation: "Employee"
		And I fill in hobbies
		And I fill in Website "www.helen.com.br"
		Then Finish insurance step

	Scenario: Fill in fields of Enter Product Data
		Given I enter Start Date "06/15/2025"
		And I click on Insurance Sum [$] "3000000"
		And I click on Merit Rating: "Super Bonus"
		And I click on Damage Insurance: "Full Coverage"
		And I specify Optional Products: Euro Protection
		And I click on Courtesy Car: "Yes"
		Then Finish product step

	Scenario: Fill in fields of Select Price Option
		Given I select the price option "selectsilver"
		Then Finish price step

	Scenario: Fill fields in Select Send Quote section
		Given that I enter the E-mail: "helen@gmail.com"
		And I fill in the Phone field: "81999995555"
		And I fill in the Username field: "Helen"
		And I fill in the Password field: "Helen1234*Alves"
		And I confirm the Password field: "Helen1234*Alves"
		Then I should click Send
		And verify the message: "Sending e-mail success!"
