package com.yasemin.entity;

public class Yilan extends HayvanlarAlemi{
    int uzunluk;

    public Yilan() {
    }

    @Override
    public String toString() {
        return "Yilan{" +
                "uzunluk=" + uzunluk +
                "} " + super.toString();
    }

    public Yilan(String tur, String ad, int yas, int agirlik, int boy, String rengi, String beslenmeTuru, String yasamAlani, int uzunluk) {
        super(tur, ad, yas, agirlik, boy, rengi, beslenmeTuru, yasamAlani);
        this.uzunluk = uzunluk;
    }


    public void surun(){
        System.out.println("Yılan sürünerek ilerliyor.");
    }
    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}
