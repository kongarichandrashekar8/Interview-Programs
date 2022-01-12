class Sort0and1
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
        int left=0;
        int right=n-1;
        while(left<right)
        {
            while(arr[left]==0 && left<n-1){
                left++;
            }
            
            
            while(arr[right]==1 && right>0)
            {
              
                right--;
            }
            if(left<right)
            {
                arr[right]=1;
                arr[left]=0;
            }
            
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
  }
}
