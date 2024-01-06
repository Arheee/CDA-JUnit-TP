package fr.arheee.demo.exercices.tp3;

public class Thermometre {

    /**
     *  Trouve la température la plus proche de zéro dans un tableau.
     * @param temperatures Un tableau d'entiers représentant les différentes température
     * @return la temperature la plus proche de zero
     * @throws IllegalArgumentException Si le nombre de mesures est supérieur à 10000.
     */
        public static int findClosestTemperature(int[] temperatures) {
            if (temperatures.length == 0) {
                return 0;
            }
            int closestTemperature = temperatures[0];

            //for temperature : temperatures pour les flemmards ...
            for (int index = 1 ; index < temperatures.length ; index ++) {
                int temperature = temperatures[index];
                if (Math.abs(temperature) < Math.abs(closestTemperature) ||
                        (Math.abs(temperature) == Math.abs(closestTemperature) && temperature > 0)) {
                    closestTemperature = temperature;
                }
            }
            if (temperatures.length > 10000) {
                throw new IllegalArgumentException("Maximum allowed is 10000.");
            }

            return closestTemperature;
        }





}
