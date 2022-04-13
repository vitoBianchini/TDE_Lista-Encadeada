public class EX1 {
    public static Double similaridade(ListaEncadeada l1, ListaEncadeada l2){
        No p = l1.primeiroEl;
        No q = l2.primeiroEl;
        Double prod = 0.0;
        Double xSoma = 0.0;
        Double ySoma = 0.0;
        System.out.println("Tabela de dados");
        System.out.println("  X  |  Y  ");
        System.out.println("-----+-----");

        while(p != null){
            int x = p.valor;
            int y = q.valor;
            System.out.println("  "+x+"  |  "+y+"  ");

            Double resultado1 = (double) (x * y);
            prod = prod + resultado1;

            Double resultado2 = (double) (x * x);
            xSoma = xSoma + resultado2;
            
            Double resultado3 = (double) (y * y);
            ySoma = ySoma + resultado3;

            p = p.proximo;
            q = q.proximo;
        }

        Double multiplicacao =  ySoma * xSoma;

        Double raiz = Math.sqrt(multiplicacao);

        Double resultado = prod / raiz;
        System.out.println("Valor gerado: "+resultado);
        String formatado = String.format("%.2f", resultado);
        System.out.println("Valor formatado: " + formatado );
        return resultado;
    }
}
