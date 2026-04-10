package esempi;

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
    public int hashCode()
    {
        return codiceFiscale.hashCode();
    }

    //equals deve fare uguaglianza di stato, non di indirizzo
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Persona)
        {
           Persona other = (Persona) obj;
           return   nominativo.equals(other.nominativo)         &&
                    codiceFiscale.equals(other.codiceFiscale)   ;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "codiceFiscale='" + codiceFiscale + '\'' +
                ", nominativo='" + nominativo + '\'' +
                '}';
    }
}
