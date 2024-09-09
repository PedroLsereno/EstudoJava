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
	private int elementosTotais;
	
	
//------Criando uma fila vazia-------------
	public FilaObject() {
        this.maxTamanho = 10;
        this.item = new Object[this.maxTamanho];	
        this.inicio = 0;
        this.fim = -1;
        this.elementosTotais = 0;
	}
	
	public FilaObject(int maxTamanho) { 
        this.maxTamanho = maxTamanho;
        this.item = new Object[maxTamanho];
        this.inicio = 0;
        this.fim = -1;
        this.elementosTotais = 0;
    }
//------------------------------------------
    public int tamanho() {
    	return maxTamanho;
    }
	
//----Adicionando elementos na Fila---------
	public Object inserir(Object novo) {
        if (cheio())
        {
            return null;
        }
        
        this.fim = this.fim + 1;
        elementosTotais++;
        
        if (this.fim == this.elementosTotais) {
        	this.fim = 0;
        }
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
	        this.inicio = this.fim + 1;
	        this.item[this.inicio] = null;
	        
	        if(this.inicio == this.fim) {
	        	this.inicio = 0;
	        }
	        elementosTotais--;
	        return x;
	    }

//----------Mostrando a fila------------------------------------------
	public void mostrarFila() {
		int cont = 0;
		int i = this.inicio;
		while (cont < elementosTotais) {
			System.out.println("Elemento " + (cont + 1) + ": " + item[i]);
			i = (i + 1) % maxTamanho;
			cont++;
		}
	}

//---------------------------------------------------------------------	

//----Verificando se a fila está vazia---------------------
    public boolean vazio() {
        return (elementosTotais == 0);
    }

//-----Verificando se a fila está cheia--------------------------------
    public boolean cheio() {
    	return (elementosTotais == maxTamanho);
    }
    
//------Gambiarra pra resetar o inico e o fim kk-------------------------
    public void resetFila() {
	    	this.inicio = 0;
	        this.fim = -1;
	        this.elementosTotais = 0;
    }	
}
