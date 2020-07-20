package com.scotthis.demo.mapper;

import com.scotthis.demo.beans.KaiyaoDetail;
import com.scotthis.demo.beans.Record_numBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KaiyaoDetailMapper {
    List<KaiyaoDetail> getKaiyaoDetail(Record_numBean record_numBean);
//    public List<Reg> getData();
}