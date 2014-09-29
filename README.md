JUST EAT Engineer Recruitment Test
==================================

Thank you for taking the time to do our technical test. It consists of two parts:

* [A coding test](#coding-test)
* [A few technical questions](#technical-questions)

## Coding Test

JUST EAT has a public API available at [http://api-interview.just-eat.com/](http://api-interview.just-eat.com/) that you can use to get restaurant information, including restaurant details and delivery information.

As an example, [http://api-interview.just-eat.com/retstaurants?q=se19](http://api-interview.just-eat.com/retstaurants?q=se19) returns a list of restaurants that deliver to SE19, including some basic restaurant information.

The API requires you specify a set of valid request headers.

    Accept-Tenant: uk
    Accept-Language: en-GB
    Content-Type: application/json
    Authorization: Basic VGVjaFRlc3RBUEk6dXNlcjI=
    Host: [api-interview.just-eat.com](http://api-interview.just-eat.com/)

The task is to create an application that accepts a postcode as a parameter. The application should then display the following information about each restaurant that delivers to that postcode.

- Name
- Rating
- Types of food for the restaurant

The restaurants should be ordered from highest rating to lowest rating.

### Platform Choice

You can create the application as either a command line application, web application or mobile application in any of the following platforms

- .NET or Ruby for command line applications
- .NET, PHP, Ruby or JavaScript for web applications
- iOS, Andriod or Windows Mobile for mobile applications

Think about the type of work you would like to do at JUST EAT and **choose an appropriate application type and platform**.

### Task requirements

 
Feel free to spend as much or as little time on the exercise as you like as long as the following requirements have been met 

- Please complete at least 1 story.
- Your code should run and compile in one step.
- Feel free to use whatever frameworks / libraries / packages you like.
- Your code should be of production quality.
- In order to avoid bounced emails we would like you to submit your results by uploading the relevant zip file to a shared Google Drive folder. Please send an email to [tech.recruitment@just-eat.com](mailto:tech.recruitment@just-eat.com) with your **valid Google email address** so we can give you the correct upload permissions.

### User stories

#### Story 1

As a **user running the application**  
I can **view the a list of restaurants in outcode se19**  
So that **I know which restaurants are currently available**

##### Acceptance criteria

- For the known outcode se19, results are returned
- The Name and Cuisines of the restaurant are displayed


#### Story 2

As a **user running the application**  
I can **supply any valid outcode**  
So that **I can view a list of restaurants for the given outcode**

##### Acceptance criteria

- For the any valid outcode, results are returned


#### Story 3

As a **user running the application**  
I can **view an ordered list of restaurants**  
So that **I can quickly decide which restaurants are the best**

##### Acceptance criteria

- Restaurants ordered from highest rating to lowest rating
- The Rating for the restaurant is displayed 


#### Story 4

As a **user running the application**  
I can **supply a invalid outcode to the application**  
So that **a helpful error message is displayed**

##### Acceptance criteria

- For any invalid outcode the application displays a helpful error message 

# Technical questions

Please answer the following questions in a markdown file called `Answers to technical questions.md`.

* What would you add to your solution if you had more time?
* What was the most useful feature that was added to the latest version of your chosen language? Please include a snippet of code that shows how you've used it.
* How would you track down a performance issue in an application? Have you ever had to do this?
* How would you improve the Just Eat public API found here?: http://www.just-eat.co.uk/webservice/webservices.asmx
* Please describe yourself using JSON.


Thanks for your time, we look forward to hearing from you!
- The [JUST EAT Tech team](http://github.com/justeat)
