package ba.unsa.etf.rpr.tutorijal03;

public class MedjunarodniBroj {
    private String drzava, broj;

    public MedjunarodniBroj(String drzava, String broj) {
        this.drzava=drzava; this.broj=broj;
    }

    public String ispisi() {
        return drzava+broj;
    }



}
