import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        float c,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature in c");
        c=sc.nextFloat();
        f=((c*9)+160)/5;
        System.out.println("farenheit="+f);
    }
    
}
