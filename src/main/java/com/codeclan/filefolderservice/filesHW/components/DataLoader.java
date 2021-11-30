package com.codeclan.filefolderservice.filesHW.components;

import com.codeclan.filefolderservice.filesHW.models.Folder;
import com.codeclan.filefolderservice.filesHW.models.User;
import com.codeclan.filefolderservice.filesHW.repositories.FolderRepository;
import com.codeclan.filefolderservice.filesHW.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        User user = new User("Marion");
        userRepository.save(user);

        Folder folder = new Folder("CC_Work", user);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Pictures", user);
        folderRepository.save(folder2);
    }
}
