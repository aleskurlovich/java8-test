package test.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test {@link ListSorter}.
 * @author aleskurlovich
 *
 */
@RunWith(Parameterized.class)
public class ListSorterTest {
	
	/**
	 * Input list.
	 */
	private List<Integer> unsorted;
	
	/**
	 * Sorted list.
	 */
	private List<Integer> sorted;
	
	/**
	 * Constructor.
	 * @param aUnsorted unsorted array
	 * @param aSorted sorted array
	 */
	public ListSorterTest(Integer[] aUnsorted, Integer[] aSorted) {
		unsorted = Arrays.asList(aUnsorted);
		sorted = Arrays.asList(aSorted);
	}
	
	/**
	 * Test of {@link ListSorter#sort(List)}.
	 */
	@Test
	public void sortTest() {
		Assert.assertEquals(sorted, new ListSorter().sort(unsorted));
	}
	
	/**
	 * Generates test data.
	 * @return test data
	 */
	@Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][] {
    			{new Integer[]{3, 2, 1}, new Integer[]{1, 2, 3}},
    			{new Integer[]{null, 3, 2}, new Integer[]{2, 3, null}},
    			{new Integer[]{null, null, null}, new Integer[]{null, null, null}}
    	});
    }

}