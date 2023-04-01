import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers for calculations:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result;
        System.out.print("Enter the choice for doing your operation:");
        System.out.print("\n1.Addition.\n2.Subtraction.\n3.Multiplication\n4.Division.\n");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                result=num1+num2;
                System.out.print("\nTh resultant of the addition operation is: "+result);
                break;
            case 2:
                result=num1-num2;
                System.out.print("\nTh resultant of the subtraction operation is: "+result);
                break;
            case 3:
                result=num1*num2;
                System.out.print("\nTh resultant of the multiplication operation is: "+result);
                break;
            case 4:
                result=num1/num2;
                System.out.print("\nTh resultant of the division operation is: "+result);
                break;
            default:
                System.out.print("\n Enter a valid operation to be performed.");
        }
    }
}