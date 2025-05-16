package recursion;

public class ReverseAString {
    public static void reverse(String s){
        int sLength = s.length();
        if(sLength == 1){
            System.out.print(s.charAt(0));

        }

        else{
            System.out.print(s.charAt(sLength - 1));
            reverse(s.substring(0, sLength - 1));
        }
    }
    public static void main(String[] args) {
        reverse("Hello");
    }
}
