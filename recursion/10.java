import java.util.LinkedList;
import java.util.List;

public class Main {
//    public static int[] denominations = {1,5,10,500,550,15000};
    public static int[] denominations = {2,5,10};
    public static int numberOfWaysOfdenomination(int money){
        int number = 0;
        for (int i = 0; i < denominations.length;i++){
            int localMoney = money - denominations[i];
            if(localMoney>=0){
                number+=1+numberOfWaysOfdenomination(localMoney);
            }
        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println(numberOfWaysOfdenomination(10));
        /**
        В условии сказано найти количество вариантов изменить исходную сумму.
         То есть не обязательно уменьшать до 0
        поэтому при вариантах деноминации {2,5,10}
         и исходной сумме 10
        ответ 13:
         1) 10
         2) 5 5
         3) 5
         4) 2 2 2 2 2
         5) 2 2 2 2
         6) 2 2 2
         7) 2 2
         8) 2
         9) 2 2 5
         10) 2 5 2
         11) 5 2 2
         12) 2 5
         13) 5 2
         
         **/
    }
}