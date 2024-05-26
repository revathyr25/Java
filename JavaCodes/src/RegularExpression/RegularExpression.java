package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("hai");
        Matcher matcher= pattern.matcher("hai");
        Boolean t=matcher.find();
        System.out.println(t);

        //instead of number 0-9 we can use \\d, its actually \d but we are writing inside "" so \\d
        pattern=Pattern.compile("hello \\d\\d\\d");
        matcher= pattern.matcher("hello 123");
        t=matcher.find();
        System.out.println(t);

        //instead of writing \\d multiple times we can write like
        pattern=Pattern.compile("hello \\d{3}");
        matcher= pattern.matcher("hello 123");
        t=matcher.find();
        System.out.println(t);

        //instead of writing \\d multiple times we can write like
        pattern=Pattern.compile("a{5}");
        matcher= pattern.matcher("aaaaaa");
        t=matcher.matches();
        System.out.println(t);

        String s="hi#this i&;)+s12%'";
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

        //replacing 3 a's with a single a
        s="bdiaaamnsaaajkj";
        str = s.replaceAll("a{3}", "a");
        System.out.println(str);

        //replacing 3 or more a's with a single a
        s="bdiaaaaaamnsaaajkj";
        str = s.replaceAll("a{3,}", "a");
        System.out.println(str);
    }
}
