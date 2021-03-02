import java.util.Scanner;
public class divcoq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int item;
		System.out.println("find number: ");
		item = s.nextInt();
		divcoq d1 = new divcoq(item);
	}
	public divcoq(int item) 
	{
		int[] array = {1,2,9,10,100,525,735};
 		int l = 0;
		int h = array.length-1;
		int foundAt=-1;

		
		while (foundAt<0 && l<h ) 
		{
			int midpoint = h+l/2;
			if (array[midpoint]==item) 
			{
				foundAt = midpoint;
			}
			else if (array[midpoint]<item) 
			{
				l = midpoint +1;
			}
			else if (array[midpoint]>item) 
			{
				h = midpoint - 1;
			}
		}
		if (foundAt >= 0) 
		{
			System.out.println("found at: "+foundAt);
		}
		else 
		{
			System.out.println("can't");
		}
		
	}

}
// midpoint = h +l || 2
// Llimit = 0
// Hlimit = 7

// foundAt = -1
// array = [1,2,9,10,100,525,735]
// item = USERINPUT

// while Llimit < Hlimit and foundAt < 0
	// if array[midpoint] = item
		// foundAt = midpoint
	// if array[midpoint] < item
		// Llimit = midpoint + 1
	// if array[midpoint] > item
		// Hlimit = midpoint - 1
	// midpoint = Hlimit + Llimit || 2
	// if min > max
		// OUTPUT item not present
		// foundAt = 0
	// else 
		// OUTPUT item + found at + foundAt