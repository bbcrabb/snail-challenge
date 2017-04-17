package snail_algorithm_challenge;

public class AlgorithmChallengePuzzle
{
	public static void main(String args[])
	{
		//int [][] test1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }};
		//int[ ][ ] test1 = { { 1, 2 }, { 3, 4 } };
		int [][] test1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }};
		snailArray( test1 );
	}

	public static void snailArray(int[ ][ ] input)
	{
		int arraySize = input.length;
		if( arraySize == 1 )
		{
			System.out.println( input[ 0 ][ 0 ] );
			return;
		}
		if( arraySize == 2 )
		{
			System.out.print( input[ 0 ][ 0 ] );
			System.out.print( input[ 0 ][ 1 ] );
			System.out.print( input[ 1 ][ 1 ] );
			System.out.print( input[ 1 ][ 0 ] );
			return;

		} else
		{
			for ( int i = 0; i < arraySize; i++ )
			{
				System.out.print( input[ 0 ][ i ] );
			}
			for ( int i = 1; i < arraySize; i++ )
			{
				System.out.print( input[ i ][ arraySize - 1 ] );
			}
			for ( int i = ( arraySize - 2 ); i >= 0; i-- )
			{
				System.out.print( input[ arraySize - 1 ][ i ] );
			}
			for ( int i = arraySize - 2; i >= 1; i-- )
			{
				System.out.print( input[ i ][ 0 ] );
			}

			int[ ][ ] newArray = new int[ arraySize - 2 ][ arraySize - 2 ];

			for ( int m = 1; m < arraySize - 1; m++ )
			{
				for ( int n = 1; n < arraySize - 1; n++ )
				{
					newArray[ m - 1 ][ n - 1 ] = input[ m ][ n ];
				}
			}

			snailArray( newArray );
		}
	}
}
