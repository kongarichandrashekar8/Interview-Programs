class RotateArray
{
  public static void rotate(int[] arr,int n)
    {
        int k=arr[0];
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        arr[n-1]=k;
        
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++)
        {
            rotate(arr,n);
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
