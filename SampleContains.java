public class SampleContains {
    static void containsshow(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println('"' + str2 + '"' + " is included in " + '"' + str1 + '"');
        }
        else {
            System.out.println('"' + str2 + '"' + " is not included in " + '"' + str1 + '"');
        }
    }
        public static void main(String[] args) {
        String appleSentence = "apple is good";
        String word1 = "banana";
        String word2 = "is";
        String word3 = "not";
        String word4 = "good";
        containsshow(appleSentence, word1);
        containsshow(appleSentence, word2);
        containsshow(appleSentence, word3);
        containsshow(appleSentence, word4);
    }
}
