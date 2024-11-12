# Number Range Summarizer

This Java project implements a solution for summarizing a sequence of numbers by grouping consecutive numbers into ranges. It was developed as part of an exercise to showcase coding proficiency, understanding of Java 8, and testing capabilities.

## Requirements

- **Java 8** or higher
- A Java IDE like Eclipse (optional)

## Project Structure

- `NumberRangeSummarizer.java`: Interface definition for the summarizer.
- `NumberRangeSummarizerImpl.java`: Implements the `NumberRangeSummarizer` interface, providing functionality for collecting and summarizing number ranges.
- `NumberRangeSummarizerImplTest.java`: Contains unit tests to validate the functionality of the summarizer.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Dilz786/Number-Range-Summarizer.git
   
2. Open the project in your preferred IDE or compile and run it from the command line.

## Usage Example

The summarizer takes a comma-delimited list of integers as input and outputs a summarized version:

Input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31"

Expected Output: "1, 3, 6-8, 12-15, 21-24, 31"

## Running Tests

1. Open NumberRangeSummarizerImplTest.java in your IDE.
2. Run the main method to execute all tests.
3. The console will display the test name, input, expected output, actual output, and pass/fail status for each test case.

## Assumptions and Edge Cases

Input Assumptions: The input is a valid comma-delimited list of integers.
Edge Cases: The implementation handles empty input, single numbers, and the largest and smallest integer values.
