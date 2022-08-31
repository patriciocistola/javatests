package com.platzi.javatest.util;

import org.junit.Test;
import static com.platzi.javatest.util.Passwordutil.*;
import static org.junit.Assert.*;

public class PasswordutilTest {
    @Test
    public void menor_ocho_caracteres() {
        assertEquals(SecurityLevel.Bajo, comprobar("1234567"));
    }
    @Test
    public void mayor_ocho_caracteres() {
        assertEquals(SecurityLevel.Medio, comprobar("123456789"));
    }
}