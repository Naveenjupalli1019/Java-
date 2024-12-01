//01-12-2024
//basics
import java.util.Scanner;

public class basic {
   public basic() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name");
      String newout = sc.nextLine();
      newout = newout.toUpperCase();
      System.out.println(newout);
      int a = 10;
      int b = 20;
      int c = a + b;
      int d = a - b;
      System.out.println("Addition : " + c);
      System.out.print("Subraction : " + d);

      for(int i = 0; i < 10; ++i) {
         System.out.println("Naveen is good boy");
      }

   }
}

  // caliculator program 
import java.util.Scanner; // import scanner for taking input from user

class Caliculator{  // creating a class for adding operation
    public int add(int n1,int n2,int n3){ //declare the operation as public and requrired variables for operation
        int r1=n1+n2+n3;
        return r1;
    }
}
class Caliculator1{  // creating a class for subraction operation
    public int sub(int n4,int n5,int n6){
        int r2=n4-n5-n6;
        return r2;
    }
}
public class CaliculatorDemo1{
    public void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        Caliculator calc=new Caliculator();
        int result= calc.add(num1,num2,num3);
        System.out.println("add"+result);
        Caliculator1 cak=new Caliculator1();
        int result1= cak.sub(num1,num2,num3);
        System.out.println("sub:-"+result1);
    }
}

//another by own 

import java.util.Scanner;

public class Naveen {
   public Naveen() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x1 = sc.nextInt();
      int x2 = sc.nextInt();
      int result = x1 + x2;
      System.out.println(result);
      Caliculator cal = new Caliculator();
      int result3 = cal.div(x1, x2);
      System.out.println("Division" + result3);
      int result4 = cal.add(x1, x2);
      System.out.println("Addition" + result4);
      int result5 = cal.sub(x1, x2);
      System.out.println("Subtraction" + result5);
   }
}
