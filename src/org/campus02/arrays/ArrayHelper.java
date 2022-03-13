package org.campus02.arrays;

public class ArrayHelper {

    public static void main(String[] args) {

        int[] testArray = {8,5,1,9,0,4};

        System.out.println("<<< Initial Array >>>");
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + ", ");
        }
        System.out.println("");
        System.out.println("");

        System.out.println("<<< Sorted Array >>>");
        arrangeOrder(testArray);
        for(int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + ", ");
        }
        System.out.println("");
        System.out.println("");

    }

    public static void arrangeOrder(int[] numbers) {

        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i + 1]){
                int lower = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = lower;
                arrangeOrder(numbers);
            }
        }

    }
}
