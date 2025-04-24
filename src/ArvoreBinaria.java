public class ArvoreBinaria {
    private Nodo raiz;

    // Inserir
    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Nodo inserirRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }
        if (valor < raiz.valor)
            raiz.esquerdo = inserirRec(raiz.esquerdo, valor);
        else if (valor > raiz.valor)
            raiz.direito = inserirRec(raiz.direito, valor);
        return raiz;
    }

    // Remover
    public void remover(int valor) {
        raiz = removerRec(raiz, valor);
    }

    private Nodo removerRec(Nodo raiz, int valor) {
        if (raiz == null) return raiz;
        if (valor < raiz.valor) {
            raiz.esquerdo = removerRec(raiz.esquerdo, valor);
        } else if (valor > raiz.valor) {
            raiz.direito = removerRec(raiz.direito, valor);
        } else {
            // Nó com um ou nenhum filho
            if (raiz.esquerdo == null)
                return raiz.direito;
            else if (raiz.direito == null)
                return raiz.esquerdo;

            // Nó com dois filhos
            raiz.valor = valorMinimo(raiz.direito);
            raiz.direito = removerRec(raiz.direito, raiz.valor);
        }
        return raiz;
    }

    private int valorMinimo(Nodo raiz) {
        int minv = raiz.valor;
        while (raiz.esquerdo != null) {
            minv = raiz.esquerdo.valor;
            raiz = raiz.esquerdo;
        }
        return minv;
    }

    // Pesquisar
    public boolean pesquisar(int valor) {
        return pesquisarRec(raiz, valor);
    }

    private boolean pesquisarRec(Nodo raiz, int valor) {
        if (raiz == null) return false;
        if (raiz.valor == valor) return true;
        return valor < raiz.valor ? pesquisarRec(raiz.esquerdo, valor) :
            pesquisarRec(raiz.direito, valor);
    }

    // Travessias
    public void emOrdem() {
        emOrdemRec(raiz);
        System.out.println();
    }

    private void emOrdemRec(Nodo raiz) {
        if (raiz != null) {
            emOrdemRec(raiz.esquerdo);
            System.out.print(raiz.valor + " ␣ ");
            emOrdemRec(raiz.direito);
        }
    }

    public void preOrdem() {
        preOrdemRec(raiz);
        System.out.println();
    }

    private void preOrdemRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ␣ ");
            preOrdemRec(raiz.esquerdo);
            preOrdemRec(raiz.direito);
        }
    }

    public void posOrdem() {
        posOrdemRec(raiz);
        System.out.println();
    }

    private void posOrdemRec(Nodo raiz) {
        if (raiz != null) {
            posOrdemRec(raiz.esquerdo);
            posOrdemRec(raiz.direito);
            System.out.print(raiz.valor + " ␣ ");
        }
    }

    // Verifica se está cheia
    public boolean estaCheia() {
        return estaCheiaRec(raiz);
    }

    private boolean estaCheiaRec(Nodo nodo) {
        if (nodo == null) return true;
        if (nodo.esquerdo == null && nodo.direito == null) return true;
        if (nodo.esquerdo != null && nodo.direito != null)
            return estaCheiaRec(nodo.esquerdo) && estaCheiaRec(nodo.direito);
        return false;
    }

    // Verifica se é estritamente binária
    public boolean ehEstrita() {
        return ehEstritaRec(raiz);
    }

    private boolean ehEstritaRec(Nodo nodo) {
        if (nodo == null) return true;
        if ((nodo.esquerdo == null && nodo.direito != null) ||
            (nodo.esquerdo != null && nodo.direito == null))
            return false;
        return ehEstritaRec(nodo.esquerdo) && ehEstritaRec(nodo.direito);
    }

    // Verifica se é completa
    public boolean ehCompleta() {
        int contagemDeNos = contarNos(raiz);
        return ehCompletaRec(raiz, 0, contagemDeNos);
    }

    private boolean ehCompletaRec(Nodo nodo, int indice, int contagem) {
        if (nodo == null) return true;
        if (indice >= contagem) return false;
        return ehCompletaRec(nodo.esquerdo, 2 * indice + 1, contagem) &&
            ehCompletaRec(nodo.direito, 2 * indice + 2, contagem);
    }

    private int contarNos(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + contarNos(nodo.esquerdo) + contarNos(nodo.direito);
    }

    // Grau de um nó
    public int obterGrau(int valor) {
        Nodo nodo = encontrarNodo(raiz, valor);
        if (nodo == null) return -1;
        int grau = 0;
        if (nodo.esquerdo != null) grau++;
        if (nodo.direito != null) grau++;
        return grau;
    }

    private Nodo encontrarNodo(Nodo raiz, int valor) {
        if (raiz == null || raiz.valor == valor) return raiz;
        return valor < raiz.valor ? encontrarNodo(raiz.esquerdo, valor) : encontrarNodo(raiz.direito, valor);
    }

    // Nível da árvore
    public int nivel() {
        return altura(raiz);
    }

    private int altura(Nodo nodo) {
        if (nodo == null) return 0;
        int esquerda = altura(nodo.esquerdo);
        int direita = altura(nodo.direito);
        return Math.max(esquerda, direita) + 1;
    }
}
