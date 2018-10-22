/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asssigment07;
import java.util.Scanner;

/**
 *
 * @author 1794810
 */
public class Assignment11 {
    public static void main(String[] args) {
        int n;
        Scanner console=new Scanner(System.in);
        System.out.print("How many lines ");
        n=console.nextInt();
         int i, j;
        for(i=0; i<n; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    
}
}
