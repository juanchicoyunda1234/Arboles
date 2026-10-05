package negocio;

import modelo.Nodo;

public class ConstructorArboles {

    public static Nodo<String> crearArbolEjemplo() {
        Nodo<String> a = new Nodo<>("A");
        Nodo<String> b = new Nodo<>("B");
        Nodo<String> c = new Nodo<>("C");
        Nodo<String> d = new Nodo<>("D");
        Nodo<String> e = new Nodo<>("E");
        Nodo<String> f = new Nodo<>("F");
        Nodo<String> g = new Nodo<>("G");
        a.setIzquierdo(b);
        a.setDerecho(c);
        b.setIzquierdo(d);
        b.setDerecho(e);
        c.setDerecho(f);
        e.setIzquierdo(g);
        return a;
    }

    public static Nodo<String> crearArbolCampeonato() {
        Nodo<String> fin = new Nodo<>("Final");
        Nodo<String> sf1 = new Nodo<>("Semifinal 1");
        Nodo<String> sf2 = new Nodo<>("Semifinal 2");
        Nodo<String> e1 = new Nodo<>("Equipo 1");
        Nodo<String> e2 = new Nodo<>("Equipo 2");
        Nodo<String> e3 = new Nodo<>("Equipo 3");
        Nodo<String> e4 = new Nodo<>("Equipo 4");
        fin.setIzquierdo(sf1);
        fin.setDerecho(sf2);
        sf1.setIzquierdo(e1);
        sf1.setDerecho(e2);
        sf2.setIzquierdo(e3);
        sf2.setDerecho(e4);
        return fin;
    }
}
