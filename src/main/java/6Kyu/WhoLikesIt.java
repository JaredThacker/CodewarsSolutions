public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        StringBuilder sb = new StringBuilder();
        if (names.length == 0){
            sb.append("no one likes this");
        }
        else if (names.length > 3) {
            sb.append(String.format("%s, %s and %d others like this", names[0],names [1], names.length - 2));
        }
        else if (names.length == 3) {
            sb.append(String.format("%s, %s and %s like this", names[0], names[1], names[2]));
        }
        else if (names.length == 2) {
            sb.append(String.format("%s and %s like this", names[0], names[1]));
        } else {
            sb.append(String.format("%s likes this", names[0]));
        }
        return sb.toString();
    }
}
