package algorithms;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        // make a good test array
        int[] myArray = {5,8,-3,0,200,-10,5,-3};
        //call the method
        System.out.println(findMin(myArray) == -10);
    }

    // Finds the minimum value in an array
    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int num : array) {
            if (num <= minValue) { // just in case someone has MAX_VALUE in here
                minValue = num;
            }
        }
        return minValue;
    }

    // Finds the maximum value in an array
    public static int findMax(int[] array) {
        int maxValue = array[0];
        for (int num : array) {
            if (num >= maxValue) { // just in case someone has MAX_VALUE in here
                maxValue = num;
            }
        }
        return maxValue;
    }

    // Finds the average value of elements in an array
    public static double findAverage(int[] array) {
        // TODO: Implement this method
        double total = 0.0;
        for (int i = 0; i <array.length;i++) {
            total+= array[i]; // use 'total' instead of 'sum'
        }
        return total / array.length;
    }

    // Shifts the array to the left by one position
    public static int[] shiftLeft(int[] array) {
        // TODO: Implement this method
        // make empty array of same length
        int[] finalArray = new int[array.length];
        for (int i = 1;i < array.length; i++) {
            finalArray[i - 1]=array[i];
        }
        finalArray[array.length - 1] = array[0];
        return finalArray;
    }

    // Shifts the array to the right by one position
    public static int[] shiftRight(int[] array) {
        // TODO: Implement this method
        int[] finalArray = new int[array.length];
        for (int i = 0; i <array.length - 1; i++) {
            finalArray[i + 1] = array[i];
        }
        finalArray[0] = array[array.length - 1];
        return finalArray;
    }

    // Reverses the elements in the array
    public static int[] reverseArray(int[] array) {
        // TODO: Implement this method

        int[] finalArray =new int[array.length];
        for (int i = 0; i < array.length; i++) {
            finalArray[i] = array[array.length - 1 - i];
        }
        return finalArray;
    }
}
