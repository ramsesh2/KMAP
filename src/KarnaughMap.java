import java.util.*;

public class KarnaughMap {
	Map<Integer, Boolean> map;	//map storing term and corresponding truth value
	int size;
	
	KarnaughMap(int s){	//initializes a map with all values false
		size = s;
		map = new HashMap<Integer, Boolean>();
		for(int i = 0; i < s; i++){
			map.put(i, false);
		}
	}
	
	/**
	 * basic setter
	 * @param term index to add true value
	 */
	public void addMinTerm(int term){	//add a true value
		map.put(term, true);
	}
	
	/**
	 * sets a maxterm
	 * @param term index to set false
	 */
	public void addMaxTerm(int term){
		map.put(term, false);
	}
	/**
	 * gets truth value
	 * @param term index to get
	 * @return value at index
	 */
	public boolean get(int term){	
		return map.get(term);
	}
}
