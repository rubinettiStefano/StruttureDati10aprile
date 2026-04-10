package esempi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Esempio5Insiemistica {
    static List<Persona> lista = new ArrayList<>();

    static void inizializza() {

        lista.add(new Persona("RSSMRA80A01H501U", "Mario Rossi", "RM", 44));
        lista.add(new Persona("BNCGLI92R41L219X", "Giulia Bianchi", "MI", 32));
        lista.add(new Persona("VRDLRI75T10A944J", "Ilario Verdi", "TO", 49));
        lista.add(new Persona("NRIBRO85M01D612F", "Roberto Neri", "FI", 39));
        lista.add(new Persona("GLLFNC90S20F205Z", "Francesca Galli", "NA", 34));
        lista.add(new Persona("RSSSRA78P45H501O", "Sara Russo", "RM", 46));
        lista.add(new Persona("MNTLNE88E12L219T", "Elena Monti", "MI", 36));
        lista.add(new Persona("FRRDRN95A01L117P", "Adriano Ferrari", "RE", 29));
        lista.add(new Persona("CRSRRT00H05H501W", "Roberto Caruso", "RM", 24));
        lista.add(new Persona("BNCLRA02B41G273U", "Laura Bianco", "PA", 22));
        lista.add(new Persona("GRSMRC70L15F205K", "Marco Grassi", "NA", 54));
        lista.add(new Persona("RRIFBA82M10L219Q", "Fabio Arcuri", "MI", 42));
        lista.add(new Persona("RSOVLR98T50H501C", "Valeria Rizzo", "RM", 26));
        lista.add(new Persona("LBRSRA91D42G273S", "Serena Labate", "PA", 33));
        lista.add(new Persona("MNNGNN65A01F839O", "Giovanni Manni", "PD", 59));
        lista.add(new Persona("DNCGPP87S11H501L", "Giuseppe De Luca", "RM", 37));
        lista.add(new Persona("BRBCLR93P52L219V", "Chiara Barbieri", "MI", 31));
        lista.add(new Persona("PLLLRT77M20H501Y", "Alberto Polli", "RM", 47));
        lista.add(new Persona("MRTSTF84B05F205D", "Stefano Martini", "NA", 40));
        lista.add(new Persona("VNTLSE01E41L219G", "Elisa Venturi", "MI", 23));
    }

    static void main() {
        inizializza();
        stampaLista();
    }

    static void stampaLista() {
        for (Persona p : lista)
            System.out.println(p);
    }

    //filtro
    static List<Persona> personeSottoI30() {
        List<Persona> res = new ArrayList<>();

        for (Persona p : lista)
            if (p.getEta() < 30)
                res.add(p);

        return res;
    }

    //filtro
    static List<Persona> milanesi() {
        List<Persona> res = new ArrayList<>();

        for (Persona p : lista)
            if (p.getProvincia().equals("MI"))
                res.add(p);

        return res;
    }

    static List<Persona> milanesiSotto30anniV2() {
        Set<Persona> res = new HashSet<>(milanesi());
        res.retainAll(personeSottoI30());
        return new ArrayList<>(res);
    }

    static List<Persona> milanesiSotto30anniV1() {
        List<Persona> res = new ArrayList<>();
        for (Persona p : lista)
            if (p.getProvincia().equals("MI") && p.getEta() < 30)
                res.add(p);

        return res;
    }

    static List<Persona> personeConCodiceFiscaleConR() {
        List<Persona> res = new ArrayList<>();
        for (Persona p : lista)
            if (p.getCodiceFiscale().contains("R"))
                res.add(p);
        return res;
    }

    static List<Persona> personeConCodiceFiscaleConRNonDiMilano() {
        Set<Persona> res = new HashSet<>(personeConCodiceFiscaleConR());
        res.removeAll(milanesi());
        return new ArrayList<>(res);
    }

    //voglio persone
    //codice fiscale inizia con r
    //non milanesi
    //la cui eta sia sotto i 30
    static List<Persona> personeConCodiceFiscaleConRNonDiMilanoESottoi30anni() {
        /*
            ("MNTLNE88E12L219T", "Elena Monti", "MI", 36));    X

            ("BNCGLI92R41L219X", "Giulia Bianchi", "MI", 32)); V  X
            ("VNTLRE01E41L219G", "Elisa Venturi", "MI", 23));  V  X

            ("RSOVLR98T50H501C", "Valeria Rizzo", "RM", 26));  V  V  V
            ("MNNGNN65A01R839O", "Giovanni Manni", "PD", 59)); V  V  X

            PERSONE SOTTO I 30
             ("VNTLRE01E41L219G", "Elisa Venturi", "MI", 23));
            ("RSOVLR98T50H501C", "Valeria Rizzo", "RM", 26));
         */
        Set<Persona> res = new HashSet<>(personeConCodiceFiscaleConR());
        res.removeAll(milanesi());

        res.retainAll(personeSottoI30());
        return new ArrayList<>(res);
    }
}


