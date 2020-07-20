package com.scotthis.demo.mapper;

import com.scotthis.demo.beans.Reg;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface GetRegListMapper {
    List<Reg> getRegList();
//    public List<Reg> getData();
}