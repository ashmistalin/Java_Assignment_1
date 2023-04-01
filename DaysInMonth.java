import java.util.Scanner;
public class DaysInMonth{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the month in number:");
        int month=sc.nextInt();
        System.out.print("Enter the year:");
        int year=sc.nextInt();
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("\nThis month has 31 days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("\nThis month has 30 days.");
                break;
            case 2:
                if(year%4==0)
                {
                    System.out.print("\nThis month has 29 days.");
                }
                else
                {
                    System.out.print("\nThis month has 28 days.");
                }
                break;
            default:
                System.out.print("Enter a valid number of the month.");
        }
    }
}