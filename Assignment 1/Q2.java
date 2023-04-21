import java.util.Scanner;

import java.util.Scanner;
public class Q2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in kg: ");
        double w = sc.nextDouble();
        System.out.println("Enter the height in metres: ");
        double h= sc.nextDouble();
        System.out.println("The BMI is: ");
        double bmi = w/h*h;
        String a="";

        if (bmi<18.5){
        System.out.println(a="Underweight");}
        else if (bmi>24.9){
        System.out.println(a="Normal weight");}
        else if (bmi< 29.9){
        System.out.println("Overweight");}
        else {
        System.out.println("Obesity");}

        System.out.println("The person is : "+a);

    }}
        



    
       

