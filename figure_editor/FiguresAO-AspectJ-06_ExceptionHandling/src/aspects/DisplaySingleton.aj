package aspects;

import figures.*;

public aspect DisplaySingleton {
	
	declare warning: call(public static Display Display.getInstance()) 
	&& !within(DisplaySingleton): "nao pode chamar esse metodo diretamente";
	
	private static Display Display.instance; // atributo do tipo da classe
	
	public static Display Display.getInstance(){
		if(instance == null){
			instance = new Display();
		}
		return instance;
	}
	
	Display around(): call(Display.new()) && !within(DisplaySingleton){
		return Display.getInstance();
	}

}
