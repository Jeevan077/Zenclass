package javabasics.Zenclass;

public class ArrayClass {

	public static void main(String[] args) {
		String[] flowers = {"Rose" , "Jasmine" , "Lotus"};
		int[] num= {1,2,3,4};
		System.out.println(num.length);
		System.out.println(flowers[1]);
		
		//Finding out length of the array
		
		int l =flowers.length;
		for(int i=0;i<l;i++)
		{
        System.out.println(flowers[i]);			
		}
		
		//Swapping the array
	   flowers[1]="Zendu";
	   System.out.println("New array");
	   for(int i=0;i<3;i++)
	   {
		   System.out.println(flowers[i]);
	   }
		
	}

}
