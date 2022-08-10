package com.javaProject.SimpleIntrestCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleInterestCalculator {


    //1
    private static void calSi(){
        Scanner scn = new Scanner(System.in);

        float r , si = 0, p, t;
        char ch;

        try{

            do {
                System.out.println("Enter principal: ");
                p = scn.nextFloat();
                System.out.println("Enter rate: ");
                r = scn.nextFloat();
                r /= 100;
                System.out.println("Enter time: ");
                t = scn.nextFloat();

                if (r <= 0|| p <= 0|| t <= 0) {

                    throw new ArithmeticException("Value should be greater than 0\n");

                } else {
                    si = (p * r * t) / 100;

                    System.out.println("Simple interest is "+si);
                    System.out.println("For exit enter Y/N ");
                    ch = scn.next().charAt(0);
                }
            } while ( ch == 'Y');

        } catch(ArithmeticException e) {
            System.out.println(" Invalid value entered " + e);
        } catch(InputMismatchException e) {
            System.out.println("Input value should be float " + e);
        }
    }

    //2
    private static void calRate(){

        Scanner scn = new Scanner(System.in);

        float r = 0.0f, si, p, t;
        char ch;

        try {

            do{
                System.out.println("Enter principal: ");
                p = scn.nextFloat();
                System.out.println("Enter interest: ");
                si = scn.nextFloat();
                System.out.println("Enter time: ");
                t = scn.nextFloat();

                if (p <= 0|| si <= 0|| t <= 0) {

                    throw new ArithmeticException("Value should be greater than 0\n");

                } else {

                    r = (si * 100) / (p * t);
                    System.out.println("Rate is " + r);
                    System.out.println("For exit enter Y/N ");
                    ch = scn.next().charAt(0);
                }
            } while (ch == 'Y');

        } catch(ArithmeticException e) {
            System.out.println(" Invalid value entered " + e);
        } catch(InputMismatchException e) {
            System.out.println("Input value should be float " + e);
        }

    }

    //3
    private static void calTime(){

        Scanner scn = new Scanner(System.in);

        float r, si, t = 0.0f, p;
        char ch;

        try {
            do {
                System.out.println("Enter principal: ");
                p = scn.nextFloat();
                System.out.println("Enter interest: ");
                si = scn.nextFloat();
                System.out.println("Enter rate: ");
                r = scn.nextFloat();
                r /= 100;

                if (r <= 0|| si <= 0|| p <= 0) {

                    throw new ArithmeticException("Value should be greater than 0\n");

                } else {
                    t = ((si * 100) / (p * r));
                    System.out.println("time is " + t);
                    System.out.println("For exit enter Y/N ");
                    ch = scn.next().charAt(0);
                }
            } while (ch=='Y');

        } catch(ArithmeticException e) {
            System.out.println(" Invalid value entered " + e);
        } catch(InputMismatchException e) {
            System.out.println("Input value should be float " + e);
        }

    }

    //4
    private static void calPri(){
        Scanner scn = new Scanner(System.in);

        float t, p = 0.0f, r, si;
        char ch;

        try {

            do {
                System.out.println("Enter time: ");
                t = scn.nextFloat();
                System.out.println("Enter intrest: ");
                si = scn.nextFloat();
                System.out.println("Enter rate: ");
                r = scn.nextFloat();
                r /= 100;

                if (t <= 0||si <= 0|| r <= 0) {

                    throw new ArithmeticException("Value should be greater than 0\n");

                } else {
                    p = ((si * 100) / (t * r));
                    System.out.println("Principal is " + p);
                    System.out.println("For exit enter Y/N ");
                    ch = scn.next().charAt(0);
                }
            } while (ch == 'Y');

        } catch(ArithmeticException e) {
            System.out.println(" Invalid value entered " + e);
        } catch(InputMismatchException e) {
            System.out.println("Input value should be float " + e);
        }

    }

    //5
    private static void calAmnt(){
        Scanner scn = new Scanner(System.in);

        float a = 0.0f, si, p;
        char ch;

        try {
            do {
                System.out.println("Enter principal: ");
                p = scn.nextFloat();
                System.out.println("Enter intrest: ");
                si = scn.nextFloat();

                if (p <= 0|| si <= 0) {

                    throw new ArithmeticException("Value should be greater than 0\n");

                } else {

                    a = p+si;
                    System.out.println("Principal is "+a);
                    System.out.println("For exit enter Y/N ");
                    ch = scn.next().charAt(0);
                }
            } while (ch == 'Y');
        } catch(ArithmeticException e) {
            System.out.println(" Invalid value entered " + e);
        } catch(InputMismatchException e) {
            System.out.println("Input value should be float " + e);
        }

    }

    //6
    private static void calprin(){

        Scanner scn = new Scanner(System.in);

        char ch;
        float r,p = 0.0f, a, t;

        try {
            do {
                System.out.println("Enter time: ");
                t = scn.nextFloat();
                System.out.println("Enter rate: ");
                r = scn.nextFloat();
                r /= 100;
                System.out.println("Enter amount: ");
                a = scn.nextFloat();

                if (t <= 0|| r <= 0|| a <= 0) {

                    throw new ArithmeticException("Value should be greater than 0\n");

                } else {
                    p = ((a * 100) / (100 + (t * r)));
                    System.out.println("Principal is " + p);
                    System.out.println("For exit enter Y/N ");
                    ch = scn.next().charAt(0);
                }
            } while (ch == 'Y');
        } catch(ArithmeticException e) {
            System.out.println(" Invalid value entered " + e);
        } catch(InputMismatchException e) {
            System.out.println("Input value should be float " + e);
        }

    }

    //7
    private static void calPrin(){

        Scanner scn = new Scanner(System.in);

        char ch;
        float p = 0.0f, si, a;

        try {
            do {
                System.out.println("Enter intrest: ");
                si = scn.nextFloat();
                System.out.println("Enter amount: ");
                a = scn.nextFloat();

                if (si <= 0|| a <= 0) {

                    throw new ArithmeticException("Value should be greater than 0\n");

                } else {
                    p = (a - si);
                    System.out.println("Principal is "+p);
                    System.out.println("For exit enter Y/N ");
                    ch = scn.next().charAt(0);
                }
            } while (ch == 'Y');
        } catch(ArithmeticException e) {
            System.out.println(" Invalid value entered" + e);
        } catch(InputMismatchException e) {
            System.out.println("Input value should be float " + e);
        }

    }

    //8
    private static void calAmt(){

        Scanner scn = new Scanner(System.in);

        char ch;
        float a = 0.0f, p, t, r;

        try {
            do{
                System.out.println("Enter rate: ");
                r = scn.nextFloat();
                System.out.println("Enter time: ");
                t = scn.nextFloat();
                System.out.println("Enter principal: ");
                p = scn.nextFloat();

                if (r <= 0|| t <= 0|| p <= 0) {

                    throw new ArithmeticException("Value should be greater than 0\n");

                } else {
                    a = p * (100 + (t * r)) / 100;
                    System.out.println("Principal is " + a);
                    System.out.println("For exit enter Y/N ");
                    ch = scn.next().charAt(0);
                }
            } while (ch == 'Y');
        } catch(ArithmeticException e) {
            System.out.println(" Invalid value entered " + e);
        } catch(InputMismatchException e) {
            System.out.println("Input value should be float " + e);
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Enter number of time you want to run loop: ");
            int n = scn.nextInt();

            for (int i = 1; i <= n; i++) {

                System.out.println("Press 1 for calculation of simple Interest: ");
                System.out.println("Press 2 for calculation of Rate: ");
                System.out.println("Press 3 for calculation of Time: ");
                System.out.println("Press 4 for calculation of Principal when si,time and rate is given: ");
                System.out.println("Press 5 for calculation of Amount: ");
                System.out.println("Press 6 for calculation of Principal when amount,time and rate is given: ");
                System.out.println("Press 7 for calculation of Principal when amount and si given : ");
                System.out.println("Press 8 for calculation of Amount when when principal,time and rate given : ");
                int cs = scn.nextInt();

                switch (cs){
                    case 1:
                        calSi();
                        break;

                    case 2:
                        calRate();
                        break;

                    case 3:
                        calTime();
                        break;

                    case 4:
                        calPri();
                        break;

                    case 5:
                        calAmnt();
                        break;

                    case 6:
                        calprin();
                        break;

                    case 7:
                        calPrin();
                        break;

                    case 8:
                        calAmt();
                        break;

                    default:
                        System.out.println("Invalid press");

                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Inter valid input in integer type " + e);
        } finally {
            System.out.println("\"The Program Is Finished\"");
        }



    }

}
