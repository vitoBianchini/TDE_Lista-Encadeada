public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TDE2");
        System.out.println("\n\nEX1 - Cálculo de similaridade");

        ListaEncadeada x = new ListaEncadeada();
        x.insere_ultimo(2);
        x.insere_ultimo(3);
        x.insere_ultimo(1);
        ListaEncadeada y = new ListaEncadeada();
        y.insere_ultimo(3);
        y.insere_ultimo(1);
        y.insere_ultimo(2);

        EX1.similaridade(x, y);
       
        System.out.println("\n\nEX2 -  Interseção entre duas listas\n");

        ListaEncadeada um = new ListaEncadeada();
        um.insere_primeiro(3);
        um.insere_primeiro(2);
        um.insere_primeiro(11);
        um.insere_primeiro(5);
        um.insere_primeiro(15);
        um.insere_primeiro(8);

        ListaEncadeada dois = new ListaEncadeada();
        dois.insere_primeiro(8);
        dois.insere_primeiro(2);
        dois.insere_primeiro(13);
        dois.insere_primeiro(89);
        dois.insere_primeiro(15);
        dois.insere_primeiro(7);

        EX2.interseccao(um, dois);
        




        
    }
}
