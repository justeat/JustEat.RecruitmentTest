# Just Eat Test Automation Engineer Recruitment Test

Thank you for taking the time to do our technical test. It consists of two parts:

  1. [A technical test](#technical-test)
  1. [A few technical questions](#technical-questions)

In order to avoid bounced emails we would like you to submit your results by uploading the relevant zip file to a shared Google Drive folder. In order to obtain the URL for this folder, please supply your Gmail or Google-based email address to either your recruitment contact or the Just Eat member of staff who assigned you the test.

Please make this a **single** zip file named `{yourname}-{role-applied-for}.zip` containing:

  1. A single markdown file with the answers to the technical questions
  1. A folder containing the technical test (please try not to include files like library dependencies)

## Technical Test

Just Eat's consumer-facing website in the UK is available at [www.just-eat.co.uk](https://www.just-eat.co.uk/), which you can use to find takeaway restaurants in a postcode area.

The Technical test consists of two tasks:

  1. Write the step definitions for the scenario below.
  1. Add two more scenarios, with corresponding step definitions, which you feel would enhance the test coverage of the site.

_If you are based internationally, you may have to use a more local website to your current location instead of the UK website due to IP restrictions, for example [www.menulog.com.au](https://www.menulog.com.au/) in Australia or [www.just-eat.es](https://www.just-eat.es/) in Spain._

### Scenario to Automate

```
Feature: Use the website to find restaurants
  So that I can order food
  As a hungry customer
  I want to be able to find restaurants in my area

Scenario: Search for restaurants in an area
  Given I want food in "AR51 1AA"
  When I search for restaurants
  Then I should see some restaurants in "AR51 1AA"
```

### Platform Choice

You can create step definitions using any language or framework you are experienced with.

### Task requirements

Feel free to spend as much or as little time on the exercise as you like as long as the following requirements have been met:

  * Please complete the two tasks described above.
  * You should provide clear instructions on your test setup and how to execute your tests. The clarity and precision of these instructions - and the ease with which the interviewers can execute them - will be a key part of the assessment. Please create a README file detailing said instructions. Please also use this file for listing any additional comments or observations you might want to share about your submission.

## Technical questions

Please answer the following questions in a markdown file called `Answers to technical questions.md`.

  1. How long did you spend on the technical test? What would you add to your solution if you had more time? If you didn't spend much time on the technical test then use this as an opportunity to explain what you would add.
  1. What do you think is the most interesting trend in test automation?
  1. How would you implement test automation in a legacy application? Have you ever had to do this?
  1. How would you improve the customer experience of the Just Eat website?
  1. Please describe yourself using JSON.


#### Thanks for your time, we look forward to hearing from you!
- The [Just Eat Tech](https://careers.just-eat.com/departments/technology) team
