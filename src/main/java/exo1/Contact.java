package exo1;

import java.util.ArrayList;
import java.util.List;

public class Contact implements ContactService {
    private static List<Contact> lesContacts = new ArrayList<>();
    private String nom;
    private String numero;

    public Contact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getInfoContact() {
        return toString();
    }


    public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }

    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            System.out.println("Nom: " + contact.getNom() + ", Numéro: " + contact.getNumero());
        }
    }

    public void sauvegardeEnBD() {
        // Logique pour sauvegarder les contacts dans une base de données
    }

    public void envoiEmail(Contact contact, String message) {
        // Logique pour envoyer un email
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Numéro: " + getNumero();
    }
}

