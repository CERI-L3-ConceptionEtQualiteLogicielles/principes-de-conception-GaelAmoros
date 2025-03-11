package exo1;

public class FormatInfoContactXML implements FormatInfoContact {
    public String getInfoContact(Contact c) {
        return "<contact>\n\t<nom>" + c.getNom() + "</nom>\n\t<numero>" + c.getNumero() + "</numero>\n</contact>";
    }
}