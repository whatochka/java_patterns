package pr1;

import java.util.Arrays;

public class Mirror implements Function {
    public String[] apply(String[] strings) {
        String[] mirroredStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            mirroredStrings[i] = new StringBuilder(strings[i]).reverse().toString();
        }

        return mirroredStrings;
    }
}

