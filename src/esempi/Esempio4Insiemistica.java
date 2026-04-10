package esempi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Esempio4Insiemistica
{
    static void main() {
        Set<String> paroleCorte = new HashSet<>();
        paroleCorte.add("cane");
        paroleCorte.add("boa");
        paroleCorte.add("ago");
        paroleCorte.add("bue");
        paroleCorte.add("cero");
        paroleCorte.add("euro");
        //length()<=4

        Set<String> animali = new HashSet<>();
        animali.add("cane");
        animali.add("boa");
        animali.add("bue");
        animali.add("cigno");
        animali.add("anaconda");
        //significato  == animale

        //creare un nuovo insieme clonando uno dei due presenti
        //risultatoUnione è clone di paroleCorte
        //chiamare i metodi per fare unione,intersezione o sottrazione

        //unione     length()<=4  || significato  == animale
        Set<String> risultatoUnione = new HashSet<>(paroleCorte);
        risultatoUnione.addAll(animali);
        System.out.println(risultatoUnione);

        //sottrazione length()<=4  &&  significato  != animale
        Set<String> risultatoSottrazione1 = new HashSet<>(paroleCorte);
        risultatoSottrazione1.removeAll(animali);
        System.out.println(risultatoSottrazione1);
        //significato  == animale && length()>4
        Set<String> risultatoSottrazione2 = new HashSet<>(animali);
        risultatoSottrazione2.removeAll(paroleCorte);
        System.out.println(risultatoSottrazione2);

        //intersezione length()<=4  && significato  == animale
        Set<String> risultatoIntersezione = new HashSet<>(paroleCorte);
        risultatoIntersezione.retainAll(animali);
        System.out.println(risultatoIntersezione);
    }
}
