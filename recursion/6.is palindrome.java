public class Main {

    public static boolean isPalindrome(int index, String string){
        boolean check = string.charAt(index) == string.charAt(string.length()-index-1);
        if(index == 0){
            return check;
        }
        return check && isPalindrome(index-1,string);
    }
    public static void main(String[] args) {
        String string = "Hello world!";
        System.out.println(string);
        System.out.println("Is palindrome: "+ isPalindrome(string.length()/2-1,string));
        string = "Hello olleH";
        System.out.println(string);
        System.out.println("Is palindrome: "+ isPalindrome(string.length()/2-1,string));
    }
}