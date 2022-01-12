class HighestKwindow
{
  public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<=n-k;i++)
        {
            int max=arr[i]; 
            for(int j=i+1;j<i+k;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
                
            }
            System.out.print(max+" ");
        }
        //1 2 3 1 4 5 2 3 6 k=3 n=9  0 to 9-3
        
        //8 5 10 7 9 4 15 12 90 13 k=4
    }
}
