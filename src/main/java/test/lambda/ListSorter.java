package test.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Performs list sorting.
 * @author aleskurlovich
 *
 */
public class ListSorter {
	
	/**
	 * Sorts list.
	 * @param list list
	 */
	public <T extends Comparable<T>> List<T> sort(List<T> list) {
		List<T> copy = new ArrayList<T>(list);
		Collections.sort(copy, (obj1, obj2) ->  {
									if (obj1 != null 
											&& obj2 != null)  {
										return obj1.compareTo(obj2);
									}
									else if (obj1 == null) {
										return 1;
									} else {
										return -1;
									}
								});
		return copy;
	}

}
