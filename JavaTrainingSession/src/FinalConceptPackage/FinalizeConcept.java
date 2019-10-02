package FinalConceptPackage;

public class FinalizeConcept {
	//finalize is a method()
	
	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		//here garbage collector will destroy these 2 objects from the memory
		/*inside the jvm, if there is no object reference is available immediately garbage collector will be called 
		 * or automatically it will be called and it will destroy all these objects to free some space memory*/
		
		System.gc(); //it willcall the garbage collector
		

	}

}
