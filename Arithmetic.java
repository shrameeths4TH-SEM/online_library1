import java.util.Scanner;
class sum
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter two number");
      int a=s.nextInt();
      int b=s.nextInt();
      int sum=a+b;
      int mul=a*b;
      int div=b/a;
      int dif=a-b;
      System.out.println("sum is"+sum);
      System.out.println("mul is"+mul);
      System.out.println("div is"+div);
      System.out.println("dif is"+dif);
    }
  }
    
