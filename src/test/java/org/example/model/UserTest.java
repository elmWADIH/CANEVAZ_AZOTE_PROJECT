package org.example.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple unit test for User model
 */
class UserTest {

    @Test
    void testUserConstructor() {
        User user = new User(1, "alice", "alice@example.com");
        
        assertEquals(1, user.getId());
        assertEquals("alice", user.getUsername());
        assertEquals("alice@example.com", user.getEmail());
    }

    @Test
    void testDefaultConstructor() {
        User user = new User();
        
        assertNotNull(user);
    }
}
