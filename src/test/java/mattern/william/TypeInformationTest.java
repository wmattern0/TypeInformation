package mattern.william;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TypeInformationTest {
    TypeInformation typeInformation;
    String string = "String";
    String otherString = "Smash Mouth is the best band ever.";
    Integer small = 1;
    Integer big = 100000;
    Boolean trueObject = true;
    Boolean falseObject = false;
    ArrayList<String> stringList = new ArrayList<String>();

    @Before
    public void setUp(){
        typeInformation = new TypeInformation();
        stringList.add(string);
        stringList.add(otherString);
    }

    @Test
    public void classImplementsInterfaceTest(){
        assertTrue(typeInformation.classImplementsInterface(string,"Serializable"));
        assertTrue(typeInformation.classImplementsInterface(otherString,"Comparable"));
        assertTrue(typeInformation.classImplementsInterface(small,"Comparable"));
        assertTrue(typeInformation.classImplementsInterface(big,"Comparable"));
        assertTrue(typeInformation.classImplementsInterface(trueObject,"Serializable"));
        assertTrue(typeInformation.classImplementsInterface(falseObject,"Comparable"));
        assertTrue(typeInformation.classImplementsInterface(stringList,"RandomAccess"));
        assertTrue(typeInformation.classImplementsInterface(stringList,"List"));

        assertFalse(typeInformation.classImplementsInterface(stringList,"Queue"));
        assertFalse(typeInformation.classImplementsInterface(small,"Serializable"));
        assertFalse(typeInformation.classImplementsInterface(falseObject,"Iterable"));
    }

    @Test
    public void listAllMembersTest(){
        System.out.println("Fields");
        for(Field field: trueObject.getClass().getFields()){
            System.out.println(field.toString());
        }
        System.out.println();
        System.out.println("Constructors");
        for(Constructor constructor: trueObject.getClass().getConstructors()){
            System.out.println(constructor.toString());
        }
        System.out.println();
        System.out.println("Methods");
        for(Method constructor: trueObject.getClass().getMethods()){
            System.out.println(constructor.toString());
        }


    }

}