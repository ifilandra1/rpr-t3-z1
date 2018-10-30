package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj {
    private String drzava, broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava=drzava; this.broj=broj;
    }

    public String ispisi() {
        return drzava+broj;
    }



}
