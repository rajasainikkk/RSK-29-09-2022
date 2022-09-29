package com.collection.bll;

import java.util.Arrays;
import java.util.LinkedList;

public class Languages {
	public static void main(String args []) {
				
				LinkedList<String> languages = new LinkedList<String>();
				
				languages.add("C ");
				languages.add("C++ ");
				languages.add("Java ");
				languages.add("Kotlin ");
				languages.add("Python ");
				languages.add("Perl ");
				languages.add("Rubi ");

				System.out.println("Display all elements");
				for(String language :languages) {
					System.out.println(language);
				}
						
				languages.remove(5);
				System.out.println("=============================================");
				System.out.println(" remove index 5");
				for(String language :languages)
					System.out.println(language);
			
				languages.remove("Kotlin");
				System.out.println("================================================");
				System.out.println(" remove kotlin element :");
				for(String language :languages)
					System.out.println(language);

				LinkedList<String> scripting_languages = new LinkedList<> (Arrays.asList("Python","Rubi","Perl"));
				
				languages.removeAll(scripting_languages);
				
				System.out.println("=========================================");
				System.out.println(" remove all "
								+ "the scripting languages (Python, Ruby, Perl) :");
				for(String language :languages)
					System.out.println(language);
				
				//Remove all elements
				languages.removeAll(languages);
				System.out.println("=================================================");
				System.out.println(" remove all elements :");
				for(String language :languages)
					System.out.println(language);
				
			}

		

	}



