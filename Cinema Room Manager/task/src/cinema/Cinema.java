package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);

        // Enter initial screen room size & calculate number of seats & define screenRoom array
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();

        int numberOfSeats = rows * seatsPerRow;
        // initialize two arrays one for seats marking and another for price markings
        char[][] screenRoom = new char[rows + 1][seatsPerRow + 1];
        int[][] seatPrice = new int[rows + 1][seatsPerRow + 1];

        // fill seats array for initial state:
        // no tickets sold , all seats available = marked as 'S'; prices filled with integer = 0
        // in first column and row of the array row numbers & seats numbers;
        //   note that seat row & seat numbers are not a seats, but we fill them with zero 'prices'
        //   to make code and arrays comparisons easier

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seatsPerRow; j++) {
                // top left corner write space to first element of array
                if (i == 0 && j == 0) {
                    screenRoom[i][j] = ' ';
                    seatPrice[i][j] = 0;
                }
                // in first row write seat numbers
                else if (i == 0 && j > 0) {
                    char c = (char) (j + '0');
                    screenRoom[i][j] = c;
                    seatPrice[i][j] = 0;
                }
                // in first column write row numbers
                else if (i > 0 && j == 0) {
                    char c = (char) (i + '0');
                    screenRoom[i][j] = c;
                    seatPrice[i][j] = 0;
                }
                else {
                    screenRoom[i][j] = 'S';
                    seatPrice[i][j] = 0;
                }
            }
        }

        // while menuItem is not '0' display menu items and return selection
        // initialy menuItem = 1 to show seats first time
        int menuItem = 1;

        while (menuItem != 0) {

            menuItem = selectMenuItem();

            if (menuItem == 1) {
                showSeats(screenRoom, rows, seatsPerRow);
            }
            else if (menuItem == 2) {
                buyTicket(screenRoom, seatPrice, numberOfSeats, rows);
            }
            else if (menuItem == 3) {
                showStatistics(screenRoom, seatPrice, seatsPerRow, rows);
            }
            else if (menuItem == 0) {
                break;
            }
            else if (menuItem < 0 || menuItem > 3) {
                System.out.println("Wrong input!");
            }

        }
    } 

    // write method for displaying menu items that returns int = selected menu item
    public static int selectMenuItem() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    // this method displays seats
    public static void showSeats(char[][] screenRoom, int rows, int seatsPerRow) {
        System.out.println();
        System.out.println("Cinema:");

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seatsPerRow; j++) {
                System.out.print(screenRoom[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // this method calculates ticket price based on room size (number of seats and rows)
    // and writes sold seat price in seatPrice[][] array
    // it also marks seat as sold in screenRoom[][] array by writing there character 'B'
    public static void buyTicket(char[][] screenRoom, int[][] seatPrice, int numberOfSeats, int rows) {
        Scanner scanner = new Scanner(System.in);

        // enter a row and seat number, if values invalid prompt to enter again
        int row = 0;
        int seat = 0;
        int seats = numberOfSeats / rows;

        boolean seatInvalid = true;
        boolean seatNotAvailable = true;

        //

        while (seatInvalid || seatNotAvailable) {

            // enter seat coordinates

            System.out.println("Enter a row number:");
            row = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seat = scanner.nextInt();

            // check if seat number & row are bigger than zero
            // and smaller than number of rows & number of seats in a row

            if (row > 0 && seat > 0 && row <= rows && seat <= seats) {
                seatInvalid = false;

                // now that seat is valid (index in range)
                // check if seat has not been already sold

                if ( 'B' != screenRoom[row][seat]) {
                    seatNotAvailable = false;
                }
                else {
                    System.out.println("That ticket has already been purchased!");
                }
            }
            else {
                System.out.println("Wrong input!");
            }
        }

        // if the seat is available (has not been sold yet then evaluate price
        // and write a price into array

            if (!seatNotAvailable) {
                int smallRoom = 60;
                int ticket1 = 10; // ticket price in fRow
                int ticket2 = 8; // ticket price in back row

                int ticketPrice = 0;

                if (numberOfSeats <= smallRoom) {
                    ticketPrice = ticket1;
                }
                if (numberOfSeats > smallRoom) {
                    int fRow = rows / 2;
                    if (row <= fRow) {
                        ticketPrice = ticket1;
                    } else {
                        ticketPrice = ticket2;
                    }
                }
                seatPrice[row][seat] = ticketPrice;
                screenRoom[row][seat] = 'B';

                System.out.println("Ticket price: $" + ticketPrice);
                System.out.println();
            }
        }

    // this method calculates current statistics based on what has been written in seatPrice[][] array
    public static void showStatistics(char[][] screenRoom, int[][] seatPrice, int seatsPerRow, int rows) {

        // Calculate the number of purchased tickets and currentIncome
        //  >> count all 'B' in screenRoom[] array
        //  >> sum prices of all sold tickets in seatPrice[][] array
        int numberOfBoughtTickets = 0;
        int currentIncome = 0;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seatsPerRow; j++) {
                if ('B' == screenRoom[i][j]) {
                    numberOfBoughtTickets = numberOfBoughtTickets + 1;
                    currentIncome = currentIncome + seatPrice[i][j];
                    }
                }
            }

        // The number of purchased tickets represented as a percentage.
        // Percentages should be rounded to 2 decimal places

        double percentOfBoughtTickets = (double) 100 * numberOfBoughtTickets / (rows * seatsPerRow);

        //calculate The total income that shows how much money the theatre will get if all the tickets are sold.
        //      >> sum up all seat cost between two prices depending on screen room size / number of rows

        int potentialIncome = 0;

        int smallRoom = 60;
        int ticket1 = 10; // ticket price in fRow
        int ticket2 = 8; // ticket price in back row

        // small room: potential income is number of seats times ticket1 price
        if (rows * seatsPerRow <= smallRoom) {
            potentialIncome = ticket1 * rows * seatsPerRow;
        }


        // big room
        if (rows * seatsPerRow > smallRoom) {
            int fRow = rows / 2;
            potentialIncome = ticket1 * fRow * seatsPerRow + ticket2 * (rows - fRow) * seatsPerRow;
        }

        // print out calculated statistics:

        System.out.println("Number of purchased tickets: " + numberOfBoughtTickets);

        System.out.printf("Percentage: %.2f%% \n" , percentOfBoughtTickets);
        // System.out.println("Percentage: "+String.format("%.2f",percentOfBoughtTickets)+"%");


        // System.out.println("percentOfBoughtTickets="+ percentOfBoughtTickets);


        System.out.println("Current income: $" + currentIncome);

        System.out.println("Total income: $" + potentialIncome);
    }
}