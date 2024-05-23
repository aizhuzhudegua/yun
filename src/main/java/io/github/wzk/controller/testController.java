package io.github.wzk.controller;

import io.github.wzk.encode.ApiResult;
import io.github.wzk.entity.Alarmlist;
import io.github.wzk.service.AlarmlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/test")
@CrossOrigin
public class testController {


    @GetMapping("/")
    @ResponseBody
    public ApiResult getLatest() {
        return ApiResult.success("ok");
    }

}
