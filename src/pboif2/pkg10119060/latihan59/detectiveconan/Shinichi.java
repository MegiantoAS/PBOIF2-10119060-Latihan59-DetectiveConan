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
public class Shinichi extends DetectiveConan{
    private String nama;
    
    public Shinichi(String kanji, String siapaDia, String karakterUnik) {
        super(kanji, siapaDia, karakterUnik);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
