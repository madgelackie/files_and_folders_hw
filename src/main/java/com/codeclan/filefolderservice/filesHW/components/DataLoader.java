package com.codeclan.filefolderservice.filesHW.components;

import com.codeclan.filefolderservice.filesHW.models.User;
import com.codeclan.filefolderservice.filesHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        User user = new User("Marion");
        userRepository.save(user);
    }
}
