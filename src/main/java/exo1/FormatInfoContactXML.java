package exo1;

public class FormatInfoContactXML implements FormatInfoContact {
    public String getInfoContact(Contact c) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n<personne>\n");
        sb.append("\t<nom>").append(c.getNom()).append("</nom>\n");
        sb.append("\t<numéro>").append(c.getNumero()).append("</numéro>\n");

        if (c.getPrenom() != null && !c.getPrenom().isEmpty()) sb.append("\t<prenom>").append(c.getPrenom()).append("</prenom>\n");
        if (c.getCivilite() != null && !c.getCivilite().isEmpty()) sb.append("\t<civilite>").append(c.getCivilite()).append("</civilite>\n");
        if (c.getAdresse() != null && !c.getAdresse().isEmpty()) sb.append("\t<adresse>").append(c.getAdresse()).append("</adresse>\n");
        if (c.getEmail() != null && !c.getEmail().isEmpty()) sb.append("\t<email>").append(c.getEmail()).append("</email>\n");
        if (c.getDateAnniversaire() != null && !c.getDateAnniversaire().isEmpty()) sb.append("\t<dateAnniversaire>").append(c.getDateAnniversaire()).append("</dateAnniversaire>\n");
        if (c.getLieuTravail() != null && !c.getLieuTravail().isEmpty()) sb.append("\t<lieuTravail>").append(c.getLieuTravail()).append("</lieuTravail>\n");
        if (c.getVille() != null && !c.getVille().isEmpty()) sb.append("\t<ville>").append(c.getVille()).append("</ville>\n");

        sb.append("</personne>");

        return sb.toString();
    }
}