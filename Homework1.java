package EPAM;

public class Homework1 {

    static int[] bubbleSort(int[] array) {
        int[] clone = array.clone();
        int temp;
        for (int i = 0; i < clone.length; i++) {
            for (int j = 0; j < clone.length; j++) {
                if (clone[i] < clone[j]) {
                    temp = clone[j];
                    clone[j] = clone[i];
                    clone[i] = temp;
                }
            }
        }
        return clone;
    }

    static int[] sortedOddEven(int[] array) {
        int countOdd = 0;
        int countEven = 0;
        for (int i : array) {
            if (i % 2 == 1 || i % 2 == -1) {
                countOdd++;
            } else {
                countEven++;
            }
        }
        int[] odds = new int[countOdd];
        int[] evens = new int[countEven];
        for (int i : array) {
            if (i % 2 == 1 || i % 2 == -1) {
                odds[countOdd - 1] = i;
                countOdd--;
            } else {
                evens[countEven - 1] = i;
                countEven--;
            }
        }
        odds = bubbleSort(odds);
        evens = bubbleSort(evens);
        int resultIndex = 0;
        int[] result = new int[array.length];
        while (countOdd < odds.length) {
            result[resultIndex] = odds[countOdd];
            countOdd++;
            if (resultIndex > evens.length * 2 - 2) {
                resultIndex++;
                continue;
            }
            resultIndex += 2;
        }
        resultIndex = 1;
        while (countEven < evens.length) {
            result[resultIndex] = evens[countEven];
            countEven++;
            if (resultIndex > odds.length * 2 - 2) {
                resultIndex++;
                continue;
            }
            resultIndex += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {-9, 4, -6, -7, -3, 4, 5, 6, 3, -1, 8, -6, 2, -4, -7, 7, -9, 7, 9, 7};

        int[] result = sortedOddEven(array);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
