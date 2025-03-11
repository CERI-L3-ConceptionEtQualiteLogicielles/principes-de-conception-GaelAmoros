package exo1;

public class FormatInfoContactJSON implements FormatInfoContact{
    public String getInfoContact(Contact c) {
        return "{" +
                "\n\t\"nom\": \"" + c.getNom() + "\"," +
                "\n\t\"numero\": \"" + c.getNumero() + "\"" +
                "\n}";
    }
}
