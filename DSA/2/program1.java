import java.util.*;

class Square {
    int run(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i*i<=num) {
                System.out.println(i);
                count++;
           System.out.println(i*i);
	    }
        }
        return count;
    }
}

class Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Square obj = new Square();
        int count = obj.run(num);
        System.out.println("Total divisors: " + count);
    }
}

