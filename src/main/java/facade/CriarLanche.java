package facade;

import decorator.Lanche;
import facade.rotinas.MontarLanche;

public class CriarLanche {

    public static void execute(final Pedido pedido) {
        Lanche lanche = MontarLanche.execute(pedido.getItems());
    }
    
}
