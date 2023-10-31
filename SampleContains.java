public class SampleContains {
    static void containsshow(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println('"' + str1 + '"' + " is included in " + '"' + str2 + '"');
        }
        else {
            System.out.println('"' + str1 + '"' + " is not included in " + '"' + str2 + '"');
        }
    }
        public static void main(String[] args) {
        String appleSentence = "apple is good";
        String bananadSentence = "banana is not good";

        containsshow(appleSentence, bananadSentence);
    }
}
