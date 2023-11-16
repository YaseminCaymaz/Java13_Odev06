package com.yasemin.entity;

public class Kus extends HayvanlarAlemi{
    int kanatUzunlugu;

    public Kus() {
    }

    public Kus(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public Kus(String tur, String ad, int yas, int agirlik, int boy, String rengi, String beslenmeTuru, String yasamAlani, int kanatUzunlugu) {
        super(tur, ad, yas, agirlik, boy, rengi, beslenmeTuru, yasamAlani);
        this.kanatUzunlugu = kanatUzunlugu;
    }

    @Override
    public String toString() {
        return "Kus{" +
                "kanatUzunlugu=" + kanatUzunlugu +
                "} " + super.toString();
    }

    public void kanatCirp(){
        System.out.println("Kuş kanat çırpıyor..");
    }

    public int getKanatUzunlugu() {
        return kanatUzunlugu;
    }

    public void setKanatUzunlugu(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }
}
