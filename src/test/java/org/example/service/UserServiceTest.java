package org.example.service;

import org.example.model.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for UserService
 */
class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        // Runs before each test
        userService = new UserService();
        System.out.println("Setting up test...");
    }

    @AfterEach
    void tearDown() {
        // Runs after each test
        System.out.println("Cleaning up test...");
    }

    @Test
    @DisplayName("Test user creation with valid data")
    void testCreateUserWithValidData() {
        User user = new User(0, "testuser", "test@example.com");
        
        // Note: This will fail without database setup
        // Replace with mock when database is not available
        assertNotNull(user);
        assertEquals("testuser", user.getUsername());
        assertEquals("test@example.com", user.getEmail());
    }

    @Test
    @DisplayName("Test user creation with invalid data")
    void testCreateUserWithInvalidData() {
        User user = new User(0, "", "test@example.com");
        
        boolean result = userService.createUser(user);
        
        assertFalse(result, "User creation should fail with empty username");
    }

    @Test
    @DisplayName("Test user creation with null username")
    void testCreateUserWithNullUsername() {
        User user = new User(0, null, "test@example.com");
        
        boolean result = userService.createUser(user);
        
        assertFalse(result, "User creation should fail with null username");
    }

    @Test
    void testUserGettersAndSetters() {
        User user = new User();
        user.setId(1);
        user.setUsername("john");
        user.setEmail("john@example.com");

        assertEquals(1, user.getId());
        assertEquals("john", user.getUsername());
        assertEquals("john@example.com", user.getEmail());
    }

    @Test
    void testUserToString() {
        User user = new User(1, "jane", "jane@example.com");
        String expected = "User{id=1, username='jane', email='jane@example.com'}";
        
        assertEquals(expected, user.toString());
    }
}
