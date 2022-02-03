package session1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.Scanner;

public class EmailSearch {

	void searchemail() {
		String array[]= {"pocheshd@gmail.com","devupochesh@gmail.com","pocheshdevu@gmail.com","dev@gmail.com"};
		
		
		Scanner sc = new Scanner(System.in);
		
		List<String> nameList = new ArrayList<>(Arrays.asList(array));
		
		System.out.println("Enter an email:");
		String s = sc.next();
		
		
		
		System.out.println("mail found:"+nameList.contains(s));
		
	}
	public static void main(String[] args) {
		EmailSearch obj = new EmailSearch();
		obj.searchemail();
		
	}	
		
}		
				
	


