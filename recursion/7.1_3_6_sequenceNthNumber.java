public class Main {

    public static int _1_3_6_sequenceNthNumber(int n){
        if(n<=1){
            return n;
        }
        return n+_1_3_6_sequenceNthNumber(n-1);
    }
    public static void main(String[] args) {
        System.out.println(_1_3_6_sequenceNthNumber(5));
    }
}