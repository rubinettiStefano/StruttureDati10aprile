package esempi;

import java.util.Objects;

public class Persona
{
    private String codiceFiscale;
    private String nominativo;
    private String provincia;
    private int eta;

    public Persona(){}

    public Persona(String codiceFiscale, String nominativo) {
        this.codiceFiscale = codiceFiscale;
        this.nominativo = nominativo;
    }

    public Persona(String codiceFiscale, String nominativo, String provincia, int eta) {
        this.codiceFiscale = codiceFiscale;
        this.nominativo = nominativo;
        this.provincia = provincia;
        this.eta = eta;
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

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Persona persona)) return false;
        return eta == persona.eta && Objects.equals(codiceFiscale, persona.codiceFiscale) && Objects.equals(nominativo, persona.nominativo) && Objects.equals(provincia, persona.provincia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codiceFiscale, nominativo, provincia, eta);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "codiceFiscale='" + codiceFiscale + '\'' +
                ", nominativo='" + nominativo + '\'' +
                ", provincia='" + provincia + '\'' +
                ", eta=" + eta +
                '}';
    }
}
