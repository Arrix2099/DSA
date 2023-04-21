import java.util.Scanner;

public class Q1 {

 int number;
 
 public static void main(String[] args) {
  Q1 countTheNumberOfDivisibles = new Q1();
  countTheNumberOfDivisibles.getTheNumber();
  System.out.println("the number of times one must repeatedly divide this number by 2 is: " + countTheNumberOfDivisibles.countTheNumberOfDivisibles());

 }
 
 public void getTheNumber(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a number greater than 2: ");
  number = scanner.nextInt();
  if(number < 2){
   number = 0;
   System.out.println(" number is less than 2. please give the number greater than 2");
  }
  scanner.close();
 }
 
 public int countTheNumberOfDivisibles(){
  int count = 0;
  while(true){
   if(number < 2){
    break;
   }
   else {
    number = number - 2;
    count++;
   }
  }
  return count;
 }

}
