package ba.unsa.etf.rpr.tutorijal03;

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

    public int hashCode() {
        return 0;
    }


}
