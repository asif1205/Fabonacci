/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabonacciseries;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class FabonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=kb.nextInt();
        if(num<=0){
            System.out.println("Invalid input");
        }
        else if(num==1){
            System.out.println(0);
        }
        else if(num==2){
            System.out.print(0);
            System.out.println(1);
        }
        else {
            int fab[]=new int[num];
            fab[1]=1;
            for(int i=2;i<num;i++){
                fab[i]=fab[i-1]+fab[i-2];
            }
            for(int x:fab)
              System.out.println(x);
        }
        
    }
    
}
