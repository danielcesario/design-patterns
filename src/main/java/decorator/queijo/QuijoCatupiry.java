package decorator.queijo;

import decorator.Lanche;
import decorator.LancheDecorator;

public class QuijoCatupiry extends LancheDecorator {

    public QuijoCatupiry(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nQueijo Catupiry";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 5;
    }
}
