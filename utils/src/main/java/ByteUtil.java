import java.io.*;
import java.nio.ByteBuffer;

/**
 * 对象序列化，反序列化（序列化对象转byte[],ByteBuffer, byte[]转object
 *
 * @author Vicky
 * @email eclipser@163.com
 */
public class ByteUtil {

    public static byte[] getBytes(Object obj) {
        byte[] bytes = null;
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        try {
            ObjectOutputStream out = new ObjectOutputStream(bout);
            out.writeObject(obj);
            out.flush();
            bytes = bout.toByteArray();
            bout.close();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return bytes;
    }

    public static Object getObject(byte[] bytes) throws IOException
            , ClassNotFoundException {
        ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
        ObjectInputStream oi = new ObjectInputStream(bi);
        Object obj = oi.readObject();
        bi.close();
        oi.close();
        return obj;
    }

    public static ByteBuffer getByteBuffer(Object obj) {
        byte[] bytes = new byte[0];
        try {
            bytes = ByteUtil.getBytes(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ByteBuffer buff = ByteBuffer.wrap(bytes);
        return buff;
    }

}
