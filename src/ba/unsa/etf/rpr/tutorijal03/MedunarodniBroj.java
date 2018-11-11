package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava, broj;

    public String getDrzava() {
        return drzava;
    }

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava=drzava; this.broj=broj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String ispisi() {
        return drzava+broj;
    }

    public int hashCode() {

        return 0;
    }

    public int compareTo(Object o) {
        MedunarodniBroj m=  (MedunarodniBroj) o;
        return this.getBroj().compareTo(m.getBroj());
    }


}
