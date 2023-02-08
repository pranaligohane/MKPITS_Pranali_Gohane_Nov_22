import java.io.*;

public class FileUsable_Demo08{
public static void main(String[] args){

File f=new File("C:\\Users\\gohan\\OneDrive\\Desktop\\JAVA\\.txt");
try{

System.out.println(f.getUsableSpace());
}catch(Exception e){
throw new RuntimeException(e);

}
}
}

