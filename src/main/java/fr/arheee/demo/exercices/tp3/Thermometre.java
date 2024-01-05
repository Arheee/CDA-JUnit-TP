package fr.arheee.demo.exercices.tp3;

public class Thermometre {

        public static int findClosestTemperature(int[] temperatures) {
            if (temperatures.length == 0) {
                return 0;
            }
            int closestTemperature = temperatures[0];
            for (int temperature : temperatures) {
                if (Math.abs(temperature) < Math.abs(closestTemperature) ||
                        (Math.abs(temperature) == Math.abs(closestTemperature) && temperature > 0)) {
                    closestTemperature = temperature;
                }
            }

            return closestTemperature;
        }

}
