# Banco de Preguntas - Quiz Interactivo

**Tema:** Concepto y jerarquía de árboles · Estructura de Datos (Unidad 3)  
**Enlace al Quiz en Vivo:** [Quizizz / Wayground](https://wayground.com/admin/quiz/6ac5b513346b0a5f373a4a08?source=quiz_share)

---

### Pregunta 1
¿Cuál de las siguientes estructuras cumple simultáneamente las propiedades de ser conexa y no tener ciclos, por lo que constituye un árbol?

- **a)** A conectado con B y C; B conectado con D
- **b)** A conectado con B y C; B conectado con C y D
- **c)** A conectado con B, B con C y C con D (A-B-C-D)
- **d)** A conectado con B y D, y C solo con D

**Respuesta correcta:** a (en la plataforma interactiva está registrada como la clave principal; formalmente c y d también constituyen árboles válidos)  
**Explicación:** Un árbol es un grafo no dirigido conexo y acíclico ($N$ nodos y $N-1$ aristas sin lazos cerrados):
- **Opción a:** Constituye un árbol binario ramificado donde la raíz $A$ conecta con $B$ y $C$, y $B$ conecta con $D$ (4 nodos, 3 aristas, conexo y sin ciclos).
- **Opción b:** No es un árbol, ya que las conexiones entre $B$, $C$ y $D$ generan un ciclo cerrado.
- **Opción c:** Constituye un árbol en cadena ($A \leftrightarrow B \leftrightarrow C \leftrightarrow D$), el cual es conexo y acíclico (4 nodos, 3 aristas).
- **Opción d:** Constituye un árbol conexo y sin ciclos ($B \leftrightarrow A \leftrightarrow D \leftrightarrow C$), con 4 nodos y 3 aristas.
Por lo tanto, las opciones **a**, **c** y **d** satisfacen formalmente las condiciones de árbol, siendo **a** la opción configurada en la plataforma.

---

### Pregunta 2
En un árbol cuya raíz es A, el camino más largo desde la raíz hasta una hoja es A → B → E → G. ¿Cuál es la altura del árbol, contando las aristas del camino?

- **a)** 1
- **b)** 2
- **c)** 3
- **d)** 4

**Respuesta correcta:** c  
**Explicación:** La altura de un árbol, según la convención estándar adoptada en la asignatura, se mide por la cantidad de aristas (o niveles de profundidad) del camino más largo desde la raíz hasta una hoja. El camino $A \to B \to E \to G$ contiene 4 nodos pero exactamente 3 aristas intermedias ($A-B$, $B-E$, $E-G$), por lo tanto su altura es 3.

---

### Pregunta 3
Un nodo raíz R tiene tres hijos directos: A, B y C. ¿Cómo debe clasificarse esta estructura según el número máximo de hijos permitido por cada tipo de árbol?

- **a)** Como árbol general, porque admite cualquier cantidad de hijos
- **b)** Como árbol binario, porque tiene una raíz definida
- **c)** Como árbol binario, porque sus hijos están conectados
- **d)** Como árbol general, porque todos sus nodos son hojas

**Respuesta correcta:** a  
**Explicación:** La definición formal de un árbol binario impone que cada nodo tenga a lo sumo dos hijos directos (izquierdo y derecho). Al tener el nodo raíz tres hijos ($A, B, C$), se incumple la condición binaria y la estructura se clasifica como un árbol general ($N$-ario), que no impone límite superior a la cardinalidad del conjunto de hijos.

---

### Pregunta 4
En la clase genérica `Nodo<T>`, ¿qué información almacenan sus tres atributos privados?

- **a)** Un dato y dos referencias: izquierdo y derecho
- **b)** Dos datos y una referencia: padre e hijo
- **c)** Un dato y dos referencias: padre y nivel
- **d)** Tres datos sin referencias a otros nodos

**Respuesta correcta:** a  
**Explicación:** La estructura autorreferencial básica del nodo binario consta de tres campos privados: `private T dato;` (que contiene el objeto o valor de tipo genérico) y dos referencias a nodos del mismo tipo: `private Nodo<T> izquierdo;` y `private Nodo<T> derecho;`.

---

### Pregunta 5
¿Cuál es la responsabilidad principal de la clase `Nodo.java` dentro de la estructura de un árbol binario?

