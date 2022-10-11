package homeWork_1;

public class miniProjeAsalSayi {
    public static void main(String[] args) {

        int number = 20;

        int remainder = number % 2;

        System.out.println(remainder);
        boolean isPrime = true;

        if (number < 2) {
            System.out.println(" Geçersiz Sayı");
        }
        if (number == 1) {
            System.out.println(" Sayı Asal değildir");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(" Sayı Asaldır");
        } else {
            System.out.println(" Sayı Asal değildir");
        }

    }

}
