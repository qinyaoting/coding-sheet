package a4batch;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 11/27/17
 * Time: 6:40 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class PersonItemProcessor implements ItemProcessor<Person,Person> {

    private static final Logger logger = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) throws Exception {

        final String firstName = person.getFirstName().toUpperCase();
        final String lastName= person.getLastName().toUpperCase();

        final Person transformedPerson = new Person(firstName,lastName);

        logger.info("converting ("+person+") into (" + transformedPerson+")");

        return transformedPerson;
    }
}
