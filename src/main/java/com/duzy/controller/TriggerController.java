package com.duzy.controller;

import com.duzy.service.IpLocationService;
import com.duzy.service.SshLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhiyuandu
 * @description
 * @since 2022/10/31 17:23
 */
@RestController
@RequestMapping("/t")
@Slf4j
public class TriggerController {

    @Autowired
    private IpLocationService ipLocationService;
    @Autowired
    private SshLogService sshLogService;


    @GetMapping
    public void ssh() {
        sshLogService.loadSshLogFileToDb();
    }

    @GetMapping("/location")
    public void location() {
        ipLocationService.parseFromApi();
    }


}
