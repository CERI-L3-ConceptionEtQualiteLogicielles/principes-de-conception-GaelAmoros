package exo1;

public class EnvoiMail implements Envoi{
    public void envoi(Contact contact, String message){
        System.out.println("Envoi d'un email à " + contact);
        System.out.println("Contenu : \n " + message);
    }
}