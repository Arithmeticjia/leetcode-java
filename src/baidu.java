public class baidu {

    private static baidu instance = new baidu();

    private baidu(){

    }

    public baidu getInstance(){
        return instance;
    }


}


class baidu2 {
    private static baidu2 instance;

    private baidu2(){

    }

//    public synchronized baidu2 getInstance(){
//        if(instance != null){
//            return new baidu2();
//        }
//
//        return instance;
//    }

    public static baidu2 getInstance(){

        if(instance == null){
            synchronized (baidu2.class){
                if(instance == null){
                    instance = new baidu2();
                }
            }
        }

        return instance;
    }
}

// 每门课程都>90的学生姓名
// name course score table

//SELECT a.name FROM table_name a GROUP BY a.name HAVING MIN(a.score) > 90;
//
//select distinct name from table_name where name not in (select distinct name from table_name where score <= 90)
