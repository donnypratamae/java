package pkg1p43;
import javax.swing.JOptionPane;
public class donny72 {
    public static boolean putar = true;
    public static void main(String[] args) {
            String suaraKucing = "";
            String suaraAyam = "";
            String suaraTikus = "";
            
            do {
                String pil = JOptionPane.showInputDialog("    MENU BUNYI HEWAN    \n 1.BUNYI KUCING"+"\n 2.BUNYI AYAM \n "
                        + "3. BUNYI TIKUS \n 4. KELUAR"+"\n  PILIH[1 - 4]");
                
                switch (pil) {
                    case "1" : {
                        KUCING meong = new KUCING();
                        suaraKucing = meong.lolong();
                        JOptionPane.showMessageDialog(null,"Suara Kucing .... "+" "+suaraKucing+"\n BENARKAN SUARA KUCING");
                        suaraKucing = meong.lolong1();
                        JOptionPane.showMessageDialog(null,"SUARA KUCING INPUTAN\n"+suaraKucing);
                        break;
                    }
                    case "2" : {
                        AYAM kokok = new AYAM();
                        suaraAyam = kokok.petok();
                        JOptionPane.showMessageDialog(null,"Suara Ayam .... "+suaraAyam+"\n BENARKAN SUARA AYAM");
                        suaraAyam = kokok.petok1();
                        JOptionPane.showMessageDialog(null,"SUARA AYAM INPUTAN\n"+suaraAyam);
                        break;
                    }
                    case "3" : {
                        TIKUS cicit = new TIKUS();
                        suaraTikus = cicit.yiyit();
                        JOptionPane.showMessageDialog(null,"Suara Tikus .... "+suaraTikus+"\n BENARKAN SUARA TIKUS");
                        suaraTikus = cicit.yiyit1();
                        JOptionPane.showMessageDialog(null,"SUARA TIKUS INPUTAN\n"+suaraTikus);
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
