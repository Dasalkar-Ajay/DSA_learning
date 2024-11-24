import java.util.*;

class squareroot {
    static int sqrt(int num) {
        int start = 1;
        int end = num;
        int ans = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            int sqrt = mid * mid;

            if (sqrt == mid)
                return mid;

            if (sqrt > num) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sqrt(num));
    }
}
