public class Main {
    public static int _1_2_4_sequenceSumOfFirstN(int n,int nth){
        if(n==1){
            return nth;
        }
        return nth + _1_2_4_sequenceSumOfFirstN(n-1,nth/2);
    }
    public static int _1_2_4_sequenceSumOfFirstN(int n){
        return _1_2_4_sequenceSumOfFirstN(n,(int) Math.pow(2,n-1));
    }

    public static int _1_2_4_sequenceSumOfFirstN_version2(int n){
        if(n==1){
            return 1;
        }
        return (int)Math.pow(2,n-1)+_1_2_4_sequenceSumOfFirstN(n-1);
    }
    public static void main(String[] args) {
        System.out.println(_1_2_4_sequenceSumOfFirstN(1));//1
        System.out.println(_1_2_4_sequenceSumOfFirstN(2));//3
        System.out.println(_1_2_4_sequenceSumOfFirstN(3));//7
        System.out.println(_1_2_4_sequenceSumOfFirstN(4));//15
        System.out.println(_1_2_4_sequenceSumOfFirstN(5));//31

        System.out.println(_1_2_4_sequenceSumOfFirstN_version2(1));//1
        System.out.println(_1_2_4_sequenceSumOfFirstN_version2(2));//3
        System.out.println(_1_2_4_sequenceSumOfFirstN_version2(3));//7
        System.out.println(_1_2_4_sequenceSumOfFirstN_version2(4));//15
        System.out.println(_1_2_4_sequenceSumOfFirstN_version2(5));//31
    }
}