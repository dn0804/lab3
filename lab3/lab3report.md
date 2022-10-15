# Part 1






# Part 2

## Reverse In Place bug

Failure-inducing input:

![Image](test.png)

Symptom:

![Image](symptom.png)

From this failure message, the array's elements did not change position starting at the latter half of the array. The element [3] was still 4, meaning its position was unaffected.

Bug:

![Image](bug.png)

Fixed code:

![Image](fixedreverseinplace.jpg)