public class Main {
    public static int stairs(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return stairs(n-2)+stairs(n-1);
    }
    public static void main(String[] args) {
        System.out.println(stairs(4));
    }
}