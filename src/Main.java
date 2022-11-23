/*
23/11/22 - NOVUS FS SOFTWARE DEVELOPER PROGRAMME
Exercise 1:
Initialise an integer array of size 10.
Fill the array with numbers.
Write a programme to sum the contents of the array.
Output the result via the sum variable.
Calculate the average (average to be double variable)
 */

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int numbers[]={11,22,33,44,55,66,77,88,99,110};

        for (int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }

        double average = sum/(numbers.length);
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the numbers in the array is " + average);
    }
}