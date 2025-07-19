import java.util.StringBuilder;
public class StringPgm{
    public static void main(String[] args) {
        String name="value";
        String firstName="Shruti";
        String lastName="Jalkote";
        String fullName=firstName+" "+lastName;
        System.out.println("Name: "+fullName);
        System.out.println(fullName.length());

        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        String name1="abc";
        String name2="xyz";
        if((name1).compareTo(name2)==0){
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }

        String name3="abcdefghijkl";
        String name4=name3.substring(2, 7);
        System.out.println("Substring: "+name4);

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb.charAt(2));
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.append("Shruti");
        System.out.println(sb);

        StringBuilder str = new StringBuilder("Hello");
        for (int i=0; i<str.length()/2; i++) 
        {
            int front = i;
            int back = str.length()-i-1;
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);
            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }   
        System.out.println("Reversed String: " + str);

     }
}