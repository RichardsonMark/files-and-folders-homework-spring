package com.example.codeclan.filefolderservice.components;

import com.example.codeclan.filefolderservice.models.File;
import com.example.codeclan.filefolderservice.models.Folder;
import com.example.codeclan.filefolderservice.models.User;
import com.example.codeclan.filefolderservice.repositories.FileRepository;
import com.example.codeclan.filefolderservice.repositories.FolderRepository;
import com.example.codeclan.filefolderservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private FolderRepository folderRepository;
    @Autowired
    private UserRepository userRepository;
    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User mark = new User("Mark");
        userRepository.save(mark);
        User mark2 = new User("Mark2");
        userRepository.save(mark2);
        User mark3 = new User("Mark3");
        userRepository.save(mark3);
        Folder homework = new Folder("Mark's Homework", mark);
        folderRepository.save(homework);
        Folder classwork = new Folder("Mark's Classwork", mark2);
        folderRepository.save(classwork);
        Folder otherStuff = new Folder("Mark's Other work", mark3);
        folderRepository.save(otherStuff);
        File classnotes = new File("ClassNotes", "txt", 1024, classwork);
        fileRepository.save(classnotes);
        File beans = new File("Beans", "jpg", 2048, otherStuff);
        fileRepository.save(beans);
        File weetabix = new File("Weetabix", "png", 1024, otherStuff);
        fileRepository.save(weetabix);
        File beansOnWeetabix = new File("Beans on Weetabix", "png", 2048, otherStuff);
        fileRepository.save(beansOnWeetabix);
    }
}
