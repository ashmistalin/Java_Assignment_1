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

C:\Users\Dell\.jdks\openjdk-19.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\lib\idea_rt.jar=7913:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Dell\IdeaProjects\Java 1\out\production\Java 1" AreaofRhombus
Enter the first diagonal length(d1):
12
Enter the second diagonal length(d2):
23.09
The area of the rhombus in sq. units: 138.54001

Process finished with exit code 0
