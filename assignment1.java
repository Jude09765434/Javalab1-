package assignment;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math.*;

public class assignment1 {

//Function for determining length of string
public int Length() {
String input="The Blacklist";
int strLength=input.length();
return strLength;
}
//Function for reversing user input
public String Reverse() { 
Scanner input=new Scanner(System.in);
System.out.print("Please enter a string: ");
String message=input.nextLine();
String reverse="";
String splitArray[] = message.split(" ");
for(int i=0; i<splitArray.length; i++) {
for (int j=splitArray[i].length()-1; j>=0; j--) {
reverse=reverse+splitArray[i].charAt(j);
}
reverse = reverse+" ";
}
return reverse;
}
//Function for calculating circumference and area of a circle, given the radius
public void Circle() {
Scanner user_input = new Scanner(System.in);
System.out.println("Enter radius the circle: ");
double num = user_input.nextDouble();
double circum= 2* Math.PI* num;
double Area =  Math.PI* Math.pow(num, 2);
double C = Math.round(circum*100.0)/100.0;
double A = Math.round(Area*100.0)/100.0;
    System.out.printf("The area is:"+ A +" "+ "and the circumference is:" + C );
      
}
public static void main(String  []args) {
//assignment1 number1 = new assignment1();
//System.out.println(number1.Length()); //This prints out the value of the string length of the input
//Lab1 number2 = new assignment1();
//System.out.println(number2.Reverse()); //This prints out the reverse of the user input string
assignment1 number3 = new assignment1();
number3.Circle();//This prints out the Area and circumference of a circle given a radius

}

}

// Jude Asare Donkor
// 28372020
// lab 1