package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    @Override
    public Collection<Integer> collect(String input) {
        // Split the input by commas, parse to integers, and collect them in a list
        List<Integer> numbers = new ArrayList<>();
        for (String str : input.split(",")) {
            try {
                numbers.add(Integer.parseInt(str.trim()));
            } catch (NumberFormatException e) {
                // Ignore any invalid numbers
            }
        }
        Collections.sort(numbers);
        return numbers;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        List<Integer> numbers = new ArrayList<>(input);
        if (numbers.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int start = numbers.get(0);
        int end = start;

        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current == end + 1) {
                // Continue the range
                end = current;
            } else {
                // End the current range and start a new one
                appendRange(result, start, end);
                start = end = current;
            }
        }
        // Append the last range
        appendRange(result, start, end);

        return result.toString();
    }

    private void appendRange(StringBuilder result, int start, int end) {
        if (result.length() > 0) {
            result.append(", ");
        }
        if (start == end) {
            result.append(start);
        } else {
            result.append(start).append("-").append(end);
        }
    }
}
