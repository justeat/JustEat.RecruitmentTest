# Just Eat Associate Engineer Recruitment Test

Thank you for taking the time to do our technical test. It consists of two parts:

1. [Technical test](#technical-test)
2. [Technical questions](#technical-questions)

Please don't publish your solution as a public repository, but submit your results by uploading the relevant zip file to a shared Google Drive folder instead.
In order to obtain the URL for this folder, please supply your Gmail or Google-based email address to either your recruitment contact or the Just Eat member of staff who assigned you the test.

Please make this a **single** zip file named `{yourname}-{role-applied-for}.zip` containing:

  1. A single Markdown file with the answers to the technical questions
  1. A folder containing the technical test (please try not to include files like library dependencies)

### Technical Test

Just Eat has a public API available at https://uk.api.just-eat.io/ that you will use to get restaurant information.

As an example, https://uk.api.just-eat.io/restaurants/bypostcode/ar511aa returns a list of restaurants that deliver to AR51 1AA, including some basic restaurant information.

The task is to write some code that accepts a postcode as a parameter and then returns a list of restaurants for that postcode. The application should then display the following information about each restaurant returned in the results:

- Name
- Rating

The input and display can be on a web page or a terminal/console.

### The API Call
- URL: `https://uk.api.just-eat.io`
- Endpoint: `/restaurants/bypostcode/{postcode}`
- Method: `GET`

#### Tasks

1. As a customer, when I input my postcode, then I am shown a list of restaurants for that postcode
2. As a customer, when I input no postcode, I am shown no results
3. As a customer, when I input an invalid postcode, I am shown no results


#### Platform Choice

Feel free to use any programming language, libraries and frameworks you are experienced with.

#### Expectations

- Please do not spend too much time on UI design. We would happily receive a test which simply outputs a text-based list or restaurant names and ratings in a browser.
- We do not require extensive user input and error handling. Just ensure your solution doesn't fall over if a customer were to type in an empty postcode. 
- A JavaScript and HTML file which we can run in your preferred web browser is an acceptable solution. 

## Technical Questions

Please answer the following questions and include them in the Markdown file uploaded with your technical test

1. How long did you spend on the technical test?
2. What would you add to your solution if you had more time?
3. What do you think you could research or learn more about to help you build a better solution, given more time?
4. How would you go about researching or learning the above?

