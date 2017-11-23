
package recurs;

import java.util.*;

public class Recurs 
{
    static int i = 1;
    public static void main (String [] args)
    {
        Scanner var = new Scanner (System.in);
        System.out.print ("Masukkan jumlah = ");
        int n = var.nextInt ();
        acak (n, 'A', 'B', 'C');
    }
    
    public static void acak (int n, char Asal, char Bantu, char Tujuan)
    {
        try 
                {
                   if (n != 0)
        {
            acak(n-1, Asal, Tujuan, Bantu);
            System.out.println("Urutan ke "+ i++ +", acak dari "+ Asal+" ke "+Tujuan);
            acak (n-1, Bantu, Asal, Tujuan);
            
        } 
                }
                 
                catch (RuntimeException err) 
                        {
                            err.getMessage();
                        }
        
}
}
