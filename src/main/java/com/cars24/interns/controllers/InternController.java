package com.cars24.interns.controllers;

import com.cars24.interns.data.res.GetInternResponse;
import com.cars24.interns.services.impl.InternServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/intern")
@CrossOrigin(origins = "http://localhost:3000")
public class InternController {
    @Autowired
    private InternServiceImpl imp;
    @GetMapping("/{name}")
    public ResponseEntity<GetInternResponse> GetIntern(@PathVariable String name){

        ResponseEntity<GetInternResponse> res=imp.getIntern(name);
          return res;
    }


}
