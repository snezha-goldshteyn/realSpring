package labs.intro.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repository
@Autowired
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface MyExampleRepo {

    DBType value();



}
