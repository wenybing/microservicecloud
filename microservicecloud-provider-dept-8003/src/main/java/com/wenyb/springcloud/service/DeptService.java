package com.wenyb.springcloud.service;

import com.wenyb.springcloud.entities.Dept;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/3/15 9:25
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
