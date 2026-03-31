public class Helpers {
    public static String getAreaCode(String phoneNumber) {
        String [] parts = phoneNumber.split("-");

        return parts[0];
    }

    public static String returnAreaCodeStateAbbrev(String areaCode) {
        return switch (areaCode) {
            case "401" -> "RI";
            case "860" -> "CT";
            case "508" -> "MA";
            default -> "Invalid area code";
        };
    }

    public static String returnLastFour(String social) {
        String [] parts = social.split("-");

        return parts[parts.length - 1];
    }
}
