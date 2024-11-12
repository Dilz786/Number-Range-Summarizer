package numberrangesummarizer;

import java.util.Collection;

public class NumberRangeSummarizerImplTest {

    public static void main(String[] args) {
        NumberRangeSummarizer summarizer = new NumberRangeSummarizerImpl();

        // Test case 1: Provided example
        runTest(summarizer, "1,3,6,7,8,12,13,14,15,21,22,23,24,31", "1, 3, 6-8, 12-15, 21-24, 31", "Example Test");

        // Test case 2: No ranges (individual numbers)
        runTest(summarizer, "1,3,5,7,9", "1, 3, 5, 7, 9", "No Ranges");

        // Test case 3: Single element
        runTest(summarizer, "5", "5", "Single Element");

        // Test case 4: Mixed ranges and singles
        runTest(summarizer, "1,2,4,5,6,8,10,11,12,15", "1-2, 4-6, 8, 10-12, 15", "Mixed Ranges and Singles");

        // Test case 5: Empty input
        runTest(summarizer, "", "", "Empty Input");

        // Test case 6: Large range
        runTest(summarizer, "1,2,3,4,5,6,7,8,9,10", "1-10", "Large Range");

        // Test case 7: Edge case with min and max integers
        runTest(summarizer, Integer.MIN_VALUE + "," + (Integer.MIN_VALUE + 1) + "," + Integer.MAX_VALUE,
                Integer.MIN_VALUE + "-" + (Integer.MIN_VALUE + 1) + ", " + Integer.MAX_VALUE,
                "Edge Case with Min and Max Integers");

        System.out.println("All tests completed.");
    }

    private static void runTest(NumberRangeSummarizer summarizer, String input, String expected, String testName) {
        Collection<Integer> numbers = summarizer.collect(input);
        String result = summarizer.summarizeCollection(numbers);
        
        System.out.println("Running " + testName + "...");
        System.out.println("Input: " + input);
        System.out.println("Expected Output: " + expected);
        System.out.println("Actual Output: " + result);

        if (result.equals(expected)) {
            System.out.println(testName + " passed.\n");
        } else {
            System.out.println(testName + " failed.\n");
        }
    }
}


