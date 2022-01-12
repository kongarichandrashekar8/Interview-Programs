class PrimeDigits
{
  public static boolean checkPrime(int k)
    {
        
        for(int i=2;i<k/2+1;i++)
        {
            if(k%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static int giveSum(int n)
    {
        int sum;
        if(n<10){
            sum= n;
        }
        else{
            sum=0;
            while(n>0)
            {
                sum=sum+n%10;4+3+2
                n=n/10;0
            }
            
        }
        return sum;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] digitPrimes=new int[n];
		int i=0;
		int number=2;
		while(true)
		{
		    int k=number;
		    
		    boolean c=checkPrime(k);
		    
		    if(c)
		    {
		        while(true)
		        {
		            k=giveSum(k);
		            if(k<10)
		            {
		                break;
		            }
		        }
		    // 2 3 5 7 
    		    switch(k){
    		        case 2:
    		            digitPrimes[i]=number;
    		            i++;
    		            break;
    		        case 3:
    		            digitPrimes[i]=number;
    		            i++;
    		            break;
    		        case 5:
    		            digitPrimes[i]=number;
    		            i++;
    		            break;
    		        case 7:
    		            digitPrimes[i]=number;
    		            i++;
    		            break;
    		    }
		    }
		    
		   
		    if(i==n){
		        break;
		    }
		    number++;
		}
		
		for(int j=0;j<n;j++){
		    System.out.print(digitPrimes[j]+" ");
		}
	}
}
