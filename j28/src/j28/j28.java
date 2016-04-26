package j28;

import java.util.ArrayList;
import java.util.Iterator;

public class j28 {
	
	public static void main(String args[]){
	
		ArrayList<String> arr = new ArrayList<>();
		arr.add(0,"Tushar");
		arr.add(1,"Saumya");
		arr.add(2,"Shikha");
		
		Iterator s = arr.iterator();
		while(s.hasNext()){
		System.out.println(s.next());
		}
	}
	
	

}
