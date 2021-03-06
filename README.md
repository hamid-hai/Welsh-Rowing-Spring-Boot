<h1 align="center">Welcome to Group 7 - Client Project - Welsh Rowing Association - After Fork - C1935888</h1>
<p>
</p>

### 🏠 [GitLab Homepage](https://git.cardiff.ac.uk/c1935888/clientproject-group7-1935888-afterfork/)

## Database Initialization  / Instructions

At the front of the directory file, ‘rowingDatabase.sql’ should be present.

Please open this file in ‘MySQL Workbench 8.0 CE’ OR ‘MariaDB’ with your root login connection
credentials and run ‘rowingDatabase.sql’.

The database is now set up and running for the web applications use.

## Building and starting the Spring Boot Application

Using command prompt set the current directory to the location of the project build.gradle file

Run the command 

```sh
gradle build
```
This will build the program using gradle, running all tests ensuring that they pass.

Once buliding is complete you can now run the application using the .jar file

**In the Java '.jar' file directory, open Command Prompt and use the command**

```sh
java -jar -Dspring.profiles.active=prod -Djasypt.encryptor.password=COMSC JAR_C1935888.jar
```

The Spring Boot Application will then start-up and will host on port 8080.

## Navigation to server homepage

In a browser of your choice navigate to 'HTTPS:/localhost:8080'

**HTTP is disabled, accessing the server via HTTP is forbidden.**

**If you fail to access the HTTPS page due to Chrome blocking please enable the following flags**

Type into the URL bar and enable
chrome://flags/#allow-insecure-localhost

You will be directed to the homepage of the application.

## Login details

Navigate to 'Login' from the homepage using the header at the top of the page.

You'll be asked to enter login infomation, please see below for pre-made login details for two different types of users.

**For Athlete's you may choose to create a new account, please see further down**

Athlete
- Username: painterbob
- Password: PaintingRoss324

Coach
- Username: coachaccount
- Password: CoachAccount465

## Tests

### Athlete Dashboard Test

### Creation of account can be ran through Selenium, please run file signUptest in InteliJ "src/test/java/nsa/group7/welshrowing/selenium/ after server is running"

#### 1 - Creation of account - Selenium version avilable

1. Go to 'HTTPS://localhost:8080'
2. Click 'Sign up' in the Navigation Bar.
3. Fill in the fields.
4. Press 'Create Your Account'.
5. Fill in the extra info (fields marked with '*' are required, you cannot create an account without these fields)..
6. You'll be presented with your own Athlete dashboard.
7. Log out using the 'Log Out' button in the Navigation Bar.
8. Head to 'Login'.
9. Use those creidentals to login again, ensuring that the account has been registered in the database.

#### 2 - Filling forms

1. Sign into existing or newly created athlete account. -  If you used Selenium for Test 1, the login details are username: johncenapower password: invisibleCena24
2. Go to the Morning-Monitoring Form and fill in the details, if you fill in this particular form 7 times on different dates you'll see the data refelected in the graph on the dashboard.
3. Go through each other from and fill in the forms to your preference.
5. Clicking on 'View Data' at the bottom will show the Morning Monitoring data you entered in each entry in table view.

### Coach Dashboard Test

#### 1 - Logging into Coach Dashboard and filling forms

1. Go to 'HTTPS://localhost:8080'
2. Go to 'Login' in the navigation bar.
3. Use the coach login credentials above - You'll see you're logged in as a coach under the name 'John Lewis' at the top of the coach dashboard.
4. See which users have not completed morning monitoring, if you filled in Morning Monitoring data for the current date, they won't appear on the list - You can see the pre-created Athlete account has not filled in Morning Monitoring for today "Bob Ross".
5. Press Athlete Morning Monitoring to a table list of all the morning monitoring enteries.
6. Fill in the interview form, selecting an applicant from the drop down menu 
7. Complete applicant testing via 'Applicant Testing' button - You can see your Athlete created in the signup process.
8. Approve or decline the newly created user in the applicant test from 'Visit all Applicants', this process can take a while, go back and enter the page again.