package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so vao day");
        int number = sc.nextInt();
        if (number < 1000) {
            int st1 = number / 100;
            int st2 = (number - st1 * 100) / 10;
            int st3 = number - st1 * 100 - st2 * 10;
            boolean special = false;
            String str1, str2, str3;
            switch (st1) {
                case 1:
                    str1 = "one";
                    break;
                case 2:
                    str1 = "two";
                    break;
                case 3:
                    str1 = "three";
                    break;
                case 4:
                    str1 = "four";
                    break;
                case 5:
                    str1 = "five";
                    break;
                case 6:
                    str1 = "six";
                    break;
                case 7:
                    str1 = "seven";
                    break;
                case 8:
                    str1 = "eight";
                    break;
                case 9:
                    str1 = "nine";
                    break;
                default:
                    str1 = "";
            }
            switch (st2) {
                case 1:
                    switch (st3) {
                        case 0:
                            str2 = "ten";
                            special = true;
                            break;
                        case 1:
                            str2 = "eleven";
                            special = true;
                            break;
                        case 2:
                            str2 = "twelve";
                            special = true;
                            break;
                        case 3:
                            str2 = "thirteen";
                            special = true;
                            break;
                        case 4:
                            str2 = "fourteen";
                            special = true;
                            break;
                        case 5:
                            str2 = "fifteen";
                            special = true;
                            break;
                        case 6:
                            str2 = "sixteen";
                            special = true;
                            break;
                        case 7:
                            str2 = "seventeen";
                            special = true;
                            break;
                        case 8:
                            str2 = "eighteen";
                            special = true;
                            break;
                        case 9:
                            str2 = "nineteen";
                            special = true;
                            break;
                        default:
                            str2 = "";
                    }
                    break;
                case 2:
                    str2 = "twenty";
                    break;
                case 3:
                    str2 = "thirty";
                    break;
                case 4:
                    str2 = "fourty";
                    break;
                case 5:
                    str2 = "fifty";
                    break;
                case 6:
                    str2 = "sixty";
                    break;
                case 7:
                    str2 = "seventy";
                    break;
                case 8:
                    str2 = "eighty";
                    break;
                case 9:
                    str2 = "ninety";
                    break;
                default:
                    str2 = "";
            }
            switch (st3) {
                case 1:
                    str3 = "one";
                    break;
                case 2:
                    str3 = "two";
                    break;
                case 3:
                    str3 = "three";
                    break;
                case 4:
                    str3 = "four";
                    break;
                case 5:
                    str3 = "five";
                    break;
                case 6:
                    str3 = "six";
                    break;
                case 7:
                    str3 = "seven";
                    break;
                case 8:
                    str3 = "eight";
                    break;
                case 9:
                    str3 = "nine";
                    break;
                default:
                    str3 = "";
            }
            if (str1 == "") {
                if (str2 == "") {
                    System.out.println(str3);
                } else {
                    if (special) {
                        System.out.println(str2);
                    } else {
                        System.out.println(str2 + " " + str3);
                    }
                }
            } else {
                if (!special) {
                    System.out.println(str1 + " hundred " + str2 + " " + str3);
                } else {
                    System.out.println(str1 + " hundred " + str2);
                }
            }
        }
    }
}
