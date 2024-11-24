import java.util.*;

class Demo {
        static int sqrt(int num) {
                int val = 0;
                for (int i = 0; i <= num; i++) {
                        if (i * i <= num) {
                                val = i;

                        } else {
                                break;
                        }
                }
                return val;
        }

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println(sqrt(num));

        }
}
