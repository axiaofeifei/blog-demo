/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/9 15:02
 */

package proxy;

public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHostOrNotRating(int rating);
}
