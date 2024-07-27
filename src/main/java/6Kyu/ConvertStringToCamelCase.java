public class ConvertStringToCamelCase {
    //6 kyu
    static String toCamelCase(String s){
        //check if empty
        if(s.isEmpty()){
            return s;
        }
        //split on special chars (probably not all special chars)
        String[] split = s.split("[\\s@&.?$+_-]+");

        if (Character.isUpperCase(split[0].charAt(0))){
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].substring(0,1).toUpperCase() + split[i].substring(1);
            }
        } else {
            for (int i = 1; i < split.length; i++){
                split[i] = split[i].substring(0,1).toUpperCase() + split[i].substring(1);
            }
        }
        String solution = String.join(",", split);
        return solution.replaceAll(",", "");
    }
}
