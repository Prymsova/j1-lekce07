package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák

 * Testuje metodu {@link Svatky#jeVSeznamu(String)}
 * METODA AAA:

 * @Test
void jeVSeznamu() {
    // Arrange
    Svatky svatky = new Svatky();
    String jmenoJeVSeznamu = "Alexej";
    String jmenoNeniVSeznamu = "Adam";

    // Act
    boolean resultJeVSeznamu = svatky.jeVSeznamu(jmenoJeVSeznamu);
    boolean resultNeniVSeznamu = svatky.jeVSeznamu(jmenoNeniVSeznamu);

    // Assert
    assertTrue(resultJeVSeznamu, "Očekávala jsem, že " + jmenoJeVSeznamu + " je v seznamu jmen.");
    assertFalse(resultNeniVSeznamu, "Očekávala jsem, že " + jmenoNeniVSeznamu + " není v seznamu jmen.");
}
*/

class SvatkyTest {

    /**
     * Testuje metodu {@link Svatky#vratKdyMaSvatek(String)}
     */
    @Test
    void kdyMaSvatek() {
        Svatky svatky = new Svatky();
        assertEquals(MonthDay.of(5, 18), svatky.vratKdyMaSvatek("Nataša"));
        assertNull(svatky.vratKdyMaSvatek("Eva"));
    }

    /**
     * Testuje metodu {@link Svatky#jeVSeznamu(String)}
     */
    @Test
    void jeVSeznamu() {
        //TODO Otestovat, že najde v seznamu existující jméno a nenajde neexistující jméno
        Svatky svatky = new Svatky();
        assertTrue(svatky.jeVSeznamu("Zikmund"));
        assertFalse(svatky.jeVSeznamu("Lota"));
    }

    /**
     * Testuje metodu {@link Svatky#getPocetJmen()}
     */
    @Test
    void getPocetJmen() {
        //TODO Otestovat, že vrací počet jmen, která máme v seznamu
        Svatky svatky = new Svatky();
        assertEquals(37, svatky.getPocetJmen());
    }

    /**
     * Testuje metodu {@link Svatky#getSeznamJmen()}
     */
    @Test
    void getSeznamJmen() {
        //TODO Zkontrolovat, že seznam jmen má správný počet položek.
        Svatky svatky = new Svatky();
        Set<String> seznamJmen = new HashSet<>();
        seznamJmen.add("Zikmund");
        seznamJmen.add("Alexej");
        seznamJmen.add("Alex");
        seznamJmen.add("Květoslav");
        seznamJmen.add("Klaudie");
        seznamJmen.add("Klaudia");
        seznamJmen.add("Claudia");
        seznamJmen.add("Radoslav");
        seznamJmen.add("Stanislav");
        seznamJmen.add("Ctibor");
        seznamJmen.add("Stibor");
        seznamJmen.add("Blažena");
        seznamJmen.add("Svatava");
        seznamJmen.add("Pankrác");
        seznamJmen.add("Servác");
        seznamJmen.add("Bonifác");
        seznamJmen.add("Žofie");
        seznamJmen.add("Přemysl");
        seznamJmen.add("Aneta");
        seznamJmen.add("Nataša");
        seznamJmen.add("Ivo");
        seznamJmen.add("Zbyšek");
        seznamJmen.add("Monika");
        seznamJmen.add("Emil");
        seznamJmen.add("Vladimír");
        seznamJmen.add("Vladimíra");
        seznamJmen.add("Jana");
        seznamJmen.add("Vanesa");
        seznamJmen.add("Viola");
        seznamJmen.add("Filip");
        seznamJmen.add("Valdemar");
        seznamJmen.add("Vilém");
        seznamJmen.add("Viliam");
        seznamJmen.add("Maxmilián");
        seznamJmen.add("Maxim");
        seznamJmen.add("Ferdinand");
        seznamJmen.add("Kamila");
        assertEquals(seznamJmen, svatky.getSeznamJmen());
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, int)}
     */
    @Test
    void pridatSvatekDenMesicInt() {
        //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
        Svatky svatky = new Svatky();
        assertFalse(svatky.jeVSeznamu("Anna"));
        svatky.pridejSvatek("Anna", 26, 7);
        assertTrue(svatky.jeVSeznamu("Anna"));
        assertEquals(MonthDay.of(7, 26), svatky.vratKdyMaSvatek("Anna"));
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, Month)}
     */
    @Test
    void pridatSvatekDenMesicMonth() {
        //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
        Svatky svatky = new Svatky();
        assertFalse(svatky.jeVSeznamu("Anna"));
        svatky.pridejSvatek("Anna", 26, Month.JULY);
        assertTrue(svatky.jeVSeznamu("Anna"));
        assertEquals(MonthDay.of(7, 26), svatky.vratKdyMaSvatek("Anna"));
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, MonthDay)}
     */
    @Test
    void prridatSvatekMonthDay() {
        //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
        Svatky svatky = new Svatky();
        assertFalse(svatky.jeVSeznamu("Anna"));
        svatky.pridejSvatek("Anna", MonthDay.of(7, 26));
        assertTrue(svatky.jeVSeznamu("Anna"));
        assertEquals(MonthDay.of(7, 26), svatky.vratKdyMaSvatek("Anna"));
    }

    /**
     * Testuje metodu {@link Svatky#smazSvatek(String)}
     */
    @Test
    void smazatSvatek() {
        //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
        Svatky svatky = new Svatky();
        assertTrue(svatky.jeVSeznamu("Zikmund"));
        svatky.smazSvatek("Zikmund");
        assertFalse(svatky.jeVSeznamu("Zikmund"));
    }
}
