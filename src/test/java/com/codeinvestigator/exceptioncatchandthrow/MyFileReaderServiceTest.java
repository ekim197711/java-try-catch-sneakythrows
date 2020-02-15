package com.codeinvestigator.exceptioncatchandthrow;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MyFileReaderServiceTest {

    @Autowired
    MyFileReaderService myFileReaderService;

    @Test
    public void readFromFile() {
        myFileReaderService.readFromFile();
    }
}