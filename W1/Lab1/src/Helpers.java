public class Helpers {
    public static String[] splitName(String name) {
        // \\s+ splits on one or more whitespace characters, and trim() removes leading and trailing whitespace
        return name.trim().split("\\s+");
    }

    public static String[] splitDate(String date) {
        return date.split("/");
    }

    public static String formatDate(String month, String day, String year) {
        switch (month) {
            case "01" -> month = "Jan";
            case "02" -> month = "Feb";
            case "03" -> month = "Mar";
            case "04" -> month = "Apr";
            case "05" -> month = "May";
            case "06" -> month = "Jun";
            case "07" -> month = "Jul";
            case "08" -> month = "Aug";
            case "09" -> month = "Sep";
            case "10" -> month = "Oct";
            case "11" -> month = "Nov";
            case "12" -> month = "Dec";

            default -> month = "Invalid month";
        }

        day =
                (day.startsWith("0"))
                        ? day.substring(1)
                        : day;

        return (month.equals("Invalid month"))
                ? "Invalid month"
                : month + " " + day + ", " + year;
    }

    public static String formatOutput(String lName, String fName, String date) {
        String comma =
                (!lName.isEmpty())
                        ? ", "
                        : "";

        return (date.equals("Invalid month"))
                ? "Invalid Date"
                : lName + comma + fName + " had a Date of Birth of " + date;
    }
}
