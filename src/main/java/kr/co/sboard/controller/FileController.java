package kr.co.sboard.controller;


import kr.co.sboard.service.FileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class FileController {

    private final FileService fileService;


    @GetMapping("/file/download")
    public ResponseEntity downloadFile(int fno){
        return fileService.downloadFile(fno);
    }
}
