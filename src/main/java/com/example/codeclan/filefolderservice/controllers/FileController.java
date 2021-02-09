package com.example.codeclan.filefolderservice.controllers;

import com.example.codeclan.filefolderservice.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

}
