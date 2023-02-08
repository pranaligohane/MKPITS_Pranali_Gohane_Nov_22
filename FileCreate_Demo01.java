import java.io.*;

public class FileCreate_Demo01{
public static void main(String[] args){

File f=new File("C:\\Users\\gohan\\OneDrive\\Desktop\\JAVA\\.txt");
try{

f.createNewFile();
} catch (IOException e){
throw new RuntimeException(e);

}
}
}
