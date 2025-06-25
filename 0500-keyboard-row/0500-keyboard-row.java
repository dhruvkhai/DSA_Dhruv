

public class Solution {
    public static String[] findWords(String[] words) {
        
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lowerWord = word.toLowerCase();
            for (String row : rows) {
                if (lowerWord.chars().allMatch(c -> row.indexOf(c) != -1)) {
                    result.add(word);
                    break;
                }
            }
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }
        String[] result = findWords(words);
        System.out.println(Arrays.toString(result));
    }
}
