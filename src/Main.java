import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        //unzip all files
        UnzippedFile unzippedFile = new UnzippedFile();
        unzippedFile.unzipSensorFiles();
        unzippedFile.mergeSensorFiles();

        Searching searching = new Searching();

        boolean flag = true;
        while (flag) {

            System.out.println();
            System.out.println("Choose sensor: ");
            System.out.println("    0. Quit");
            System.out.println("    1. Heart Rate Number");
            System.out.println("    2. Running Activity");
            System.out.println("    3. Count Step On Date");
            System.out.println("Input integer:");

            String input = scanner.nextLine();  // Read user input

            switch (input) {
                case "1":
                    // Write a query to count the number of heart-rate the user has received on his/her smartwatch in a day.
                    searching.heartRateNumber(getDate());
                    break;
                case "2":
                    // Check whether in a particular day (that the user enters the date as input), the user has
                    searching.ifRunning(getDate());

                    break;
                case "3":
                    // Get the total amount of step s/he took in that particular day.
                    System.out.println("How many steps did I walk on ");
                    int stepCounts = searching.countStep(getDate());
                    System.out.println("You walk " + stepCounts + " steps");
                    break;

                case "0":
                    // if the user choose 0, quit the program
                    flag = false;
                    break;

                default:
                    System.out.println("please enter a number 1-6 to choose a sensor");
                    System.out.println("enter 0 to quit");
                    break;
            }

        }
    }

    public static String getDate(){

        String rtn = "";

        System.out.print("Input month:");
        String month = scanner.nextLine().trim();
        rtn += month +"/";

        System.out.print("Input day:");
        String day = scanner.nextLine().trim();
        rtn += day +"/";

        System.out.print("Input year:");
        String year = scanner.nextLine().trim();
        System.out.println();
        rtn += year;

        return rtn;

    }

}




