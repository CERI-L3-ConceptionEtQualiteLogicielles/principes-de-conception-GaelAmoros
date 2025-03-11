package exo1;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    public static class ContactBuilder {
        // Champs obligatoires
        private String nom;
        private String numero;

        // Champs facultatifs
        private String prenom = null;
        private String civilite = null;
        private String adresse = null;
        private String email = null;
        private String dateAnniversaire = null;
        private String lieuTravail = null;
        private String ville = null;

        public ContactBuilder(String nom, String numero){
            this.nom = nom;
            this.numero = numero;
        }

        public ContactBuilder addPrenom(String prenom){
            this.prenom = prenom;
            return this;
        }
        public ContactBuilder addCivilite(String civilite){
            this.civilite = civilite;
            return this;
        }
        public ContactBuilder addAdresse(String adresse){
            this.adresse = adresse;
            return this;
        }
        public ContactBuilder addEmail(String email){
            this.email = email;
            return this;
        }
        public ContactBuilder addDateAnniversaire(String dateAnniversaire){
            this.dateAnniversaire = dateAnniversaire;
            return this;
        }
        public ContactBuilder addLieuTravail(String lieuTravail){
            this.lieuTravail = lieuTravail;
            return this;
        }
        public ContactBuilder addVille(String ville){
            this.ville = ville;
            return this;
        }

        public Contact build(){
            return new Contact(
                    this.nom,
                    this.numero,
                    this.prenom,
                    this.civilite,
                    this.adresse,
                    this.email,
                    this.dateAnniversaire,
                    this.lieuTravail,
                    this.ville
            );
        }



    }

    // Champs obligatoires
    private String nom;
    private String numero;

    // Champs facultatifs
    private String prenom;
    private String civilite;
    private String adresse;
    private String email;
    private String dateAnniversaire;
    private String lieuTravail;
    private String ville;

    private Contact(String nom,
                    String numero,
                    String prenom,
                    String civilite,
                    String adresse,
                    String email,
                    String dateAnniversaire,
                    String lieuTravail,
                    String ville) {
        this.nom = nom;
        this.numero = numero;
        this.prenom = prenom;
        this.civilite = civilite;
        this.adresse = adresse;
        this.email = email;
        this.dateAnniversaire = dateAnniversaire;
        this.lieuTravail = lieuTravail;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getCivilite() {
        return civilite;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getEmail() {
        return email;
    }
    public String getDateAnniversaire() {
        return dateAnniversaire;
    }
    public String getLieuTravail() {
        return lieuTravail;
    }
    public String getVille() {
        return ville;
    }

    public String getInfoContact(FormatInfoContact f) {
        return f.getInfoContact(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom: ").append(nom).append(", ");
        sb.append("Numéro: ").append(numero);

        if (prenom != null && !prenom.isEmpty()) sb.append(", Prénom: ").append(prenom);
        if (civilite != null && !civilite.isEmpty()) sb.append(", Civilité: ").append(civilite);
        if (adresse != null && !adresse.isEmpty()) sb.append(", Adresse: ").append(adresse);
        if (email != null && !email.isEmpty()) sb.append(", Email: ").append(email);
        if (dateAnniversaire != null && !dateAnniversaire.isEmpty()) sb.append(", Date d'anniversaire: ").append(dateAnniversaire);
        if (lieuTravail != null && !lieuTravail.isEmpty()) sb.append(", Lieu de travail: ").append(lieuTravail);
        if (ville != null && !ville.isEmpty()) sb.append(", Ville: ").append(ville);

        return sb.toString();
    }
}