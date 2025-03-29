package exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
	public static void main(String[] args) {
		//create a file
		try {
			File myobj= new File("Task list.txt");
			if(myobj.createNewFile()) {
				System.out.println("File created: "+ myobj.getName());
				System.out.println("File created: "+ myobj.getAbsolutePath());
			}else {
				System.out.println("File already exist");
			}
		}catch(IOException e){
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		// write a file
		try {
			FileWriter mywriter=new FileWriter("filename.txt");
			mywriter.write("Files in java might be risky");
			mywriter.close();
			System.out.println("Successfully wrote to the file");
		}catch(IOException e) {
			System.out.println("an error occurred");
			e.printStackTrace();
		}
		
		//Read files
		try {
			File obj=new File("filename.txt");
			Scanner myreader = new Scanner(obj);
			while(myreader.hasNextLine()) {
				String data = myreader.nextLine();
				System.out.println(data);
			}
			myreader.close();
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		// GetFileInfo
		File obj=new File("filename.txt");
		if(obj.exists()) {
			System.out.println("File name: "+ obj.getName());
			System.out.println("Absolute path: "+ obj.getAbsolutePath());
			System.out.println("writeable: "+ obj.canWrite());
			System.out.println("Readable: "+ obj.canRead());
			System.out.println("File size in bytes: "+ obj.length());
		}else {
			System.out.println("The file does not exist.");
		}
		// delete files
		File myobj= new File("Task list.txt");
		if(myobj.delete()) {
			System.out.println("Deleted the folder: "+ myobj.getName());
		}else {
			System.out.println("Failed to delete the folder.");
		}
	}
}
