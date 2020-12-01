package decorator.acompanhamento;

import decorator.Lanche;
import decorator.LancheDecorator;

public class Bacon extends LancheDecorator {

    public Bacon(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nAdicionar Bacon";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 3;
    }
}
