import java.util.ArrayList;

public class KortTest {

    public static void main(String[] args) {
        
        ArrayList<Kort> reg = new ArrayList<Kort>();
        
        Kort k1 = new Ansatt("Ole", "Olsen", 1234, 3, 180);
        Kort k2 = new Gjest("Marit", "Olsen");
        Ansatt k3 = new Ansatt("Bjørn", "Olsen", 1234, 4, 200);
        reg.add(k1);
        reg.add(k2);
        reg.add(k3);

        for (int i=0; i<reg.size(); i++) {
            Kort kort = (Kort)reg.get(i);
            System.out.print(kort);
            System.out.println("\nTest av kort: med kode 1234 er" + (kort.sjekkPIN(1234) ?  " gyldig" :  " ugyldig" ) );
            System.out.println("\nTest av kort: med kode 9999 er" + (kort.sjekkPIN(9999) ?  " gyldig" :  " ugyldig" ) );
        }
        
        k3.settEtternavn("Nilsen");
        
        System.out.println("\nNavnet til Bjørn er " + k3.hentFulltNavn());
        
    }
}
