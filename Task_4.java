public class Task_4 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "elderberry"};
        String searchWord = args[0];

        try {
            boolean found = false;
            for (String str : arr) {
                if (str.contains(searchWord)) {
                    System.out.println(str);
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new Exception("No strings containing the word you are looking for were found.");
            }

        } catch (Exception e) {
            System.out.println("No strings containing the word you are looking for were found.");
        }
    }
}
