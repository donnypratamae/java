package pkg1p43;
import javax.swing.*;
public class donny37 {
    public static void main(String[] args) 
    {
        String tampil="";
        float rata = 0f, nil1 = 0f, nil2 = 0f;
        double def = 0.25, koreksi;
        
        String ujian1 = JOptionPane.showInputDialog("NILAI UJIAN 1");
        nil1 = Float.parseFloat(ujian1);
        String ujian2 = JOptionPane.showInputDialog("NILAI UJIAN 2");
        nil2 = Float.parseFloat(ujian2);
        
        rata = ((nil1 + nil2)/2);
        koreksi = rata * def;
        tampil += "     HASIL NILAI     \n";
        tampil += "=====================\n";
        tampil += " 1. Nilai Ujian 1  = "+nil1+"\n";
        tampil += " 2. Nilai Ujian 2  = "+nil2+"\n";
        tampil += "---------------------\n";
        tampil += " Rata rata Nilai   = "+rata+"\n";
        tampil += " Hasil defiasi     = "+koreksi+"\n";
        JOptionPane.showMessageDialog(null, tampil, "HASIL UJIAN", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
