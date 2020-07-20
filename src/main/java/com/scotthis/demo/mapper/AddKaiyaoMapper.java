package com.scotthis.demo.mapper;

import com.scotthis.demo.beans.KaiyaoItem;
import com.scotthis.demo.beans.Reg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddKaiyaoMapper {
    void addKaiyao(KaiyaoItem kaiyaoItem);
//    public List<Reg> getData();
}
