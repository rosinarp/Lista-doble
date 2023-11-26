class ListaLigadaDoble {
    public Nodo cabeza;

    public ListaLigadaDoble() {
        this.cabeza = null;
    }

    // Buscar un nodo por el valor de su campo clave y devolver una referencia
    public Nodo buscarPorClave(int clave) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == clave) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Buscar un nodo por su campo clave e insertar un nuevo nodo después de él
    public void insertarDespuesDe(int claveBuscada, Nodo nuevoNodo) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.clave == claveBuscada) {
                nuevoNodo.siguiente = actual.siguiente;
                nuevoNodo.anterior = actual;
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = nuevoNodo;
                }
                actual.siguiente = nuevoNodo;
                return;
            }
            actual = actual.siguiente;
        }
    }

    // Intercambiar un nodo por otro buscado
    public void intercambiarNodos(int clave1, int clave2) {
        Nodo nodo1 = buscarPorClave(clave1);
        Nodo nodo2 = buscarPorClave(clave2);

        // Verificar si ambos nodos existen
        if (nodo1 != null && nodo2 != null) {
            // Intercambiar los nodos
            Nodo temp = nodo1.siguiente;
            nodo1.siguiente = nodo2.siguiente;
            nodo2.siguiente = temp;

            if (nodo1.siguiente != null) {
                nodo1.siguiente.anterior = nodo1;
            }
            if (nodo2.siguiente != null) {
                nodo2.siguiente.anterior = nodo2;
            }

            temp = nodo1.anterior;
            nodo1.anterior = nodo2.anterior;
            nodo2.anterior = temp;

            if (nodo1.anterior != null) {
                nodo1.anterior.siguiente = nodo1;
            }
            if (nodo2.anterior != null) {
                nodo2.anterior.siguiente = nodo2;
            }
        }
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.clave + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
