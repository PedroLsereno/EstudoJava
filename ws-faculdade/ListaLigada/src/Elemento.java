
public class Elemento {
	//O elemento(nó) sabe de duas coisas
	private String valor;
	private Elemento proximo; //proximo elemento
	
	public Elemento(String novoValor) {
		this.valor = novoValor;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	
}
