public class TesteListaLinear {

    public static void main(String[] args) {
        try {
            System.out.println("=== Teste da Lista Linear ===");
            ListaLinear lista = new ListaLinear(6);

            // 1. Testando inserções
            System.out.println("\n--- Inserindo elementos ---");
            lista.inserirInicio(5); // Lista: [ 5 ]
            lista.mostrar();
            lista.inserirFim(10);   // Lista: [ 5, 10 ]
            lista.mostrar();
            lista.inserirInicio(3); // Lista: [ 3, 5, 10 ]
            lista.mostrar();
            lista.inserirFim(20);   // Lista: [ 3, 5, 10, 20 ]
            lista.mostrar();
            lista.inserir(8, 2);    // Lista: [ 3, 5, 8, 10, 20 ]
            lista.mostrar();
            lista.inserir(30, 5);   // Lista: [ 3, 5, 8, 10, 20, 30 ]
            lista.mostrar();

            // 2. Testando pesquisa
            System.out.println("\n--- Pesquisando elementos ---");
            System.out.println("Pesquisar 10: " + (lista.pesquisar(10) ? "Encontrado" : "Não encontrado"));
            System.out.println("Pesquisar 99: " + (lista.pesquisar(99) ? "Encontrado" : "Não encontrado"));

            // 3. Testando remoções
            System.out.println("\n--- Removendo elementos ---");
            System.out.println("Removido do início: " + lista.removerInicio()); // Remove 3
            lista.mostrar();
            System.out.println("Removido do fim: " + lista.removerFim());       // Remove 30
            lista.mostrar();
            System.out.println("Removido da posição 2: " + lista.remover(2)); // Remove 10
            lista.mostrar();

            // 4. Testando exceção de overflow
            System.out.println("\n--- Testando Overflow ---");
            System.out.println("Enchendo a lista novamente...");
            lista.inserirFim(1); // Lista: [ 5, 8, 20, 1 ]
            lista.inserirFim(2); // Lista: [ 5, 8, 20, 1, 2 ]
            lista.inserirFim(3); // Lista: [ 5, 8, 20, 1, 2, 3 ]
            lista.mostrar();
            System.out.println("Tentando inserir mais um elemento...");
            lista.inserirFim(99); // Deve lançar exceção

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        // 5. Testando exceção de underflow
        try {
            System.out.println("\n--- Testando Underflow ---");
            ListaLinear listaVazia = new ListaLinear(5);
            System.out.println("Tentando remover de uma lista vazia...");
            listaVazia.removerFim(); // Deve lançar exceção

        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}