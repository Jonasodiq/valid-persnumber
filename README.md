# Swedish Personal Identity Number Validator

A simple Java program to validate Swedish personal identity numbers using the Luhn algorithm. The program accepts a personal number in the format YYMMDDXXXX and checks whether it is valid or not.

## Features

- Removes all non-numeric characters (e.g., hyphens) from the inputted personal number.
- Validates that the personal number has exactly 10 digits.
- Uses the Luhn algorithm to calculate the check digit.
- Outputs whether the personal number is valid or invalid.
- Allows the user to validate multiple personal numbers in one session.

## How to Use the Program

1. **Run the program** by executing `Main.java`.
2. **Enter a personal number** when prompted. The number should be in the format YYMMDDXXXX, but the program also accepts numbers with hyphens or spaces.
3. **The program will check if the personal number is valid** and print the result to the console.
4. **You can continue validating more personal numbers** by entering "y" when asked if you'd like to check another number. Otherwise, the program will exit.

## Example

```bash
Enter a personal number, 10 digits (YYMMDDXXXX): 9001011234
The personal number is valid.
Do you want to check another personal number? (y/n): y
Enter a personal number, 10 digits (YYMMDDXXXX): 850101-2345
The personal number is invalid.
Do you want to check another personal number? (y/n): n
```

## 
Here’s a suggestion for your README.md file in English:

markdown
Kopiera kod
# Swedish Personal Identity Number Validator

A simple Java program to validate Swedish personal identity numbers using the Luhn algorithm. The program accepts a personal number in the format YYMMDDXXXX and checks whether it is valid or not.

## Features

- Removes all non-numeric characters (e.g., hyphens) from the inputted personal number.
- Validates that the personal number has exactly 10 digits.
- Uses the Luhn algorithm to calculate the check digit.
- Outputs whether the personal number is valid or invalid.
- Allows the user to validate multiple personal numbers in one session.

## How to Use the Program

1. **Run the program** by executing `Main.java`.
2. **Enter a personal number** when prompted. The number should be in the format YYMMDDXXXX, but the program also accepts numbers with hyphens or spaces.
3. **The program will check if the personal number is valid** and print the result to the console.
4. **You can continue validating more personal numbers** by entering "y" when asked if you'd like to check another number. Otherwise, the program will exit.

## Example

```bash
Enter a personal number, 10 digits (YYMMDDXXXX): 9001011234
The personal number is valid.
Do you want to check another personal number? (y/n): y
Enter a personal number, 10 digits (YYMMDDXXXX): 850101-2345
The personal number is invalid.
Do you want to check another personal number? (y/n): n
```
## Requirements
**Java 8 or later must be installed on your machine.**
## Build and Run the Program
1. **Clone the project or download the source code.**

2. **Navigate to the project directory in your terminal.**

3. **Run the program:**

```bash
java Main
```
## Contributing
If you'd like to contribute to this project,
feel free to open a pull request or create an issue for any improvements or bugs you encounter.

## License
This project is licensed under the MIT License.