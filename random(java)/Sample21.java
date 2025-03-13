public class Sample21 {

    
    public static void reverseString(String str) {
        if (str == null || str.length() <= 1) {
        System.out.print(str);  
        System.out.print(str.charAt(str.length() - 1));  
        reverseString(str.substring(0, str.length() - 1));  
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        
        reverseString(str); 
        System.out.print("Reversed string: "+str);
}
}

