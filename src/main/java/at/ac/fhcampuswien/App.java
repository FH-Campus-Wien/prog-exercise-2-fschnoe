package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner s = new Scanner(System.in);

        double biggest_num = 0.00;
        int i = 1;
        double num1;
        DecimalFormat df = new DecimalFormat("#.00");

        do {
            System.out.print("Number " + i + ": ");
            num1 = s.nextDouble();

            if (num1 <= 0 && i == 1) {
                System.out.println("No number entered.");
                break;
            }

            i++;

            if(num1 > biggest_num) {
                biggest_num = num1;
            } else if (num1 <= 0) {
                break;
            }
        } while (true);

        if(i > 1) {
            String num = df.format(biggest_num);
            System.out.println("The largest number is " + num);
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner s = new Scanner(System.in);
        System.out.print("n: ");
        int n = s.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number!");
        } else {
            int runningNumber = 1;

            for (int i = 1; i < n+1; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(runningNumber + " ");
                    runningNumber++;
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        final int RUNS = 6;

        for (int i = 1; i <= RUNS; i++) {
            int numberOfWhiteSpaces = (RUNS-i)*2 / 2;

            for (int j = 0; j < numberOfWhiteSpaces; j++) {
                System.out.print(" ");
            }

            int numberOfStars = i*2-1;
            for (int j = 0; j < numberOfStars; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner s = new Scanner(System.in);
        System.out.print("h: ");
        int h = s.nextInt();
        System.out.print("c: ");
        char c = s.next().charAt(0);

        //Little to High
        

        //High to Little

    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner s = new Scanner(System.in);
        int i = 1;

        int badGrades = 0;
        int sumG = 0;
        int countG = 0;

        do {
            System.out.print("Mark " + i + ": ");
            int mark = s.nextInt();
            i++;

            if(mark > 5) {
                System.out.println("Invalid mark!");
                i--;
                continue;
            }

            if(mark == 0) {
                break;
            }

            if(mark == 5) {
                badGrades++;
            }

            countG++;
            sumG += mark;

        } while(true);

        double avg = (double) sumG / countG;

        if(Double.isNaN(avg)) {
            avg = 0.00;
        }

        DecimalFormat df = new DecimalFormat("0.00");
        String avgStr = df.format(avg);

        System.out.println("Average: " + avgStr);
        System.out.println("Negative marks: " + badGrades);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner s = new Scanner(System.in);
        System.out.print("n: ");
        int n = s.nextInt();


    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}