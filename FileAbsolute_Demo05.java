import java.io.*;

public class FileAbsolute_Demo05{
public static void main(String[] args){

File f=new File("C:\\Users\\gohan\\OneDrive\\Desktop\\JAVA\\.txt");
try{

System.out.println(f.getAbsolutePath());
}catch(Exception e){
throw new RuntimeException(e);

}
}
}

