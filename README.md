JUST EAT Engineer Recruitment Test
==================================

Thank you for taking the time to do our technical test. It consists of two parts:

* [A coding test](#coding-test)
* [A few technical questions](#technical-questions)

In order to avoid bounced emails we would like you to submit your results by uploading the relevant zip file to a shared Google Drive folder. In order to obtain the URL for this folder please supply your Gmail or Google-based email address to either your agent or the JUST EAT member of staff who assigned you the test.

Please make this a **single** zip file named **{yourname}-{role-applied-for}.zip** containing:

1. a single markdown file with the answers to the technical questions
2. one folder containing the technical test

## Coding Test

JUST EAT has a public API available at [https://public.je-apis.com/](https://public.je-apis.com/) that you can use to get restaurant information, including restaurant details and delivery information.

As an example, [https://public.je-apis.com/restaurants?q=se19](https://public.je-apis.com/restaurants?q=se19) returns a list of restaurants that deliver to the outcode SE19, including some basic restaurant information.

The API requires you specify a set of valid request headers.

    Accept-Tenant: uk
    Accept-Language: en-GB
    Authorization: Basic VGVjaFRlc3RBUEk6dXNlcjI=
    Host: public.je-apis.com

The task is to create an application that accepts an outcode as a parameter. The application should then display the following information about each restaurant that delivers to that outcode.

- Name
- Rating
- Types of food for the restaurant

### Platform Choice

You can create the application as either a command line application, web application or mobile application in any of the following platforms

- .NET, Ruby or Python for command line applications
- .NET, PHP, Ruby, Python or JavaScript for web applications
- iOS, Android or Windows Mobile for mobile applications

Think about the type of work you would like to do at JUST EAT and **choose an appropriate application type and platform**.

### Task requirements

Feel free to spend as much or as little time on the exercise as you like as long as the following requirements have been met.  

- Please complete the user story below.
- Your code should compile and run in one step.
- Feel free to use whatever frameworks / libraries / packages you like.

### User Story

As a **user running the application**  
I can **view a list of restaurants in a user submitted outcode (ex. SE19)**  
So that **I know which restaurants are currently available**

If you have chosen a native mobile application platform please also include the following:

As a **user running the application**  
I can **view the the restaurant logo along side restaurant information**  
So that **I know exactly which restaurants are currently available**

As a **user running the application**  
I can **use GPS to find my current postcode to retrieve restaurant results**  
So that **I dont need to type it in**

#### Acceptance criteria

- For the known outcode se19, results are returned
- The Name, Cuisine Types and Rating of the restaurant are displayed

# Technical questions

Please answer the following questions in a markdown file called `Answers to technical questions.md`.

1. How long did you spend on the coding test? What would you add to your solution if you had more time? If you didn't spend much time on the coding test then use this as an opportunity to explain what you would add.
2. What was the most useful feature that was added to the latest version of your chosen language? Please include a snippet of code that shows how you've used it.
3. How would you track down a performance issue in production? Have you ever had to do this?
4. How would you improve the JUST EAT APIs that you just used?
5. Please describe yourself using JSON.
6. Assess yourself on the following fields of expertise on a scale from 1 to 10 (where 1 is no experience at all and 10 is extremely experienced):

- design patterns
- RESTful APIs
- complex system design
- SOLID principles
- software lifecycle
- data structures
- algorithms
- threading
- OOP
- D.I. and I.O.C
- Functional Programming
- app architecture design
- memory management
- debugging
- unit testing
- TDD
- automation testing
- performance testing
- the language(s) used for the test task
- closures/blocks/lambdas
- C.I.
- DCVS

####Thanks for your time, we look forward to hearing from you!
- The [JUST EAT Tech team](http://github.com/justeat)
