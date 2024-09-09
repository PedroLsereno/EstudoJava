package biblioteca;

public class PilhaObject {
//	Conceito de Pilha
	//	-Pilha é um tipo abistrado de dado
	//	
	//	Funcionamento de uma Pilha
	//	-Conforme vou adicionando valores, o meu último valor adicionado fica no topo,
	//	já o primeiro fica embaixo.
	//	-Ao tirar um valor, vou remover do topo
	//	
	//	O que pensar quando for criar uma fila?
	//	-tem o topo,tamanho e um lugar para guardar os elementos;
	//	-o que determina se a pilha está vazia é se o topo é negativo;
	private Object item[];
    private int topo;
    private int maxTamanho;
    
    
//-----Criando uma Pilha vazia-----------
    public PilhaObject() {        
        this.maxTamanho = 10;
        this.item = new Object[10];
        this.topo = -1;
    }

    public PilhaObject(int maxTamanho) { 
        this.maxTamanho = maxTamanho;
        this.item = new Object[maxTamanho];
        this.topo = -1; 
    }
//--------------------------------------
    public int tamanho() {
    	return maxTamanho;
    }
    
//-----Empilhando elementos-------------
    public Object empilhar(Object novo) {
        if (this.topo == this.maxTamanho - 1)
        {
            return null;
        }
        this.topo = this.topo + 1;
        this.item[this.topo] = novo;
        return novo;
    }
//---------------------------------------

//--------Pegando o elemento do Topo---------- 
//Busca o elemento do topo, porém não retira
    public Object elementoTopo() {
        if (this.vazio()) 
        {
            return null;
        }
        	return this.item[this.topo];
    }
//--------------------------------------------

//-------Tirando o elemento do topo da pilha---
    public Object desempilhar() {
        if (this.vazio())
        {
            return null;
        }
        Object x = this.item[topo];
        this.item[this.topo] = null;
        topo--;
        return x;
    }    
//-----------------------------------------------
    
//---Verificando se a pilha está vazia--------
//retorna true se a Pilha estiver vazia
    public boolean vazio() {
        return (this.topo == -1);
    }
//---------------------------------------------   
	public void mostrarPilha() {
		System.out.println("Mostrando a Pilha");
		for (int i = 0; i < 10; i++) {
			System.out.println("Elemento " + (i+1) + ": " +item[i] );
		}
	}
}
