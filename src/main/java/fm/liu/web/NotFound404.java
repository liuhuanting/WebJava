package fm.liu.web;

/**
 * 处理404错误
 *
 * @author Ma
 */
public class NotFound404 {

    public static void set404(String string) {
        Response.setContent("<h2>404 没找到</h2>" + string);
        Response.setStatus(404);
    }

    /**
     * 异常引起的404
     */
    public static void set404(Exception ex) {
        NotFound404.set404(ex.toString());
    }
}
