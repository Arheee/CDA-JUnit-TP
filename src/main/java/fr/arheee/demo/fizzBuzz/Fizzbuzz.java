package fr.arheee.demo.fizzBuzz;

public class Fizzbuzz {

    //number % 3 == 0 ça veut dire number est un multiple de 3

    /**
     * Retourne Fizz si multiple de 3,
     * Retourne Buzz si multiple de 5,
     * Retourne FizzBuzz si multiple de 3 et de 5
     * @param number nombre
     * @return
     */
    public String say(int number){

        if(number % 15 == 0) return "FizzBuzz";

        if(number % 3== 0) return "Fizz";

        if(number % 5 == 0) return "Buzz";

        return String.valueOf(number);
    }
}