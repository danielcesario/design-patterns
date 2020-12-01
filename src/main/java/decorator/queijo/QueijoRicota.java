package decorator.queijo;

import decorator.Lanche;
import decorator.LancheDecorator;

public class QueijoRicota extends LancheDecorator {

    public QueijoRicota(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nQueijo Ricota";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 4.5;
    }
}
