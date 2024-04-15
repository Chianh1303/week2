import java.util.Scanner;

public class Kiemtrasont {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, dem =0;
        System.out.println("Nhap vao so can kiem tra:");
        n = scan.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                dem++;
            }
        }
        if (dem ==2){
            System.out.println(n + "la so nguyen to");
        }else {
            System.out.println(n+ "ko la so nguyen to");
        }

    }
}

