package tugas_besok;

public class Bagi implements IOperasiAritmatika {
    @Override
    public double kalkulasi(double bil1, double bil2) {
        if (bil2 != 0) {
            return bil1 / bil2;
        }
        throw new ArithmeticException("Tidak dapat melakukan pembagian dengan nol.");
    }
}
