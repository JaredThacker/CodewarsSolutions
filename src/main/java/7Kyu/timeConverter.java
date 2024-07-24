 public class timeConverter{
    //7 kyu
        public static String toTime(int seconds){
            int minutes = seconds / 60;
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours + " hour(s) and " + remainingMinutes + " minute(s)";
        }
}
