# Just Eat Data Engineer Recruitment Test
Thank you for taking the time to apply to Just Eat as a Data Engineer!

## Process

The next stage of the interview process involves some live code pairing.
To prepare for this, you have 2 options, pick which ever option you are most comfortable with:

### 1. Prepare only
- Read and understand the [Problem Statement](#problem-statement)
- Set up your favourite IDE with the sample [scala](./scala) or [python](./python) code.
- Make sure you know how the code works, it compiles and you know how to run it with different args
- Think about how you plan on implementing a solution to the problem

In the code pairing session, we will start coding the solution 

### 2. Spend an hour or two implementing a solution
- Complete all the above steps in '1. Prepare only'
- Start coding your solution 

In the code pairing session, we will continue coding or add a new feature



## Problem Statement

Your task is to write a command line application that splits a single large csv file into many smaller files.

If your program was invoked as follows, it should read the input file `path/to/file`, 
and split it into many output files in the directory `path/to/dir`. 
None of the files in the output directory should be greater than 500 bytes in size or 100 lines long.

```bash
./file-splitter --input-file path/to/file --output-dir path/to/dir --max-bytes 500 --max-lines 100
```

The output file names should have a part number appended to it.  
For example, with an input file `large-data.csv` the output directory would contain:

```
output-dir/large-data-part0.csv
output-dir/large-data-part1.csv
output-dir/large-data-part2.csv
...
```


## Top tips

At Just Eat we value code that is functional, simple to read and review, and demonstrates best practice.

You should complete this assignment in Scala or Python, unless instructed otherwise. 
Sample projects with the arguments parsed are provided. 
If you would like to use a different method for argument parsing this is fine.

Think about the libraries and frameworks you intend to use. Are they suitable for the scale of this problem?

We judge based on the following things:
* Code readability
* Code well architected / separated
* Testing of key parts 
* Code maintainability, can it be extended
* Code performance
