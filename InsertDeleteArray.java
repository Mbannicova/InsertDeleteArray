
public class InsertDeleteArray {

	public static void main(String[] args) {
		 
		int[] data = {10,20,30,40,50};
		
		int indexToDelete = 2;
		
		int[] newData = new int[data.length - 1];
		
		for(int oi = 0, ci = 0; oi < data.length; oi++ )
	    {
	        if( oi != indexToDelete ){
	            newData[ ci++ ] = data[ oi ];
	        }
	    }
		
		data = newData;
		
		for( int i : data) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int newValue = -10;
		
		int indexToInsert = 2;
		
		int[] newData2 = new int[data.length + 1];
		
		for(int oi = 0, ci = 0; oi < data.length; oi++ )
	    {
			
	        newData2[ ci++ ] = data[ oi ];
	        
			if(oi == indexToInsert){
	        	
	        newData2[ci] = newValue ;}
	        
	         	        
	    }
		
		data = newData2;
		
		
		for( int i : data) {
			System.out.println(i);
		}
		
		

	}

}
