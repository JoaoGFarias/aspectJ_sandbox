package aspects;

import figures.*;

public aspect DisplayUpdating2 {
	
	pointcut change(): call(public void Shape+.set*(*)) ||
	                   call(public void Shape.moveBy(int, int));
	
	// cflowbelow is used in the getting started with AspectJ paper
	after(): change() && !cflowbelow(change()) {
		System.out.println("***************************************************");
		System.out.println("signature: "+thisJoinPointStaticPart.getSignature());
		System.out.println("join point: "+thisJoinPoint);
		System.out.println("where: "+thisJoinPointStaticPart.getSourceLocation());
		Display.update();
		System.out.println("***************************************************");
	}
}
