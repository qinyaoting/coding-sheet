package a2cache;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/23/17
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SuppressWarnings("serial")
public class Country implements Serializable {

    private final String code;

    public Country(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Country country = (Country)o;
        return this.code.equals(country.code);
    }

    @Override
    public int hashCode() {
        return this.code.hashCode();
    }
}
