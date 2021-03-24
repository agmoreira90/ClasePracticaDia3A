package ejercicio2;

public class testFigurasGeometricas {
    public static void main(String[] args) {
        FiguraGeometrica f1 = new Circulo(5);
        FiguraGeometrica f2 = new Rectangulo(2, 3);
        FiguraGeometrica f3 = new Triangulo(2, 3);

        FiguraGeometrica figuras[] = new FiguraGeometrica[3];
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        System.out.println(f2);
        double promedio = GeoUtil.areaPromedio(figuras);
        System.out.println("promedio = " + promedio);
    }
}
