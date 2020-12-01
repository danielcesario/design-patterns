package decorator;

abstract public class LancheDecorator extends Lanche {

    public Lanche lanche;

    public LancheDecorator(Lanche lanche) {
        this.lanche = lanche;
    }
}
