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
public class Contoh3 {
    public static void main(String[] args)
    {
        //CARA PERTAMA
        //MENAMPILKAN 10 BILNGAN GANJIL PERTAMA
        int x = 1;
        
        for(x = 1 ; x <= 20 ; x+=2)
        {
            System.out.print(x + " " );
        }
        
        System.out.println();
        
        //MENAMPILKAN 10 BILANGAN GENAP PERTAMA
         
     for(x = 2 ; x <= 20 ; x+=2)
        {
            System.out.print(x + " " );
        }
       System.out.println();
     //CARA KEDUA
        //MENAMPILKAN 10 BILANGAN GANJIL PERTAMA
        
        for(x = 1 ; x <=20 ; x++)
        {
            if(x % 2 == 1)
            {
                System.out.print(x + " " );
            }
               
        }
        System.out.println();
        //MENAMPILKAN 10 BILANGAN GENAP PERTAMA
        
        for(x = 1; x <= 20 ; x++)
        {
            if(x % 2 == 0)
            {
                System.out.print(x + " ");
            }
        }
    }
}
