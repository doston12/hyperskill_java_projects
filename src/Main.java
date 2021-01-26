import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n, m, t1 = 0, t2 = 0;

        n = sc.nextInt();

        do {
            m = sc.nextInt();
            if(m != 0){
                if(n - m >= 1 || n == m)
                    t1 = 1;
                else if (n - m >= -1 || n == m)
                    t2 = 1;
                n = m;
            }
        } while(n != 0);

        if(t1 == 1 && t2 == 1)
            System.out.println(false);
        else
            System.out.println(true);
    }
}