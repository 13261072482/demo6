package com.qiang;

import com.qiang.common.ImageUtil;
import com.qiang.dao.BannerMapper;
import com.qiang.dao.entity.BannerEntity;
import com.qiang.service.dto.request.BannerDto;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.*;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo6ApplicationTests {

    @Resource
    BannerMapper bannerMapper;

    @Test
    public void contextLoads() {
        String filePath = "C:/Users/maxrocky/Desktop/aaa.jpg";
        try {
            FileInputStream fis = ImageUtil.readImage(filePath);
            byte[] b = new byte[fis.available()];
            fis.read(b);
            bannerMapper.addPics(new BannerDto(b, 8));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void getPic() throws IOException {
        byte[] ben = null;
        List<BannerEntity> list = bannerMapper.getBanners(8);
        if (list.size() > 0) {
            ben = list.get(0).getBpic();
        }
        ;
        System.out.println(String.valueOf(ben));
        try {
            FileInputStream in = new FileInputStream(String.valueOf(ben));
            FileUtils.copyInputStreamToFile(in, new File("E://aaa.jpg"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void optionalTest() {
        //创建optional示例,可以通过方法返回值得到
        Optional<String> name = Optional.of("Sanaulla");
        //创建没有值的optional示例,例如null
        Optional empty = Optional.ofNullable(null);
        //ispresent方法来检查optional示例是否有值
        if (name.isPresent()) {
            System.out.println(name.get());
        }
        Optional<String> upperName = name.map((value) -> value.toUpperCase());
        System.out.println(upperName.orElse("no value found"));

        upperName = name.flatMap((value)-> Optional.of(value.toUpperCase()));
        System.out.println(upperName.orElse("no value found"));

    }

}
