package exo1;

import java.util.ArrayList;
import java.util.List;

public class Annuaire implements ContactService{
    private static List<Contact> lesContacts = new ArrayList<>();

    public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }

    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            System.out.println(contact);
        }
    }

    public void sauvegardeEnBD() {
        // Logique pour sauvegarder les contacts dans une base de données
    }

    public void envoiEmail(Contact contact, String message) {
        // Logique pour envoyer un email
    }
}