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

OUTPUT:

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=8261:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\Java 1\out\production\Java 1" Tables
Enter the number for which the table has to generated: 5
Enter the limit for the table: 10
5x1=5
5x2=10
5x3=15
5x4=20
5x5=25
5x6=30
5x7=35
5x8=40
5x9=45
5x10=50

Process finished with exit code 0
