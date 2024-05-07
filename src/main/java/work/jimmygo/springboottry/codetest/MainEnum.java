package work.jimmygo.springboottry.codetest;

/**
 * 功能描述
 *
 * @author shenzui5233
 * @since 2023-09-24
 */
public class MainEnum {
    public static void main(String[] args) {
        System.out.println(TitleEnum.TITLE1.name() + " " + TitleEnum.TITLE2.ordinal());
    }

    enum TitleEnum {
        TITLE1,

        TITLE2;
    }
}
