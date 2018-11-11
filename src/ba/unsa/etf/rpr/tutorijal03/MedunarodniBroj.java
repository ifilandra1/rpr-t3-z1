package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava, broj;

    public String getDrzava() {
        return drzava;
    }

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava=drzava; this.broj=broj;
    }

    final public String getBroj() {
        return broj;
    }

    final public void setBroj(String broj) {
        this.broj = broj;
    }

    final public String ispisi() {
        return drzava+broj;
    }

    final public int hashCode() {

        return 0;
    }

    final public int compareTo(Object o) {
        MedunarodniBroj m=  (MedunarodniBroj) o;
        return this.getBroj().compareTo(m.getBroj());
    }


}
