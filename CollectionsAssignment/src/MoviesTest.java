import java.time.LocalDate;
import java.util.*;


class sortByLang implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return o1.getLang().compareTo(o1.getLang());
	}
	
}


public class MoviesTest {
	public static void main(String[] args) {
		
		ArrayList<Movies> list = new ArrayList<>();
		list.add(new Movies("sajdhb","dSDG", LocalDate.of(2020, 12, 10),"tesg","DGFGZ",123));
		list.add(new Movies("fdhzfd","hgD", LocalDate.of(2000, 12, 10),"ehjwgy","hgef",123));
		list.add(new Movies("ghjcgyj","ireuz", LocalDate.of(2010, 12, 10),"rhR","rhf",123));
		Collections.sort(list);	//Sort By directors
		System.out.println("Sort By directors: ");
		for (Movies movies : list) {
			System.out.println(movies.getDirector());
		}
		Collections.sort(list, new sortByLang()); //Sort by language
		System.out.println("Sort by language");
		for (Movies movies : list) {
			System.out.println(movies.getLang());
		}
		
	}

}
