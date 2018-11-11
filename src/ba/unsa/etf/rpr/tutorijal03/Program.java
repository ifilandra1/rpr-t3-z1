package ba.unsa.etf.rpr.tutorijal03;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        Imenik imenik = new Imenik();
        while(true) {

            System.out.println("Unesite ime i prezime");
            Scanner scan = new Scanner(System.in);
            String ime = scan.next();
            System.out.println("Koji tip broja zelite unijeti?");
            System.out.println("1 - mobilni broj, 2- fiksni broj, 3- medjunarodni broj");
            int n = scan.nextInt();
            if (n == 1) {
                System.out.println("Unesite pozivni broj za mobilnu mrezu");
                int pozivni = scan.nextInt();
                System.out.println("Unesite broj");
                String broj = scan.next();
                imenik.dodaj(ime, new MobilniBroj(pozivni, broj));
            }
            if (n == 2) {
                System.out.println("Unesite pozivni za grad");
                String pozivni = scan.next();
                System.out.println("Unesite broj");
                String broj = scan.next();
                imenik.dodaj(ime, new FiksniBroj(FiksniBroj.Grad.fromPozivni(pozivni), broj));

            }
            if (n == 3) {
                System.out.println("Unesite pozivni za drzavu");
                String pozivni = scan.next();
                System.out.println("Unesite broj");
                String broj = scan.next();
                imenik.dodaj(ime, new MedunarodniBroj(pozivni, broj));
            }
            System.out.println("Unesite 0 za kraj, 1 za nastavak");
            n=scan.nextInt();
            if(n==0){
                break;
            }


        }




    }
}
