package esempi;

import java.util.HashSet;
import java.util.Set;

public class Esempio2Set
{
    static void main()
    {
        Set<Persona> persone = new HashSet<>();

        Persona p1 = new Persona("RBN219S","Stefano Rubinetti");

        //oggetti diversi, ma con lo stesso STATO
        //STATO -> Insieme dei valori delle proprietà
        Persona p2 = new Persona("PRL839H","Francesco Perillo");
        Persona p3 = new Persona("PRL839H","Francesco Perillo");

        //== -> uguaglianza di INDIRIZZO
        //da true solo se i due oggetti occupano lo stesso spazio in memoria
        //se sono esattamente lo stesso oggetto
//        System.out.println(p2.equals(p3));
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p3.hashCode());

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);

        System.out.println(persone.size());
//        Set<String> parole = new HashSet<>();
//
//       String s1 = "Stefano Rubinetti";
//       String s2 = "Francesco Perillo";
//       String s3 = "Francesco Perillo";
//
//        parole.add(s1);
//        parole.add(s2);
//        parole.add(s3);
//
//        System.out.println(parole.size());
    }
}
