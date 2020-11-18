/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan59.detectiveconan;

/**
 *
 * @author asus
 */
public class DetectiveConan {
    protected String kanji;
    protected String siapaDia;
    protected String karakterUnik;
    
    public DetectiveConan(String kanji, String siapaDia, String karakterUnik){
        this.kanji = kanji;
        this.karakterUnik = karakterUnik;
        this.siapaDia = siapaDia;
    }
    
    public void tampil(){
        System.out.println("Nama dalam Huruf Kanji           : "+kanji);
        System.out.println("Karakter Unik                    : "+karakterUnik);
        System.out.println("Siapa Dia ?                      : "+siapaDia);
    }
    
}