- **a)** Administrar las operaciones de inserción, eliminación y recorridos del árbol.
- **b)** Dibujar y renderizar la interfaz gráfica de usuario del árbol.
- **c)** Almacenar el valor o dato y mantener las referencias hacia los nodos izquierdo y derecho.
- **d)** Ejecutar el método main y las pruebas unitarias.

**Respuesta correcta:** c  
**Explicación:** Bajo el patrón arquitectónico por capas, `Nodo.java` pertenece a la capa de **modelo**. Su única responsabilidad es modelar la entidad atómica del árbol (almacenar el dato y enlazar a sus hijos). La lógica de negocio y recorridos pertenece a `ArbolBinario.java`, y la presentación visual a las clases del paquete `app`.

---

### Pregunta 6
Un nodo tiene sus enlaces izquierdo y derecho apuntando a otros nodos. Si se ejecuta `grado()`, ¿cómo se obtiene el resultado?

- **a)** Se inicia en cero y se incrementa por cada enlace no nulo
- **b)** Se inicia en uno y se incrementa por cada enlace no nulo
- **c)** Se cuentan solo los enlaces que apuntan al lado izquierdo
- **d)** Se cuentan solo los enlaces que apuntan al lado derecho

**Respuesta correcta:** a  
**Explicación:** El grado de un nodo representa el número de hijos directos que posee (0, 1 o 2 en árboles binarios). El método `grado()` inicia un acumulador local en 0, suma 1 si `izquierdo != null`, y suma 1 si `derecho != null`, retornando 2 cuando ambos enlaces son válidos.

---

### Pregunta 7
En una arquitectura de tres capas para un árbol binario, ¿qué capa debe utilizar directamente la capa de negocio?

- **a)** La capa de aplicación
- **b)** La capa de modelo
- **c)** La capa de persistencia
- **d)** La capa de presentación

**Respuesta correcta:** b  
**Explicación:** El flujo de dependencias unidireccional en el diseño por capas establece que la capa de negocio (`arboles.negocio`, clase `ArbolBinario`) debe depender directamente de las estructuras de datos fundamentales de la capa de modelo (`arboles.modelo`, clase `Nodo`), manipulando sus punteros y datos para ejecutar la lógica de la estructura.

---

### Pregunta 8
Un programa ejecuta `agregarIzquierdo(padre, dato)`. El parámetro padre no es nulo, pero ya existe un hijo izquierdo. ¿Qué debe hacer el método?

- **a)** Crear otro hijo izquierdo y reemplazar el anterior
- **b)** Devolver un error porque el lugar está ocupado
- **c)** Crear el nodo como hijo derecho del mismo padre
- **d)** Devolver el padre sin modificar el árbol

**Respuesta correcta:** b  
**Explicación:** Para preservar la consistencia y no destruir subárboles completos accidentalmente, el método valida previamente si `padre.getIzquierdo() != null`. Si la posición ya se encuentra ocupada, debe reportar un error o lanzar una excepción (`IllegalStateException`) sin alterar la estructura preexistente.

---

### Pregunta 9
En un árbol binario, ¿qué valor devuelve el algoritmo `contarHojas(nodo)` cuando el nodo no es nulo y además es una hoja?

- **a)** Devuelve 0 porque no tiene hijos
- **b)** Devuelve 1 porque cuenta la hoja
- **c)** Devuelve 2 porque tiene dos enlaces
- **d)** Devuelve 1 más sus subárboles

**Respuesta correcta:** b  
**Explicación:** Es la condición base de la recursión: si el nodo actual cumple con la propiedad `nodo.esHoja()` (ambos punteros `izquierdo` y `derecho` son `null`), este nodo constituye una hoja válida y el algoritmo devuelve inmediatamente 1, contribuyendo a la suma total en el retorno de las llamadas recursivas.

---

### Pregunta 10
Dentro de la arquitectura del proyecto, ¿en qué paquete se encuentra la lógica de negocio como las operaciones de `ArbolBinario.java`?

- **a)** `arboles.app`
- **b)** `arboles.negocio`
- **c)** `arboles.modelo`
- **d)** `reto.pruebas`

**Respuesta correcta:** b  
**Explicación:** La clase `ArbolBinario<T>` encapsula las operaciones algorítmicas de administración del árbol (`crearRaiz`, inserciones seguras, `contarNodos`, `contarHojas`, `altura`), lo cual corresponde por convención y diseño a la capa de negocio, alojada en el paquete `arboles.negocio`.
