
public class UC4OOPSBannerApp {

    public static void main(String[] args) {

        // Store all lines of the OOPS banner in a String array
        String[] bannerLines = new String[7];

        bannerLines[0] = String.join(" ", " ***** ", " ***** ", " ******", " ***** ");
        bannerLines[1] = String.join(" ", "*     *", "*     *", "*     *", "*     *");
        bannerLines[2] = String.join(" ", "*     *", "*     *", "*     *", "*      ");
        bannerLines[3] = String.join(" ", "*     *", "*     *", "****** ", " ***** ");
        bannerLines[4] = String.join(" ", "*     *", "*     *", "*      ", "      *");
        bannerLines[5] = String.join(" ", "*     *", "*     *", "*      ", "*     *");
        bannerLines[6] = String.join(" ", " ***** ", " ***** ", "*      ", " ***** ");

        // Loop through the array and print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
