package ejercicio2;

import java.util.ArrayList;

public class geoUtil {
    public static double areaPromedio(FiguraGeometrica arr[]){
        double promedio = 0;
        for (int i = 0; i < arr.length; i++) {
            promedio += arr[i].area();
        }
        return promedio;
    }
}
