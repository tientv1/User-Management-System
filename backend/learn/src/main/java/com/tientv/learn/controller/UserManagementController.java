package com.tientv.learn.controller;

import com.tientv.learn.dto.ReqRes;
import com.tientv.learn.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserManagementController {

    @Autowired
    private UserManagementService userManagementService;

    @PostMapping("/auth/register")
    public ResponseEntity<ReqRes> register(ReqRes reg) {
        return ResponseEntity.ok(userManagementService.register(reg));
    }

    @PostMapping("/auth/login")
    public ResponseEntity<ReqRes> login(ReqRes reg) {
        return ResponseEntity.ok(userManagementService.login(reg));
    }

    @GetMapping("/admin/get-all-users")
    
}
