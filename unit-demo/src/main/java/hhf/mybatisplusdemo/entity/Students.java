package hhf.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("student")
public class Students implements Serializable {

  @TableId(value = "id")
  private Integer id;
  private Long stuNum;
  private String stuName;
  private Long age;
  private String gender;
  private String birthday;










}
