package ba.unsa.etf.rpr.tutorijal03;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;
    private String broj;
    public MobilniBroj(int mobilnaMreza, String broj ) {

          this.mobilnaMreza=mobilnaMreza;
          this.broj=broj;
    }

    public String ispisi() {
        String s=new String();
        s+="0"+this.mobilnaMreza;
        s+="/";
        return s+this.broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilniBroj that = (MobilniBroj) o;
        return mobilnaMreza == that.mobilnaMreza &&
                Objects.equals(broj, that.broj);
    }

    public int hashCode() {
        return 0;
    }


}
