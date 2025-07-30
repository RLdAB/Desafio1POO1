public class Produto {
    String nome;
    double preco;
    int estoque;

    // Construtor completo
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Construtor só com nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        estoque = 0; // Começa sem nada
    }

    // Adiciona ao estoque
    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            estoque += qtd;
            System.out.println("Adicionado: " + qtd + " unidades de " + nome);
        } else {
            System.out.println("Quantidade inválida (tem que ser > 0)");
        }
    }

    // Vende o produto (se tiver no estoque)
    public boolean vender(int qtd) {
        if (qtd <= 0) {
            System.out.println("Quantidade inválida para venda.");
            return false;
        }

        if (estoque >= qtd) {
            estoque -= qtd;
            System.out.println("Venda feita: " + qtd + " unidades de " + nome);
            return true;
        } else {
            System.out.println("Não tem tudo isso em estoque. Só tem: " + estoque);
            return false;
        }
    }

    // Mostra as infos do produto
    public void mostrarResumo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");
    }


    public void aplicarDesconto(double porc) {
        preco = preco - (preco * porc / 100);
        System.out.println("Desconto de " + porc + "% aplicado. Novo preço: R$ " + preco);
    }
}

