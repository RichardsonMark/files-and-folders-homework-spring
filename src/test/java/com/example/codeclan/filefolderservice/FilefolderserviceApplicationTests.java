package com.example.codeclan.filefolderservice;

import com.example.codeclan.filefolderservice.models.File;
import com.example.codeclan.filefolderservice.models.Folder;
import com.example.codeclan.filefolderservice.models.User;
import com.example.codeclan.filefolderservice.repositories.FileRepository;
import com.example.codeclan.filefolderservice.repositories.FolderRepository;
import com.example.codeclan.filefolderservice.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FilefolderserviceApplicationTests {

	@Autowired
	UserRepository userRepository;
	@Autowired
	FileRepository fileRepository;
	@Autowired
	FolderRepository folderRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddNewUser() {
		User user = new User("Mark");
		userRepository.save(user);
	}

	@Test
	public void canAddNewUserAndFolder() {
		User user = new User("Mark2");
		userRepository.save(user);
		Folder folder = new Folder("Mark's Homework", user);
		folderRepository.save(folder);
	}

	@Test
	public void canAddNewUserFileAndFolder() {
		User user = new User("Mark3");
		userRepository.save(user);
		Folder folder = new Folder("Mark's Classwork", user);
		folderRepository.save(folder);
		File file = new File("ClassNotes", "txt", 1024, folder);
		fileRepository.save(file);
	}

}
