package test.downfile;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/11 10:25
 */
public class IOUtilsServletDownloadDemo {
    public static void main(String[] args) {


        HttpServletResponse httpServletResponse = null;
        FileInputStream inputStream = null;
        ServletOutputStream outputStream = null;
        try {
            //根据id获取到文件地址

            String downloadUrl = "C:\\Users\\Lenovo\\Desktop";
            String downName = "query-model.xltm";
            //获得文件输入流
            inputStream = new FileInputStream(new File(downloadUrl, downName));


            //设置文件下载方式
            httpServletResponse.setHeader("content-disposition", "attachment;filelName=" + URLEncoder.encode(downName, "UTF-8"));
            httpServletResponse.setContentType("application/json;charset=UTF-8");
            httpServletResponse.setStatus(10);


            //下载文件
            //String toFileUrl = "C:\\Users\\Lenovo\\Desktop";
            //String toFileName = "test111.xlsx";
            outputStream = httpServletResponse.getOutputStream();

            IOUtils.copy(inputStream, outputStream);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

//关闭

            IOUtils.closeQuietly(inputStream);
            IOUtils.closeQuietly(outputStream);
        }
    }
}
