public class isIsogram {
    public static boolean  isIsogram(String str) {
//        if(str.equals("")){
//            return true;
//        }
//        String upper = str.toUpperCase();
//        String[] split = upper.split("");
//        HashSet<String> mySet = new HashSet<String>(Arrays.asList(split));
//
//        if(str.length() == mySet.size()){
//            return true;
//        } else {
//            return false;
//        }
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}


