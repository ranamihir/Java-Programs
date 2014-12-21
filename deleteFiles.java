import java.io.*;
import java.util.*;

class Files{
	File f = new File("E:/");
	File[] arr = f.listFiles();
	int l = arr.length;
	String extension;
	
	void assignExtension(String ext)
	{
		extension = ext;
	}
	
	void deleteFiles(){
		for(int i = 0; i < l; i++)
		{
			String name = arr[i].getName();
			
			if(name.endsWith(extension))
				arr[i].delete();
		}
	}
}
			
			
			
public class deleteDocs{
	public static void main(String[] args) throws IOException{
		System.out.println("Enter extension of file which is to be deleted along with dot character: ");
		Scanner sc = new Scanner(System.in);
		String ext = sc.nextLine();
		
		Files f = new Files();
		f.assignExtension(ext);
		f.deleteFiles();

		System.out.println("The files with " + ext + " extension have been deleted.");
	}
}