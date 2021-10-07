package com.kodilla.testing.accenture;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class DuplicatesTestSuite {
    @Test
    public void shouldReturnListWithRepeatedValues() {
        // given
        Duplicates exercise = new Duplicates();

        // when
        List<Integer> result = exercise.findDuplicates(asList(-1, 1, 3, 2, 5, 6, -1, 3, 6), 2);

        // then
        assertThat(asList(-1, 3, 6), containsInAnyOrder(result.toArray()));
    }

   /* @Test
    public void nullValuesShouldBeOmitted() {
        // given
        Duplicates exercise = new Duplicates();

        // when
        List<Integer> result = exercise.findDuplicates(asList(1, 1, null, 2, 5, 6, 1, 3, 6, null), 2);

        // then
        assertEquals(singletonList(6), result);
    }*/

}
