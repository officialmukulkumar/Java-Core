

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double b;
        String s;
        
        System.out.println("Enter a Number :");
        a=sc.nextInt();
        
        System.out.println("Enter a Double Value :");
        b=sc.nextDouble();
        
        System.out.println("Enter a String :");
        s=sc.next();
        //Space kai baad ka scan nhi hoga 
        
        System.out.println("Here is the Output");
        System.out.println(a+ " "+b +" "+s);
        
       
    }
    
}
