package hhf.springbootredis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

  private Integer id;
  private long stuNum;
  private String stuName;
  private long age;
  private String gender;
  private java.sql.Date birthday;

}
