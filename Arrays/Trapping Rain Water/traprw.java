import java.util.Scanner;

public class traprw{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n;
      
      System.out.print("Enter the no of buildings : ");
      n = sc.nextInt();
      if(n<3)
        {
            System.out.println("Volume of water stotred is 0");
            System.exit(0);
        }
      int bh[] = new int[n];
      System.out.println("Enter the heights of the buildings :");
      for(int i = 0;i<n;i++)
          bh[i]=sc.nextInt();
      
         System.out.println("The Volume of water stored is : "+(TrappedWater(bh,n)));
  }
  public static int TrappedWater(int bh[], int n){
      int vol = 0;
      int lb[]=new int[n];
      int rb[]=new int[n];
      lb[0] = bh[0];
      rb[n-1] = bh[n-1];
      for(int i=1;i<n;i++)
         {
            lb[i] = Math.max(lb[i-1],bh[i]);
            rb[n-i-1] = Math.max(rb[n-i],bh[n-i-1]);
         }
         int wh;
      for(int i=0;i<n;i++)
         {
           wh = Math.min(lb[i],rb[i]);
           if((wh-bh[i])>0)
             vol += (wh-bh[i])*1;
           else
             vol+=0;
         }
         return vol;
  }
}
