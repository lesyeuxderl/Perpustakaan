/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_perpustakaan;

/**
 *
 * @author Asus
 */
public class Mahasiswa {
    private String  nama;
    private String nim;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public Mahasiswa(String nama,String nim){
        this.nama=nama;
        this.nim=nim;
    }
    public Mahasiswa(){
        
    }
    
}
