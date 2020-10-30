package pkg1p43;
public class donny18 
{
    public static void main(String[] args) 
    {
        int MERAH = 7, KUNING = 4, HIJAU = 2, PINK = 1;
        while (PINK<=3) 
        {
            int BIRU = 5, jm = 0, tt = 0;
            do 
            {
                jm = MERAH + BIRU - HIJAU;
                System.out.println("  "+MERAH+" + "+BIRU+" - "+HIJAU+" = "+jm);
                MERAH = MERAH + 1;
                BIRU = BIRU - 1;
                HIJAU = HIJAU + 1;
                tt = tt + jm; 
            }
            while (BIRU>=KUNING);
            KUNING = KUNING - 1;
            PINK = PINK + 1;
            System.out.println(" ------------------- + ");
            System.out.println("  TOTAL       = "+tt);
            System.out.println("");
        }
        System.out.println("");
        System.out.println("DONNY PRATAMA 202400116");
    }
}
