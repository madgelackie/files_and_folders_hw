package com.codeclan.filefolderservice.filesHW.components;

import com.codeclan.filefolderservice.filesHW.models.File;
import com.codeclan.filefolderservice.filesHW.models.Folder;
import com.codeclan.filefolderservice.filesHW.models.User;
import com.codeclan.filefolderservice.filesHW.repositories.FileRepository;
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

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        User user = new User("Marion");
        userRepository.save(user);

        User user2 = new User("Graham");
        userRepository.save(user2);

        Folder folder = new Folder("CC_Work", user);
        folderRepository.save(folder);

        Folder folder2 = new Folder("Pictures", user);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Desktop", user2);
        folderRepository.save(folder3);

        user.addFolder(folder);
        user.addFolder(folder2);
        userRepository.save(user);

        File file1 = new File("This", "txt", 100, folder);
        File file2 = new File("File", "rb", 13, folder);
        File file3 = new File("Rules", "java", 500, folder);
        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);

        File file4 = new File("And", "txt", 100, folder2);
        File file5 = new File("Then", "txt", 100, folder2);
        fileRepository.save(file4);
        fileRepository.save(file5);

        File file6 = new File("And", "txt", 100, folder3);
        File file7 = new File("Then", "txt", 100, folder3);
        fileRepository.save(file6);
        fileRepository.save(file7);


    }
}
