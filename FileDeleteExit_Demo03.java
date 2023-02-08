import java.io.*;

public class FileDeleteExit_Demo03{
public static void main(String[] args){

File f=new File("C:\\Users\\gohan\\OneDrive\\Desktop\\JAVA\\.txt");
try{

f.deleteOnExit();
} catch (Exception e){
throw new RuntimeException(e);

}
}
}

