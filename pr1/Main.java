package pr1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] inputStrings = {"hello", "world", "java"};
        Mirror mirrorFunction = new Mirror();
        String[] mirroredStrings = mirrorFunction.apply(inputStrings);
        System.out.println("Original Strings: " + Arrays.toString(inputStrings));
        System.out.println("Mirrored Strings: " + Arrays.toString(mirroredStrings));
    }
}
