import java.util.Scanner;
public class AreaofRhombus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first diagonal length(d1):");
        float d1= sc.nextFloat();
        System.out.println("Enter the second diagonal length(d2):");
        float d2= sc.nextFloat();
        float area=d1*d2/2;
        System.out.println("The area of the rhombus in sq. units: "+area);
    }
}