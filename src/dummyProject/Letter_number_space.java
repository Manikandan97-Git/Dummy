package dummyProject;

public class Letter_number_space {
	public static void main (String [] args) {
	String name = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
	method(name);
	 
	}
	 
	 public static void method(String x) {
		 char [] ch = x.toCharArray();
		 int space =0;
		 int letter =0;
		 int number =0;
		 int other =0;
	 
	for(int i = 0; i < x.length();i++) {
	   if(Character.isSpace(ch[i])) {
		   space++;
	   }else if (Character.isLetter(ch[i])) {
		   letter++;
	   }else if (Character.isDigit(ch[i])) {
		   number++;
	   }else {
		   other++;
	   }
	}
	
	System.out.println( "The String is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
	System.out.println("letter: " + letter);
	System.out.println("space: " + space);
	System.out.println("number: " + number);
	System.out.println("other: " + other);
	        //Another Method
	
	
	String words = "300 world champions titles 2023 ????????";
	char [] ch2 = words.toCharArray();
	int letters = 0;
	int spaces = 0;
	int numbers = 0;
	int others =0;

	for(int i=0; i < words.length();i++) {
		if(Character.isSpace(ch2[i])) {
			spaces++;
		}else if (Character.isDigit(ch2[i])) {
			numbers++;
		}else if(Character.isLetter(ch2[i])) {
			letters++;
		}else {
			others++;
		}
		
	}
	System.out.println("Sentence : " + words);
	System.out.println("Letter : " + letters);
	System.out.println("Space : " + spaces);
	System.out.println("Numbers : " + numbers);
	System.out.println("Others : " + others);

	
	
	
		}
	}

