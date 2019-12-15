package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.UserApiRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserApiController implements CrudInterface {


    @Override
    @PostMapping("")        //api/user
    public Header<UserApiController> create(@RequestBody UserApiRequest userApiRequest) {
        return null;
    }

    @Override
    @GetMapping("{id}")    //api/user/{id}
    public Header read(@PathVariable(name = "id") Long id) {
        return null;
    }

    @Override
    @PutMapping("")         //api/user
    public Header update() {
        return null;
    }

    @Override
    @DeleteMapping("{id}")      //api/user/{id}
    public Header delete(@PathVariable Long id) {
        return null;
    }
}
