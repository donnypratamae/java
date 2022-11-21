package pkg1p43;
import javax.swing.JOptionPane;
public class donny73 {
    public static boolean putar = true;
    public static void main(String[] args) {
            String nasigoreng = "";
            String miegoreng = "";
            String mierebus = "";
            
            do {
                String pil = JOptionPane.showInputDialog("    MENU MAKANAN    \n 1.NASI GORENG"+"\n 2.MIE GORENG \n "
                        + "3.MIE REBUS \n 4. KELUAR"+"\n  PILIH[1 - 4]");
                
                switch (pil) {
                    case "1" : {
                        NASIGORENG nasi = new NASIGORENG();
                        nasigoreng = nasi.nasgor();
                        JOptionPane.showMessageDialog(null,"NASI GORENG READY \n 1. PEDAS \n 2.TIDAK PEDAS");
                        nasigoreng = nasi.nasgor2();
                        JOptionPane.showMessageDialog(null,"PESANAN DITERIMA! \nNASI GORENG VARIAN "+nasigoreng+" SEGERA DIPROSES! \nSILAHKAN DITUNGGU :)");
                        break;
                    }
                    case "2" : {
                        MIEGORENG mie = new MIEGORENG();
                        miegoreng = mie.miegor();
                        JOptionPane.showMessageDialog(null,"MIE GORENG READY \n 1. PEDAS \n 2.TIDAK PEDAS");
                        miegoreng = mie.miegor2();
                        JOptionPane.showMessageDialog(null,"PESANAN DITERIMA! \nMIE GORENG VARIAN "+miegoreng+" SEGERA DIPROSES! \nSILAHKAN DITUNGGU :)");
                        break;
                    }
                    case "3" : {
                        MIEREBUS mie2 = new MIEREBUS();
                        mierebus = mie2.miebus();
                        JOptionPane.showMessageDialog(null,"MIE REBUS READY \n 1. PEDAS \n 2.TIDAK PEDAS");
                        mierebus = mie2.miebus2();
                        JOptionPane.showMessageDialog(null,"PESANAN DITERIMA! \nMIE REBUS VARIAN "+mierebus+" SEGERA DIPROSES! \nSILAHKAN DITUNGGU :)");
                    }
                    case "4" : {
                        System.exit(0);putar = false;
                        break;
                    }
                }
            }
            while(putar);
        }
}
