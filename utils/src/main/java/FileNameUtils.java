import java.util.UUID;

public class FileNameUtils {

    /**
     * 获取文件后缀
     *
     * @param fileName
     * @return
     */
    public static String getSuffix(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    /**
     * 生成新的文件名
     *
     * @param fileOriginName 源文件名
     * @return
     */
    public static String getFileName(String fileOriginName) {
        return FileNameUtils.getUUID() + "." + FileNameUtils.getSuffix(fileOriginName);
    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
