package linearsearch;

public class Main {

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        // Step 1: Display screen for user to input positive number (array size)
        int arraySize = search.inputPositiveNumber("Enter number of array: ");
        // Step 2: Generate random integer in number range for each array element
        int[] numberArray = search.generateRandomArray(arraySize);
        // Step 3: Input search value
        int searchValue = search.inputPositiveNumber("Enter search value: ");
        // Step 4: Display the array
        search.displayArray(numberArray);
        // Step 5: Display index of search number in array
        search.displaySearchResult(numberArray, searchValue);

    }
}
