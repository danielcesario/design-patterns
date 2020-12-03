package decorator;

import decorator.acompanhamento.Bacon;
import decorator.acompanhamento.Fritas;
import decorator.acompanhamento.Salada;
import decorator.pao.PaoAustraliano;
import decorator.pao.PaoIntegral;
import decorator.pao.PaoSimples;
import decorator.queijo.QueijoCheedar;
import decorator.queijo.QueijoMussarela;
import decorator.queijo.QueijoRicota;
import decorator.queijo.QueijoSuico;
import decorator.queijo.QuijoCatupiry;

public class LancheBuilder {

    private Lanche lanche = new LancheInicial();

    public LancheBuilder() {
    }

    public LancheBuilder paoSimples() {
        lanche = new PaoSimples(lanche);
        return this;
    }

    public LancheBuilder paoAustraliano() {
        lanche = new PaoAustraliano(lanche);
        return this;
    }

    public LancheBuilder paoIntegral() {
        lanche = new PaoIntegral(lanche);
        return this;
    }

    public LancheBuilder bacon() {
        lanche = new Bacon(lanche);
        return this;
    }

    public LancheBuilder fritas() {
        lanche = new Fritas(lanche);
        return this;
    }

    public LancheBuilder salada() {
        lanche = new Salada(lanche);
        return this;
    }

    public LancheBuilder queijoCatupiry() {
        lanche = new QuijoCatupiry(lanche);
        return this;
    }

    public LancheBuilder queijoCheedar() {
        lanche = new QueijoCheedar(lanche);
        return this;
    }

    public LancheBuilder queijoMussarela() {
        lanche = new QueijoMussarela(lanche);
        return this;
    }

    public LancheBuilder queijoRicota() {
        lanche = new QueijoRicota(lanche);
        return this;
    }

    public LancheBuilder queijoSuico() {
        lanche = new QueijoSuico(lanche);
        return this;
    }

    public Lanche build() {
        Lanche lancheCriado = lanche;
        lanche = new LancheInicial();
        return lancheCriado;
    }
    
}
