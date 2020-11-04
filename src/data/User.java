/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk user melakukan login terhadap sistem
 */
public class User {
    private static String username;
    private static String password;
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        if(("RizkiAdam".equals(parUserName))&&("terbaikselalu".equals(parPassword))){
            statusAkun = true;
        }else{
            statusAkun = false;
        }
        
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String parUserName){
        if(status == true){
            System.out.println("******HALLO " + parUserName + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }else{
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
    public void pengecekanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}
