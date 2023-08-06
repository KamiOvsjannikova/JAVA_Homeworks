package org.example.homework0108;
//Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        System.out.println("Missing positive: " + findMissingPositive(arr1));

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        System.out.println("Missing positive: " + findMissingPositive(arr2));

    }
    public static int findMissingPositive(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        int[] positiveArr = new int[n - j];
        System.arraycopy(arr, j, positiveArr, 0, n - j);

        for (int i = 0; i < positiveArr.length; i++) {
            int index = Math.abs(positiveArr[i]) - 1;
            if (index < positiveArr.length) {
                positiveArr[index] = -Math.abs(positiveArr[index]);
            }
        }

        for (int i = 0; i < positiveArr.length; i++) {
            if (positiveArr[i] > 0) {
                return i + 1;
            }
        }

        return positiveArr.length + 1;
    }
}




