import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task_8 {
    public static void main(String[] args) {
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(args));
        System.out.println(uniqueWords.size());
    }
}
