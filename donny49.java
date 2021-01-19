package pkg1p43;
import javax.swing.*;
public class donny49
{
    private static int harga, porsi;
    private static String pil,pr;
    public static void main (String[] args)
    {
        boolean putar = true ;
        do
        {
            pr = "";
            do
            {
                pil = JOptionPane.showInputDialog(null," MENU MASAKAN \n1.AYAM BAKAR CABAI PEDAS \n2. ES CAMPUR RASA MACAM MACAM " + "\n3. IKAN TONGKOL MAIN BOLA \n4. SELESAI \n PILIH [1 - 4]\n");
            }
            while (!(("1".equals(pil)) | ("2".equals(pil)) | ("3".equals(pil)) | ("4".equals(pil))));
            switch (pil)
            {
                case "1" : 
                {
                    pr = JOptionPane.showInputDialog(null,"DAFTAR HARGA PERPORSI 50.00"+"\n - AYAM BAKAR\n - NASI PUTIH \n - AIR MINUM (TEHMANIS ATAU TEH TAWAR \n"+" PILIH BERAPA PORSI");
                    porsi = Integer.parseInt(pr);
                    harga = porsi * 50000;
                    JOptionPane.showMessageDialog(null,"TOTAL HARGA = Rp. "+harga);
                    break;
                }
                case "2" : 
                {
                    pr = JOptionPane.showInputDialog(null,"DAFTAR HARGA PERPORSI 75.00"+"\n -ES CAMPUR RASA BUAH \nRASA SAYUR ATAU TIDAK ADA RASA\n"+" PILIH BERAPA PORSI ");
                    porsi = Integer.parseInt(pr);
                    harga = porsi * 75000;
                    JOptionPane.showMessageDialog(null,"TOTAL HARGA = Rp."+harga);
                    break;
                }
                case "3" : 
                {
                    pr = JOptionPane.showInputDialog(null,"DAFTAR HARGA PERPORSI 125.00"+" \n - IKAN KECAP ATAU IKAN PEDAS\n"+" \n - BOLA KASTI ATAU BOLA BASKET\n"+" PILIH BERAPA PORSI ");
                    porsi = Integer.parseInt(pr);
                    harga = porsi * 125000;
                    JOptionPane.showMessageDialog(null,"TOTAL HARGA = Rp."+harga);
                    break;
                }
                case "4" : putar = false;
            }
        }
        while (putar);
    }
}