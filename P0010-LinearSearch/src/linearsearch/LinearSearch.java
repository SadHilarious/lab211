package linearsearch;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

// LƯU Ý: comment vòng lặp, điều kiện
public class LinearSearch {

    public int inputPositiveNumber(String msg) {
        Scanner scanner = new Scanner(System.in); 
        // loop until user inputs a valid positive integer
        while (true) {
            try {
                System.out.println(msg); // print message 
                String input = scanner.nextLine();
                int num = Integer.parseInt(input); // force to use int 
                if (num > 0) { // check condition
                    return num;
                } else {
                    System.out.println("Negative integer is NOT allowed!");
                }
            } catch (Exception e) { // tt helps detect all data type except INT
                System.out.println("Please input a integer");
            }
        }
    }

    public int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size]; // create empty variable for storring array
        for (int i = 0; i < arr.length; i++) { // pass through all the INT in array
            arr[i] = random.nextInt(size) + 1; // random ra từ 0 -> size -1, sau đó +1 => thành từ 1 -> size (méo bt dịch sang tiếng anh như lào)
        }
        return arr;
    }

    public void displayArray(int[] arr) {
        System.out.println("The array: " + Arrays.toString(arr)); 
    }

    public void displaySearchResult(int[] numberArray, int searchValue) {
        boolean isFound = false;
        for (int i = 0; i < numberArray.length; i++) { // pass through all in INT in array
            if (numberArray[i] == searchValue) {// if true => print bellow
                System.out.println("Found " + searchValue + " at index: " + i);
                isFound = true; // mark this INT as true
                break; // stop if found
            }
        }
        if (!isFound) { // if not found, print bellow
            System.out.println("Can't find index!");
        }
    }
}
