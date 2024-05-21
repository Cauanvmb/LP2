import Model.ItemCompra;
import Model.ListaCompra;
import Model.Produto;
import Model.Supermercado;

public class Main2 {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        supermercado.setNome("Supermercado Astolfo");

        Produto produto1 = new Produto(supermercado);
        produto1.setNome("Arroz");
        produto1.setUnidade("kg");
        produto1.setDescricao("Arroz branco");
        produto1.setPreco(5.0);
        produto1.setDescontoMaximo(10.0);

        ItemCompra item1 = new ItemCompra(produto1, 5.0);
        item1.setQuantidade(2);

        ListaCompra lista = new ListaCompra(10);
        lista.incluir(item1);

        System.out.println("Total da lista de compras: " + lista.calcularPreco());
    }
}
