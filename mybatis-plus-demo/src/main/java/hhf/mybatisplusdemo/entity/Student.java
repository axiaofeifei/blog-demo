package hhf.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

  @TableId(value = "id")
  private Integer id;
  private long stuNum;
  private String stuName;
  private long age;
  private String gender;
  private String birthday;





  public long getStuNum() {
    return stuNum;
  }

  public void setStuNum(long stuNum) {
    this.stuNum = stuNum;
  }


  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }




}
