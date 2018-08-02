/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J08;
import java.util.Scanner;
/**
 *
 * @author Anandarafi
 */
public class Contoh2 {
    public static void main(String[] args)
    {
        //PERULANGAN FOR
        Scanner baca = new Scanner(System.in);
       int n;
       int x;
       System.out.println("Masukkan nilai n: ");
       n = baca.nextInt();
        
                for(x = 1 ; x <= n ; x++)
                {
                    System.out.println(x + " ");
                }
          
               
                //PERULANGAN WHILE
                
         x = 1;
         while (x <= n)
                 {
                     System.out.println(x + " ");
                     x++;
                 }
         
        
         //PERULANGAN DO-WHILE
         x = 1;
         do
         {
             System.out.println(x + " ");
             x++;
         }
         while(x <= n);
                             
                         
    }
}
