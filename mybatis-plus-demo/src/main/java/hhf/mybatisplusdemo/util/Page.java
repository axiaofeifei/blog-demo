package hhf.mybatisplusdemo.util;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import hhf.mybatisplusdemo.entity.Students;

import java.util.List;

/**
 * @author 小非肥
 * @version 1.0
 * @date 2022/5/20 16:47
 */
public class Page implements IPage<Students> {






    @Override
    public List<OrderItem> orders() {
        return null;
    }

    @Override
    public List<Students> getRecords() {
        return null;
    }

    @Override
    public IPage<Students> setRecords(List<Students> records) {
        return null;
    }

    @Override
    public long getTotal() {
        return 0;
    }

    @Override
    public IPage<Students> setTotal(long total) {
        return null;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public IPage<Students> setSize(long size) {
        return null;
    }

    @Override
    public long getCurrent() {
        return 0;
    }

    @Override
    public IPage<Students> setCurrent(long current) {
        return null;
    }
}
