package Observer;

import java.util.ArrayList;
import java.util.List;

public class Telefonia implements ICompaniaTelefonica {
    private List<IUsuario> observerList= new ArrayList<>();

    private List<Promociones> promocionesList = new ArrayList<>();

   public void uploadNewVideo(Promociones video){
       promocionesList.add(video);
       this.notifyObserver(video);
   }

    @Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
       observerList.remove(observer);
    }


    @Override
    public void notifyObserver(Promociones promociones) {
        for (IUsuario userYoutube:observerList) {
               if (userYoutube.getCategoria().equals(promociones.getCategoria())){
                   // notificacion
                     userYoutube.update("Te llego una nueva notificacion: "+promociones.getDescripcion(),promociones);
               }

        }
    }
}
