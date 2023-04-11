public class Main {
    public static String reverse(String initialString){
        if (initialString.length()==1){
            return ""+initialString.charAt(0);
        }
        char newChar = initialString.charAt(initialString.length()-1);
        String newString = initialString.substring(0,initialString.length()-1);
        return newChar+reverse(newString);
    }
    public static void main(String[] args) {
        String string = "Hello world!";
        System.out.println(reverse(string));
    }
}