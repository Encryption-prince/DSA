import java.util.Scanner;
public class stocks{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.print("Enter the no of days : ");
      n = sc.nextInt();
      int price[] = new int[n];
      System.out.println("Enter the prices of stocks day wise : ");
      for(int i=0;i<n;i++)
         price[i]=sc.nextInt();
         
        System.out.println("Max Profit that can be earned is : "+maxProfit(price,n));
        sc.close();
   }
   public static int maxProfit(int price[],int n){
        int mincp = price[0];//storing the min cost price till now
        int sp;//sell price
        int profit = 0;//current day profit
        int maxprofit = 0;//max profit till now
        for(int i=1;i<n;i++){
            mincp = Math.min(mincp,price[i]);
            sp = price[i];
            profit = sp-mincp;
            maxprofit = Math.max(maxprofit,profit);
           /* 
            ---------OR--------------
            if(mincp<sp)
              {
                profit = sp-mincp;
                maxprofit = Math.max(maxprofit,profit);
            }
            else
              mincp = sp;
              */
        }
        return maxprofit;
   }
}