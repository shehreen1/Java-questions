import java.sql.SQLOutput;
import java.util.Scanner;
public class practiceSet4 {
    public static void main(String[] args) {
        int a = 10;
        if (a == 16) {
            System.out.println("i am good in coding");
        } else {
            System.out.println("I am not good in coding");
        }
        //Ques.2-Write a java program to find out whether a  student
        // pass or fail; if it requires total 40% and at least 33% in
        // each subject to pass. Assume 3 subjects and take marks as an input from the user.
        System.out.println("Enter the marks of your three subjects");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of english: ");
        int x = sc.nextInt();
        System.out.println("Enter marks of computer: ");
        int y = sc.nextInt();
        System.out.println("Enter marks of Science: ");
        int z = sc.nextInt();
        float avg = (x + y + z) / 3.0f;
        System.out.println("Your overall percentage is" + avg);
        if (avg >= 40 && x >= 33 && y >= 33 && z >= 33) {
            System.out.println("Congratulations, you are promoted");
        } else {
            System.out.println("You are not promoted,Try again!!");
        }
        //Ques.3-Calculate income tax paid by an employee to the government as per the slabs mentioned below;
        //         Income Slab             Tax
        //          2.5L-5.0L               5%
        //          5.0L-10.0L              20%
        //          Above 10.0L             30%
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if (income < 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (income - 5f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (10.0f - 5f);
            tax = tax + 0.03f * (income - 10.0f);
        }
        System.out.println("the total tax paid by the employee is" + tax);
        //Ques.4-Write a java program to find out the day of the week given the number [1 for Monday,
        //2 for Tuesday.... and so on1]
        System.out.println();
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        //Ques.6-Write a program to find out the type of website from the url.
        //.com - commercial website
        //.org - organizational website
        //.in -  an indian website
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("This organizational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an indian website");
        }
    }







}
