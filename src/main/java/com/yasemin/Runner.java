package com.yasemin;

import com.yasemin.entity.*;

public class Runner {
    public static void main(String[] args) {
        HayvanlarAlemi hayvanlarAlemi=new HayvanlarAlemi();
        Kedi kedi=new Kedi();
        kedi.setAd("Mavi");
        kedi.setTur("Tekir");
        kedi.setAgirlik(5);
        kedi.setBoy(52);
        kedi.setRengi("Sarı");
        kedi.setBeslenmeTuru("Etçil");
        kedi.setYas(3);
        kedi.setYasamAlani("Karada");
        kedi.toString();
        kedi.besle();
        kedi.sesCikart();
        Balik balik=new Balik("Tatlı Su Baligı","Japon Balıgı",2,310,10,"Turuncu","Otcul","Tatlı Su Alanları");
        balik.toString();
        balik.besle();
        balik.yuz();
        Yilan yilan=new Yilan();
        yilan.toString();
        yilan.besle();
        yilan.surun();
        Kus kus=new Kus("Göçmen kuş","Leylek",1,450,90,"Beyaz","Etçil","Karada",200);
        kus.toString();
        kus.besle();
        kus.kanatCirp();
    }
}
