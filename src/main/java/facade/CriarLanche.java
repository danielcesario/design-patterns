package facade;

import decorator.Lanche;
import facade.rotinas.CalcularImposto;
import facade.rotinas.MontarLanche;

public class CriarLanche {

    public static void execute(final Pedido pedido) {
        System.out.println("--------- Iniciando a Preparação do Ingredientes -----------");
        Lanche lanche = MontarLanche.execute(pedido.getItems());
        System.out.println(lanche.getDescricao());
        System.out.println("--------- Finalizando a Preparação do Ingredientes -----------");

        System.out.println("--------- Iniciando o Calculo dos Impostos -----------");
        CalcularImposto.execute(lanche.getPreco());
        System.out.println("--------- Finalizando o Calculo dos Impostos -----------");
    }
    
}
