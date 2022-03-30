package com.Zakariya;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        for (int i=1;i<=5;i++){
//            System.out.println(i);
//        }

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // for loop
//        for (int i = 0; i < n; i++) {
//            System.out.println("Welcome Professor");
//        }

//        while loop
//        int num = 1;
//        while (n<=5){
//            System.out.println(num);
//            num+=1;
//        }


//        when to use which loop?
//        when the number of repetitions is known then
//        use for loop else while loop


        int num =5;
        do {
            System.out.println("Welcome Professor");
        }
        while (num!=5);

//         The difference between do-while and while is that the do-while loop will
//        execute at least once in its lifecycle and then it will check the condition
//        whereas in the case of while loop the loop will only run if the condition is met.


    }

}
