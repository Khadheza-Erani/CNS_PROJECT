# CNS_Project_With Selenium

## How to run this project
- Clone this project
- Open with IntelliJ IDEA Community Edition / Command Shell
- Run Command:  
```console 
mvn test
mvn test -Dbrowser="chrome"
mvn test -Dbrowser="chrome" -DxmlFileName="testing.xml"
mvn test -Dbrowser="chrom" -DtestClassName="testcase which you want to run"
```console
allure generate ./allure-results --clean

```console 
allure open ./allure-report

## Technology used:
- IntelliJ 
- Allure
- Apache

## Prerequisite:
- IntelliJ IDEA Community Edition 2023.2.5
- Jdk
- Apache-maven-3.9.4
- Node.js v20.11.0.
- Goole Chrome(Windows 123.0.6312.28)
- Allure-2.24.1

## Prerequisite Dependencies:
- Selenium-java 4.13.0
- TestNG 7.8.0
- Allure-testng 2.24.0

## Installation Process:
- Download;
  1.> IntelliJ IDEA Community Edition 2023.2.5
  2.> Jdk
  3.> Apache-maven-3.9.4
  4.> Node.js v20.11.0 
- Go to the bin folder copy the path for each download folder.
- Open edit system variable from pc/laptop.
- Paste the copied path and save variable name.

## Automation Documentation:
- http://123.200.20.20:5302/

## Test case list:
1. ### Test LogIn Button
	> Create Data Sets with valid/Invalid credentials.

2. ### Verify Continue with LogIn Button
	> In the test case you need to validate the following field values:
 	1. > Go the Dashboard
 	2. > Select any job
 	3. > Switch tab
 	4. > Verify vacancy button
        

3. ###  Fill up an online job circular fields
	> In the test case you need to validate the following pages field values:
	1. > Basic Information page
 	2. > Address page
	3. > Education
 	4. > Job Experience page
	5. > Certificate page
	6. > Complete page

5. ### Create & Verify Basic Information page
	> In the test case you need to validate the following field values:
        1. > GENERAL
        2. > Current working
	3. > NATIONAL ID
        4. > No file chosen
        5. > DATE OF BIRTH
        6. > AGE
        7. > Verify NID
        8. > FATHER NAME
        9. > MOTHER NAME
        10. > MOBILE
        11. > First OTP Pop Up
        12. > OTP field
        13. > Second OTP Pop Up
        14. > E-MAIL
        15. > GENDER
        16. > MARITAL STATUS
        17. > RELIGION
        18. > SIGNATURE (300PX X 80PX) (UPTO 60KB)
        19. > QUOTA ATTACHMENT (UPTO 600KB)
        20. > Next button

6. ### Create & Verify Adress page
	> In the test case you need to validate the following field values:
        1. > Permanent DIVISION 
        2. > Permanent DISTRICT
      	3. > Permanent THANA/UPAZILA
        4. > Permanent POST OFFICE
        6. > Permanent POST CODE
        7. > Permanent ADDRESS LINE
        8. > Present DIVISION
        9. > Present DISTRICT
        10. > Present THANA/UPAZILA
        11. > Present POST OFFICE
        12. > Present POST CODE
        13. > Present ADDRESS LINE
        14. > Next Button.
      
7. ### Create & Verify Education page
	> In the test case you need to validate the following field values:
        1. > EDUCATION LEVEL
        2. > EXAM
        3. > SUBJECT
        4. > PASSING YEAR
        5. > Next button
	
8. ### Create & Verify  Job Experience page
	> In the test case you need to validate the following field values:
        1. > ORGANIZATION
        2. > DESIGNATION
        3. > START DATE
        4. > END DATE
        5. > Next button
8. ### Create & Verify Certificate page
	> In the test case you need to validate the following field values:
        1. > COURSE 
        2. > DURATION
        3. > Time
        4. > Next button
8. ### Create & Verify  Complete page
	> In the test case you need to validate the following field values:
        1. > Declaration Checkbox
        2. > Previous Button
        3. > Complete Button
        4. > Allert Okay Button


## Allure Report Summary:
![Allure Summary](https://github.com/Khadheza-Erani/CNS_PROJECT.git)







![V](https://github.com/Khadheza-Erani/CNS_PROJECT/assets/144150820/ed1d1751-5648-41a8-a6f1-598b87cb7e0a)
![V2](https://github.com/Khadheza-Erani/CNS_PROJECT/assets/144150820/02ec3331-22b8-4f23-a0cb-278a9b93637f)
![V3](https://github.com/Khadheza-Erani/CNS_PROJECT/assets/144150820/a4bf3439-6878-4385-9610-5896665c7557)

