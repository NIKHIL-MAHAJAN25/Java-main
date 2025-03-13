public class Sample24 {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,0,2,10,12,13,15,13,13,16,17};
        int i=0,odd=0,even=0;
        for(i=0;i<=14;i++)
        {
            if(array[i]%2==0){
                System.out.println("Even number:"+array[i]);
                even++;
            
            }
            else if (array[i]%2==1) 
                
            {
                System.out.println("odd numbers:"+array[i]);
                odd++;
            }
        }
        System.out.println("Total even numbers:"+even);
        System.out.println("Total odd numbers:"+odd);
    }
}
