import java.util.*;

public class Equation {
	Map expressions;
	
	public Equation(){
		expressions = new HashMap<Integer, HashSet<Group>>();
	}
	
	public void formPrimeImplicants(KarnaughMap kmap){
		/********************************************************************
		 * This Part of this function gets all terms that are 1 in the map and creates a set with just 1 group consisting on that term. 
		 * Adds the key (term) value (set) to the expressions map
		 */
		for(int i = 0; i < kmap.size; i++){
			Set g = new HashSet<Group>();
			if(kmap.get(i)){
				g.add(new Group(i));
				expressions.put(i, g);
			}
		}
	}
}
