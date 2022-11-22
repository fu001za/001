package day1.utils;

import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseUtil {
    /**
     * 将obj变成json字符串，写到输出的字符流中
     * @param obj
     * @param response
     */
    public static  void write(Object obj, HttpServletResponse response){
        String json= JSON.toJSONString(obj);
        try {
            PrintWriter writer = response.getWriter();
            writer.write(json);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
