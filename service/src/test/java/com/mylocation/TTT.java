package com.mylocation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lenovo on 2017/9/8.
 */
public class TTT {

    public static void main(String[] args) {
        String reportTime = "2017-09-07 14:51:31";
        String bookTime = "2017-09-11 14:52:07";
        String dealTime = "2017-09-11 15:11:16";
        //时间戳转化为Sting或Date
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date reportDate = format.parse(reportTime);
            Date bookDate = format.parse(bookTime);
            Date dealDate = format.parse(dealTime);
            long reportLong = reportDate.getTime();
            long bookLong = bookDate.getTime();
            long dealLong = dealDate.getTime();
            System.out.println("reportDate "+ reportDate +" reportLong "+ reportLong);
            System.out.println("bookDate "+ bookDate +" bookLong "+ bookLong);
            long sub = (bookLong - reportLong)/1000;
            long hour = sub/3600;
            long hourLeft = sub%3600;
            long min = hourLeft/60;
            long sec = hourLeft%60;

            long sub2 = (dealLong - bookLong)/1000;
            long hour2 = sub2/3600;
            long hourLeft2 = sub2%3600;
            long min2 = hourLeft2/60;
            long sec2 = hourLeft2%60;

            System.out.println("dealDate "+dealDate +" dealLong "+ dealLong);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
