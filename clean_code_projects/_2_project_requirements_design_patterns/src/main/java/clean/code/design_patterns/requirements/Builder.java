package clean.code.design_patterns.requirements;

public class Builder {
    public final String name;
    public Integer age;
    public String hairStyle;
    public String hairColor;

    public Builder(String name) {
        if (name == null) {
            throw new Error("The character must have a name!");
        }
        this.name = name;
    }

    public Builder age(Integer age) {
        this.age = age;
        return this;
    }

    public Builder hairStyle(String hs) {
        this.hairStyle = hs;
        return this;
    }

    public Builder hairColor(String hc) {
        this.hairColor = hc;
        return this;
    }

    public Character build() {
        return new Character(this);
    }
}
