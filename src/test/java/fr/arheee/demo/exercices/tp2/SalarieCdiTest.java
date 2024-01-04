package fr.arheee.demo.exercices.tp2;

import fr.arheee.demo.exercices.tp2.Identite;
import fr.arheee.demo.exercices.tp2.Salaire;
import fr.arheee.demo.exercices.tp2.SalarieCdi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SalarieCdiTest {

    @Mock
    private Salaire salaireMock;

    @Mock
    private Identite identiteMock;

    private SalarieCdi salarieCdi;


    @BeforeEach
    public void setUp() {

        salarieCdi = new SalarieCdi(salaireMock, identiteMock);
    }

    @ParameterizedTest
    @CsvSource({
            "200, 2000",
            "160, 1620.7"
    })
    @DisplayName("Test paramétré de la méthode travailler pour SalarieCdi")
    public void testTravailler(double heuresTravaillees, double expectedSalaire) {
        when(salaireMock.payer(heuresTravaillees)).thenReturn(expectedSalaire);
        salarieCdi.travailler(heuresTravaillees);
        verify(
                salaireMock,
                times(1))
                .payer(heuresTravaillees);

    }

    @Test
    @DisplayName("Test demenager pour SalarieCdi")
    public void testDemenager() {
        Adresse nouvelleAdresse = new Adresse("123", "Rue du mock", "75000", "Paris", "France");
        salarieCdi.demenager(nouvelleAdresse);
        verify(identiteMock, times(1)).setAdresse(nouvelleAdresse);
    }


    @Test
    @DisplayName("Test augmenter pour SalarieCdi")
    public void testAugmenter() {
        double pourcentageAugmentation = 20;
        when(salaireMock.getTauxHoraire()).thenReturn(10.0);
        salarieCdi.augmenter(pourcentageAugmentation);
        verify(salaireMock, times(1)).augmenter(pourcentageAugmentation);

        assertEquals(12.0, salarieCdi.getSalaire().getTauxHoraire(), 0.0001);
    }
}






