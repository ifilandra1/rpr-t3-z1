package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {

    enum Grad {BIHAC,ORASJE,TUZLA,ZENICA,GORAZDE,TRAVNIK,MOSTAR,SIROKIBRIJEG,SARAJEVO,LIVNO,BRCKO };
     String broj;
     Grad grad;

    public Grad getGrad() {
        return grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public int compareTo(Object o) {

        return this.getBroj().compareTo( ((FiksniBroj) o).getBroj()  );

    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public FiksniBroj(Grad grad, String broj){
        this.grad=grad; this.broj=broj;
    };

   public String ispisi(){
       String s = new String();
       if(grad==Grad.BIHAC)s+="037";
       else if(grad==Grad.ORASJE)s+="031";
       else if(grad==Grad.TUZLA)s+="035";
       else if(grad==Grad.ZENICA)s+="032";
       else if(grad==Grad.GORAZDE)s+="038";
       else if(grad==Grad.TRAVNIK)s+="030";
       else if(grad==Grad.MOSTAR)s+="036";
       else if(grad==Grad.SIROKIBRIJEG)s+="039";
       else if(grad==Grad.SARAJEVO)s+="033";
       else if(grad==Grad.LIVNO)s+="034";
       else if(grad==Grad.BRCKO)s+="049";
       s+="/";
       return s+this.broj;
    };

   public int hashCode(){

       return 2;
   }

}
