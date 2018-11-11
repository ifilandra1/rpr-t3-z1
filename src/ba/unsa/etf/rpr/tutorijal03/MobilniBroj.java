package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj {
    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    private int mobilnaMreza;
    private String broj;
    public MobilniBroj(int mobilnaMreza, String broj ) {

          this.mobilnaMreza=mobilnaMreza;
          this.broj=broj;
    }

    final public String getBroj() {
        return broj;
    }

    final public void setBroj(String broj) {
        this.broj = broj;
    }

    final public String ispisi() {

       String s="0"+this.mobilnaMreza;
        s+="/";
        return s+this.broj;
    }

    final public int compareTo(Object o) {
        return this.getBroj().compareTo( (  (MobilniBroj) o ).getBroj() );

    }

    @Override
    final public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        MobilniBroj that = (MobilniBroj) o;
        return mobilnaMreza == that.mobilnaMreza &&
                Objects.equals(broj, that.broj);
    }

    final public int hashCode() {
        return 0;
    }


}
