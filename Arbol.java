
public class Arbol {
	private Integer dato;
	private Arbol izq;
	private Arbol der;
	public Arbol(){
		dato=null;
		izq=null;
		der=null;
	}
	public boolean isEmpty(){
		if((this.dato==null) && (this.izq==null) &&(this.der==null)){
			return true;
		}
		return false;
	}
	public void Insert(Integer dato){
		if(this.dato==null){
			this.dato=dato;
			this.izq=new Arbol();
			this.der= new Arbol();
		}else{
			if (dato.compareTo(this.dato)<0){
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
	public boolean hasElement(Integer valor){
		
		if (!this.isEmpty()){
			
			if (this.dato.equals(valor)){
				return true;
			}else 
			{if(this.dato.compareTo(valor)<0)
				 return this.der.hasElement(valor);
			 if(this.dato.compareTo(valor)>0){
				 return this.izq.hasElement(valor);
				 }
			 }
		}
		
		return false;
		
	}
}
