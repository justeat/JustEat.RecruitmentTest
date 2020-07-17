# Just Eat Data Engineer Recruitment Test
Thank you for taking the time to do our technical test.

It consists of two parts:

1. A technical test
1. A few feedback questions


### Your assignment

We would really like you to show off how you code. At Just Eat we value code that is functional, simple to read and review, demonstrates best practice.

You can complete this assignment in Scala or Python. Sample projects with the arguments parsed are provided. If you would like to use a different method for argument parsing this is fine.

We advise candidates to spend no longer than 90m on this test. If you run out of time, leave us some notes about the specific improvements you would have made had you had more time!


### Judging criteria

* Code readability
* Code well architected / separated
* Testing of key parts 
* Code maintainability, can it be extended
* Code performance

 *if you are applying for the associate or junior role don't worry if you cannot achieve all of the criteria  


## Code test

Your task is to write a command line application that splits a large file into smaller files.

The (smaller) output files should meet the following requirements:

* The number of lines must not exceed some limit (param: --max-lines)
AND
* The number of bytes must not exceed some limit (param: --max-bytes)


Your program should be invoked like so:

```bash
./file-splitter --input-file path/to/file --output-dir path/to/dir --max-bytes 5 --max-lines 10000
```

The output file names should have a part number appended to it.  For example for an input file `large-data.jsonl` the output directory would contain:

```
output-dir/large-data-part0.jsonl
output-dir/large-data-part1.jsonl
output-dir/large-data-part2.jsonl
...
```

## Feedback Questions

Please create a README.md file in the root directory.

in the README:

1. Provide clear instructions on your test setup and how to execute your tests.
1. List any additional comments or observations you might want to share about your submission.
1. How long did you spend on the coding test?
1. What would you add to your solution if you had more time? If you didn't spend much time on the coding test then use this as an opportunity to explain what you would add.
1. Why did you choose the language you used for the coding test?
1. Please describe yourself using JSON.


## Submitting the test

In order to avoid bounced emails we would like you to submit your results by uploading the relevant zip file to a shared Google Drive folder. In order to obtain the URL for this folder, please supply your Gmail or Google-based email address to either your agent or the Just Eat member of staff who assigned you the test.

Please make this a single zip file named {yourname}-{role-applied-for}.zip containing your solution to the technical test.


#### Thanks for your time, we look forward to hearing from you!
- The [Just Eat Data and AI team](https://careers.just-eat.com/departments/data-and-ai)
