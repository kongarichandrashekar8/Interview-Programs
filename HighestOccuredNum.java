class HighestOccuredNum
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
        int value=0;
        int max=1;
        //Arrays.sort(arr);
       // 2 3 6 1 7
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        1 2 2 2 3 3
        
        int individualCount=1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1]){
                individualCount++;
                if(individualCount>max)
                {
                    value=arr[i];
                    max=individualCount;
                }
                
            }
            else{
                    individualCount=1;
                }
        }
        if(max==1)
        {
            System.out.println("-1");
        }
        else{
            System.out.println(value);
        }
    }
}
