package sort.mysort;

public class SortTest {

	public static void main(String[] args) {
		
		int[] numList = {5, 21, 14, 3, 31, 8, 27, 15};
		
		// Sort sort = new InsertionSort();
		Sort sort = new SelectionSort();
		sort.setData(numList);
		sort.sort();
		System.out.println(sort.getOrgData());
		System.out.println(sort.getSortedData());

	}

}
