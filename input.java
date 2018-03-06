import java.util.Scanner;
import java.io.*;
public class input {
    public static void main(String[] args) throws IOException
     { BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(sc.readLine());
        String ab = sc.readLine();
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter any num");
        int num = obj.nextInt();
        System.out.println("The number is:");
        System.out.println(num);
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter any name");
        String name = obj2.nextLine();
        System.out.print("Your name is:");
        System.out.println(name);
    }

    
}