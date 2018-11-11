package ba.unsa.etf.rpr.tutorijal03;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Imenik {

    HashMap<String, TelefonskiBroj> mapa = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
       mapa.put(ime,broj);
    }

    public String dajBroj (String ime){
         return mapa.get(ime).ispisi();
    }

    public String DajIme (TelefonskiBroj broj) {

        Iterator it=mapa.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry par=(Map.Entry)it.next();
            if(par.getValue().equals(broj)) return((String)par.getKey());
        }

return "";
    }


    String naSlovo(char s) {
        String rijec = "";
        Iterator it=mapa.entrySet().iterator();
        int i=0;
        while(it.hasNext()) {
              HashMap.Entry par=(HashMap.Entry)it.next();
              if(((String) par.getKey()).charAt(0) ==s) {
                  rijec+=i+1+". "+par.getKey()+" - "+  (  (TelefonskiBroj) par.getValue()).ispisi();
              }
        }
       return rijec;
    }

    Set <String> izGrada(FiksniBroj.Grad g) {

        Set<String> imena = new HashSet<String>();
           Iterator it=mapa.entrySet().iterator();
          while(it.hasNext()) {
              HashMap.Entry par = (HashMap.Entry)it.next();
                    if(      (par.getValue() instanceof FiksniBroj) &&  ((FiksniBroj) par.getValue()).getGrad() ==g ){
                        imena.add(  (String)par.getKey() );

                    }

          }



          return new TreeSet<String>(imena);
    }

    Set <TelefonskiBroj> izGradaBrojevi (FiksniBroj.Grad g) {

        Set<TelefonskiBroj> brojevi= new HashSet<TelefonskiBroj>();
           Iterator it= mapa.entrySet().iterator();
           while(it.hasNext()) {
               HashMap.Entry par = (HashMap.Entry)it.next();
               if(  (par.getValue() instanceof FiksniBroj) &&  ((FiksniBroj) par.getValue()).getGrad()==g   ) {
                   brojevi.add(   (TelefonskiBroj)par.getValue() );

               }
           }

           return new TreeSet<TelefonskiBroj>(brojevi);


    }




}
