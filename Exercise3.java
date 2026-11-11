public class Exercise3 {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder revWord = new StringBuilder(word);
            revWord.reverse();
            result.append(revWord).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
