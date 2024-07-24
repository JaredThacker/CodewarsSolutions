public class SquareDigit {

    public int squareDigits(int n) {
        String num = Integer.toString(n);
        String rep = "";
        char[] eachDigit = num.toCharArray();
        for(int i = 0; i < num.length(); i++){
            int digit = Character.getNumericValue(eachDigit[i]);
            int square = digit*digit;
            String squareNum = Integer.toString(square);
            rep += squareNum;
        }
        int newNum = Integer.parseInt(rep);
        return newNum;
    }
}