package io.bobz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("When running PalindromGeneratorService")
class PalindromeGeneratorServiceTest {
    private PalindromeGeneratorService palindromeGeneratorService;

    @BeforeEach
    void init() {
        palindromeGeneratorService = new PalindromeGeneratorService();
    }

    @Test
    @DisplayName("generate method")
    void testGenerate() {
        String original = "arsenal";

        String palindrome = generatePalindrome(original);

        assertEquals(palindrome, palindromeGeneratorService.generate(original));
    }

    private String generatePalindrome(String original) {
        String palindrome = "";

        for (int i = original.length() - 1; i >= 0; i--)
            palindrome = palindrome + original.charAt(i);

        return palindrome;
    }
}
