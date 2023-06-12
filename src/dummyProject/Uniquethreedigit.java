package dummyProject;

public class Uniquethreedigit {

	public static void main(String[] args) {
		int times = 0;
		for(int i = 1; i <=4;i++) {
			for(int j =1; j <=4;j++) {
				for(int k =1; k <=4;k++) {
					if(k != i && k != j && i != j) {
						times++;
						System.out.println(i +""+j +""+k);
						
					}
				}
			}
			
		}
		System.out.println("Unique three digit numbers using 1,2,3,4 count is " + times );
	}

}
