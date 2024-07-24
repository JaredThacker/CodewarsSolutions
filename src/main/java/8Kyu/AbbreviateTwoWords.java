public class AbbreviateTwoWords {
    //8 Kyu
    public static String abbrevName(String name) {
        String upper = name.toUpperCase();
        String[] split = upper.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(split[0].substring(0,1) + "." + split[1].substring(0,1));
        return sb.toString();
    }
}