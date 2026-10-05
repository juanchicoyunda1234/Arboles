package app;

import java.util.Scanner;
import modelo.Nodo;
import negocio.ConstructorArboles;
import pruebas.Pruebas;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion(entrada);
            switch (opcion) {
                case 1 -> verArbolEjemplo();
                case 2 -> verArbolCampeonato();
                case 3 -> Pruebas.ejecutar();
                case 0 -> System.out.println("Fin del programa.");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Ver el arbol de ejemplo (A a G)");
        System.out.println("2. Ver el arbol del campeonato");
        System.out.println("3. Ejecutar pruebas");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
    }

    private static int leerOpcion(Scanner entrada) {
        String linea = entrada.nextLine().trim();
        try {
            return Integer.parseInt(linea);
        } catch (NumberFormatException ex) {
            return -1;
        }
    }

    private static void mostrarNodo(Nodo<String> nodo) {
        System.out.println("Nodo " + nodo.getDato() + " es hoja: " + nodo.esHoja());
    }

    private static void verArbolEjemplo() {
        Nodo<String> a = ConstructorArboles.crearArbolEjemplo();
        Nodo<String> b = a.getIzquierdo();
        Nodo<String> c = a.getDerecho();
        Nodo<String> d = b.getIzquierdo();
        Nodo<String> e = b.getDerecho();
        Nodo<String> f = c.getDerecho();
        Nodo<String> g = e.getIzquierdo();
        System.out.println("Raiz: " + a.getDato());
        mostrarNodo(a);
        mostrarNodo(b);
        mostrarNodo(c);
        mostrarNodo(d);
        mostrarNodo(e);
        mostrarNodo(f);
        mostrarNodo(g);
    }

    private static void verArbolCampeonato() {
        Nodo<String> fin = ConstructorArboles.crearArbolCampeonato();
        Nodo<String> sf1 = fin.getIzquierdo();
        Nodo<String> sf2 = fin.getDerecho();
        System.out.println("Raiz: " + fin.getDato());
        mostrarNodo(fin);
        mostrarNodo(sf1);
        mostrarNodo(sf2);
        mostrarNodo(sf1.getIzquierdo());
        mostrarNodo(sf1.getDerecho());
        mostrarNodo(sf2.getIzquierdo());
        mostrarNodo(sf2.getDerecho());
    }
}
