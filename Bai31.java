/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.pkg1;
import java.util.Scanner;
/**
 *
 * @author ThomDoan
 */
public class Bai31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int A = a.nextInt();
        System.out.print("Nhap b: ");
        int B =  a.nextInt();
        tinhuoc(A,B);
        
        
    }
   public static void tinhuoc(int n,int m)
    {
        int kq = 0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0 && m%i==0)
                kq=i;
        }
        System.out.print("uoc chung lon nhat la:"+kq );
    }
    
}
