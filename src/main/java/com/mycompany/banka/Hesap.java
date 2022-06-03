
package com.mycompany.banka;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;




public class Hesap implements Serializable{

    private String hesapID;
    private String hesapTuru;
    private String tcNo;
    private int hesapBakiye;

    
    public Hesap(String hesapID, String hesapTuru, String tcNo, int hesapBakiye){
        this.hesapID = hesapID;
        this.hesapTuru = hesapTuru;
        this.hesapBakiye = hesapBakiye;
        this.tcNo=tcNo;
    }
    /**
     * @return the hesapID
     */
    public String getHesapID() {
        return hesapID;
    }

    /**
     * @return the hesapTuru
     */
    public String getHesapTuru() {
        return hesapTuru;
    }

    /**
     * @return the tcNo
     */
    public String getTcNo() {
        return tcNo;
    }

    /**
     * @return the hesapBakiye
     */
    public int getHesapBakiye() {
        return hesapBakiye;
    }
    
    
    
    
    
}
