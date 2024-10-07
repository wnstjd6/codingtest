import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); 
        char b;
        String ab = "";
        for(int i = 0; i<a.length(); i++){
            b = a.charAt(i);
            if(Character.isUpperCase(b)){
                ab+=Character.toLowerCase(b);
            }
            else{
                ab+=Character.toUpperCase(b);
            }
        }
        System.out.println(ab);
        
    }
}