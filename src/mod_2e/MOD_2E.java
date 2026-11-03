import javax.swing.JOptionPane;
public class MOD_2E {
    public static void main(String[] args) {
        String panjang, lebar;
        double luas;
        panjang = JOptionPane.showInputDialog("Masukan Nilai Panjang");
        double pj = Double.parseDouble(panjang);
        lebar = JOptionPane.showInputDialog("Masukan Nilai lebar");
        double lb = Double.parseDouble(lebar);
        luas = pj * lb;
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang = " + luas);
    }
}