public class Arbol {
	int dato;
	Arbol izq,der;
	public Arbol(){
		this.dato=0;
		this.izq=null;
		this.der=null;
	}
	public boolean isEmpty(){
		if((this.dato==0) && (this.izq==null) &&(this.der==null)){
			return true;
		}
		return false;
	}
	public void Insert(int dato){
		if(this.isEmpty()){
			this.dato=dato;
			this.izq=new Arbol();
			this.der= new Arbol();
		}else{
			if (dato<this.dato){
				this.izq.Insert(dato);
				
			}else{
				this.der.Insert(dato);
			}
		}
	}
	public void PreOrder(Arbol raiz){
		if(!raiz.isEmpty()){
			System.out.print(raiz.dato + ";");
			PreOrder(raiz.izq);
			PreOrder(raiz.der);
		}
	}
	public void InOrder(Arbol raiz){
		if(!raiz.isEmpty()){
			InOrder(raiz.izq);
			System.out.print(raiz.dato + ";");
			InOrder(raiz.der);
			
		}
	}
	public void PosOrder(Arbol raiz){
		if(!raiz.isEmpty()){
			PosOrder(raiz.der);
			PosOrder(raiz.izq);
			System.out.print(raiz.dato + ";");
			
		}
	}
	public boolean hasElement(int valor){
		
		if (!this.isEmpty()){
			
			if (this.dato==valor){
				return true;
			}else 
			{if(this.dato<valor)
				 return this.der.hasElement(valor);
			 if(this.dato>valor){
				 return this.izq.hasElement(valor);
				 }
			 }
		}
		
		return false;
		
	}
}
