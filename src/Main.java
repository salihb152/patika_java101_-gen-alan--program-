import java.util.Scanner;
public class Main {
    public static void main(String[] args)  {
       
        int a, b, c, cevre;
         

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. kenarı giriniz : ");
        a= scanner.nextInt();

        System.out.println("2. kenarı giriniz : ");
        b= scanner.nextInt();

        System.out.println("3. kenarı giriniz : ");
        c= scanner.nextInt();

        cevre=a+b+c;

        double alan= Math.sqrt((cevre/2)*((cevre/2)-a)*((cevre/2)-b)*((cevre/2)-c)); 
        
        System.out.println("Üçgenin Alanı : "+ alan);


    }
}
