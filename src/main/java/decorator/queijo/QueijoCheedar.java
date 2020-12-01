package decorator.queijo;

import decorator.Lanche;
import decorator.LancheDecorator;

public class QueijoCheedar extends LancheDecorator {

    public QueijoCheedar(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nQueijo Suiço";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 2.5;
    }
}
