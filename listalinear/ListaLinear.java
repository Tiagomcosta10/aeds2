/**
 * Implementação de uma estrutura de dados de lista linear baseada em array.
 */
public class ListaLinear {

    private int[] array;
    private int n; // Contador para o número atual de elementos na lista

    /**
     * Construtor. Cria uma lista vazia com capacidade máxima definida.
     * @param max O número máximo de elementos que a lista pode armazenar.
     */
    public ListaLinear(int max) {
        array = new int[max];
        n = 0;
    }

    /**
     * Insere um elemento no início da lista.
     * Complexidade: O(n)
     * @param elem O elemento a ser inserido.
     * @throws Exception Se a lista estiver cheia (overflow).
     */
    public void inserirInicio(int elem) throws Exception {
        if (n >= array.length) {
            throw new Exception("Erro ao inserir no início: a lista está cheia (overflow)!");
        }

        // Desloca todos os elementos para a direita
        for (int i = n; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = elem;
        n++;
    }

    /**
     * Insere um elemento no fim da lista.
     * Complexidade: O(1)
     * @param elem O elemento a ser inserido.
     * @throws Exception Se a lista estiver cheia (overflow).
     */
    public void inserirFim(int elem) throws Exception {
        if (n >= array.length) {
            throw new Exception("Erro ao inserir no fim: a lista está cheia (overflow)!");
        }
        array[n] = elem;
        n++;
    }

    /**
     * Insere um elemento em uma posição específica da lista.
     * Complexidade: O(n)
     * @param elem O elemento a ser inserido.
     * @param pos A posição (índice) onde o elemento será inserido.
     * @throws Exception Se a lista estiver cheia (overflow) ou a posição for inválida.
     */
    public void inserir(int elem, int pos) throws Exception {
        if (n >= array.length) {
            throw new Exception("Erro ao inserir: a lista está cheia (overflow)!");
        }
        if (pos < 0 || pos > n) {
            throw new Exception("Erro ao inserir: posição inválida!");
        }

        // Desloca elementos para a direita a partir da posição de inserção
        for (int i = n; i > pos; i--) {
            array[i] = array[i - 1];
        }

        array[pos] = elem;
        n++;
    }

    /**
     * Remove e retorna o elemento do início da lista.
     * Complexidade: O(n)
     * @return O elemento removido.
     * @throws Exception Se a lista estiver vazia (underflow).
     */
    public int removerInicio() throws Exception {
        if (n == 0) {
            throw new Exception("Erro ao remover do início: a lista está vazia (underflow)!");
        }

        int resp = array[0];
        n--;

        // Desloca todos os elementos para a esquerda
        for (int i = 0; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    /**
     * Remove e retorna o elemento do fim da lista.
     * Complexidade: O(1)
     * @return O elemento removido.
     * @throws Exception Se a lista estiver vazia (underflow).
     */
    public int removerFim() throws Exception {
        if (n == 0) {
            throw new Exception("Erro ao remover do fim: a lista está vazia (underflow)!");
        }
        return array[--n];
    }

    /**
     * Remove e retorna o elemento de uma posição específica.
     * Complexidade: O(n)
     * @param pos A posição (índice) do elemento a ser removido.
     * @return O elemento removido.
     * @throws Exception Se a lista estiver vazia (underflow) ou a posição for inválida.
     */
    public int remover(int pos) throws Exception {
        if (n == 0) {
            throw new Exception("Erro ao remover: a lista está vazia (underflow)!");
        }
        if (pos < 0 || pos >= n) {
            throw new Exception("Erro ao remover: posição inválida!");
        }

        int resp = array[pos];
        n--;

        // Desloca elementos para a esquerda a partir da posição de remoção
        for (int i = pos; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    /**
     * Imprime os elementos da lista de forma iterativa.
     * Complexidade: O(n)
     */
    public void mostrar() {
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    /**
     * Pesquisa se um elemento está presente na lista.
     * Complexidade: O(n)
     * @param elem O elemento a ser pesquisado.
     * @return true se o elemento for encontrado, false caso contrário.
     */
    public boolean pesquisar(int elem) {
        for (int i = 0; i < n; i++) {
            if (array[i] == elem) {
                return true;
            }
        }
        return false;
    }
}