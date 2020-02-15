package com.codeinvestigator.exceptioncatchandthrow;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Slf4j
@Service
public class MyFileReaderService {

    @SneakyThrows
    public void readFromFile() {
        String abspath = "/home/mike/projects/exception-catch-and-throw/src/main/resources/myfile.txt";
            List<String> strings = Files.readAllLines(Paths.get(abspath));
            strings.forEach(l -> log.info("Line in file: {}", l));
    }
}
