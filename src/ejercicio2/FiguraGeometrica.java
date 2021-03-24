package ejercicio2;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString() {
        String str = "Area: " + area();
        return str;
    }

}
