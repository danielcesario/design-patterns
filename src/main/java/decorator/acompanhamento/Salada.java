package decorator.acompanhamento;

import decorator.Lanche;
import decorator.LancheDecorator;

public class Salada extends LancheDecorator {

    public Salada(Lanche lanche) {
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + "\nAdicionar Salada";
    }

    @Override
    public Double getPreco() {
        return lanche.getPreco() + 2;
    }
}
