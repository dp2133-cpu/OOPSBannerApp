
import java.util.HashMap;
import java.util.Map;

public class UC8OOPSBannerApp {

    // Utility method to create the map of character patterns
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        patterns.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        patterns.put('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        return patterns;
    }

    // Utility method to render the banner
    public static void renderBanner(String word, Map<Character, String[]> patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }

            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildCharacterPatterns();

        String word = "OOPS";

        renderBanner(word, patterns);
    }
}
