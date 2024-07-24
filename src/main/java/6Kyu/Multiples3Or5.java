public class Multiples3Or5 {
    //6 Kyu
    public int solution(int number) {
        int sum = 0;
        for(int i = 1; i < number; i++){
            sum += (i % 3 == 0 && i % 5 == 0) ? i : (i % 3 == 0) ? i : (i % 5 == 0) ? i : 0;
        }
        return sum;
    }
}
