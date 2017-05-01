package aspects;

import figures.*;

public aspect ShapeHierarchy {
	
	declare parents: Point extends Shape;
    declare parents: Line extends Shape;

}
