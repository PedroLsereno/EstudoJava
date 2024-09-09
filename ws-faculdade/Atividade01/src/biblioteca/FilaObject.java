package biblioteca;

public class FilaObject {
	//	Conceito de Fila
	//	-Fila é um tipo abistrado de dado
	//	
	//	Funcionamento de uma fila
	//	-Sempre que vou remover um valor, é do começo da fila
	//	-Sempre que vou adicionar um valor, é no fim da fila
	//	
	//	O que pensar quando for criar uma fila?
	//	-tem um inicio,fim,tamanho e um lugar para guardar os elementos;
	//	-o que determina se a fila está vazia é se o inicio é maior que o fim;
	
	
	private Object item[];
	private int maxTamanho;
	private int inicio;
	private int fim;
	
	
//------Criando uma fila vazia-------------
	public FilaObject() {
        this.maxTamanho = 10;
        this.item = new Object[this.maxTamanho];	
        this.inicio = 0;
        this.fim = -1;
	}
	
	public FilaObject(int maxTamanho) { 
        this.maxTamanho = maxTamanho;
        this.item = new Object[maxTamanho];
        this.inicio = 0;
        this.fim = -1;
    }
//------------------------------------------
    public int tamanho() {
    	return maxTamanho;
    }
	
//----Adicionando elementos na Fila---------
	public Object inserir(Object novo) {
        if (((this.fim + 1) == this.maxTamanho))
        {
            return null;
        }
        this.fim = this.fim + 1;
        this.item[this.fim] = novo;
        return novo;
    }
//---------------------------------------------
	
//-----Retirando elemento da Fila-------------
	   public Object retirar() {
	        if (vazio()) 
	        {
	            return null;
	        }
	        Object x = this.item[this.inicio];
	        this.item[this.inicio] = null;
	        this.inicio = this.inicio + 1;
	        return x;
	    }

//----------Mostrando a fila------------------------------------------
	public void mostrarFila() {
		for (int i = 0; i < tamanho(); i++) {
		    System.out.println("Elemento " + (i+1) + ": " + this.item[i]);
		}
	}

//---------------------------------------------------------------------	

//----Verificando se a fila está vazia---------------------
    public boolean vazio() {
        return (this.inicio>this.fim);
    }
    
    
//------Gambiarra pra resetar o inico e o fim kk-------------------------
    public void resetFila() {
    	if(vazio()) {
	    	this.inicio = 0;
	        this.fim = -1;
    	}
    }
	
	
	
}
