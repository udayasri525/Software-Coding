package functinalInterface;

import java.util.function.Predicate;
import java.util.function.Consumer;

class primenumber {

    private int num;

    public primenumber(int num) {
        this.num = num;            //constructor
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "[num=" + num + "] ";
    }
}

public class example2 {

    public static void main(String[] args) {

        primenumber obj = new primenumber(5);

        // Predicate for Prime Check
        Predicate<Integer> check = new Predicate<Integer>() {

            @Override
            public boolean test(Integer num) {

                if (num <= 1) {
                    return false;
                }

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }

                return true;
            }
        };

        // Consumer to print result
        Consumer<primenumber> co = new Consumer<primenumber>() {

            @Override
            public void accept(primenumber t) {
                System.out.println(t + "is a Prime Number");
            }
        };

        if (check.test(obj.getNum())) {
            co.accept(obj);
        } else {
            System.out.println(obj.getNum() + " is Not Prime");
        }
    }
}