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

    /**@
     * Test paramétré methode Travailler de SalarieCdi
     * @param heuresTravaillees les heures travaillées par le salarié en CDI
     * @param expectedSalaire le salaire calculé à partir des heures travaillées
     */
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
        Adresse adresseMock = mock(Adresse.class);
        salarieCdi.demenager(adresseMock);
        verify(identiteMock, times(1)).setAdresse(adresseMock);
    }


    /**@
     * Test de la méthode augmenter pour SalarieCdi
     * @param pourcentageAugmentation le pourcentage d'augmentation
     * @param tauxHoraireInitial le taux horaire avant l'augmentation
     * @param excepted le nouveau taux horaire balèze parce qu'on aime la tune
     */

    @ParameterizedTest
    @CsvSource({
            "20, 10, 12",
            "20, 20, 24"
    })
    @DisplayName("Test augmenter pour SalarieCdi")
    public void testAugmenter(double pourcentageAugmentation, double tauxHoraireInitial, double excepted) {
        when(salaireMock.getTauxHoraire()).thenReturn(tauxHoraireInitial);
        salarieCdi.augmenter(pourcentageAugmentation);
        verify(salaireMock, times(1)).setTauxHoraire(excepted);
    }
}






