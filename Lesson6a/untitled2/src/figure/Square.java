package figure;

import java.util.Objects;

public class Square {
    private double side;

    public void setSide(double side) {
        if (side>0) {
            this.side = side;
        }
    }
    double calculateArea(){
        return side*side;

    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +"x"+side+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
