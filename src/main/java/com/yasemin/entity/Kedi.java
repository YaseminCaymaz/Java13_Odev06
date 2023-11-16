package com.yasemin.entity;

public class Kedi extends HayvanlarAlemi{
    public Kedi() {
    }

    public Kedi(String tur, String ad, int yas, int agirlik, int boy, String rengi, String beslenmeTuru, String yasamAlani) {
        super(tur, ad, yas, agirlik, boy, rengi, beslenmeTuru, yasamAlani);
    }

    @Override
    public String toString() {
        return "Kedi{" +
                "tur='" + tur + '\'' +
                ", ad='" + ad + '\'' +
                ", yas=" + yas +
                ", agirlik=" + agirlik +
                ", boy=" + boy +
                ", rengi='" + rengi + '\'' +
                ", beslenmeTuru='" + beslenmeTuru + '\'' +
                ", yasamAlani='" + yasamAlani + '\'' +
                "} " + super.toString();
    }

    public void sesCikart(){
       System.out.println("Miyaaaaaaav!");
   }
}
