package hhf.springbootswagger.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)// 使用链式调用
public class Student implements Serializable {

  @ApiModelProperty(value = "学生主键id")
  private Integer id;
  @ApiModelProperty(value = "学生id")
  private Integer stuNum;
  @ApiModelProperty(value = "学生名字")
  private String stuName;
  @ApiModelProperty(value = "学生年龄")
  private Integer age;
  @ApiModelProperty(value = "学生性别")
  private String gender;
  @ApiModelProperty(value = "学生生日")
  private String birthday;




}
