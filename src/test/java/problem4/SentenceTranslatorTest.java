package problem4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SentenceTranslatorTest {

    private SentenceTranslator translator;

    @BeforeEach
    void setUp() {
        translator = new SentenceTranslator();
    }

    @Test
    void 알파벳_한개를_변환() {
        char result1 = translator.translate('A');
        char result2 = translator.translate('I');
        char result3 = translator.translate('Z');

        assertThat(result1).isEqualTo('Z');
        assertThat(result2).isEqualTo('R');
        assertThat(result3).isEqualTo('A');
    }

    @Test
    void 알파벳_이외의문자는_그대로반환() {
        char result1 = translator.translate(' ');
        char result2 = translator.translate('!');

        assertThat(result1).isEqualTo(' ');
        assertThat(result2).isEqualTo('!');
    }
}
