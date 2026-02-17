public class OOPSBannerUC4 {

    public static void main(String[] args) {

        // Create banner array using String.join()
        String[] banner = {

            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*     *"),
            String.join("  ", "*     *", "*     *", "*     *", "*      "),
            String.join("  ", "*     *", "*     *", "****** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*      ", "      *"),
            String.join("  ", "*     *", "*     *", "*      ", "*     *"),
            String.join("  ", " ***** ", " ***** ", "*      ", " ***** ")

        };

        // Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}