package decorator.pao;

import decorator.Lanche;
import decorator.LancheDecorator;

public class PaoAustraliano extends LancheDecorator {

    public PaoAustraliano(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nPão Australiano";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 4;
    }
}
