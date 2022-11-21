package pkg1p43;
import javax.swing.JOptionPane;
public class donny71 {
    public static void main(String[] agrs) {
        String suaraKucing = "";
        String suaraAyam = "";
        String suaraTikus = "";
        
        KUCING meong = new KUCING();
        suaraKucing = meong.lolong();
        JOptionPane.showMessageDialog(null,"Suara Kucing .... "+" "+suaraKucing+"\n BENARKAN SUARA KUCING");
        suaraKucing = meong.lolong1();
        JOptionPane.showMessageDialog(null,"SUARA KUCING INPUTAN\n"+suaraKucing);
        
        AYAM kokok = new AYAM();
        suaraAyam = kokok.petok();
        JOptionPane.showMessageDialog(null,"Suara Ayam .... "+suaraAyam+"\n BENARKAN SUARA AYAM");
        suaraAyam = kokok.petok1();
        JOptionPane.showMessageDialog(null,"SUARA AYAM INPUTAN\n"+suaraAyam);
        
        TIKUS cicit = new TIKUS();
        suaraTikus = cicit.yiyit();
        JOptionPane.showMessageDialog(null,"Suara Tikus .... "+suaraTikus+"\n BENARKAN SUARA TIKUS");
        suaraTikus = cicit.yiyit1();
        JOptionPane.showMessageDialog(null,"SUARA TIKUS INPUTAN\n"+suaraTikus);
    }
}
