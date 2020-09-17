package cn.v5cn.drone.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
public class IndexController {

    @GetMapping("/index")
    public Object index() throws IOException {

        File flie = new File("/mnt/data");
        if(!(!flie.exists() && flie.mkdirs())) {
            throw new RuntimeException("创建目录失败");
        }
        File text = new File(flie.getAbsolutePath() + "/hello.txt");
        FileOutputStream fos = new FileOutputStream(text);
        fos.write("Hello World".getBytes(StandardCharsets.UTF_8));
        fos.flush();
        fos.close();
        return "Hello Drone 成功 ~~~~~~";
    }
}
