package equals_method;

public class Tree {
String name;
String color;

public Tree(String name,String color){
	
	this.name=name;
	this.color=color;	
}

public boolean equals(Object obj) {
	if(obj instanceof Tree) {
		
		Tree tree=(Tree)obj;
		
		if(this.name.equals(tree.name)){
			if(this.color.equals(tree.color)) {
				return true;
			}
		
		
		else {
			return false;
		}
		
		}
	
		else {
		             return false;
	}
	}
	else {
		
		return false;
	}
}
}
