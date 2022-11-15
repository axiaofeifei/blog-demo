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










}
