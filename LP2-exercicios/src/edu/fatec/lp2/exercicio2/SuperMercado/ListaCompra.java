package SuperMercado;

public class ListaCompra implements Calculavel {
    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int contador;

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ItemCompra[qtdeMax];
        this.contador = 0;
    }

    public void incluir(ItemCompra item) {
        if (contador < qtdeMax) {
            itensCompra[contador] = item;
            contador++;
        } else {
            throw new IllegalStateException("Lista de compras está cheia");
        }
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += itensCompra[i].calcularPreco();
        }
        return total;
    }

    public ItemCompra[] getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(ItemCompra[] itensCompra) {
        this.itensCompra = itensCompra;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
