public class hienthisonguyento {
        public static void main(String[] args) {
            int count = 0;
            int number = 2;
             int result = 0;
            System.out.println("20 số nguyên tố đầu tiên là:");
            while (count < 20) {
                if (isPrime(number)) {
                    result = number;

                    count++;
                }
                number++;
            }
            System.out.println(result);
        }
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;

        }
    }


