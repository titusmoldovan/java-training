package code._4_student_effort.Pairs;

class Pair<T extends Shoe>{
    private final T first;
    private final T second;

    public Pair(T firstElement, T secondElement){
            first = firstElement;
            second = secondElement;
            if (first.getClass().equals(second.getClass())) {
                match(first, second);
            }else
                throw new Error("Not the same types");
    }

    private void match(T first, T second) {
        if (!first.getColor().equals(second.getColor())){
            throw new SizesDoNotMatch();
        }
        if (first.getSize() != second.getSize()){
            throw new ColorsDoNotMatch();
        }
        if(first.getSize() == second.getSize() && first.getColor().equals(second.getColor())){
            System.out.println("It's a match!");
        }
    }

    public Object getFirst(){ return first; }
    public Object getSecond(){ return second; }

}

class SizesDoNotMatch extends RuntimeException{
    public SizesDoNotMatch() {
    }
}

class ColorsDoNotMatch extends RuntimeException{
    public ColorsDoNotMatch() {
    }
}

interface Shoe{
    int getSize();
    String getColor();
}

class Running implements Shoe{
    private final String color;
    private final int size;

    public Running(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}

class Heels implements Shoe{
    private final String color;
    private final int size;

    public Heels(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}

class Boot implements Shoe{
    private final String color;
    private final int size;

    public Boot(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}

public class PairsExample {
    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);

        Boot bootShoe = new Boot("BLACK", 45);
        Pair<Shoe> pairKO = new Pair<>(runningShoe1, bootShoe);
    }
}
