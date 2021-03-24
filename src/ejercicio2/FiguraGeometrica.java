package ejercicio2;

public abstract class FiguraGeometrica {

    public abstract double area();

    @Override
    public String toString() {
        String str = "Area del " + this.getClass().getName().replace("ejercicio2.","") + ": " + area();
        return str;
    }

}
