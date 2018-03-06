

import java.util.Scanner;
public class conditional {
public static void main(String[] args) {
    int a,b;
    char op;
    System.out.println("Enter any two numbers and the opertion to be applied");
    Scanner obj = new Scanner(System.in);
    a = obj.nextInt();
    Scanner obj2 = new Scanner(System.in);
    b = obj2.nextInt();
    Scanner obj3 = new Scanner(System.in);
    op = obj3.next().charAt(0);
    
    Operation opref = new Operation();
    opref.calc(a,b,op);
}
    
}
class Operation{
    private double result;
    public void calc(int n1, int n2 , char op)
    {
        if(op == '+')
        result = n1+n2;
        else if(op == '-')
        result = n1-n2;
        else if(op == '*' )
        result = n1*n2;
        else
        System.out.println("Invalid operator used");
        System.out.println("The answer is: "+ result);
    }
}