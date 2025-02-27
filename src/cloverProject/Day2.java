package cloverProject;

import java.util.stream.Collectors;

public class Day2 {
    public static void main(String[] args) {
        String st = "programming";
        System.out.println(
                st.chars()
                .mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(i->i,Collectors.counting()))
        		  );


     
            

	

    }
}
