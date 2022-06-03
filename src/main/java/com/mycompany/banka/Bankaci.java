
package com.mycompany.banka;
import java.sql.*;



public class Bankaci {
    
    
    
    private String bankaciTC;
    private String bankaciAd;
    private String bankaciSoyad;
    private String bankaciSifre;
    
    public Bankaci(String bankaciTC, String bankaciAd, String bankaciSoyad, String bankaciSifre){
        this.bankaciTC = bankaciTC;
        this.bankaciAd = bankaciAd;
        this.bankaciSoyad = bankaciSoyad;
        this.bankaciSifre=bankaciSifre;
    }

    /**
     * @return the bankaciTC
     */
    public String getBankaciTC() {
        return bankaciTC;
    }

    /**
     * @return the bankaciAd
     */
    public String getBankaciAd() {
        return bankaciAd;
    }

    /**
     * @return the bankaciSoyad
     */
    public String getBankaciSoyad() {
        return bankaciSoyad;
    }

    /**
     * @return the bankaciSifre
     */
    public String getBankaciSifre() {
        return bankaciSifre;
    }
    
    
    
    
    
}
