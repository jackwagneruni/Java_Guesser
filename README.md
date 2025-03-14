this is the algorithm I wrote for my java program, let me know if this follows the same principles from what you did with python

# Java Guesser Algorithm

## Menu and main loop

Options:

0. Exit
1. Human Guesser
2. Computer Guesser

ask the user to pick a choice
Interpret the user's input
0: exit the program
1: start human guesser class
2: start computer guesser class

## Human Guesser Mode
1. Calculate a random number between 1 and 100
2. Repeat the following until the user guesses correctly
  - If the user guesses too low print that it was too low a guess
  - If the user guesses too high print it was too high a guess
  - If the user guesses correctly: print saying they got it correct

## Computer Guesser Mode (Binary Search)
1. Set variable `low` to equal 1, and `high` = 100.
2. Repeat these steps until the number is correctly guessed:
- calculate `guess` = (low + high) / 2.
- print "I guess " + guess
- Ask the user if the guess is too high (H), too low (L), or correct (C).
- Adjust the range:
  - If H, set `high` to a vaulue of (`guess` - 1)
  - If L, set `low` to the value of (`guess` + 1)
  - If C, print "Correct!" and set the repeat variable to false
