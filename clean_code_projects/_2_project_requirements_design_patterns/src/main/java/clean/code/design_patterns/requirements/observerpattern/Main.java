package clean.code.design_patterns.requirements.observerpattern;

public class Main {
    public static void main(String[] args) {
        Spotify alternativeRock=new Spotify();
        Observer listener1=new Subscriber();
        Observer listener2=new Subscriber();
        Observer listener3= new Subscriber();
        Observer listener4=new Subscriber();

        alternativeRock.addListener(listener1);
        alternativeRock.addListener(listener2);

        Artist artist1=new Artist("Nothing but Thieves");
        alternativeRock.addArtist(artist1);

        alternativeRock.notifyListeners(artist1);

        alternativeRock.removeListener(listener3);

        alternativeRock.addListener(listener4);

        Artist artist2=new Artist("Maneskin");
        alternativeRock.addArtist(artist2);
        alternativeRock.notifyListeners(artist2);



    }
}
