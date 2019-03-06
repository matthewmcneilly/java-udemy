public class PrimitiveDataTypes {
	public static void main(String[] args) {
		byte myMinByte = -128;
		byte myMaxByte = 127;
		
		short myMinShort = -32768;
		short myMaxShort = 32767;
		
		long myMinLong = -9223372036854775808L;
		long myMaxLong = 9223372036854775807L;
		
		
		int myMinValue = -2147483648;
		int myMaxValue = 2147483647;
		int myReadableValue = 2_147_483_647; //Underscore can be used to make literal values more readable 
		
		byte myByteValue = -128;
		byte byteTotal = (byte) (myByteValue/2); //Example of casting/converting data types 
		
		
		int myIntValue = 5/3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5d /3d;
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue); // Doubles are recommended for the extra precision
	}
}
