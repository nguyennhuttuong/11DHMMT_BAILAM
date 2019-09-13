/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lad.pkg2.bai.pkg2;

import java.util.Scanner;

/**
 *
 * @author Nguyễn Nhựt Tường
 */
public class Lad2Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float a,b,x;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất có dạng ax + b = 0 ");
        System.out.print("Nhập giá trị a : ");
        a= scanner.nextFloat();
        System.out.print("Nhập giá trị b : ");
        b= scanner.nextFloat();
        
        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình có vô số nghiệm !");
                
            } 
            else {
                System.out.println("Phương trình vô nghiệm !");
            }
            
        } 
        else {
            x=-b/a;
            System.out.println("Nghiệm của phương trình là :" +x);
        }
    }
    
}
