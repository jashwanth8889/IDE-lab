import java.util.*;
import java.lang.Math;

public class Areas {
    public static void main(String[] args) {
        int count,a,b,c;
        System.out.println("Enter Number of sides");        
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        if(count == 1){
            System.out.println("Enter length of side : ");        
            a = sc.nextInt();
            System.out.println("Area of circle is : "+a*3.14*a);
        }else if(count == 2){
            System.out.println("Enter Length of side-1 : ");        
            a = sc.nextInt();
            System.out.println("Enter Length of side-2 : ");        
            b = sc.nextInt();
            System.out.println("Area of rectangle is : "+a*b);
        }else if(count ==3){
            System.out.println("Enter Length of side-1 : ");        
            a = sc.nextInt();
            System.out.println("Enter Length of side-2 : ");        
            b = sc.nextInt();
            System.out.println("Enter Length of side-3 : ");        
            c = sc.nextInt();
            float s = a+b+c/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of triangle is : "+area);
        }
    }
}