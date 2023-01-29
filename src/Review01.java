
public class Review01 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int product = 500;
        int percent = 10;

        int tamount = tax(500, 10);

        System.out.println(product + "円の商品の税込価格は" +(product+tamount) +"円（消費税は" +tamount + "円)です。");

    }

    public static int tax(int product, int percent) {
        int result = product / percent;
        return result;
    }

}
