
import java.util.*;

class code {
        void Printto(int num) {
                if (num == 0)
                        return;

                Printto(num-1);
                System.out.println(num);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                code Obj = new code();
                Obj.Printto(num);

        }
}
