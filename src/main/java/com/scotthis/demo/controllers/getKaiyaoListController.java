package com.scotthis.demo.controllers;

import com.scotthis.demo.beans.KaiyaoDetail;
import com.scotthis.demo.beans.Record_numBean;
import com.scotthis.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class getKaiyaoListController {
    @Autowired
    private MyService myService;

//    public List<Reg> test(String records_num, String pName, String sex, String idCardNum, Date Birthday, int age, String homeAddress, int department_type_id, int department_id, int reg_level_id, int doctor_id){
//
//        Reg reg = new Reg(null,records_num, name, sex, idCardNum, birthday, age, homeAddress, department_type_id, regTime, department_id, doctor_id, state
//        myService.addAppointment(reg1);
//        System.out.println("addAppointment Called");
//
//    }


    @GetMapping("/getKaiyaoList")
//    @ResponseBody
    public List<KaiyaoDetail> test(@RequestParam ("records_num") String records_num) {
        Record_numBean record_numBean = new Record_numBean(records_num);
        List<KaiyaoDetail> kaiyaoDetail = myService.getKaiyaoDetail(record_numBean);
        System.out.println(kaiyaoDetail);
        return kaiyaoDetail;
    }


}
