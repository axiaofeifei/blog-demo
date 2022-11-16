package tool;







import java.io.File;

/**
 * @Author hehongfei
 * @Description
 * @Date 2022/11/16 16:24
 */
public class DeleteFile {
    public boolean deleteAllFile(String path, boolean isIncludeRoot) {
        if(path == null) {
            return false;
        }

        File file = new File(path);
        if (!file.exists()) {
            return false;
        }

        if(file.isFile()) {
            return file.delete();
        }

        File[] fileList = file.listFiles();
        boolean res = true;
        for (File f : fileList) {
            if(f.isFile()) {
                res = res && f.delete();
            } else if(f.isDirectory()) {
                res = res && deleteAllFile(f.getAbsolutePath(), true);
            }
        }

        if(isIncludeRoot) {
            res = res && file.delete();
        }

        return res;
    }

}
