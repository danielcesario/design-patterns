package decorator.acompanhamento;

import decorator.Lanche;
import decorator.LancheDecorator;

public class Fritas extends LancheDecorator {

    public Fritas(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nAdicionar Fritas";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 6;
    }
}
