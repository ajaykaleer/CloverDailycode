package stream;

import java.util.List;

public class StreamBasic {
	
	
	
	
	
	List<Integer> newList = list1.stream()filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(newList);

}
