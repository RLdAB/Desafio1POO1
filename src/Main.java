public class Main {
    public static void main(String[] args) {
        // Criando produtos com os dois construtores
        Produto p1 = new Produto("Fone de Ouvido", 150.0, 10);
        Produto p2 = new Produto("Mouse Gamer", 120.0); // estoque vai ser 0

        // Mostrando resumo inicial
        System.out.println("Resumo inicial dos produtos:");
        p1.mostrarResumo();
        p2.mostrarResumo();

        System.out.println("\n--- Adicionando estoque ---");
        p2.adicionarEstoque(5); // adiciona 5 ao mouse

        System.out.println("\n--- Tentando vender ---");
        p1.vender(3);  // vende 3 fones
        p2.vender(10); // tenta vender 10 mouses (não tem tudo isso)

        System.out.println("\n--- Aplicando desconto ---");
        p1.aplicarDesconto(10); // desconto de 10%

        System.out.println("\n--- Resumo final ---");
        p1.mostrarResumo();
        p2.mostrarResumo();
    }
}
