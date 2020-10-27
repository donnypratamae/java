package pkg1p43;
public class donny17 {
    public static void main(String[] args) 
    {
        int papa = 2, mama = 3, tt = 0;
        while (papa<=4) 
        {
            int mbak = 1, jm = 0;
            while (mbak<=mama) 
            {
                jm = mbak + papa;
                System.out.println("   "+mbak+" + "+papa+" = "+jm);
                mbak = mbak + 1;
                tt = tt + jm;
            }
            papa = papa + 2;
            mama = mama + 1;
        }
        System.out.println("--------------- +");
        System.out.println("  TOTAL  = "+tt);
        System.out.println("");
        System.out.println("DONNY PRATAMA 202400116");
    }
    
}
