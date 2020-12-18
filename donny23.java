package pkg1p43;
public class donny23 {
    public static void main(String[] args) 
    {
        int REVO = 2, gt = 0;
        while(REVO>=1) 
        {
            int VARIO = 1, BEAT = 210, VESPA = 1, tot;
            while(VARIO<=3) 
            {
                VESPA = 1;
                tot = 0;
                do 
                {
                    System.out.print(BEAT+"  ");
                    tot = tot + BEAT;
                    BEAT = BEAT - 10;
                    VESPA = VESPA + 1;
                }
                while(VESPA<=4);
                System.out.println("  =  "+tot);
                gt = gt + tot;
                VARIO = VARIO + 1;
            }
            REVO = REVO - 1;
        }
        System.out.println("=============================== + ");
        System.out.println(" TOTAL KESELURUHAN    =  "+gt);
        System.out.println("");
        System.out.println("DONNY PRATAMA 202400116");
    }
}
