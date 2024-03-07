
package com.mycompany.condterna;

import java.util.Scanner;

public class CondTerna {

    public static void main(String[] args) {
        
        Scanner ct = new Scanner(System.in);
        
        double preco = ct.nextDouble();
        double desconto;
        
        /*if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }
        */
       
        desconto = (preco < 20.0) ? (preco * 0.1) : (preco * 0.05);
        System.out.println("R$" + desconto + " de desconto");
        
        
       
    }
       
    }

