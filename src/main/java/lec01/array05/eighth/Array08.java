package lec01.array05.eighth;

import java.util.Arrays;

public class Array08 {

    public static void main(String[] args) {

        int[] intArr1 = new int[] {1, 2, 3, 4, 5};
        int[] intArr2 = new int[5];
        System.arraycopy(intArr1, 1, intArr2, 0, 2);
        System.out.println(Arrays.toString(intArr2)); // [2, 3, 0, 0, 0]

        /**
         * System.arraycopy("원본배열", "원본시작위치", "복사배열", "복사배열시작위치", "총길이")
         */

        int[] anotherArr1 = new int[] {1, 2, 3, 4, 5};
        int[] copyArr1 = new int[5];
        System.arraycopy(anotherArr1, 0, copyArr1, 0, 3);
        System.out.println(Arrays.toString(copyArr1));

        copyArr1 = new int[5];
        int anotherLength = anotherArr1.length;

        for (int i = 0; i < anotherLength; i++) {
            System.out.println(anotherArr1[i]);
        }

        for (int i = 1; i < 4; i++){
            int extValue = anotherArr1[i];
            copyArr1[i - 1] = extValue;
        }
        System.out.println(Arrays.toString(copyArr1));

    }
}
