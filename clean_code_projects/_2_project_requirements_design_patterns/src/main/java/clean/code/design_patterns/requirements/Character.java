package clean.code.design_patterns.requirements;

public final class Character {
    private final String name;
    private final Integer age;
    private final String hairstyle;
    private final String hairColor;

    public Character(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.hairstyle = builder.hairStyle;
        this.hairColor = builder.hairColor;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairstyle='" + hairstyle + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
