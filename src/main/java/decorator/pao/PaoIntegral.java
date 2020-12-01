package decorator.pao;

import decorator.Lanche;
import decorator.LancheDecorator;

public class PaoIntegral extends LancheDecorator {

    public PaoIntegral(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nPão Integral";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 3;
    }
}
