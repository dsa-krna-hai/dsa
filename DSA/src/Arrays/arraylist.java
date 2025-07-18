package Arrays;
import java.util.ArrayList;
public class arraylist {
    public static void main (String[] args){
        ArrayList <String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println(languages);
        String str = languages.get(1);
        System.out.println(str);

        languages.set(1,"C++");
        System.out.println(languages);

        languages.remove(2);
        System.out.println(languages);

    }
}
