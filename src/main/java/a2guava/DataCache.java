package a2guava;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/24/17
 * Time: 11:10 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Component
public class DataCache {

    private Map<Long,String> dataMap = new HashMap<>();

    @PostConstruct
    public void init() {
        dataMap.put(1L, "张三");
        dataMap.put(2L, "lisi");
        dataMap.put(3L, "wangwu");
    }

    @Cacheable(value = "guavaDemo", key = "#id + 'dataMap'")//1.2
    public String query(Long id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()) + ":query id is "+id);
        return dataMap.get(id);
    }

    @CachePut(value = "guavaDemo", key = "#id + 'dataMap'")
    public String put(Long id, String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()) + ":insert id is "+id);
        dataMap.put(id, value);
        return value;
    }

    @CacheEvict(value = "guavaDemo", key = "#id + 'dataMap'")
    public void remove(Long id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()) + ":remove id is "+id);
        dataMap.remove(id);
    }
}
