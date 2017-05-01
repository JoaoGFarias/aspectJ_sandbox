
package figures;

import java.util.ArrayList;
import java.util.List;

public class Display implements Observer{
	
	private Subject subject;
	private List<Subject> subjects;
	
	public Display(Subject subject){
		this.subject = subject;
		this.subject.registerObserver(this);
	}
	
	public Display(){
		this.subjects = new ArrayList<>();
	}
	
	public void addSubject(Subject subject){
		subject.registerObserver(this);
		this.subjects.add(subject);
	}
    
    public void update(Shape s) {
    	System.out.println("Figure "+s+" updated!!");
    }

	@Override
	public void update(Object obs) {
		this.update((Shape)obs);
	}
}
    
