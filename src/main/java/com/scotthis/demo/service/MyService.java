package com.scotthis.demo.service;

import com.scotthis.demo.beans.KaiyaoDetail;
import com.scotthis.demo.beans.KaiyaoItem;
import com.scotthis.demo.beans.Record_numBean;
import com.scotthis.demo.beans.Reg;
import com.scotthis.demo.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyService {

    @Autowired
    private AppointmentMapper appointmentMapper;

    @Autowired
    private GetRegListMapper getRegListMapper;

    @Autowired
    private AddKaiyaoMapper addKaiyaoMapper;

    @Autowired
    private KaiyaoDetailMapper kaiyaoDetialMapper;

    @Autowired
    private UpdateFayaoMapper updateFayaoMapper;

    public void addAppointment(Reg reg){
        appointmentMapper.addAppointment(reg);
    }
    public ArrayList<Reg> getRegArr(){
        ArrayList<Reg> regArrayList = (ArrayList<Reg>) getRegListMapper.getRegList();
        System.out.println(regArrayList);
        return regArrayList;
    }

    public void addKaiyao(KaiyaoItem kaiyaoItem) {
        addKaiyaoMapper.addKaiyao(kaiyaoItem);
    }

    public ArrayList<KaiyaoDetail> getKaiyaoDetail(Record_numBean record_numBean){
        ArrayList<KaiyaoDetail> kaiyaoDetailArrayList = (ArrayList<KaiyaoDetail>) kaiyaoDetialMapper.getKaiyaoDetail(record_numBean);
        return kaiyaoDetailArrayList;
    }

    public void updateFayao(Record_numBean record_numBean){
        updateFayaoMapper.updateFayao(record_numBean);
    }
}
