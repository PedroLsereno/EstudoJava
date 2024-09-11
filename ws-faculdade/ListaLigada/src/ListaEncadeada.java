
public class ListaEncadeada {
	//A lista encadeada sabe duas coisas
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	public ListaEncadeada() {
		this.tamanho = 0;
	}
	
	public Elemento getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	//A lista tem que fazer 3 coisas
	public void adicionar(String novoValor) {
		Elemento novoElemento = new Elemento(novoValor);
		if(this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;	
		}else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;
	}
	
	public void remover(String novoValor) {
		
	}
	
	public Elemento get(int posicao) {//Apontar para o próximo elemento
			Elemento atual = this.primeiro;
			for(int i = 0; i < posicao; i++) {
				if(atual.getProximo() != null) {
					atual = atual.getProximo();
				}
			}
			return atual;
	}
	
	
}
