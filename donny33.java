package pkg1p43;
import javax.swing.*;
public class donny33 {
    public static void main(String[] args) 
    {
        String ulang = "y";
        do 
        {
            String info = "";
            int BAYAR = 0;
            String NM_BRG = JOptionPane.showInputDialog("Nama Barang");
            String HG_BRG = JOptionPane.showInputDialog("Harga Barang");
            int Harga = Integer.parseInt(HG_BRG);
            String PT_HRG = JOptionPane.showInputDialog("Potongan Harga");
            int Potong = Integer.parseInt(PT_HRG);

            BAYAR = Harga - Potong;
            info +="\n Nama     = "+NM_BRG;
            info +="\n Harga    = "+HG_BRG;
            info +="\n Potongan = "+Potong;
            info +="\n Harga     = "+BAYAR;

            JOptionPane.showMessageDialog(null,info,"INDORMASI HARGA",JOptionPane.INFORMATION_MESSAGE);
            info = "";
            do 
            {
                ulang = JOptionPane.showInputDialog("INPUT DATA BARANG [Y/T]");
            }
            while (!("y".equals(ulang) | "Y".equals(ulang) | "t".equals(ulang) | "T".equals(ulang)));
        }
        while ("y".equals(ulang) | "Y".equals(ulang));
        System.exit(0);
    }
}