/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan59.detectiveconan;

/**
 *
 @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Detective Conan
 */
public class PBOIF210119060Latihan59DetectiveConan {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Shinichi objTokoh = new Shinichi("工藤 新一 Kudō Shinichi","Shinichi Kudo adalah seorang detektif SMA terkenal yang " +
                                   "sering membantu polisi menyelesaikan kasus sulit", "menunjukkan karakter yang polos dan imut, layaknya anak " +
                                    "kelas 1 SD.");
        objTokoh.setNama("Shinichi Kudo");
        
        Mouri objMouri = new Mouri("毛利 蘭 Mōri Ran", "teman masa kecil dan cinta pertama Shinichi Kudo.", "handal dalam urusan rumah tangga");
        objMouri.setNama("Ran Mouri");
        
        System.out.println("                          -------Kartun Detective Conan--------");
        System.out.println("");
        
        System.out.println("Nama                             : "+objTokoh.getNama());
        objTokoh.tampil();
        System.out.println("");
        System.out.println("Nama                             : "+objMouri.getNama());
        objMouri.tampil();
    }
    
}
