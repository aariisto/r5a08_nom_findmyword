package org.ex;

import org.example.Letter;
import org.example.Score;
import org.example.Word;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions.*;
public class WordTest {
    @Test
    public void should_check_one_incorrect_letter(){
        // Arrange
        Word word = new Word("E"); // Le mot à déviner fait une lettre

        // Act
        Score res = word.guess("B");




    }
}
