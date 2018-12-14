import java.util.HashMap;
import java.util.List;

public class main {
	
		public static Operator Addition = new Operator();
		public static Operator Subtraction = new Operator();
		public static Operator Multplication = new Operator();
		public static Operator Division = new Operator();
		public static Operator Modulo = new Operator();
		public static Operator Dereference = new Operator();
		public static Operator LessThan = new Operator();
		public static Operator GreaterThan = new Operator();
		public static Operator EqualsTo = new Operator();
		public static Operator LessThanOrEqual = new Operator();
		public static Operator GreaterThanOrEQual = new Operator();
		
		
		
		public static void initializeOperators() {
		Addition.setName("+");
		Subtraction.setName("-");
		Multplication.setName("*");
		Division.setName("/");
		Modulo.setName("%");
		Dereference.setName("[]");
		LessThan.setName("<");
		GreaterThan.setName(">");
		EqualsTo.setName("==");
		LessThanOrEqual.setName("<=");		
		GreaterThanOrEQual.setName(">=");
		}
		
		public static HashMap<PairOfTypes, List<Operator>> OperatorMatrix;
		
		public static void initializeMatrix() {
			PairOfTypes pair=new PairOfTypes(Type.Index, Type.Index);
			List<Operator> list = null;
			list.add(Addition);
			list.add(Subtraction);
			list.add(Multplication);
			list.add(Division);
			list.add(Modulo);
			list.add(EqualsTo);
			list.add(GreaterThan);
			list.add(LessThan);
			list.add(GreaterThanOrEQual);
			list.add(LessThanOrEqual);
			OperatorMatrix.put(pair, list);
			
			
			
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		List<Variable> VariableList;
		initializeOperators();
 		
 		
 		
 		
 		
	}

}
