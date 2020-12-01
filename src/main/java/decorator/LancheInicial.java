package decorator;

public class LancheInicial extends Lanche {

    @Override
    public String getDescricao() {
        return "Criar Lanche com:";
    }

    @Override
    public Double getPreco() {
        return 0d;
    }
}
