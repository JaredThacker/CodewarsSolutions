public class RegexValidatePin {
    public static boolean validatePin(String pin) {
        if (pin.matches("[0-9]+")){
            return (pin.length() == 4) ? true : (pin.length() == 6) ? true : false;
        }
        return false;
    }
}