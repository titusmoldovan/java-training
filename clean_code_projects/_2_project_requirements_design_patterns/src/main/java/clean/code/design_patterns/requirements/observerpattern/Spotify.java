package clean.code.design_patterns.requirements.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Spotify implements Playlist {
    private List<Observer> listeners=new ArrayList<>();
    private List<Artist> artists=new ArrayList<>();

    public void addArtist(Artist artist){
        artists.add(artist);
    }

    @Override
    public void addListener(Observer listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(Observer listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListeners(Artist artist) {
        System.out.println(artist.getName()+" has released a new song! Be the first one to hear it!");
        for(Observer listener:listeners){
            listener.update("NEW MUSIC");
        }
    }
}
