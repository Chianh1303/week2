import java.util.Scanner;

public class uocchunglonnhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = input.nextInt();
        System.out.println("Nhập b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b == 0 ){
            System.out.println("ko tồn tại");
        }
        while (a != b){
            if (a > b)
             a = a - b;
            else
                b = b-a;
        }
        System.out.println("Đáp án" + a);
    }
}
