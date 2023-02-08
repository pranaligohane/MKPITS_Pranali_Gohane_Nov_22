import java.io.*;

public class FileDelete_Demo02{
public static void main(String[] args){

File f=new File("C:\\Users\\gohan\\OneDrive\\Desktop\\JAVA\\.txt");
try{

f.delete();
} catch (Exception e){
throw new RuntimeException(e);

}
}
}

