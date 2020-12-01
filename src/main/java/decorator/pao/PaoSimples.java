package decorator.pao;

import decorator.Lanche;
import decorator.LancheDecorator;

public class PaoSimples extends LancheDecorator {

    public PaoSimples(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nPão Simples";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 2;
    }
}
