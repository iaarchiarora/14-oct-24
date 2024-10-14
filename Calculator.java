

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
 
public class Calculator{
  
    public static void main(String[] args)
    {
        
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
 
        System.out.println("Enter the operator (+,-,*,/,%):");
 
        char op = sc.next().charAt(0);
        double o = 0;
 
        switch (op) {
        
        case '+':
            o = num1 + num2;
            break;
 
        
        case '-':
            o = num1 - num2;
            break;
 
       
        case '*':
            o = num1 * num2;
            break;
 
   
        case '/':
            o = num1 / num2;
            break;
			
		case '%':
		o=num1%num2;
		break;
 
        default:
            System.out.println("You enter wrong input");
        }
 
        System.out.println("Output after operating:");
     
 
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    }
}