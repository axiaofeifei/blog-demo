package com.hhf.exceltest2.test;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;
import com.hhf.exceltest2.entity.User;
import com.hhf.exceltest2.entity.UserDynamicExcel;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

public class ExportExcelTest {

    @Test
    public void testWriteExcel() throws IOException {
        User user = new User();
        // 准备数据
        List<User> userExcels =   user.setUsersData();
        // 自己填写信息的对象
        ExportParams params = new ExportParams();
        //填写自己添加的信息
        params.setTitle("信息");
        params.setSheetName("用户信息");
        //将自己添加的信息，实体类结构，类的数据组成对象workbook
        Workbook workbook = ExcelExportUtil.exportExcel(params, User.class, userExcels);
        String fileAddress = "E:\\codes\\hhf\\blog-demo\\excel-test" +
                "\\src\\main\\java\\com\\hhf\\exceltest2\\test1.xlsx";
        FileOutputStream outputStream = new FileOutputStream(fileAddress);
        //将workbook写入到指定的文件
        workbook.write(outputStream);
        workbook.close();
    }

    @Test
    public void testWriteExcel_2( ) throws IOException {
        // 准备假数据
        User user = new User();
        List<User> userExcels = user.setUsersData();

        //建立动态表头类的对象
        UserDynamicExcel userDynamicExcel = new UserDynamicExcel();
        //获得第一种动态表头
        List<UserDynamicExcel> userExcelList = userDynamicExcel.getUserExcelList_1();
        //ExcelExportEntity是这样一个类，用于代替实体类结构表头
        List<ExcelExportEntity> beanList = new ArrayList<ExcelExportEntity>(userExcelList.size());

        for (UserDynamicExcel tablePo : userExcelList){
            ExcelExportEntity entity = new ExcelExportEntity();
            entity.setName(tablePo.getFiledShowName());
            entity.setKey(tablePo.getFiledCode());
            entity.setOrderNum(tablePo.getOrderNum());
            beanList.add(entity);
        }
        try {

            ExportParams params = new ExportParams();
            //excel表格的信息
            params.setTitle("信息");
            params.setSheetName("用户信息");
            //将并添加信息，实体类结构，类的数据做成excel表格对象workbook
            Workbook workbook = ExcelExportUtil.exportExcel(params,beanList, userExcels);

            //response.setHeader("content-Type","application/vnd.ms-excel");
            //response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(excelName + "导出表", "UTF-8") + ".xls");
            //response.setCharacterEncoding("UTF-8");
            //将要存储的位置做成对象
            String fileaddress = "E:\\codes\\hhf\\blog-demo\\excel-test" +
                    "\\src\\main\\java\\com\\hhf\\exceltest2\\test2.xlsx";
            FileOutputStream outputStream = new FileOutputStream(fileaddress);
            //将workbook写入到指定的地址
            workbook.write(outputStream);
            workbook.close();
        } catch (ExportException e) {
            e.printStackTrace();
        }



    }
}
