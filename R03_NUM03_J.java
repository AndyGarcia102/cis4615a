public static int getInteger(DataInputStream is ) throws IOException {
	return is.readInt();
}

//Correct the code as shown in theCompliant Solution below:

public static long getInteger (DataInputStream	is ) throws IOException {
	return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one−bits
}
