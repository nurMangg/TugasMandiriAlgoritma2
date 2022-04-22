package Model;

import Interface.ContohInterface;

public class Perhitungan implements ContohInterface {
        private int a;
        private int b;
        private int hasil;
    

    public Perhitungan(int a,int b,int hasil){
        this.a = a;
        this.b = b;
        hasil = 0;
        this.hasil = hasil;

        printJudulClass("Print Judul Dalam Method Perhitungan");
    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul Menggunakan Interface");
    }

    @Override
    public void Hitung() {
        // TODO Auto-generated method stub
        this.hasil = this.a + this.b;
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
    }



    // Method Return Hasil Tambah dengan Parameter
    public int hitungan(int angka1, int angka2){
        this.a = angka1;
        this.b = angka2;
        Hitung();
        return this.hasil;
    }

    // Method Return Hasil Kali dengan Parameter
    public int kalian(int angka3, int angka4) {
        this.a = angka3;
        this.b = angka4;
        HitungKali();
        return this.hasil;
    }

}


