

public class Operator {
	public String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getResult(Variable a, Variable b) {	//won't check for inappropriate input
		if(name.equals("+")){
			if(a.type.equals(Type.Int))return Type.Int;
			if(a.type.equals(Type.Index))return Type.Index;
		}
		else if(name.equals("-")) {
			if(a.type.equals(Type.Int))return Type.Int;
			if(a.type.equals(Type.Index))return Type.Index;
		}
		else if(name.equals("*")) {
			if(a.type.equals(Type.Int))return Type.Int;
			if(a.type.equals(Type.Index))return Type.Index;
		}
		else if(name.equals("/")) {
			if(a.type.equals(Type.Int))return Type.Int;
			if(a.type.equals(Type.Index))return Type.Index;
		}
		else if(name.equals("%")) {
			if(a.type.equals(Type.Int))return Type.Int;
			if(a.type.equals(Type.Index))return Type.Index;
		}
		else if(name.equals("[]")) {
			return Type.Int;
		}
		else if(name.equals("==")) {
			return Type.Bool;
		}
		else if(name.equals("<")) {
			return Type.Bool;
		}
		else if(name.equals(">")) {
			return Type.Bool;
		}
		else if(name.equals("<=")) {
			return Type.Bool;
		}
		else if(name.equals(">=")) {
			return Type.Bool;
		}
		return Type.unDefined;
	}
}
