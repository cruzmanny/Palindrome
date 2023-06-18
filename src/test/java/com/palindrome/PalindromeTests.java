package com.palindrome;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTests {
    @Test
    @DisplayName("Reverse String")
    void reverse() {
        assertAll(() -> assertEquals("nur sesrun", Palindrome.reverse("nurses run")),
                () -> assertEquals("-121", Palindrome.reverse("121-")),
                () -> assertEquals("!dlroW olleH", Palindrome.reverse("Hello World!")),
                () -> assertEquals("ET phone home!", Palindrome.reverse("!emoh enohp TE")));
    }
    @Test
    @DisplayName("Is Palindrome")
    void isPalindrome() {
        assertAll(() -> assertTrue(Palindrome.isPalindrome("no lemon, no melon", "nolem on ,nomel on")),
                () -> assertTrue(Palindrome.isPalindrome("*2129 89 212*","*212 98 9212*")),
                () -> assertFalse(Palindrome.isPalindrome("Doctor Who", "ohW rotcoD")),
                () -> assertFalse(Palindrome.isPalindrome("-1250", "0521-")));
    }
}