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
                System.out.println(msg); // in ra thông báo
                String input = scanner.nextLine();
                int num = Integer.parseInt(input); // ép đổi sang dạng int
                if (num > 0) { // kiểm tra điều kiện số có âm hay ko 
                    return num;
                } else {
                    System.out.println("Negative integer is NOT allowed!");
                }
            } catch (Exception e) { // Phát hiện lỗi => bắt user nhập lại
                System.out.println("Please input a integer");
            }
        }
    }

    public int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size]; // Khởi tạo biến rỗng 
        for (int i = 0; i < arr.length; i++) { // duyệt qua tất cả phân tử trong mảng
            arr[i] = random.nextInt(size) + 1; // random ra từ 0 -> size -1, sau đó +1 => thành từ 1 -> size
        }
        return arr;
    }

    public void displayArray(int[] arr) {
        System.out.println("The array: " + Arrays.toString(arr)); // làm này cho nhanh
    }

    public void displaySearchResult(int[] numberArray, int searchValue) {
        boolean isFound = false;
        for (int i = 0; i < numberArray.length; i++) { // duyệt qua tất cả phân tử trong mảng
            if (numberArray[i] == searchValue) {// nếu đúng => in ra output
                System.out.println("Found " + searchValue + " at index: " + i);
                isFound = true; // gắn cờ xác nhận đã tìm dc
                break; 
            }
        }
        if (!isFound) { // nếu chưa tìm dc, in ra dòng dưới 
            System.out.println("Can't find index!");
        }
    }
}
