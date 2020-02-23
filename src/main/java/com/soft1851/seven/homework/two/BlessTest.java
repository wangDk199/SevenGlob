/**
 * @author ke
 * @ClassName BlessTest
 * @Description TOOD
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class BlessTest  {
    public static void main(String[] args) {
        Bless bless = str -> {
            System.out.println(str);
            System.out.println(str.substring(11, 15));
        };
        bless.sayBless("做为一名中国人，时刻为武汉加油！");
    }
}
