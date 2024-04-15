import java.util.Scanner;

public class hienthihinh {
    public static void main(String[] args) {
        System.out.println("1. Hiển thị hình chữ nhật.");
        System.out.println("2. Hiển thị hình tam giác vuông");
        Scanner scanner = new Scanner(System.in);
        int chose = scanner.nextInt();
        switch (chose){
            case 1:
                for (int i = 1; i <=3; i++){
                    for (int j =1; j<= 10; j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for(int i =1; i <= 7; i++){
                    for(int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;



        }
    }
}
