public class SaleHotdogs{
    //8 Kyu
    public static int saleHotdogs(final int n){
        return (n < 5) ? n*100 : (n >= 5 && n < 10) ? n * 95 : (n >= 10) ? n*90 : n*100;
    }
}