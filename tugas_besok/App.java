package tugas_besok;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Pertama: ");
        double bil1 = input.nextDouble();

        System.out.print("Masukkan Bilangan Kedua: ");
        double bil2 = input.nextDouble();

        System.out.print("Masukkan Operator (+, -, *, /): ");
        String operator = input.next();

        IOperasiAritmatika operasi = FactoryAritmatika.buatOperasi(operator);

        Calculator calculator = new Calculator(operasi);
        double result = calculator.aksiOperasi(bil1, bil2);

        System.out.println("Hasil: " + result);
    }
}
