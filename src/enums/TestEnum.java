package enums;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        Season season = Season.SPRING;
        /**
         * 枚举
         */
        switch (season){
            case SPRING:
                System.out.println("春天来了");
                break;
            case SUMMER:
                System.out.println("夏天来了");
                break;
            case AUTUMN:
                System.out.println("秋天来了");
                break;
            case WINTER:
                System.out.println("冬天来了");
                break;
        }
    }

}

enum Season{
    /**
     * season
     */
    SPRING,SUMMER,AUTUMN,WINTER
}

enum Week{
    /**
     * week
     */
    星期一,星期二
}
