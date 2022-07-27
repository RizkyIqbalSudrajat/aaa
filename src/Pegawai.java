/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class Pegawai extends Perusahaan{
    public String nama,jk;
    public int nomorPegawai;
    public int PendapatanGaji, pendapatanMaksimal;
    
    @Override
    public void identitasPegawai(){
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: "+jk);
        System.out.println("Nomor Pegawai: "+nomorPegawai);
    }
    
    @Override
   public void bagianPekerjaan(){
        System.out.println("Bekerja bagian Admin");
   }
   
   //overloading
   public int Cekgaji(int PendapatanGaji){
       return PendapatanGaji;
   }
       
   }
       
   
   
  // public void Cekgaji(int pendapatanMaksimal){
      // System.out.println("Gaji Maksimal: "+pendapatanMaksimal);
  // }

    

   