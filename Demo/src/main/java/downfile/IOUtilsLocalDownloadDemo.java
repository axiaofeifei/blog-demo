package test.downfile;


//import org.apache.commons.io.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/9 14:47
 */
public class IOUtilsLocalDownloadDemo {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            //根据id获取到文件地址

            String downloadUrl = "C:\\Users\\Lenovo\\Desktop";
            String downName = "query.xlsx";
            //获得文件输入流
            inputStream = new FileInputStream(new File(downloadUrl, downName));
            //设置文件下载方式
//            Response response = new Response();
//            response.setHeader("content-disposition", "attachment;filelName=" + URLEncoder.encode(downName, "UTF-8"));
//            outputStream = response.getOutputStream();
            //下载文件
            String toFileUrl = "C:\\Users\\Lenovo\\Desktop";
            String toFileName = "test111.xlsx";
            outputStream = new FileOutputStream(new File(toFileUrl,toFileName));

            //IOUtils.copy(inputStream, outputStream);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

//关闭

            //IOUtils.closeQuietly(inputStream);
            //IOUtils.closeQuietly(outputStream);


        }
    }
}
