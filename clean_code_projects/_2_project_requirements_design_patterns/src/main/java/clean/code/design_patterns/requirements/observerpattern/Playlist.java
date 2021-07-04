package clean.code.design_patterns.requirements.observerpattern;

public interface Playlist {
    public void addListener(Observer observer);
    public void removeListener(Observer observer);
    public void notifyListeners(Artist artist);
}
