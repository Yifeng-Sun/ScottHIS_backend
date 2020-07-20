package com.scotthis.demo.controllers;

import com.scotthis.demo.beans.KaiyaoItem;
import com.scotthis.demo.beans.Record_numBean;
import com.scotthis.demo.beans.Reg;
import com.scotthis.demo.service.MyService;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class UpdateFayaoController {
    @Autowired
    private MyService myService;

//    public List<Reg> test(String records_num, String pName, String sex, String idCardNum, Date Birthday, int age, String homeAddress, int department_type_id, int department_id, int reg_level_id, int doctor_id){
//
//        Reg reg = new Reg(null,records_num, name, sex, idCardNum, birthday, age, homeAddress, department_type_id, regTime, department_id, doctor_id, state
//        myService.addAppointment(reg1);
//        System.out.println("addAppointment Called");
//
//    }


    @GetMapping("/updateFayao")
//    @ResponseBody
    public void Faiyao(@RequestParam ("records_num") String records_num) {
        System.out.println(records_num);
        Record_numBean record_numBean = new Record_numBean(records_num);
        System.out.println("知道你想update了");
        myService.updateFayao(record_numBean);
        System.out.println("update完了");
    }


}
