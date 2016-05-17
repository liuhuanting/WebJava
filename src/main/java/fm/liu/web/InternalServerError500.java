package fm.liu.web;

/**
 * 处理500错误
 *
 * @author Ma
 */
public class InternalServerError500 {

    public static void set500(String string) {
        Response.setContent("<h2>500 服务器方法生错误</h2>" + string);
        Response.setStatus(500);
    }

    /**
     * 触发500异常
     */
    public static void set500(Exception ex) {
        InternalServerError500.set500(ex.toString());
    }
}
