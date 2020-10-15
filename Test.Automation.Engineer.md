# Just Eat Test Automation Engineer Recruitment Test

Thank you for taking the time to do our technical test. It consists of two parts:

1. [Technical test](#technical-test)
   - [UI Automated Test](#ui-automated-test)
   - [API Automated Test](#api-automated-test)
2. [Technical questions](#technical-questions)

Please don't publish your solution as a public repository, but submit your results by uploading the relevant zip file to a shared Google Drive folder instead.
In order to obtain the URL for this folder, please supply your Gmail or Google-based email address to either your recruitment contact or the Just Eat member of staff who assigned you the test.

Please make this a **single** zip file named `{yourname}-{role-applied-for}.zip` containing:

  1. A single markdown file with the answers to the technical questions
  1. A folder containing the technical test (please try not to include files like library dependencies)

## Technical Test

### UI Automated Test

Just Eat's consumer-facing website in the UK is available at [www.just-eat.co.uk](https://www.just-eat.co.uk/), which you can use to find takeaway restaurants in a postcode area.

_If you are based internationally, you may have to use a more local website to your current location instead of the UK website due to IP restrictions, for example [www.menulog.com.au](https://www.menulog.com.au/) in Australia or [www.just-eat.es](https://www.just-eat.es/) in Spain._

#### Tasks

The UI Automated Test consists of two tasks:

  1. Write the step definitions for the scenario below.
  1. Add two more scenarios, with corresponding step definitions, which you feel would enhance the test coverage of the site.

#### Platform Choice

Feel free to use any programming language, libraries and frameworks you are experienced with.

#### Task requirements

- Clear test setup and execution instructions are provided in the README.md file
- All code changes are documented and structured as well-described Git commits

#### Scenario to Automate

```gherkin
Feature: Use the website to find restaurants
  So that I can order food
  As a hungry customer
  I want to be able to find restaurants in my area

Scenario: Search for restaurants in an area
  Given I want food in "AR51 1AA"
  When I search for restaurants
  Then I should see some restaurants in "AR51 1AA"
```

----

### API Automated Test

Just Eat has a public API available at <https://uk.api.just-eat.io/> that you will use to get restaurant information.

#### Prerequisites

- URL: <https://uk.api.just-eat.io>
- Endpoint: `/restaurants/bypostcode/{postcode}`
- Method: `GET`

#### Example

`GET` <https://uk.api.just-eat.io/restaurants/bypostcode/ar511aa> returns complex restaurants-related data for postcode `AR51 1AA`

#### Tasks

1. Verify `Restaurants[n].Address` sub-object of each restaurant object in response. It should reflect the following schema:

``` json
{
  "properties": {
    "City": {
      "type": "string",
      "description": "City name"
    },
    "FirstLine": {
      "type": "string",
      "description": "First line of address"
    },
    "Postcode": {
      "type": "string"
    },
    "Latitude": {
      "type": "number",
      "format": "decimal"
    },
    "Longitude": {
      "type": "number",
      "format": "decimal"
    }
  }
}
```

2. Verify the following functional requirements regarding restaurants data in response:

- `A restaurant with more than 1 rating should have a star rating greater than 0`
- `A restaurant with no ratings should have a star rating of 0`
- `A restaurant should have a valid URL (returns 200)`

3. Design 3 more requirements which you think are missing most and implement verification tests.

#### Platform Choice

Feel free to use any programming language, libraries and frameworks you are experienced with.

#### Task requirements

- A RESTful API test automation library/framework is implemented using any programming language from scratch
- Clear test setup and execution instructions are provided in the README.md file
- All code changes are documented and structured as well-described Git commits

----

## Technical questions

Please answer the following questions in a markdown file called `Answers to technical questions.md`.

1. How long did you spend on the technical test?
1. What would you add to your solution if you had more time?
1. If you didn't spend much time on the technical test then use this as an opportunity to explain what you would add.
1. What do you think is the most interesting trend in test automation?
1. How would you implement test automation in a legacy application? Have you ever had to do this?
1. How would you improve the customer experience of the Just Eat website?

----

Thanks for your time, we look forward to hearing from you!

The [Just Eat Tech](https://careers.just-eat.com/departments/technology) team
