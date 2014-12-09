
import java.util.*;

public class array {

	private final int[] array;
	private int writeIndex = 0;
	private final static Random random = new Random();

	public SimpleArray(int size){
		array = new int[size];
	}
	public void add( int value )
	{
		int position = writeIndex;

		try{
			Thread.sleep(random.nextInt(500));
		}catch ( InterruptedException ex)
		{
			ex.printStackTrace();
		}

		array[position] = value;
		System.out.printf( "%s wrote %2d to element %d.\n",
				Thread.currentThread().getName(),value,position);
		
		++writeIndex;
		System.out.printf( "Next write index: %d\n", writeIndex ); 
	}
	public String toString()
	{
		String arrayString = "\nContents of Array:\n"; 
		for ( int i = 0; i < array.length; i++ )
			 arrayString += array[ i ] + " "; 
		return arrayString; 
	}
}
