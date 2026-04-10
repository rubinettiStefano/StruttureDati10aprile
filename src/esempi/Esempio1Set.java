package esempi;

import java.util.HashSet;
import java.util.Set;

public class Esempio1Set
{
    static void main()
    {
        Set<String> parole = new HashSet<>();

        parole.add("ciao");
        parole.add("bye");
        parole.add("albero");
        parole.add("cane");
        parole.add("paperino");

        for(String s:parole)
            System.out.println(s);

        System.out.println("Numero elementi: "+parole.size());
    }















}
