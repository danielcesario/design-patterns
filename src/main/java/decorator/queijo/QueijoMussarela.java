package decorator.queijo;

import decorator.Lanche;
import decorator.LancheDecorator;

public class QueijoMussarela extends LancheDecorator {

    public QueijoMussarela(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nQueijo Mussarela";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 2;
    }
}
