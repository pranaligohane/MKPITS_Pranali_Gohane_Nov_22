import java.io.*;

public class FileCanonical_Demo06{
public static void main(String[] args){

File f=new File("C:\\Users\\gohan\\OneDrive\\Desktop\\JAVA\\.txt");
try{

System.out.println(f.getCanonicalPath());
}catch(Exception e){
throw new RuntimeException(e);

}
}
}


