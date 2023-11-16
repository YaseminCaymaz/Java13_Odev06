package com.yasemin.entity;

public class HayvanlarAlemi {
    String tur;
    String ad;
    int yas;
    int agirlik;
    int boy;
    String rengi;
    String beslenmeTuru;//Etcil, Otcul ya da hem etcil hem otcul olması
    String yasamAlani;//Karada ya da denizde yasaması

    public HayvanlarAlemi() {
    }

    public HayvanlarAlemi(String tur, String ad, int yas, int agirlik, int boy, String rengi, String beslenmeTuru, String yasamAlani) {
        this.tur = tur;
        this.ad = ad;
        this.yas = yas;
        this.agirlik = agirlik;
        this.boy = boy;
        this.rengi = rengi;
        this.beslenmeTuru = beslenmeTuru;
        this.yasamAlani = yasamAlani;
    }

    @Override
    public String toString() {
        return "HayvanlarAlemi{" +
                "tur='" + tur + '\'' +
                ", ad='" + ad + '\'' +
                ", yas=" + yas +
                ", agirlik=" + agirlik +
                ", boy=" + boy +
                ", rengi='" + rengi + '\'' +
                ", beslenmeTuru='" + beslenmeTuru + '\'' +
                ", yasamAlani='" + yasamAlani + '\'' +
                '}';
    }
    public void besle(){
        System.out.println("Beslenmesi yapıldı.");
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public String getBeslenmeTuru() {
        return beslenmeTuru;
    }

    public void setBeslenmeTuru(String beslenmeTuru) {
        this.beslenmeTuru = beslenmeTuru;
    }

    public String getYasamAlani() {
        return yasamAlani;
    }

    public void setYasamAlani(String yasamAlani) {
        this.yasamAlani = yasamAlani;
    }
}
