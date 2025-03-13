public class Main
{
   
    static void subsequence(String s,String newString) {
    if(s.length()==0) {
        System.out.println(newString);
        return;
    }
   
    
    subsequence(s.substring(1), newString + s.charAt(0));
   
    
    subsequence(s.substring(1), newString);
}
    public static void main(String[] args) {
      subsequence("NIKHIL","");
    }
}