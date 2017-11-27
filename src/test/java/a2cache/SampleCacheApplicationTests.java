package a2cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/23/17
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleCacheApplicationTests {

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private CountryRepository countryRepository;

    @Test
    public void validateCache() {
        Cache countries = this.cacheManager.getCache("countries");
        assertThat(countries).isNotNull();
        countries.clear();
        assertThat(countries.get("BE")).isNull();

        Country be = this.countryRepository.findByCode("BE");
        assertThat((Country) countries.get("BE").get()).isEqualTo(be);
    }
}
