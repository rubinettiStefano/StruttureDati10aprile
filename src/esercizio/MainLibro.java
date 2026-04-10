package esercizio;

import libreria.Console;
import libreria.FileReader;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainLibro
{
    static Set<Libro> tuttiLibri = new HashSet<>();

    static void inizializzaDaFile(String nomeFile)
    {
        FileReader fr = new FileReader(nomeFile);
        while (fr.hasNextLine())
            tuttiLibri.add(transformRowToBook(fr.readString()));
    }

    static Libro transformRowToBook(String riga)
    {
        //"9788804750550,Il Trono di Spade. Vol. 1: Il Trono di Spade,George R. R. Martin,Avventura-Fantasy-Gore-Horror,2022-08-27,9.40"
        String[] splitted = riga.split(",");
        Libro res = new Libro();
        res.setIsbn(splitted[0]);
        res.setTitolo(splitted[1]);
        res.setAutore(splitted[2]);
        //splitted[3] = "Avventura-Fantasy-Gore-Horror" -> splittarla di nuovo ,trasformarla in set e passarla al metodo
        String[] generi = splitted[3].split("-");
//        for(String g: generi)
//            res.addGenere(g);
//        res.setGeneri(new HashSet<>(Arrays.asList(splitted[3].split("-"))));
        Set<String> generiSet = new HashSet<>(Arrays.asList(generi));
        res.setGeneri(generiSet);
        res.setReleaseDate(splitted[4]);
        res.setPrice(Double.parseDouble(splitted[5]));

        return res;
    }

    static void main()
    {
        Console.print("Inserisci nome del file da cui vuoi leggere i libri, se dai invio vuoto, sarà libri.txt");
        String resp = Console.readString();
        if(resp.isBlank())
            resp="libri.txt";

        inizializzaDaFile(resp);

        int cmd= 0;
        do {
            Console.print("Dammi comando");
            cmd = Console.readInt();

            //ogni metodo dovrà restituire un set con i dati richiesti
            Set<Libro> daStampare = new HashSet<>();

            switch (cmd) {
                case 1 -> daStampare = libriAutore();
                case 2 -> daStampare = libriPrezzoMinore();
                case 3 -> daStampare = libriPrezzoMaggioreUgualeV1();
                case 4 -> daStampare = libriPrezzoMaggioreUgualeV2();
                case 5 -> daStampare = libriDiPiuAutori();
                case 6 -> daStampare = libriPerGenere();
                case 7 -> daStampare = libriNonGenere();
                case 8 -> daStampare = libriTuttiGeneri();
                case 9 -> daStampare = libriNonTuttiGeneri();
                case 10 -> daStampare = libriNonTuttiGeneriV2();
                case 11 -> daStampare = libriUscitiPrima();
                case 12 -> daStampare = libriUscitiDopo();
                case 13 -> daStampare = libriUscitiInAnno();
                case 14 -> daStampare = libriUscitiInAnni();
                case 15 -> daStampare = libriUscitiInAnniEDiAutori();
                case 16 -> daStampare = libriUscitiInAnniEDiGeneri();
                case 17 -> daStampare = libriDiAutoreEPrezzoMinimo();
                case 18 -> daStampare = libriDiAutoreGenerePrezzoMinimo();
                case -1 -> Console.print("Uscita dal programma. Buon lavoro!\n");
                default -> Console.print("Comando non presente. Riprova.\n");
            }

            System.out.println(daStampare);

        }while (cmd!=-1);
    }

    /**
     * Chiedere utente un autore,
     * restituire solo libri di tale autore
     * @return
     */
    private static Set<Libro> libriAutore()
    {
        Set<Libro> res = new HashSet<>();
        Console.print("Dammi autore");
        String aut = Console.readString().toLowerCase();

        for(Libro l : tuttiLibri)
            if(l.getAutore().toLowerCase().contains(aut))
                res.add(l);

        return res;
    }

    /**
     * Chiedere utente prezzo, restituire libri con prezzo minore
     * @return
     */
    private static Set<Libro> libriPrezzoMinore()
    {
        return null;
    }

    /**
     * Chiedere utente prezzo, restituire libri con prezzo maggiore uguale
     * @return
     */
    private static Set<Libro> libriPrezzoMaggioreUgualeV1()
    {
        return null;
    }

    /**
     * Come sopra, ma usare sottrazione di insieme con quelli di prezzo minore
     * di quello inserito
     * @return
     */
    private static Set<Libro> libriPrezzoMaggioreUgualeV2()
    {
        return null;
    }

    /**
     * Chiedere utente per quanti autori vuole cercare
     * Ciclare richiamando il metodo libriAutore, dove utente inserira autore
     * e aggiungere quei libri ad un set da restituire, che dovrà contenere i libri
     * di tutti gli autori inseriti
     * @return
     */
    private static Set<Libro> libriDiPiuAutori()
    {
        return null;
    }

    /**
     * CHiedere utente un genere, restituire libri che abbiano il genere richiesto
     * @return
     */
    private static Set<Libro> libriPerGenere()
    {
        return null;
    }

    /**
     * Con insiemistica e il metodo sopra, restituire libri che non abbiano il genere
     * inserito nel metodo sopra
     * @return
     */
    private static Set<Libro> libriNonGenere()
    {
        return null;
    }

    /**
     * CHiedere utente tanti generi con la virgola,
     * restituire libri che abbiano tutti i generi ricvhiesti
     *
     * @return
     */
    private static Set<Libro> libriTuttiGeneri()
    {
        return null;
    }

    /**
     * CHiedere utente tanti generi con la virgola,
     * restituire libri che non abbiano nessuno dei generi inseriti
     * (non fatelo con insiemistica)
     *
     * @return
     */
    private static Set<Libro> libriNonTuttiGeneri()
    {
        return null;
    }

    /**
     * trovare il modo per farlo con insiemistica usando il metodo  libriPerGenere
     *
     * @return
     */
    private static Set<Libro> libriNonTuttiGeneriV2()
    {
        return null;
    }

    /**
     * CHiedere utente una data, restituire libri usciti prima di quella data
     *
     * @return
     */
    private static Set<Libro> libriUscitiPrima()
    {
        return null;
    }

    /**
     * CHiedere utente una data, restituire libri usciti dopo di quella data
     * usare metodo sopra e insiemistica
     *
     * @return
     */
    private static Set<Libro> libriUscitiDopo()
    {
        return null;
    }

    /**
     * chiedere utente un singolo intero, un anno, dare tutti i libri usciti in quell'anno
     * @return
     */
    private static Set<Libro> libriUscitiInAnno()
    {
        return null;
    }

    /**
     * chiedere utente due interi, due anni, dare tutti i libri usciti tra quei 2 anni
     *
     * CONSIGLIO, si può fare in 4 modi diversi, provate a farlo in almeno 2
     * @return
     */
    private static Set<Libro> libriUscitiInAnni() {
        return null;
    }

    //da qui in poi tutti metodi solo insiemistici, che usano quelli sopra


    private static Set<Libro> libriUscitiInAnniEDiAutori() {
        return null;
    }

    private static Set<Libro> libriUscitiInAnniEDiGeneri() {
        return null;
    }

    private static Set<Libro> libriDiAutoreEPrezzoMinimo() {
        return null;
    }

    private static Set<Libro> libriDiAutoreGenerePrezzoMinimo() {
        return null;
    }



}
