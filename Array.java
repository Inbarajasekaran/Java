class Array {
    static int[] array = new int[5];
    static int[] array1 = { 1, 2, 3, 4, 5 };
    static int array2[][] = { { 1, 2, 3 }, { 4, 5 } };

    static class SingleDArray {
        public void printSingleDArray() {
            // System.out.println(array); // // points the array address
            for (int i = 0; i < array1.length; i++) {
                System.out.println(array1[i]);
            }
        }
    }

    static class MultiDArray {
        int[][] multiDArray = new int[3][2];
        int multiDArray1[][] = { { 1, 2, 3 }, { 4, 5 }, { 7, 8 } };

        public void printMultiDArray() {
            multiDArray[0][0] = 1;
            multiDArray[0][1] = 2;

            multiDArray[1][0] = 4;
            multiDArray[1][1] = 5;

            multiDArray[2][0] = 4;
            multiDArray[2][1] = 5;

            // for (int i = 0; i < multiDArray.length; i++) {
            // for (int j = 0; j < 2; j++) {
            // System.out.println(multiDArray[i][j]);
            // }
            // }

            for (int i = 0; i < multiDArray1.length; i++) {
                for (int j = 0; j < multiDArray1[i].length; j++) {
                    System.out.println(multiDArray1[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        // SingleDArray singleDArray = new SingleDArray();
        // singleDArray.printSingleDArray();
        MultiDArray multiDArray = new MultiDArray();
        multiDArray.printMultiDArray();
    }
}