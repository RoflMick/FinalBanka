package com.example.netactivity;

public class Entry {
    public final String zeme;
    public final String kod;
    public final String kurz;
    public final String mena;
    public int flagID;
 
    // TODO 3. Rozsirit dalsi udaje ve tride, ktere se budou vest pro kazdou menu
    // TODO 3. To zahrnuje i upraveni konstruktoru
            
    Entry(String zeme, String kod, String kurz, String mena) {
        this.zeme = zeme;
        this.kod = kod;
        this.kurz = kurz;
        this.mena = mena;
    }

    public String getKurz() {
        return kurz;
    }

    public String getZeme() {
        return zeme;
    }

    public String getKod() {
        return kod;
    }

    public String getMena() {
        return mena;
    }

    public String getFlagResourceName() {
        return "@drawable/" + "flag_" + getKod();
    }
}
