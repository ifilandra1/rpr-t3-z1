package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    public enum Grad {
        BIHAC("037"), ORASJE("031"), TUZLA("035"), ZENICA("032"), GORAZDE("038"), TRAVNIK("030"), MOSTAR("036"), SIROKIBRIJEG("039"), SARAJEVO("033"), LIVNO("034"), BRCKO("049");
        private String poz;

        Grad(String s) {
            this.poz = s;
        }

        public static Grad fromPozivni(String s){
            switch (s) {
                case "037": return BIHAC;
                case "031": return ORASJE;
                case "035": return TUZLA;
                case "032": return ZENICA;
                case "038": return GORAZDE;
                case "030": return TRAVNIK;
                case "036": return MOSTAR;
                case "039": return SIROKIBRIJEG;
                case "034": return LIVNO;
                case "049": return BRCKO;

            }
            return SARAJEVO;
        }
        public String getPoz() {
            return this.poz;
        }

    }

    ;
    private String broj;
    private Grad grad;

    public final Grad getGrad() {
        return grad;
    }

   public final String getBroj() {
        return broj;
    }

    public final void setBroj(String broj) {
        this.broj = broj;
    }

  public final int compareTo(Object o) {

        return this.getBroj().compareTo(((FiksniBroj) o).getBroj());

    }

    public final void setGrad(Grad grad) {
        this.grad = grad;
    }

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    ;

    public final String ispisi() {

        String s = this.grad.getPoz();
        s += "/";
        return s + this.broj;
    }

    ;

    public final int hashCode() {

        return 2;
    }

}
