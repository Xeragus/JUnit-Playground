package io.bobz;

import java.util.HashSet;
import java.util.Set;

public class SetIntersectionValidator {

    public Set intersection(Set s1, Set s2) {
        if(s1 == null || s2 == null) {
            throw new NullPointerException();
        }

        Set<String> intersectionSet =  new HashSet<String>(s1);
        intersectionSet.retainAll(s2);

        return intersectionSet;
    }

}
