import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        System.out.println("Số nt nhỏ hơn 100 là ");
        int check = 0;
        int x,y ;
        for (x = 2;x < 100; x++){
            for(y = 1;y <= x; y++){
                if (x % y == 0){
                    check++;

                }
            }
            if (check <= 2){
                System.out.print(x+ ";");
            }
            check = 0;
        }
    }
}
