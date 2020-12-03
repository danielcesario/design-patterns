package facade.rotinas;

public class CalcularImposto {

    public static Double execute(final Double custoProducao) {
        System.out.println("Custo Producao: " + custoProducao);
        
        final Double valorISS = custoProducao * 0.18;
        System.out.println("Custo ISS: " + valorISS);

        final Double valorICMS = custoProducao * 0.08;
        System.out.println("Custo ICMS: " + valorICMS);

        final Double custoFinal = custoProducao + valorISS + valorICMS;
        System.out.println("Custo Final: " + custoFinal);

        return custoFinal;
    }
    
}
