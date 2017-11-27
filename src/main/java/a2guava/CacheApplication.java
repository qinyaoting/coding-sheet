package a2guava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/24/17
 * Time: 11:09 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@RestController
@EnableCaching      //1.1
public class CacheApplication {

    @Autowired
    private DataCache dataCache;

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class,args);
    }

    @RequestMapping("/put")
    public String put(Long id, String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date()) + ":value is " +dataCache.put(id, value);
    }

    @RequestMapping("/get")
    public String get(Long id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date()) + ":value is " +dataCache.query(id);
    }

    @RequestMapping("/remove")
    public String remove(Long id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dataCache.remove(id);
        return sdf.format(new Date()) + "success";
    }
}
