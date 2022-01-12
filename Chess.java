class Chess
{
  public static void display(int[][] matrix,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");//printing
            }
            System.out.println();
        }
        
    }
    public static void placeRookFindShortestPath(int[][] matrix,int i,int j)
    {
        System.out.print("("+i+","+j+")");
        System.out.print("("+1+","+j+")");
        System.out.print("("+1+","+1+")");
        System.out.println();
        System.out.print("NUmber of blocks traversed ");
        System.out.println(i+j);
        System.out.print("NUmber of moves ");
        System.out.println(2);
        /*if(i==j)
        {
            for(int a=i;a>=1;a--)
            {
                System.out.print("("+a+","+j+")");
            }
            for(int a=i;a>=1;a--)
            {
                System.out.print("("+1+","+a+")");
            }
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(i+j);
            System.out.print("NUmber of moves ");
            System.out.println(i+j);
            
            
        }
        else if(i>j)
        {
            int a;
            for(a=j;a>=1;a--)
            {
                System.out.print("("+i+","+j+")");
            }
            for(int a=i;a>=1;a--)
            {
                System.out.print("("+1+","+a+")");
            }
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(i+j);
            System.out.print("NUmber of moves ");
            System.out.println(i+j);
            
            
        }*/
    }
   
    public static void placeKingFindShortestPath(int[][] matrix,int i,int j)
    {
        if(i==j)
        {
            System.out.print("NUmber of blocks traversed ");
            System.out.println(i-1);
            System.out.print("NUmber of moves ");
            System.out.println(i-1);
            for(int a=i;a>=1;a--)
            {
                System.out.print("("+a+","+a+")");
            }
        }
        else if(i>j)
        {
            System.out.print("NUmber of blocks traversed ");
            System.out.println(i-1);
            System.out.print("NUmber of moves ");
            System.out.println(i-1);
            System.out.println("Path:");
            int c=i;
            for(int a=0;a<=i-j;a++)
            {
                System.out.print("("+c+","+j+")");
                c--;
            }
            for(int d=c;d>=1;d--)
            {
                System.out.print("("+d+","+d+")");
            }
        }
        else{
             System.out.print("NUmber of blocks traversed ");
            System.out.println(j-1);
            System.out.print("NUmber of moves ");
            System.out.println(j-1);
            int c=j;
            System.out.println("Path:");
            for(int a=0;a<=j-i;a++)
            {
                System.out.print("("+i+","+c+")");
                c--;
            }
            for(int d=c;d>=1;d--)
            {
                System.out.print("("+d+","+d+")");
            }
        }
        
        
        
        
    }
    public static void placeBlackBishopFindShortestPath(int[][] matrix,int i,int j)
    {
    /*  0 1 0 1 0 
        1 0 1 0 1 
        0 1 0 1 0 
        1 0 1 0 1 
        0 1 0 1 0 */
        if(i==j)
        {
            System.out.println("Path");
        
            System.out.print("("+i+","+j+")");
           
            System.out.print("("+1+","+1+")");
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(j);
            System.out.print("NUmber of moves ");
            System.out.println(1);
        }
        else if(i>j)
        {
            System.out.println("Path");
        
            System.out.print("("+i+","+j+")");
            int count=0;
            while(true)
            {
                if(i==j)
                {
                    break;
                }
                else{
                    count++;
                    i--;
                    j++;
                }
            }
            System.out.print("("+j+","+j+")");
            System.out.print("("+1+","+1+")");
        
            
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(i+count);
            System.out.print("NUmber of moves ");
            System.out.println(2);   
        }
        else 
        {
            System.out.println("Path");
        
            System.out.print("("+i+","+j+")");
            int count=0;
            while(true)
            {
                if(i==j)
                {
                    break;
                }
                else{
                    count++;
                    i++;
                    j--;
                }
            }
            System.out.print("("+j+","+j+")");
            System.out.print("("+1+","+1+")");
        
            
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(j+count);
            System.out.print("NUmber of moves ");
            System.out.println(2);   
        }
        
        
        
    }
    public static int BlackBishopFindShortestPath(int[][] matrix,int i,int j)
    {
    /*  0 1 0 1 0 
        1 0 1 0 1 
        0 1 0 1 0 
        1 0 1 0 1 
        0 1 0 1 0 */
        if(i==j)
        {
      
            return j;
        
        }
        else if(i>j)
        {
           
            int count=0;
            while(true)
            {
                if(i==j)
                {
                    break;
                }
                else{
                    count++;
                    i--;
                    j++;
                }
            }
            
           
            return i+count;
           
        }
        else 
        {
            
            int count=0;
            while(true)
            {
                if(i==j)
                {
                    break;
                }
                else{
                    count++;
                    i++;
                    j--;
                }
            }
           
            
            return j+count;
             
        }
        
        
        
    }
    public static int RookFindShortestPath(int[][] matrix,int i,int j)
    {
        
        return i+j;
        
        
    }
    
    public static void placeQueenFindShortestPath(int[][] matrix,int i,int j)
    {
        if(i==j)
        {
            System.out.println("Path");
        
            System.out.print("("+i+","+j+")");
           
            System.out.print("("+1+","+1+")");
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(j-1);
            System.out.print("NUmber of moves ");
            System.out.println(1);
            
        }
        else if(i==1 && j>1)
        {
            System.out.println("Path");
        
            System.out.print("("+i+","+j+")");
           
            System.out.print("("+1+","+1+")");
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(j-1);
            System.out.print("NUmber of moves ");
            System.out.println(2);
            
        }
        else if(i>1 && j==1)
        {
            System.out.println("Path");
        
            System.out.print("("+i+","+j+")");
           
            System.out.print("("+1+","+1+")");
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(i-1);
            System.out.print("NUmber of moves ");
            System.out.println(2);
            
        }
        else if(i>j)
        {
            System.out.println("Path");
        
            System.out.print("("+i+","+j+")");
            int count=0;
            int steps=0;
            if(i%2==0 && j%2==0)
            {
                while(true)
                {
                    if(i==j)
                    {
                        break;
                    }
                    else{
                        count++;
                        i--;
                        j++;
                    }
                }
                
            }
            else if(i%2!=0)
            {
                count++;
                i=i-1;
                while(true)
                {
                    if(i==j)
                    {
                        break;
                    }
                    else{
                        count++;
                        i--;
                        j++;
                    }
                }
                steps++;
            }
            else{
                count++;
                i=j-1;
                while(true)
                {
                    if(i==j)
                    {
                        break;
                    }
                    else{
                        count++;
                        i--;
                        j++;
                    }
                }
                steps++;
                
            }
            
            System.out.print("("+j+","+j+")");
            System.out.print("("+1+","+1+")");
        
            
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(i+count-1);
            System.out.print("NUmber of moves ");
            System.out.println(2+steps);
        }
        else{
            System.out.println("Path");
        
            System.out.print("("+i+","+j+")");
            int count=0;
            int steps=0;
            if(i%2!=0 && j%2!=0)
            {
                while(true)
                {
                    if(i==j)
                    {
                        break;
                    }
                    else{
                        count++;
                        i++;
                        j--;
                    }
                }
                
            }
            else if(i%2!=0)
            {
                count++;
                i=i+1;
                while(true)
                {
                    if(i==j)
                    {
                        break;
                    }
                    else{
                        count++;
                        i++;
                        j--;
                    }
                }
                steps++;
            }
            else{
                count++;
                i=j-1;
                while(true)
                {
                    if(i==j)
                    {
                        break;
                    }
                    else{
                        count++;
                        i++;
                        j--;
                    }
                }
                steps++;
                
            }
            
            System.out.print("("+j+","+j+")");
            System.out.print("("+1+","+1+")");
        
            
            System.out.println();
            System.out.print("NUmber of blocks traversed ");
            System.out.println(i+count-1);
            System.out.print("NUmber of moves ");
            System.out.println(2+steps);
            
        }
    }
    
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];//matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int k=i+j;
                if(k%2==0)
                {
                    matrix[i][j]=0;//storing
                }
                else{
                    matrix[i][j]=1;
                }
            }
            
        }
        System.out.println("1-display board");
        System.out.println("2-place king and find shortest path");
        System.out.println("3-place rook and find shortest path");
        System.out.println("4-place Black Bishop and find shortest path");
        System.out.println("5-place Queen and find shortest path");
        System.out.println("0-exit");
        
        while(true)
        {
            boolean toExit=false;
            System.out.println("please enter....");
            int option=sc.nextInt();
            switch(option){
                case 0:
                    toExit=true;
                    break;
                case 1:
                    display(matrix,n);
                    break;
                case 2:
                    
                    System.out.println("Enter king position...");
                    int i=sc.nextInt();
                    int j=sc.nextInt();
                    placeKingFindShortestPath(matrix,i,j);
                    break;
                case 3:
                    System.out.println("Enter Rook position...");
                    int Rooki=sc.nextInt();
                    int Rookj=sc.nextInt();
                    placeRookFindShortestPath(matrix,Rooki,Rookj);
                    break;
                case 4:
                    System.out.println("Enter Black Bishop position...");
                    int BBi=sc.nextInt();
                    int BBj=sc.nextInt();
                    placeBlackBishopFindShortestPath(matrix,BBi,BBj);
                    break;
                case 5:
                    System.out.println("Enter Queen position...");
                    int Qi=sc.nextInt();
                    int Qj=sc.nextInt();
                    placeQueenFindShortestPath(matrix,Qi,Qj);
                    break;
            }
            
            if(toExit)
            {
                break;
            }
            
        }
        
        
        
    }
}
