package pkg1p43;
import javax.swing.JOptionPane;
public class donny26 {
    public static void main(String[] args) 
    {
        String tampung = " ";
        
        for (int nilai = 1; nilai <= 5; nilai = nilai + 1) 
        {
            tampung += nilai+"   ";
        }
        
        tampung +="\n DONNY PRATAMA 202400116";
        
        JOptionPane.showMessageDialog(null,tampung,"DERET",JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
