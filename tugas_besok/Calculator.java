package tugas_besok;

public class Calculator {
    private IOperasiAritmatika operasi;

    public Calculator(IOperasiAritmatika operasi) {
        this.operasi = operasi;
    }

    public double aksiOperasi(double bil1, double bil2) {
        return operasi.kalkulasi(bil1, bil2);
    }
}
