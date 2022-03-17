//package com.NICE;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //LOOPS

        // FOR LOOP
//        for(int i = 10;i>=1;i--)
//        {
//            System.out.println(i);
//        }
//        //While Loop
//        int j = 0;
//        while(j<=10 )
//        {
//            System.out.println(j);
//            j++;
//        }
//        //Do While --in this we first run the code and then check the condition
//        do{
//            System.out.println(j);
//            j++;
//        }while(j<=20);
//        Scanner sc = new Scanner(System.in);
//        int a = 0;
//       do{
//           System.out.println("enter a number");
//           a = sc.nextInt();
//
//           System.out.println("your number is :");
//           System.out.println(a);
//
//       }while(a >= 0);
//
//        System.out.println("done");
    // CONTINUE AND BREAK
//        int i = 0;
//        while(true) {// it will run in finite time
//            if(i == 3)
//            {
//                i = i+1;// this will update the i's value to i=4
//                continue;// this will skip i = 3
//            }
//            System.out.println(i);
//
//            i = i+1;
//            if(i>5){
//                break;
//            }
        //TRY - Catch in EXCEPTION HANDLING
        // this is used to handle exception if there is a error on the code and if we had make them exception then we can ignore that erroer and remaining code will ru  smoothly
        int[] marks = {97,98,99};
        try {
            System.out.println(marks[4]);
        } catch(Exception exception){
            // do somthing
        }
        //System.out.println(marks[5]);// this will give us exception that out of range but we want to run the next statement for this we use try and catch exception
        System.out.println("name is ishika");



        //}


    }
}
