import java.util.Scanner;

public class sontnho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n ;
        System.out.println("Nhap n:");
        n = scan.nextInt();
        System.out.print( "So nguyen to be hon: " + n +"la: ");
        for (int i =1;i<n;i++){
            int dem =0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    dem++;
                }
            }
            if (dem==2){
                System.out.println(" "+i);
            }
        }
    }
}
