public class q8 {
    
    public static void main(String[] args) 
    {
        int a[]={1,2,34,5,6,99};
        System.out.println("max number:"+express(a));
    }   

    public static int express(int a[])
    {
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            if(i==0)
            {
                max=a[i];
            }
            else if(a[i]>max)
            {
                max=a[i];
            }

        }

        return max;
    }
}
