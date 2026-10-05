package pruebas;

import modelo.Nodo;
import negocio.ConstructorArboles;

public class Pruebas {
    private static int total;
    private static int correctas;

    private static void verificar(String descripcion, boolean condicion) {
        total++;
        if (condicion) {
            correctas++;
        }
        System.out.println((condicion ? "OK     " : "FALLO  ") + descripcion);
    }

    public static void ejecutar() {
        total = 0;
        correctas = 0;
        probarNodoUnico();
        probarArbolVacio();
        probarArbolEjemplo();
        probarArbolCampeonato();
        System.out.println(correctas + " de " + total + " pruebas correctas");
    }

    private static void probarNodoUnico() {
        Nodo<String> unico = new Nodo<>("X");
        verificar("Nodo unico: es hoja", unico.esHoja());
        verificar("Nodo unico: no tiene hijo izquierdo", unico.getIzquierdo() == null);
        verificar("Nodo unico: no tiene hijo derecho", unico.getDerecho() == null);
    }

    private static void probarArbolVacio() {
        Nodo<String> raiz = null;
        verificar("Arbol vacio: la raiz es null", raiz == null);
    }

    private static void probarArbolEjemplo() {
        Nodo<String> a = ConstructorArboles.crearArbolEjemplo();
        Nodo<String> b = a.getIzquierdo();
        Nodo<String> c = a.getDerecho();
        Nodo<String> d = b.getIzquierdo();
        Nodo<String> e = b.getDerecho();
        Nodo<String> f = c.getDerecho();
        Nodo<String> g = e.getIzquierdo();
        verificar("Ejemplo: la raiz es A", "A".equals(a.getDato()));
        verificar("Ejemplo: A no es hoja", !a.esHoja());
        verificar("Ejemplo: B no es hoja", !b.esHoja());
        verificar("Ejemplo: C no es hoja", !c.esHoja());
        verificar("Ejemplo: E no es hoja", !e.esHoja());
        verificar("Ejemplo: D es hoja", d.esHoja());
        verificar("Ejemplo: F es hoja", f.esHoja());
        verificar("Ejemplo: G es hoja", g.esHoja());
        verificar("Ejemplo: C solo tiene hijo derecho", c.getIzquierdo() == null && c.getDerecho() != null);
        verificar("Ejemplo: G esta a 3 arcos de la raiz", "G".equals(a.getIzquierdo().getDerecho().getIzquierdo().getDato()));
    }

    private static void probarArbolCampeonato() {
        Nodo<String> fin = ConstructorArboles.crearArbolCampeonato();
        Nodo<String> sf1 = fin.getIzquierdo();
        Nodo<String> sf2 = fin.getDerecho();
        Nodo<String> e1 = sf1.getIzquierdo();
        Nodo<String> e2 = sf1.getDerecho();
        Nodo<String> e3 = sf2.getIzquierdo();
        Nodo<String> e4 = sf2.getDerecho();
        verificar("Campeonato: la final no es hoja", !fin.esHoja());
        verificar("Campeonato: la semifinal 1 no es hoja", !sf1.esHoja());
        verificar("Campeonato: la semifinal 2 no es hoja", !sf2.esHoja());
        verificar("Campeonato: el equipo 1 es hoja", e1.esHoja());
        verificar("Campeonato: el equipo 2 es hoja", e2.esHoja());
        verificar("Campeonato: el equipo 3 es hoja", e3.esHoja());
        verificar("Campeonato: el equipo 4 es hoja", e4.esHoja());
        verificar("Campeonato: los 4 equipos estan a 2 arcos de la final", "Equipo 1".equals(e1.getDato()) && "Equipo 2".equals(e2.getDato()) && "Equipo 3".equals(e3.getDato()) && "Equipo 4".equals(e4.getDato()));
    }
}
