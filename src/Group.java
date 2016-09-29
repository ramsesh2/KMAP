
import java.util.*;

public class Group {
	Set grouping;
	
	public Group() {
		grouping = new HashSet<Integer>();
	}
	
	public Group(int term) {
		grouping = new HashSet<>();
		grouping.add(term);
	}
	
	public void addToGroup(int term){
		grouping.add(term);
	}
}
