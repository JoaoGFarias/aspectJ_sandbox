package aspects;

public aspect Tracing {
	
//	pointcut change(): (call(* *(..)) || execution(* *(..)))
//	                      && !within(Tracing);
	
	pointcut change(): execution(* *(..));
	
	before(): change() {
		System.out.println("Entering: "+thisJoinPoint);
	}
	
	after(): change() {
		System.out.println("Exit: "+thisJoinPoint);
	}
}
