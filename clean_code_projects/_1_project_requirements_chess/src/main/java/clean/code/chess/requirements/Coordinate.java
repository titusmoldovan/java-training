package clean.code.chess.requirements;

import java.util.Objects;

public class Coordinate implements Comparable<Coordinate> {

    private int coordX;
    private int coordY;

    public Coordinate(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                '}';
    }

    @Override
    public int compareTo(Coordinate o) {
        if (o.coordX == this.coordX){
            if(o.coordY > this.coordY){
                return -1;
            }else if (o.coordY < this.coordY){
                return 1;
            }else{
                return 0;
            }
        }else if( o.coordX > this.coordX){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinate)) return false;
        Coordinate that = (Coordinate) o;
        return coordX == that.coordX && coordY == that.coordY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordX, coordY);
    }
}
