import java.util.Scanner;

public class kadanesalgo{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements :");
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        kadanes(arr);
        sc.close();
    }
    public static void kadanes(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int c=0;
         for(int i = 0;i<arr.length;i++)
            {
                cs+=arr[i];
                if(cs<0)
                   cs=0;
                if(ms<cs)
                   ms = cs;
                if(arr[i]<0)
                   c++;
            } 
            if(c==arr.length)
              {
                ms=arr[0];
                for(int i = 1;i<arr.length;i++)
                    {
                        if(ms<arr[i])
                          ms = arr[i];
                    }
              }
              System.out.println("The max subarray sum is : "+ms);
        }
    }
 