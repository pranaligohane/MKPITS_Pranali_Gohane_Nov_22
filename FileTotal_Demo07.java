import java.io.*;

public class FileTotal_Demo07{
public static void main(String[] args){

File f=new File("C:\\Users\\gohan\\OneDrive\\Desktop\\JAVA\\.txt");
try{

System.out.println(f.getTotalSpace());
}catch(Exception e){
throw new RuntimeException(e);

}
}
}
