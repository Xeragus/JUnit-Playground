package io.bobz;

public class PalindromeGeneratorService {
    public String generate(String string) {
        String palindrome = "";

        for ( int i = string.length() - 1; i >= 0; i-- )
            palindrome = palindrome + string.charAt(i);

        return palindrome;
    }
}
