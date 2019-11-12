/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasircuu;

/**
 *
 * @author PC
 */
public class Kasircuu {
    private String merk;
    private String jenis;
    private String warna;
    private String kategori;
    
    
    
    public Kasircuu(String kategori, String jenis, String merk, String warna){
        this.merk = merk;
        this.warna = jenis;
        this.jenis = warna;
        this.kategori = kategori;
        
        
        
        System.out.println("\nKategori Sepatu \t: "+kategori);
        System.out.println("Jenis Sepatu    \t: "+jenis);
        System.out.println("Merk Sepatu     \t: "+merk);
        System.out.println("Warna Sepatu    \t: "+warna);
       
    }
    
}
