import java.io.*;

public class FileExists_Demo04{
public static void main(String[] args){

File f=new File("C:\\Users\\gohan\\OneDrive\\Desktop\\JAVA\\.txt");
try{

System.out.println(f.exists());
}catch(Exception e){
throw new RuntimeException(e);

}
}
}

