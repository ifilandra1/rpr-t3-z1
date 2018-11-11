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

   public final String getBroj() {
        return broj;
    }

    public final void setBroj(String broj) {
        this.broj = broj;
    }

    public final String ispisi() {

       String s="0"+this.mobilnaMreza;
        s+="/";
        return s+this.broj;
    }

    public final int compareTo(Object o) {
        return this.getBroj().compareTo( (  (MobilniBroj) o ).getBroj() );

    }

    @Override
    public final boolean equals(Object o) {
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

    public final int hashCode() {
        return 0;
    }


}
