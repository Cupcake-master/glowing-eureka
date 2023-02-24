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
                throw new Exception("Не найдено строк, содержащих искомое слово.");
            }

        } catch (Exception e) {
            System.out.println("Не найдено строк, содержащих искомое слово.");
        }
    }
}
