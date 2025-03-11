package exo1;

public class EnvoiPhoto implements Envoi{
    private final EnvoiPhotoService serviceEnvoi = new EnvoiPhotoService();

    public void envoi(Contact c, String image){
        serviceEnvoi.envoiPhoto(c, image);
    }
}