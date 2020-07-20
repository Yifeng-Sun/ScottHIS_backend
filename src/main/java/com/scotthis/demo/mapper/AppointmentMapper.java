package com.scotthis.demo.mapper;

import com.scotthis.demo.beans.Reg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppointmentMapper {
    void addAppointment(Reg reg);
//    public List<Reg> getData();
}
