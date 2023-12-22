package fr.dawan.business.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {

    @Test
    void index() {
        assertEquals("Subscribe to my OnlyHands !", new HomeController().index());
    }
}
