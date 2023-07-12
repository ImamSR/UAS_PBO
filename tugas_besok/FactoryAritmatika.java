package tugas_besok;

public class FactoryAritmatika {
    public static IOperasiAritmatika buatOperasi(String operator) {
        switch (operator) {
            case "+":
                return new Tambah();
            case "-":
                return new Kurang();
            case "*":
                return new Kali();
            case "/":
                return new Bagi();
            default:
                throw new IllegalArgumentException("Operator tidak valid.");
        }
    }
}
