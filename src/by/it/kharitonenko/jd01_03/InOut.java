package by.it.kharitonenko.jd01_03;

/**
 * @author Andrew
 * @version 1.0
 */
public class InOut {
    /**
     * string to array converter
     * @param line input string
     * @return array
     */
    static double[] getArray(String line) {
        String[] strArr = line.split(" ");
        double[] resArray = new double[strArr.length];

        for (int i = 0; i < resArray.length; i++) {
            resArray[i] = Double.parseDouble(strArr[i]);
        }
        return resArray;
    }

    /**
     * array printer, uses print
     * @param arr array to print
     */
    static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * array printer, uses format print
     * @param arr array to print
     * @param name string array name
     * @param columnCount number of maximum columns per line to print
     */
    static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f ", name, i, arr[i]);
            if ((i+1)%columnCount==0 || i+1==arr.length) {
                System.out.println();
            }
        }
    }
}
