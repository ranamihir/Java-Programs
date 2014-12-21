public class numberOfObjects{

   static int s;
   public numberOfObjects(){
      s++;
   }

   public static void main(String[] args){
      int n;

      java.util.Scanner sc = new java.util.Scanner(System.in);

      n = sc.nextInt();

      numberOfObjects count = new numberOfObjects();

      for(int i = 0; i < n-1; i++)
         count = new numberOfObjects();

      System.out.println("The number of objects created are: " + count.s);

   }
}