package com.mycompany.project2_3;
import java.util.Scanner;
public class TestVHS {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("What is your role?");
    System.out.println("1/Admin");
    System.out.println("2/Customer");
    int c=scn.nextInt();
    switch(c){
        case 1:
            admin a=new admin();
            a.AdminPanel();
        case 2:    
            customer s=new customer();
            s.CustomerPanel();
        default:            
    }    
}
}
