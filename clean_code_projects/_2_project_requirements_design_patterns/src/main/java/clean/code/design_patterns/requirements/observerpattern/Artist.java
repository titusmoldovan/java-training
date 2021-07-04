package clean.code.design_patterns.requirements.observerpattern;

public class Artist {
    private String name;
    public Artist(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
