class ConcatSortPrint
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
        
        int[] subArray=new int[n/k]; 
        int[] subArraywithoutSort=new int[n/k];
        int ii=0;
        int[] indexArray=new int[n/k];
        for(int i=0;i<n;i=i+k)
        {
            String s="";
            for(int j=i;j<i+k;j++)
            {
                s=s+Integer.toString(arr[j]);   
            }
            subArray[ii]=Integer.parseInt(s);
            subArraywithoutSort[ii]=subArray[ii];
            indexArray[ii]=i;
            ii++;
            
        }
        
        for(int i=0;i<n/k;i++)
        {
            for(int j=i+1;j<n/k;j++)
            {
                if(subArray[i]>subArray[j])
                {
                    int temp=subArray[i];
                    subArray[i]=subArray[j];
                    subArray[j]=temp;
                }
            }
        }
        
        1 32 5 6 9 3
        k=2
        subarray={132,56,93}
        subArraywithoutSort={132,56,93}
        subarray={56,93,132}
        indexArray={0,2,4}
        
        for(int i=0;i<n/k;i++)
        {
            for(int j=0;j<n/k;j++)
            {
                if(subArray[i]==subArraywithoutSort[j])
                {
                    int a=indexArray[j];
                    int b=0;
                    while(b<k)
                    {
                        System.out.print(arr[a++]+" ");
                        
                        b++;
                    }
                }
            }
        }
}
