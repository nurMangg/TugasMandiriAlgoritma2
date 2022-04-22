import Model.Perhitungan;

public class JalankanPerthitungan {
    
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);
        
        //Munculkan pertambahan dan perkalian menggunakan method return dan judul
        //Tugas di Post di email ke aherijanto@mimoapps.xyz 
        //Subject email : TM_NIM_NAMALENGKAP_KELAS
        
        int hasilTambah = s.hitungan(4, 6);
        System.out.println(hasilTambah);

        int hasilKali = s.kalian(4, 6);
        System.out.println(hasilKali);

        s.PrintJudul();
        
    }
    
}
