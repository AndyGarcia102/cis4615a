public void deleteFile(){
	File someFile = new File ("someFileName.txt");
    // Do something with someFile 
    someFile.delete();
}
//Correct the code as shown in theCompliant Solution below:
public void deleteFile(){
    File someFile = new File ("someFileName.txt");
    // Do something with someFile
    if (!someFile.delete()) {
        // Handle failure to delete	the	file
    }
}
