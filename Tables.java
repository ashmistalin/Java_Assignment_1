import java.util.Scanner;
public class Tables{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which the table has to generated: ");
        int num=sc.nextInt();
        System.out.print("Enter the limit for the table: ");
        int limit=sc.nextInt();
        for(int i=1;i<=limit;i++)
        {
            System.out.print(num+"x"+i+"="+num*i);
            System.out.print("\n");
        }
    }
}