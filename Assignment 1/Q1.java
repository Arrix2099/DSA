import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positiver integer greater than 2: ");
        int a = sc.nextInt();
        int count=0;
        while(a>2)
        {
            count++;
            a=a/2;
        }
        System.out.println("The no of times one must repeatedly divide this no: "+
        "by 2 before getting a value less than 2: "+count);
        sc.close();

    
    
    
    
    
    
    }

    }
