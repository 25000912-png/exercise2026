/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author iman
 */
public class Q2 {
public static void main(String[]args){

Scanner in=new Scanner(System.in);
System.out.print("Enter year:");
int year = in.nextInt();
if (year <= 0) {
  System.out.println("Invalid");
} else {
  boolean leap = year % 400 == 0
      || (year % 4 == 0
          && year % 100 != 0);
  System.out.println(leap
      ? "Leap year" : "Common year");
}

    } 
}
