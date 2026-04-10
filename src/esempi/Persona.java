package esempi;

import java.util.Objects;

public class Persona
{
    private String codiceFiscale;
    private String nominativo;

    public Persona(){}

    public Persona(String codiceFiscale, String nominativo) {
        this.codiceFiscale = codiceFiscale;
        this.nominativo = nominativo;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    @Override
    public boolean equals(Object o) {
//        //o instanceof Persona other
//        if(o instanceof Persona) {
//            Persona other = (Persona) o;
//        }
        if (!(o instanceof Persona other)) return false;

        //ogg1.equals(ogg2)
        //Objects.equals(ogg1, ogg2)
        return Objects.equals(codiceFiscale, other.codiceFiscale) && Objects.equals(nominativo, other.nominativo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceFiscale);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "codiceFiscale='" + codiceFiscale + '\'' +
                ", nominativo='" + nominativo + '\'' +
                '}';
    }
}
