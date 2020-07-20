package com.scotthis.demo.controllers;

import com.scotthis.demo.beans.KaiyaoItem;
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
public class kaiyaoController {
    @Autowired
    private MyService myService;

//    public List<Reg> test(String records_num, String pName, String sex, String idCardNum, Date Birthday, int age, String homeAddress, int department_type_id, int department_id, int reg_level_id, int doctor_id){
//
//        Reg reg = new Reg(null,records_num, name, sex, idCardNum, birthday, age, homeAddress, department_type_id, regTime, department_id, doctor_id, state
//        myService.addAppointment(reg1);
//        System.out.println("addAppointment Called");
//
//    }


    @GetMapping("/kaiyao")
//    @ResponseBody
    public void storeKaiyao(@RequestParam ("drugList") String drugList,
                          @RequestParam ("records_num") int records_num) {
        System.out.println(drugList);
        System.out.println(records_num);
        String[] drugNames = drugList.split("-");
        System.out.println(drugNames[2]);//从0开始2 2为第三项，即为第二个有效值
        for(int i = 1; i < drugNames.length; i++){
            KaiyaoItem kaiyaoItem = new KaiyaoItem(0,String.valueOf(records_num),drugNames[i],"1");
            myService.addKaiyao(kaiyaoItem);
        }
    }


}
