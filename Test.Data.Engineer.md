Just Eat Test Data Engineer Recruitment Test
==================================

Thank you for taking the time to do our technical test.

It consists of two parts:

* [A technical test](#technical-test)
* [A few feedback questions](#feedback-questions)

In order to avoid bounced emails we would like you to submit your results by uploading the relevant zip file to a shared Google Drive folder. In order to obtain the URL for this folder, please supply your Gmail or Google-based email address to either your agent or the Just Eat member of staff who assigned you the test.

Please make this a **single** zip file named `{yourname}-{role-applied-for}.zip` containing your solution to the technical test.

## Technical Test

### Technical Introduction
Just Eat raises hundreds of different event types. This task involves a simplification of the following 3 event types which are part of the order processing workflow:
- `OrderPlaced` is raised when a customer places an order
- `OrderDelivered` is raised when the customer receives their food
- `OrderCancelled` is raised when the customer manually cancels or the restaurant hasn't got the resources to complete the order

`OrderPlaced` represents the beginning of the workflow. Either one of `OrderDelivered` or `OrderCancelled` represents the terminus of the workflow.

The event schema is as follows:

    ```json
    {
        "Type": "OrderPlaced",
        "Data": {
            "OrderId": "3cb0f939-9398-4d29-a28f-2a1a3a6ce3b2",
            "TimestampUtc": "2017-05-14T19:12:32Z"
        }
    }
    ```
- `Type` is the event type.
- `Data.OrderId` is a randomly generated uuid which uniquely identifies an order. A single order may have more than one event associated with it.
- `Data.TimestampUtc` is the timestamp (iso format) at which the event occurred.

### Implementation
The technical test is to write an app that can generate events.

* Each order will produce two events namely (`OrderPlaced`, `OrderDelivered`) or (`OrderPlaced`, `OrderCancelled`).
* For every five orders, four orders will consist of `OrderPlaced` and `OrderDelivered` events and one order of `OrderPlaced` and `OrderCancelled` events.
* The batch of events within a given interval should be stored in a line-delimited JSON file named `orders-<timestamp>.json` eg. orders-2017-05-14-18-47-29-879763.json
* The app must take 4 arguments
    * number-of-orders - Number of orders to generate (nb. each order produces two events).
    * batch-size - Number of events per file.
    * interval - Interval in seconds between each file being created.
    * output-directory - Output directory for all created files.
* How to run the app

    ```bash
    generate-events \
        --number-of-orders=1000000 \
        --batch-size=5000 \
        --interval=1 \
        --output-directory=<local-dir>
    ```
* Example shows a snippet of ten events from the content of a generated file. Each event is on its own line separated by a line-break.

    ```json
    { "Type": "OrderPlaced", "Data": { "OrderId": "3cb0f939-9398-4d29-a28f-2a1a3a6ce3b2", "TimestampUtc": "2017-05-14T19:12:32Z" } }
    { "Type": "OrderDelivered", "Data": { "OrderId": "3cb0f939-9398-4d29-a28f-2a1a3a6ce3b2", "TimestampUtc": "2017-05-14T19:12:32Z"} }
    { "Type": "OrderPlaced", "Data": { "OrderId": "a7d86ca5-7541-4c86-a7ad-1bec2b070b3c", "TimestampUtc": "2017-05-14T19:12:33Z" } }
    { "Type": "OrderDelivered", "Data": {"OrderId": "a7d86ca5-7541-4c86-a7ad-1bec2b070b3c", "TimestampUtc": "2017-05-14T19:12:33Z"} }
    { "Type": "OrderPlaced", "Data": { "OrderId": "757001d9-a454-40d3-a14b-9f0f9440be9f", "TimestampUtc": "2017-05-14T19:12:34Z" } }
    { "Type": "OrderDelivered", "Data": { "OrderId": "757001d9-a454-40d3-a14b-9f0f9440be9f", "TimestampUtc": "2017-05-14T19:12:34Z"} }
    { "Type": "OrderPlaced", "Data": { "OrderId": "4f3fd16c-4685-45e6-a6f9-823f5f73a7d0", "TimestampUtc": "2017-05-14T19:12:35Z" } }
    { "Type": "OrderDelivered", "Data": {"OrderId": "4f3fd16c-4685-45e6-a6f9-823f5f73a7d0", "TimestampUtc": "2017-05-14T19:12:35Z"} }
    { "Type": "OrderPlaced", "Data": { "OrderId": "812a8469-68d0-4c9b-8429-d46d51d63db3", "TimestampUtc": "2017-05-14T19:12:36Z" } }
    { "Type": "OrderDelivered", "Data": { "OrderId": "812a8469-68d0-4c9b-8429-d46d51d63db3", "TimestampUtc": "2017-05-14T19:12:36Z"} }
    { "Type": "OrderPlaced", "Data": { "OrderId": "8825cd95-f172-4132-9793-864b4dd725df", "TimestampUtc": "2017-05-14T19:12:37Z" } }
    { "Type": "OrderCancelled", "Data": {"OrderId": "8825cd95-f172-4132-9793-864b4dd725df", "TimestampUtc": "2017-05-14T19:12:37Z"} }
    ```
* Every `OrderPlaced` event must have a `OrderDelivered` or `OrderCancelled` event with the same `OrderId`.

### Platform Choice

You can create the solution in any language or framework of your choice. Please don't use a language that you're unfamiliar with. We want to see you in your element!

# Feedback Questions

Feel free to spend as much or as little time on the exercise as you like. We would really like you to show us how you code. We are looking for a good demonstration of best practice, but above all, that it is functional, readable and easy to follow and review.

Please create a README.md file in the root directory.

in the README:

1. Provide clear instructions on your test setup and how to execute your tests.
1. List any additional comments or observations you might want to share about your submission.
1. How long did you spend on the coding test?
1. What would you add to your solution if you had more time? If you didn't spend much time on the coding test then use this as an opportunity to explain what you would add.
1. Why did you choose the language you used for the coding test?
1. Please describe yourself using JSON.


#### Thanks for your time, we look forward to hearing from you!
- The [Just Eat Tech team](https://careers.just-eat.com/departments/technology)
