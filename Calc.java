public class Calc{

     public static void main(String []args){
        add(5,7);
            diff(3,6);
     }
     
     
      public static void add(int a, int b){
         System.out.println("Sum="+a+b);
       }
      public static void diff(int a,int b){
         System.out.println("Diff"+ (a-b));
      }

      public static void prod(int a, int b){
          System.out.println("Product= "+(a*b));
      }
      public static void div(int a,int b){
         System.out.println("Quotient"+ (a/b));

      }
}
