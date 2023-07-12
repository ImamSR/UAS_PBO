package tugas_besok;

public class Kurang implements IOperasiAritmatika {
    @Override
    public double kalkulasi(double bil1, double bil2) {
        return bil1 - bil2;
    }
}
