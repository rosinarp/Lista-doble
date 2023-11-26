public class Main {
    public static void main(String[] args) {
        ListaLigadaDoble lista = new ListaLigadaDoble();

        // Insertar nodos en la lista
        lista.cabeza = new Nodo(1);
        Nodo segundo = new Nodo(2);
        Nodo tercero = new Nodo(3);
        lista.cabeza.siguiente = segundo;
        segundo.anterior = lista.cabeza;
        segundo.siguiente = tercero;
        tercero.anterior = segundo;

        System.out.println("Lista original:");
        lista.imprimirLista();

        // Buscar un nodo por el valor de su campo clave
        Nodo nodoBuscado = lista.buscarPorClave(2);
        System.out.println("Nodo encontrado: " + nodoBuscado.clave);

        // Insertar un nuevo nodo después de un nodo buscado
        Nodo nuevoNodo = new Nodo(4);
        lista.insertarDespuesDe(2, nuevoNodo);
        System.out.println("Lista después de la inserción:");
        lista.imprimirLista();

        // Intercambiar dos nodos
        lista.intercambiarNodos(2, 3);
        System.out.println("Lista después del intercambio:");
        lista.imprimirLista();
    }
}