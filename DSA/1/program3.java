import java.util.*;

class FactorDEmo3 {
        static int Factor(int x) {
                int count = 0;
                int itr = 0;
                for (int i = 1; i <= x / 10; i++) {

                        if (x % i == 0) {
                                System.out.println(i);
                                System.out.println(x / i);
                                count++;
                        }
                        itr++;
                }

                System.out.println(itr);

                return count * 2 - 1;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the value of x");
                int x = sc.nextInt();
                System.out.println(Factor(x));

        }
}
