
/**
 * OOPS Banner App - UC7
 * Demonstrates storing character banner patterns using an Inner Static Class
 * and assembling the banner using objects.
 */
public class UC7OOPSBannerApp {

    /**
     * Inner Static Class that encapsulates a character and its corresponding
     * banner pattern.
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         *
         * @param character Character represented
         * @param pattern Banner pattern (7 rows)
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter method for character
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter method for pattern
         *
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to build pattern for letter O
     */
    public static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    /**
     * Utility method to build pattern for letter P
     */
    public static String[] getPPattern() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    /**
     * Utility method to build pattern for letter S
     */
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
    }

    /**
     * Main method to display OOPS banner
     */
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', getOPattern()),
            new CharacterPatternMap('P', getPPattern()),
            new CharacterPatternMap('S', getSPattern())
        };

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                for (CharacterPatternMap cp : patterns) {
                    if (cp.getCharacter() == ch) {
                        line.append(cp.getPattern()[row]).append("  ");
                    }
                }

            }

            System.out.println(line);
        }
    }
}
