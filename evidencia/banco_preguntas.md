# Banco de preguntas

Seis preguntas para Kahoot o Quizizz: tres de concepto, dos de lectura de código y una de aplicación.

```java
Nodo<String> r = new Nodo<>("A");
r.setIzquierdo(new Nodo<>("B"));
r.setDerecho(new Nodo<>("C"));
r.getIzquierdo().setIzquierdo(new Nodo<>("D"));
```

1. ¿Cómo se llama el nodo que no tiene padre? (A) hoja (B) raíz (C) hijo (D) arco. Respuesta: **B, raíz**. Explicación: es el nodo de arriba y nadie lo tiene como hijo.
2. ¿Cuántos hijos puede tener como máximo cada nodo de un árbol binario? (A) 1 (B) 2 (C) 3 (D) los que quiera. Respuesta: **B, 2**. Explicación: binario quiere decir dos, el izquierdo y el derecho.
3. ¿Qué es una hoja? (A) un nodo sin hijos (B) el nodo raíz (C) un nodo con dos hijos (D) el enlace entre dos nodos. Respuesta: **A, un nodo sin hijos**. Explicación: sus dos enlaces valen null.
4. Con el código de arriba, ¿cuál es la altura del árbol contando aristas? (A) 1 (B) 2 (C) 3 (D) 4. Respuesta: **B, 2**. Explicación: el camino más largo es A, B, D, que son dos aristas.
5. Con el mismo código, ¿cuántas hojas tiene el árbol? (A) 1 (B) 2 (C) 3 (D) 4. Respuesta: **B, 2**. Explicación: C y D no tienen hijos.
6. ¿Qué dato se representa mejor con un árbol? (A) una lista de compras (B) carpetas y subcarpetas (C) la fila de un banco (D) una cola de impresión. Respuesta: **B, carpetas y subcarpetas**. Explicación: tienen jerarquía, unas cuelgan de otras.
