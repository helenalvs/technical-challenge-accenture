# [ACCENTURE QA] - QA Project

![](https://img.shields.io/badge/cucumber-v.7.18.0-yellow.svg)
![](https://img.shields.io/badge/selenium-v.4.22.0-green.svg)

---

## Challenge - Accenture QA

### Developed by: Helen Alves

---

### Objective

Implement the concepts covered on Automated Testing, BDD, and Agile methodologies.


### Tecnologias utilizadas: 

Cucumber + Selenium, Java, Gherkin.

### Result: [Watch on YouTube](https://youtu.be/4TJMWys5dco)

---

# Challenge: A Testing Application with Selenium and Cucumber :computer:

Validation on the Tricentis Sample App using Cucumber, Selenium WebDriver in Java.

---
## Test Automation Scenarios for Tricentis Sample App

### Feature: Automated Testing for Tricentis Site

This repository contains automated test scenarios for the Tricentis sample application. Each scenario aims to ensure that various forms and fields within the application are filled out correctly.

### Scenarios Overview

1. **Enter Vehicle Data**
2. **Enter Insurance Data**
3. **Enter Product Data**
4. **Select Price Option**
5. **Send Quote**

---

### 1. Scenario: Fill in fields in the Enter Vehicle Data tab

- **When** I access the Tricentis site: [Tricentis Sample App](http://sampleapp.tricentis.com/101/app.php)
- **Given** I click on `Automobile`
- **And** I select `Make: "Audi"`
- **And** I fill in the `Engine Performance [kW]: "20"`
- **And** I fill in the `Date of Manufacture: "06/15/2020"`
- **And** I select `Number of Seats: "5"`
- **And** I select `Fuel Type: "Electric Power"`
- **And** I fill in the `List Price [$]: "5000"`
- **And** I fill in the `License Plate Number: "ABC 123"`
- **And** I fill in the `Annual Mileage [mi]: "2000"`
- **Then** Finish vehicle step

---

### 2. Scenario: Fill in Enter Insurance Data fields

- **Given** I enter `First Name: "Helen"`
- **And** I enter `Last Name: "Alves"`
- **And** I fill in `Date of Birth: "10/08/1996"`
- **And** I specify `Gender: "Female"`
- **And** I fill in `Street Address: "Av. Janga"`
- **And** I select `Country: "Brazil"`
- **And** I fill in `Zip Code: "53080500"`
- **And** I fill in `City: "Recife"`
- **And** I click on `Occupation: "Employee"`
- **And** I fill in `hobbies`
- **And** I fill in `Website: "www.helen.com.br"`
- **Then** Finish insurance step

---

### 3. Scenario: Fill in fields of Enter Product Data

- **Given** I enter `Start Date: "06/15/2025"`
- **And** I click on `Insurance Sum [$]: "3000000"`
- **And** I click on `Merit Rating: "Super Bonus"`
- **And** I click on `Damage Insurance: "Full Coverage"`
- **And** I specify `Optional Products: Euro Protection`
- **And** I click on `Courtesy Car: "Yes"`
- **Then** Finish product step

---

### 4. Scenario: Fill in fields of Select Price Option

- **Given** I select the price option `selectsilver`
- **Then** Finish price step

---

### 5. Scenario: Fill fields in Select Price Option section

- **Given** that I enter the `E-mail: "helen@gmail.com"`
- **And** I fill in the `Phone field: "81999995555"`
- **And** I fill in the `Username field: "Helen"`
- **And** I fill in the `Password field: "Helen1234*Alves"`
- **And** I confirm the `Password field: "Helen1234*Alves"`
- **Then** I should click `Send`
- **And** verify the message: `"Sending e-mail success!"`

--------------------------------------------------------------------
## Technologies Used :computer:

:heavy_check_mark: <b>Java</b><br>
Programming language for application development<br>

:heavy_check_mark: <b>Maven</b><br>
Dependency manager for Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsible for translating human language into Java code<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsible for integrating Java code with Gherkin language (Cucumber), opening the browser and performing behavior tests<br>

--------------------------------------------------------------------
## How to Use :bookmark_tabs:

### Prerequisites

- Install Java:
[Download Java](https://www.java.com/en/download/manual.jsp)

- Install JDK:
[Download JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

- Verify that JAVA_HOME is configured on your computer

- Clone the project

```bash
git clone https://github.com/helenalvs/technical-challenge-accenture.git
```

- Navigate to the project directory
 ```bash
cd technical-challenge-accenture
 ```






