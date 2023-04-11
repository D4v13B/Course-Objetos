package Curso.Java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class EjemploMap {

    public static void main(String[] args) {
        // Crear el Map
        Map<String, ArrayList<Pair<String, Integer>>> miMapa = new HashMap<>();

        // Crear el ArrayList y agregar valores
        ArrayList<Pair<String, Integer>> miArrayList = new ArrayList<>();
        miArrayList.add(new Pair<>("Valor 1", 10));
        miArrayList.add(new Pair<>("Valor 2", 20));
        miArrayList.add(new Pair<>("Valor 3", 30));

        // Agregar el ArrayList al Map
        miMapa.put("Clave 1", miArrayList);

        // Acceder al ArrayList dentro del Map y obtener los valores
        ArrayList<Pair<String, Integer>> arrayListRecuperado = miMapa.get("Clave 1");
        for (Pair<String, Integer> pair : arrayListRecuperado) {
            System.out.println("String: " + pair.getFirst() + " - Integer: " + pair.getSecond());
        }
    }
}

class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
