import java.util.Scanner;
public class arrayCalculation {

    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        int[] array = new int[15];


        //prompts the user to input 15 integers and stores them in the array
        System.out.println("Input 15 integers:");
        for (int arrayDigit = 0; arrayDigit <15; arrayDigit++){
            array[arrayDigit] = newScanner.nextInt();
        }


        //prints the values stored in the array
        System.out.println("Numbers stored in the array are:");
        for (int arrayDigit = 0; arrayDigit<15; arrayDigit++){
            System.out.println(array[arrayDigit] + "");
        }
        System.out.println();


        //Asks the user to input a number and checks if it is in stored in the array
        System.out.println("Input a number to search");
        int digit = newScanner.nextInt();
        boolean found = false;
        for (int arrayDigit = 0; arrayDigit <15; arrayDigit++)
        {
            if (array[arrayDigit] == digit) {
                System.out.println("The number is found at index " + arrayDigit);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this set of arrays");
        }


        //create another array with the inputs in reverse order and print them
        int [] reversedArray = new int[15];
        for (int arrayDigit = 0; arrayDigit <15; arrayDigit++ ){
            reversedArray[arrayDigit] = array[14-arrayDigit];
        }
        System.out.println("Values stored in the reversed array");
        for (int arrayDigit = 0; arrayDigit <15; arrayDigit++){
            System.out.println(reversedArray[arrayDigit] + " ");
        }
        System.out.println();

        //Calculating the sum and product of the elements in the array and print them out
        int sum = 0;
        int product = 1;
        for (int arrayDigit =0; arrayDigit <15; arrayDigit++){
            sum += array[arrayDigit];
            product *= array[arrayDigit];
        }
        System.out.println("Sum of all elements in the array is: " +sum);
        System.out.println("Product of all elements in the array is: " +product);
    }
}