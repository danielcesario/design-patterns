package decorator;

import decorator.acompanhamento.Bacon;
import decorator.acompanhamento.Salada;
import decorator.pao.PaoIntegral;
import decorator.queijo.QueijoRicota;
import decorator.queijo.QuijoCatupiry;
import decorator.acompanhamento.Fritas;
import decorator.pao.PaoAustraliano;

public class Lanchonete {

    public static void main(String[] args) {
        Lanche lancheDaCasa = new Fritas(new QuijoCatupiry(new Bacon(new PaoAustraliano(new LancheInicial()))));
        System.out.println(lancheDaCasa.getDescricao());
        System.out.println(lancheDaCasa.getPreco());

        System.out.println("--------------------");

        Lanche lancheNatual = new Salada(new QueijoRicota(new PaoIntegral(new LancheInicial())));
        System.out.println(lancheNatual.getDescricao());
        System.out.println(lancheNatual.getPreco());

    }
}
