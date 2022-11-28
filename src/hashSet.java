import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class hashSet 
{
	public static void main(String args[])
    {
        // HashSet will allow only one null value. if extra then it will ignore
		// Sorting is not possible in hashset.
		// It will not maintain any insertion order elements are inserted on the basis of their hashcode.
		// Duplicates are not allowed.
        HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(null);
		hs.add(null); 
		hs.add(5);
		hs.add(1);
		hs.add(4);
		hs.add(65);
		hs.add(3);
		hs.add(1);
		
		System.out.println("HashSet : "+hs);

//************************************************************************************************************
		
		// TreeSet will not allow any single null value if we add then it will throw an exception
		// It will sorted in manner
		// It will not maintain any insertion order
		// Duplicates are not allowed.
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(20);
		ts.add(5);
		ts.add(7);
		ts.add(7);
		NavigableSet<Integer> reverseNs = ts.descendingSet();
		System.out.println("TreeSet : "+reverseNs);	// If you want reverse then use NavigableSet Interface
		System.out.println("TreeSet : "+ts); // Original list
    }

}
