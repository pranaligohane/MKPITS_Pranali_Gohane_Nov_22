import java.lang.StringBuffer;
public class one_one1{

//reverse
public static void main(String[] args){
char ch [] = {'p','r','a'};

StringBuffer sb=new StringBuffer("Pranali");
System.out.println(sb);

sb.reverse();
System.out.println(sb);

//append a character
sb.append('$');
System.out.println(sb);

//append a character array
sb.append(ch);
System.out.println(sb);

//inserting char at specific location
sb.insert(5,'*');
System.out.println(sb);

//using delete
sb.delete(2,5);
System.out.println(sb);
}
}





