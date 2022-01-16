public class TimeConversion {
    public static String timeConversion(String s) {
        String code = s.charAt(s.length() - 2) + "" + s.charAt(s.length() - 1);
        String hr = s.substring(0,2);
        String ans = "";

        if (code.equals("AM")) {
            if (hr.equalsIgnoreCase("12")) {
                ans = "00" + s.substring(2, 8);
            } else {
                ans = s.substring(0, 8);
            }
        } else {
            if (hr.equalsIgnoreCase("12")) {
                ans = s.substring(0, 8);
            } else {
                ans = String.valueOf(Integer.parseInt(s.substring(0,2)) + 12) + s.substring(2, 8);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:05:45AM"));
    }
}
