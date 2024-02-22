# Conditionals and Logic - Java Lab 005

**Instr uctions:**
1. Fork this repository to your GitHub account.
2. Clone the forked repository locally to your machine.
3. Create a new branch named Feature01.

## Part 1: Simplifying Nested Conditionals

**Objective:**
Rewrite the code **conditional code** in [Rewrite.java](src/Rewrite.java) by using a single **if** statement and **logical** operators.

## Part 2: Guess My Number Game

**Objective:**
Modify the existing Guess My Number game from your previous lab to provide feedback on whether the guess is too high or too low. Continue until the user guesses correctly or reaches three incorrect guesses. Display a message and terminate the program if the correct number is guessed.
* I've given you a file `src/GuessMyNumber2.java` to complete this part.

## Part 3: Fermat's Last Theorem Checker

Fermat’s Last Theorem says: If n > 2, there are no integers a, b, c, and n such that $$a^n + b^n = c^n$$


**Objective:**
Write a program in a file named `src/Fermat.java` that checks Fermat’s Last Theorem for four input integers (a, b, c, and n). If \( n > 2 \) and \( a^n + b^n = c^n \), display "Holy smokes, Fermat was wrong!" Otherwise, display "No, that doesn’t work."

Hint: Math.pow is useful.

## Part 4: Evaluating Logic Expressions

**Objective:**
Using the given variables, evaluate the logic expressions in the table below and write your answers as true, false, or error in the Markdown table's Result column.

```java
boolean yes = true;
boolean no = false;
int loVal = -999;
int hiVal = 999;
double grade = 87.5;
double amount = 50.0;
String hello = "world";
```
| Expression                               | Result |
| ---------------------------------------- |--------|
| yes == no &#124;&#124; grade > amount    | TRUE   |
| amount == 40.0 &#124;&#124; 50.0          | ERROR  |
| hiVal != loVal &#124;&#124; loVal < 0     | TRUE   |
| True &#124;&#124; hello.length() > 0     | TRUE   |
| hello.isEmpty() && yes                   | FALSE  |
| grade <= 100 && !false                   | TRUE   |
| !yes &#124;&#124; no                      | FALSE  |
| grade > 75 > amount                      | ERROR  |
| amount <= hiVal && amount >= loVal       | TRUE   |
| no && !no &#124;&#124; yes && !yes       | FALSE  |

## Part 5: Logical Operators Understanding

**Objective:**
Determine the output of the program in [FlowOfExecution.java](src/FlowOfExecution.java) without using IntelliJ or another IDE.
Understanding how to trace through code, understand logical operators, and following the flow of execution is critical to becoming a good programmer, and of course just a good problem solver.
true
true
ping!
pong!

## Part 6: Triangle Formation Test

**Objective:**
Create a file named `src/Triangle.java` and write a program in it that determines if three given lengths can form a triangle. The test for triangle formation is as follows:
- If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.

**Requirements:**
- Input three integers representing the lengths of sticks.
- Output whether you can (or cannot) form a triangle with the given lengths.
- Create code to validate inputs are valid integers.
- Display an error if any of the lengths are negative or zero.

## Submission
Follow these steps for submission:
1. Create a Feature01 branch of your code if you haven't already.
2. Commit your working code for all exercises to your local copy/Feature01 branch.
3. Push it to your Remote/origin branch (i.e., GitHub: Feature01 -> origin/Feature01).
4. Issue a Pull request to my instructor repo.
5. **Make sure to COPY the Pull request URL and submit it for the lab/assignment in Canvas.**
