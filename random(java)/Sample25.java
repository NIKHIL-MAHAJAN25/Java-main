public class Sample25 {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,0,2,10,12,13,15,13,13,16,17};
        int i=0,j=0;
        int temp;
        for(i=0;i<14;i++)
    {
        for(j=0;j<14-i-1;j++)
        {
            if(array[j]>array[j+1])
            {
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
    }
    for(i=0;i<=14;i++){
    System.out.println("sorted array is:"+array[i]);
    }
    }
}

    

