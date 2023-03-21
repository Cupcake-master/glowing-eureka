import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_9 {
    public static void main(String[] args) {
        int[] input = Arrays.stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        List<int[]> inputList = Collections.singletonList(input);

        for (int i = 0; i < inputList.size(); i++) {
            int[] inputProcessed = inputList.get(i);

            Map<Integer, Integer> map = Arrays.stream(inputProcessed)
                    .boxed()
                    .collect(Collectors.toMap(num -> num, num -> num * 2));

            int[] output = new int[inputProcessed.length];
            for (int j = 0; j < inputProcessed.length; j++) {
                output[j] = map.get(inputProcessed[j]);
            }
            System.out.println(Arrays.toString(output));

        }
    }
}
