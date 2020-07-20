package com.scotthis.demo.controllers;

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
public class ceshiController {
    @Autowired
    private MyService myService;

//    public List<Reg> test(String records_num, String pName, String sex, String idCardNum, Date Birthday, int age, String homeAddress, int department_type_id, int department_id, int reg_level_id, int doctor_id){
//
//        Reg reg = new Reg(null,records_num, name, sex, idCardNum, birthday, age, homeAddress, department_type_id, regTime, department_id, doctor_id, state
//        myService.addAppointment(reg1);
//        System.out.println("addAppointment Called");
//
//    }


    @GetMapping("/test")
//    @ResponseBody
    public String test(@RequestParam ("pName") String pName,
                       @RequestParam ("records_num") int records_num,
                       @RequestParam ("sex") String sex,
                       @RequestParam ("idCardNum") String idCardNum,
                       @RequestParam ("Birthday") String Birthday,
                       @RequestParam ("age") int age,
                       @RequestParam ("homeAddress") String homeAddress,
                       @RequestParam ("department_type_id") String department_type_id,
                       @RequestParam ("department_id") String department_id,
                       @RequestParam ("reg_level_id") String reg_level_id,
                       @RequestParam ("doctor_id") String doctor_id) {
//        System.out.println(pName);
//        System.out.println(records_num);
//        System.out.println(sex);
//        System.out.println(idCardNum);
//        System.out.println(Birthday);
//        System.out.println(age);
//        System.out.println(homeAddress);
//        System.out.println(department_type_id);
//        System.out.println(department_id);
//        System.out.println(reg_level_id);
//        System.out.println(doctor_id);
        Date nowDate = new Date(System.currentTimeMillis());
        Reg reg = new Reg(0, records_num,pName,sex,idCardNum,Date.valueOf(Birthday),age,homeAddress,department_type_id,nowDate,department_id,doctor_id,"未看诊");
        System.out.println(reg);
        myService.addAppointment(reg);
        System.out.println(reg);
    return "success";
    }


}
