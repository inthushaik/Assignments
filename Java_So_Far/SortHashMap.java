
import java.util.*;

class SortHashMap	{

	public static void main(String[] args) {

		HashMap hMap = new HashMap();

		hMap.put("Prabhat", 100);

		hMap.put("Aryan", 150);

		hMap.put("Ravi", 312);

		hMap.put("Amit", 142);

		List aList = SortHashMap.getValues(hMap);

		Iterator iter = aList.iterator();

		while (iter.hasNext())	System.out.println("value: " + iter.next());

	}
	public static List getValues(HashMap hMap)	{

		Set set = hMap.entrySet();

		ArrayList list = new ArrayList();

		for(Object obj: set)	{

			Map.Entry mapEntry = (Map.Entry)obj;

			list.add(mapEntry.getValue());

		}
		Collections.sort(list);

		return list;

	}

}