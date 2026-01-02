package Selenium;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStream_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list = Arrays.asList("Abhishek","virat","Ananda","don","abhilasha");
		
		//getting count of string starting with A
		long num = list.stream().filter(s->s.startsWith("A")).count();
		System.out.println(num);
		
		//getting string having char>4
		list.stream().filter(e->e.length()>4).forEach(e->System.out.println(e));
		
		//To print string ending with A and coverting to U case
		list.stream().filter(u->u.endsWith("a")).map(u->u.toUpperCase()).forEach(e->System.out.println(e));
		
		//print first letter with a and sort and turn to uppercase.
		list.stream().filter(f->f.startsWith("a")).sorted().map(f->f.toUpperCase()).forEach(f->System.out.println(f));
		
		//to concat both list 
		
		List<String> list2 = Arrays.asList("adam","kane","starck");
		
		Stream<String> addedStream = Stream.concat(list.stream(), list2.stream());
		boolean flag = addedStream.anyMatch(m->m.equalsIgnoreCase("adam"));
		
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
		//collect-to collect all values in form of list
		List<String> li = list.stream().filter(l->l.length()>3).map(l->l.toUpperCase()).collect(Collectors.toList());
		System.out.println(li);
		
		//to get unique number
		
		List<Integer> num1 = Arrays.asList(2,2,3,4,5,5,6,7);
		
		List<Integer> numList = num1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(numList);
		

	}

}
