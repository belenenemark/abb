public class principal {

	public static void main(String[] args) {
		System.out.println(" Arbol Binario de Busqueda");
		Arbol a = new Arbol();
		a.Insert(8);
		a.Insert(4);
		a.Insert(2);
		a.Insert(9);
		System.out.println("PreOrder");
		a.PreOrder(a);
		System.out.println();
		System.out.println("InOrder");
		a.InOrder(a);
		System.out.println();
		System.out.println("PosOrder");
		a.PosOrder(a);
		
		System.out.println();
		System.out.println("esta el elemento?");
		System.out.println(a.hasElement(2));
		
		
		

	}
	

}
