package facade;

public class Caixa {

    public static void main(String[] args) {
        Pedido novoPedido = new Pedido("PaoAustraliano", "QueijoCatupiry", "QueijoSuico", "QueijoMussarela", "Bacon", "Fritas");        
        CriarLanche.execute(novoPedido);
    }
    
}
