public class Eyeliner {
    private final String colour;
    private final String style; // soft, arabic, pin-up

    public String getColour() {
        return colour;
    }

    public String getStyle() {
        return style;
    }

    public Eyeliner(String colour, String style) {
        this.colour = colour;
        this.style = style;
    }
}
