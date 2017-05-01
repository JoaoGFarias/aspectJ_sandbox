package aspects;

import figures.*;

public privileged aspect DisplaySingleton {
	
//	declare warning: call(public static Display Display.getInstance()) 
//	&& !within(DisplaySingleton): "nao deveria chamar esse metodo diretamente";
	
	private static Display Display.instance; // atributo do tipo da classe
	
	private static Display Display.getInstance(){
		if(instance == null){
			instance = new Display();
		}
		return instance;
	}
	
	Display around(): call(Display.new()) && !within(DisplaySingleton){
		return Display.getInstance();
	}

}
