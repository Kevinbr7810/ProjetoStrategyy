public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Produto A", 100.0);
        Produto produto2 = new Produto("Produto B", 200.0);
        Produto produto3 = new Produto("Produto C", 150.0);


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        carrinho.definirDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para cliente novo: " + carrinho.calcularTotal());


        carrinho.definirDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para cliente regular: " + carrinho.calcularTotal());

        carrinho.definirDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para cliente VIP: " + carrinho.calcularTotal());
    }
}