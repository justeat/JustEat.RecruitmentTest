JUST EAT Service Operations Engineer Recruitment Test
==================================

Thank you for taking the time to do our technical test. It consists of two parts:

* [A coding test](#coding-test)
* [A few technical questions](#technical-questions)

In order to avoid bounced emails we would like you to submit your results by uploading the relevant zip file to a shared Google Drive folder. In order to obtain the URL for this folder please supply your Gmail or Google-based email address to either your agent or the JUST EAT member of staff who assigned you the test.

Please make this a **single** zip file named **{yourname}-{role-applied-for}.zip** containing:

1. a single markdown file with the answers to the technical questions
2. one folder containing the technical test

## Coding Test

As a SOC Engineer you'll be working with APIs (Such as AWS's EC2 API). This test is designed to give you the opportunity to show your ability to query an API using languages that are commonly used during operations at JUST EAT.  

JUST EAT has a public API available at [https://public.je-apis.com/](https://public.je-apis.com/) that you can use to get restaurant information, including restaurant details and delivery information.

As an example, [https://public.je-apis.com/restaurants?q=se19](https://public.je-apis.com/restaurants?q=se19) returns a list of restaurants that deliver to the outcode SE19, including some basic restaurant information.

The API requires you specify a set of valid request headers:

    Accept-Tenant: uk
    Accept-Language: en-GB
    Authorization: Basic VGVjaFRlc3RBUEk6dXNlcjI=
    Host: public.je-apis.com

The task is to create an application or script  that accepts an outcode as a parameter. The application should then display the following information about each restaurant that delivers to that outcode.

- Name
- Rating
- Types of food for the restaurant

### Platform / Language Choice

You can create the application as either a command line application or web application  in any of the following languages:

- PowerShell 
- Bash
- Python
- Ruby
- .NET / C#


### Task requirements

Feel free to spend as much or as little time on the exercise as you like as long as the following requirements have been met.  

- Please complete the user story below.
- Your code should compile and run in one step.
- Feel free to use whatever frameworks / libraries / packages you like.

### User Story

As a **user running the application**  
I can **view a list of restaurants in a user submitted outcode (ex. SE19)**  
So that **I know which restaurants are currently available**


#### Acceptance criteria

- For the known outcode se19, results are returned
- The Name, Cuisine Types and Rating of the restaurant are displayed

# Technical questions

Please answer the following questions in a markdown file called `Answers to technical questions.md`.

1. How long did you spend on the coding test? What would you add to your solution if you had more time? If you didn't spend much time on the coding test then use this as an opportunity to explain what you would add.
2. Why did you choose the language you used for the coding test?
3. What was the most useful feature that was added to the latest version of your chosen language? Please include a snippet of code that shows how you've used it.
4. How would you track down a performance issue in production? Have you ever had to do this?
5. How would you improve the JUST EAT APIs that you just used?
6. Please describe yourself using JSON.


####Thanks for your time, we look forward to hearing from you!
- The [JUST EAT Tech team](http://github.com/justeat)
