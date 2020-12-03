package facade.rotinas;

import java.util.Arrays;

import decorator.Lanche;
import decorator.LancheBuilder;

public class MontarLanche {

    public static Lanche execute(final String[] ingredientes) {
        LancheBuilder builder = new LancheBuilder();
        
        Arrays.asList(ingredientes).stream().forEach(ingrediente -> {
            switch(ingrediente) {
                case "Bacon":
                    builder.bacon();
                    break;
                case "Fritas":
                    builder.fritas();
                    break;
                case "Salada":
                    builder.salada();
                    break;
                case "PaoSimples":
                    builder.paoSimples();
                    break;
                case "PaoIntegral":
                    builder.paoIntegral();
                    break;
                case "PaoAustraliano":
                    builder.paoAustraliano();
                    break;
                case "QueijoCheedar":
                    builder.queijoCheedar();
                    break;
                case "QueijoMussarela":
                    builder.queijoMussarela();
                    break;
                case "QueijoRicota":
                    builder.queijoRicota();
                    break;
                case "QueijoSuico":
                    builder.queijoSuico();
                    break;
                case "QueijoCatupiry":
                    builder.queijoCatupiry();
                    break;
                default:
                    System.out.println("Ingrediente " + ingrediente + " inválido");
            }
        });

        return builder.build();
    }
    
}
