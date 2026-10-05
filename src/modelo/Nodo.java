package modelo;

public class Nodo<T> {
    private T dato;
    private Nodo<T> izquierdo;
    private Nodo<T> derecho;

    public Nodo(T dato) {
        this.dato = dato;
    }

    public boolean esHoja() {
        return izquierdo == null && derecho == null;
    }

    public T getDato() { return dato; }
    public Nodo<T> getIzquierdo() { return izquierdo; }
    public Nodo<T> getDerecho() { return derecho; }
    public void setIzquierdo(Nodo<T> izquierdo) { this.izquierdo = izquierdo; }
    public void setDerecho(Nodo<T> derecho) { this.derecho = derecho; }
}
