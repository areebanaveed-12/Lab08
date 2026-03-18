package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//failed test commit to github

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }


    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();

        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail because deleteCity() does not exist yet
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);

        // This will fail because countCities() doesn't exist yet
        assertEquals(2, list.countCities());
    }

}