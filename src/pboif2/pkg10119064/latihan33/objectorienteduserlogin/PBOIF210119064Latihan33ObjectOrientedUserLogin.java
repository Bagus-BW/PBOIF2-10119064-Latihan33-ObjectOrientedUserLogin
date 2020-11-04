/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan33.objectorienteduserlogin;

import data.User;
import java.util.Scanner;
/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk user melakukan login terhadap sistem
 */
public class PBOIF210119064Latihan33ObjectOrientedUserLogin {
        private static String usName;
        private static String passWord;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Username = ");
        usName = keyboard.next();
        
        System.out.print("Masukkan Password = ");
        passWord = keyboard.next();
        
        User userLogin = new User();
        
        System.out.println("");
        userLogin.pengecekanLogin(usName, passWord);
        
        
    }
    
}
