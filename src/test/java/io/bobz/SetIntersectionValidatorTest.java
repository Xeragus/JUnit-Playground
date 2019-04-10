package io.bobz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetIntersectionValidatorTest {

    private SetIntersectionValidator setIntersectionValidator;

    private Set<String> s1;
    private Set<String> s2;
    private Set<String> s3;

    @BeforeEach
    public void init() {
        setIntersectionValidator = new SetIntersectionValidator();
        s1 = new HashSet<>();
        s2 = new HashSet<>();
        s3 = new HashSet<>();
    }


    // interface based test 1
    // base: s1 != null && s2 != null
    @Test
    void testDoesNotThrowNullPointerException() {
        s1.add("Arsenal");
        s1.add("Barcelona");
        s2.add("Valencia");
        s2.add("Arsenal");
        s3.add("Arsenal");

        assertEquals(s3, setIntersectionValidator.intersection(s1, s2));
    }

    // interface based test 2
    // set 1 is null
    @Test
    void testSetOneIsNull() {
        s1 = null;
        s2.add("Malaga");

        assertThrows(NullPointerException.class, () -> setIntersectionValidator.intersection(s1, s2));
    }

    // interface based test 3
    // set 2 is null
    @Test
    void testSetTwoIsNull() {
        s2 = null;
        s1.add("Malaga");

        assertThrows(NullPointerException.class, () -> setIntersectionValidator.intersection(s1, s2));
    }

    // functionality based test 1
    // fully intersect
    @Test
    public void testFullIntersection() {
        s1.add("Arsenal");
        s1.add("Valencia");
        s2.add("Arsenal");
        s2.add("Valencia");
        s3.add("Arsenal");
        s3.add("Valencia");

        assertEquals(s3, setIntersectionValidator.intersection(s1, s2));
    }

    // functionality based test 1
    // partially intersect
    @Test
    public void testPartialIntersection() {
        s1.add("Arsenal");
        s1.add("Valencia");
        s2.add("Arsenal");
        s2.add("Celta");
        s2.add("Valencia");
        s3.add("Arsenal");
        s3.add("Valencia");

        assertEquals(s3, setIntersectionValidator.intersection(s1, s2));
    }

    // functionality based test 3
    // don't intersect
    @Test
    public void testEmptyIntersection() {
        s1.add("Arsenal");
        s1.add("Valencia");
        s2.add("CSKA Moscow");
        s2.add("Celta");
        s2.add("Real Sociedad");

        assertEquals(s3, setIntersectionValidator.intersection(s1, s2));
    }
}