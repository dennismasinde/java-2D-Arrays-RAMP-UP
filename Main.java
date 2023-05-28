public class Main {

    public static int[][] arr1 = {
            {4,8,1},
            {9,5,3},
            {6,4,6}
    };

    public static void main(String[] args) {
        printAllElements(arr1);
        System.out.println("-------------------");
        printFirstAndLastRow(arr1);
        System.out.println("-------------------");
        printFirstAndLastColumn(arr1);
        System.out.println("-------------------");
        printBorderElements(arr1);
        System.out.println("-------------------");
        printOnlyDiagonalElements(arr1);
        System.out.println("-------------------");
        printAllElementsBelowTheMajorDiagonal(arr1);
        System.out.println("-------------------");
        printAllElementsAboveTheMajorDiagonal(arr1);
        System.out.println("-------------------");
        printAllEvenElements(arr1);
        System.out.println("-------------------");
        printAllOddElements(arr1);
        System.out.println("-------------------");
        multiplyAllElementsByTen(arr1);
        System.out.println("-------------------");
        swapFirstRowWithLastRow(arr1);
        System.out.println("-------------------");
        swapFirstColumnWithLastColumn(arr1);
        System.out.println("-------------------");
        circularShiftArrayUp(arr1);
        System.out.println("------------------- ");
        circularShiftArrayDown(arr1);
        System.out.println("--------------------");
    }

    public static void printAllElements(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void printFirstAndLastRow(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (row == 0 || row == arr.length - 1) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void printFirstAndLastColumn(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (col == 0 || col == arr[0].length - 1) {
                    System.out.print(arr[row][col] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printBorderElements(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (col == 0 || col == arr[0].length - 1 ||
                        row == 0 || row == arr.length - 1) {
                    System.out.print(arr[row][col] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printOnlyDiagonalElements(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (row == col || row + col + 1 == arr.length) {
                    System.out.print(arr[row][col] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printAllElementsBelowTheMajorDiagonal(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (row >= col) {
                    System.out.print(arr[row][col] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printAllElementsAboveTheMajorDiagonal(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (row <= col) {
                    System.out.print(arr[row][col] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printAllEvenElements(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] % 2 == 0) {
                    System.out.print(arr[row][col] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printAllOddElements(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] % 2 != 0) {
                    System.out.print(arr[row][col] + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void multiplyAllElementsByTen(int [][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print((arr[row][col] *= 10) + " ");
            }
            System.out.println();
        }
    }

    public static void swapFirstRowWithLastRow(int [][] arr) {
        int firstRow = 0;
        int lastRow = arr.length - 1;
        for (int col = 0; col < arr[0].length; col++) {
            int temp = arr[firstRow][col];
            arr[firstRow][col] = arr[lastRow][col];
            arr[lastRow][col] = temp;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void swapFirstColumnWithLastColumn(int [][] arr) {
        int firstColumn = 0;
        int lastColumn = arr[0].length - 1;
        for (int row = 0; row < arr.length; row++) {
            int temp = arr[row][firstColumn];
            arr[row][firstColumn] = arr[row][lastColumn];
            arr[row][lastColumn] = temp;
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void circularShiftArrayUp(int [][] arr) {
        for (int row = 0; row < arr.length - 1; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[row+1][col];
                arr[row+1][col] = temp;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void circularShiftArrayDown(int [][] arr) {
        for (int row = arr.length -1 ; row > 0; row--) {
            for (int col = 0; col < arr[0].length; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[row-1][col];
                arr[row-1][col] = temp;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

}
