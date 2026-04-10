package esempi;

import java.util.HashSet;
import java.util.Set;

public class Esempio3Set
{
    static void main() {
        Set<String> parole = new HashSet<>();

        parole.add("ciao");
        parole.add("bye");
        parole.add("albero");
        parole.add("cane");
        parole.add("paperino");
        //for-each
        for(String s: parole)
            System.out.println(s);

        String s1 = "pluto";
        String s2 = "paperino";

        System.out.println(parole.contains(s1));
        System.out.println(parole.contains(s2));
    }
}
