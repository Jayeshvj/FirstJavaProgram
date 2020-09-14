import java.util.Scanner;

public class Days {

  public static void main(String[] args){
    System.out.println("Enter Minutes: ");
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    myMethod(a);  
  }
  public static void myMethod(int a){
      int y,r,d;
      y = a/(365*24*60);
      r = a - (y*(365*24*60));
      d = r/(24*60);
      System.out.println(+a+" minutes is approximately " +y+" years and "+d+" days");
    
  }
  }
