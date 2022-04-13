public class ListaEncadeada{
    public No ultmoEl, primeiroEl;

    public ListaEncadeada(){
        this.ultmoEl = null;
        this.primeiroEl = null;
    }

    public boolean vazia() {
        return this.primeiroEl == null;
    }

    public void insere_primeiro(int info){
        No p = new No(info);
        p.proximo = this.primeiroEl;
        this.primeiroEl = p;
        if(this.ultmoEl == null){
            this.ultmoEl = p;
        }

    }

    public void insere_ultimo(int info) {
        No u = new No(info);
        if(this.ultmoEl != null){
            this.ultmoEl.proximo = u;
        }else{
            this.primeiroEl = u;
        }
        this.ultmoEl = u;
    }

    public void mostra_lista(){
        No p = this.primeiroEl;
        while(p != null){
            System.out.println(p.valor);
            p = p.proximo;
        }
    }

    public void insere_ordenado(int info) {
        if(this.vazia() || (info <= this.primeiroEl.valor)){
            this.insere_primeiro(info);
        }else if(info >= this.ultmoEl.valor){
            this.insere_ultimo(info);
        }else{
            No novo = new No(info);
            No p = this.primeiroEl;
            No q = null;

            while(info > p.valor){
                q = p;
                p = p.proximo;
            }

            q.proximo = novo;
            novo.proximo = p;
        }
    }

    public int retira_primeiro(){
        int valor = this.primeiroEl.valor;
        this.primeiroEl = this.primeiroEl.proximo;
        return valor;
    }

    public int retira_ultimo() {
        if(!this.vazia()){
            No p = this.primeiroEl;
            while(p.proximo != this.ultmoEl){
                p = p.proximo;
            }
            int valorNo = p.proximo.valor;
            p.proximo = null;
            this.ultmoEl = p;
            return valorNo;
        }else{
            return -1;
        }
    }

    public void insere_depois(No no, int valor) {
        if(no.proximo != null){
            No m = new No(valor);
            No p = no.proximo;
    
            no.proximo = m;
            m.proximo = p;
        }
        insere_ultimo(valor);

    }

    public int retira_depois(No no) {
        if(no.proximo != null){
            No q = no.proximo;
            No p = q.proximo;
            no.proximo = p;

            return q.valor;
        }else{
            System.out.println("Opreação inválida");
            return -1;
        }

        
    }

    public int ultimo_elemento() {
        return this.ultmoEl.valor;
    }
}