public class Even{
    public static void main(String[] args){
        System.out.print("The even numbers from 1 to 20 are listed below:");
        int i;
        for(i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.print("\n"+i);
            }
        }
    }
}
