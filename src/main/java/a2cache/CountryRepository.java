package a2cache;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/23/17
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
@CacheConfig(cacheNames = "countries")//1.3
public class CountryRepository {

    @Cacheable//1.4-----首次查询会生成对象放到cache里,再次查询直接从cache里取值
    public Country findByCode(String code) {
        System.out.println("---> Loading country with code: " + code);
        return new Country(code);
    }
}
