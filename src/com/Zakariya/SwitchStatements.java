package com.Zakariya;

import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        String a = "Zaky";
//        String b = "Zaky";
//        System.out.println(a == b);
//         This returns True which means that the two different
//         pointers in the stack memory a and b points to
//         the same object in the stack memory.

        // Switch cases

//        String fruit = in.next();
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of all Fruits");
//            case "Apple" -> System.out.println("Apple a day keeps the doctor away");
//            case "Banana" -> System.out.println("High in Zinc");
//            case "Litchi" -> System.out.println("Sweet in taste is litchi");
//            case "Sugarcane" -> System.out.println("Sweetest sugarcane is from India");
//            default -> System.out.println("At least eat oranges. Re-Enter");
//        }

        // If no break is provided then in such case the switch
        // statement will continue to look to the other cases and
        // will not stop.


//        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 4 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            case 3 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//            default -> System.out.println("Invalid day");
//        }

//      Without breakpoints
//        switch (day){
//            case 1,2,3,4,5-> System.out.println("Weekday");
//            case 6,8-> System.out.println("Weekend");
//
//        }

        // Nested switch case
        int empId = in.nextInt();
        String dept = in.next();

        switch (empId) {
            case 1 -> {
                System.out.println("Zakariya");
                switch (dept) {
                    case "IT" -> System.out.println("Zakariya is studying in IT");
                    case "CSE" -> System.out.println("Zakariya is studying in CSE");
                    default -> System.out.println("No department entered");
                }
            }
            case 2 -> {
                System.out.println("Grey");
                switch (dept) {
                    case "CSE" -> System.out.println("Grey is Studying in CSE");
                    case "IT" -> System.out.println("Grey is studying in IT");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter valid ID");
        }




    }
}
