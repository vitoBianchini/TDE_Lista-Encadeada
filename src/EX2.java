public class EX2 {
    public static ListaEncadeada interseccao(ListaEncadeada l1, ListaEncadeada l2) {
        ListaEncadeada nLista = new ListaEncadeada();

        No p = l1.primeiroEl;
        No q = l2.primeiroEl;

        while(p != null){
            while(q != null){
                if(p.valor == q.valor){
                    nLista.insere_ordenado(p.valor);
                    break;
                }
                q = q.proximo;
            }
            q = l2.primeiroEl;
            p = p.proximo;
        }
        System.out.println("Valores");
        nLista.mostra_lista();

        return nLista;
    }
}
