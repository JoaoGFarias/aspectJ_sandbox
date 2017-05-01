
package figures;

public class Display {
	
	private static Display instance; // atributo do tipo da classe
	
	private Display(){} // construtor private!
	
	public static Display getInstance(){
		if(instance == null){
			instance = new Display();
		}
		return instance;
	}
    
    public void update(Shape s) {
    	System.out.println("Figure "+s+" updated!!");
    }
}
    
