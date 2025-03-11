package exo1;

public class Main {
    public static void main(String [] args) {
        Contact contact1 = new Contact.ContactBuilder("Contact1", "13123").addVille("Agro parc").build();
        Contact contact2 = new Contact.ContactBuilder("Contact2", "87123").addEmail("contact2@gmail.com").build();

        System.out.println(contact1.getInfoContact(new FormatInfoContactXML()));
        System.out.println(contact2.getInfoContact(new FormatInfoContactJSON()));

        Annuaire contacts = new Annuaire();
        contacts.ajouteContact(contact1);
        contacts.ajouteContact(contact2);

        contacts.afficheContacts();

        EnvoiSMS sms = new EnvoiSMS();

        sms.envoi(contact1, "Bonjour, voici un sms");

        EnvoiMail mail = new EnvoiMail();
        mail.envoi(contact2, "Bonjour, voici un mail");

        EnvoiPhoto photo = new EnvoiPhoto();
        photo.envoi(contact2, "Bonjour, voici une photo");
    }

}