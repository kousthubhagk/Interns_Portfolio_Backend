package com.cars24.interns.controllers;

import com.cars24.interns.data.res.GetInternResponse;
import com.cars24.interns.services.impl.InternServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/intern")
public class InternController {
    @Autowired
    private InternServiceImpl imp;
    @GetMapping("/{name}")
    public ResponseEntity<GetInternResponse> GetIntern(@PathVariable String name){

        ResponseEntity<GetInternResponse> res=imp.getIntern(name);
          return res;
    }


}
