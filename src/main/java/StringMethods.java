public class StringMethods {

    public String insertQuotes(String s1, String s2) {
        String result = "";

        if (s1.endsWith("писал")) {
            result = s1.concat(": \"" + s2.replaceAll("[«»]+", "\"") + "\"");
        } else {
            return "Error";
        }

        return result;
    }

    // Task 8
    public String cityName(String name) {
        // check if word has spaces or sashes;
        String splitter = " ";
        if (name.contains("-")) {
            splitter = "-";
        }

        // split words
        String[] words = name.split(splitter);

        String result = "";
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            result += currentWord.substring(0, 1).toUpperCase()
                    + currentWord.substring(1).toLowerCase();
            if (i < words.length - 1) {
                result += splitter;
            }
        }
        return result;
    }

    public String betweenParameters(String word, String param) {

        return word.substring(word.indexOf(param), word.lastIndexOf(param) + 1);
    }

    public boolean firstAndEndTheSame(String word) {
        String tempWord = word.toLowerCase();
        char firstLetter = tempWord.charAt(0);

        return tempWord.lastIndexOf(firstLetter) == word.length() - 1;
    }

    // Task 12
    public String lastWord(String str) {

        return str.substring(str.lastIndexOf(" ") + 1);
    }

    // Task 13
    public String deleteBetweenTwoIndexes(String str, int index1, int index2) {

        return str.substring(0, index1) + str.substring(index2 + 1);
    }

    // Task 15
    public String fullName(String data) {
        String[] words = data.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[0].charAt(0) < 'А' || words[0].charAt(0) > 'Я') {
                return "Invalid name";
            }
        }

        return "Имя: " + words[0] + "\nОтчество: " + words[1] + "\nФамилия: " + words[2];
    }

    //Task 16
    public String repeat(String str, int n) {

        return str.repeat(n);
    }

    //Task17
    public int findNumber(String str, int index) {

        return str.codePointAt(index);
    }

    // Task 18
    public boolean compareThreeWords(String s1, String s2, String s3) {

        return s1.equalsIgnoreCase(s2) && s2.equalsIgnoreCase(s3);
    }


}
