
/******************************************************************************
 * Author:      Loic Konan 
 * Email:       loickonan.lk@gmail.com 
 * Label:       Question 2
 * Title:       Programing Assignment 02
 * Course:      CMPS 4143 
 * Semester:    Fall 2021 
 * Date:        10/10/2021
 * 
 * Description:
 *              Creating multiples class about this Mammalia family 
 *              (can be found in https://en.wikipedia.org/wiki/Mammal).
 *              Storing all the outcomes in a file. 
 * 
 * Solution:
 *               
 *
 * Files:   
 *              Question_2.java
 *              input.txt
 *   
 *****************************************************************************/

import java.io.*;
import java.io.File;
import java.io.PrintStream;


class Mammalia 
{
    /**
     * All of the instances variables below.
     */
    int legs;
    boolean tails;
    boolean brain;
    int neurons;
    double precision;
    int birthDate;
    String fav_Foods;


    /**
     * Our Constructor.
     * @param legs
     * @param brain
     * @param tails
     * @param neurons
     * @param precision
     * @param birthDate
     * @param fav_Foods
     */
    Mammalia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        this.legs = legs;
        this.brain = brain;
        this.neurons = neurons;
        this.tails = tails;
        this.precision = precision;
        this.birthDate = birthDate;
        this.fav_Foods = fav_Foods;
    }

    /**
     * 
     * Setters and Getters Functions to access or to change any
     * attributes that we want.
     * 
     */

    public void set_fav_Foods(String fav_Foods) 
    {
        this.fav_Foods = fav_Foods;
    }

    public String get_fav_Foods() 
    {
        return fav_Foods;
    }

    public void set_birthDate(int birthDate) 
    {
        this.birthDate = birthDate;
    }

    public int get_birthDate() 
    {
        return birthDate;
    }

    public void set_precision(double precision) 
    {
        this.precision = precision;
    }

    public double get_precision() 
    {
        return precision;
    }

    public void set_neurons(int neurons) 
    {
        this.neurons = neurons;
    }

    public int get_neurons() 
    {
        return neurons;
    }

    public void set_brain(boolean brain) 
    {
        this.brain = brain;
    }

    public boolean get_brain() 
    {
        return brain;
    }

    public void set_tails(boolean tails) 
    {
        this.tails = tails;
    }

    public boolean get_tails() 
    {
        return tails;
    }

    public void set_legs(int legs) 
    {
        this.legs = legs;
    }

    public int get_legs() 
    {
        return legs;
    }


    /** 
     *  Member functions Below.
     */
    public void Eat() {}
    public void Walk() {}
    public void Sleep() {}

    /**
     *  To Display the information about that class.
     * @return String
     */
    public String Animal_Infos() 
    {

        return ("Number of Legs:             " + legs + "\n" 
                + "Tail?                     " + tails + "\n" 
                + "Brain?                    " + brain + "\n"
                + "Number of Neurons:        " + neurons + "\n" 
                + "Precision to understand:  " + precision + "\n"
                + "Birth Date:               " + birthDate + "\n"
                + "Favorite Food:            " + fav_Foods + "\n");
    }
}



class Monotremata extends Mammalia 
{
    Monotremata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Theria extends Mammalia 
{
    Theria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Marsupialia extends Theria 
{
    Marsupialia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Placentalia extends Theria 
{
    Placentalia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Atlantogenata extends Placentalia 
{
    Atlantogenata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Boreoeutheria extends Placentalia 
{
    Boreoeutheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Afrotheria extends Atlantogenata 
{
    Afrotheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Xenarthra extends Atlantogenata 
{
    Xenarthra(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Euarchontoglires extends Boreoeutheria 
{
    Euarchontoglires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Laurasiatheria extends Boreoeutheria 
{
    Laurasiatheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Euarchonta extends Euarchontoglires 
{
    Euarchonta(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Glires extends Euarchontoglires 
{
    Glires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Scrotifera extends Laurasiatheria 
{
    
    int Running_Speed = 0;
    String Hunting_Process;

    Scrotifera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Eulipotyphia extends Laurasiatheria 
{
    
    int Running_Speed = 0;
    String Hunting_Process;

    Eulipotyphia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Chirpotera extends Scrotifera 
{
    Chirpotera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Euungulata extends Scrotifera 
{
    Euungulata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Ferae extends Scrotifera 
{

    Ferae(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Cetartiodactyla extends Euungulata 
{
    Cetartiodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Perissodactyla extends Euungulata 
{
    Perissodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }

    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Pholidota extends Ferae 
{
    Pholidota(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }


    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


class Carnivora extends Ferae 
{
    Carnivora(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods);
    }


    @Override
    public String Animal_Infos() 
    {
        return (super.Animal_Infos() + "\n");
    }

    @Override
    public void Eat() {}

    @Override
    public void Walk() {}

    @Override
    public void Sleep() {}
}


public class Question_2 
{
    public static void main(String[] args) throws FileNotFoundException 
    {
        /**
         * Printing to a file 
         * For all the Mammalia family information.
         */
        File file = new File("Outfile.txt");

        PrintStream printing = new PrintStream(file);
        System.setOut(printing);

        /**
         * Question c:
         * 
         * Create at least 5 animals from each family.
         */
        
        System.out.println("-------------------------------------------------");
        System.out.println(" Displaying 5 Animals from the Mammalia Family");
        System.out.println("-------------------------------------------------\n");
        System.out.println("-------------------------------------------------");

        // 5 Mammalia Animals.
        Mammalia Mammalia1 = new Mammalia(4, true, true, 18, 50.0, 1500, "Grass");
        System.out.println("I am Mammalia 1 from the Mammalia Family\n"+"----------------------------------------\n"+Mammalia1.Animal_Infos());

        Mammalia Mammalia2 = new Mammalia(4, true, true, 20, 60.0, 1500, "Grass");
        System.out.println("I am Mammalia 2 from the Mammalia Family\n"+"----------------------------------------\n"+Mammalia2.Animal_Infos());

        Mammalia Mammalia3 = new Mammalia(4, true, true, 28, 50.0, 1500, "Grass");
        System.out.println("I am Mammalia 3 from the Mammalia Family\n"+"----------------------------------------\n"+Mammalia3.Animal_Infos());

        Mammalia Mammalia4 = new Mammalia(4, true, true, 85, 60.0, 1500, "Grass");
        System.out.println("I am Mammalia 4 from the Mammalia Family\n"+"----------------------------------------\n"+Mammalia4.Animal_Infos());

        Mammalia Mammalia5 = new Mammalia(4, true, true, 58, 80.0, 1500, "Grass");
        System.out.println("I am Mammalia 5 from the Mammalia Family\n"+"----------------------------------------\n"+Mammalia5.Animal_Infos());


        System.out.println("\n\n-------------------------------------------------");
        System.out.println("Displaying 5 Animals from the Monotremata Family");
        System.out.println("-------------------------------------------------\n");
        System.out.println("-------------------------------------------------");

        // 5 Monotremata Animals.
        Monotremata Monotremata1 = new Monotremata(4, true, true, 28, 10.0, 1300, "milk");
        System.out.println("I am Monotremata 1 from the Monotremata Family\n"+"---------------------------------\n"+Monotremata1.Animal_Infos());

        Monotremata Monotremata2 = new Monotremata(4, true, true, 38, 50.0, 1300, "milk");
        System.out.println("I am Monotremata 2 from the Monotremata Family\n"+"---------------------------------\n"+Monotremata2.Animal_Infos());

        Monotremata Monotremata3 = new Monotremata(4, true, true, 58, 60.0, 1300, "milk");
        System.out.println("I am Monotremata 3 from the Monotremata Family\n"+"---------------------------------\n"+Monotremata3.Animal_Infos());

        Monotremata Monotremata4 = new Monotremata(4, true, true, 15, 80.0, 1300, "milk");
        System.out.println("I am Monotremata 4 from the Monotremata Family\n"+"---------------------------------\n"+Monotremata4.Animal_Infos());

        Monotremata Monotremata5 = new Monotremata(4, true, true, 10, 60.0, 1300, "milk");
        System.out.println("I am Monotremata 5 from the Monotremata Family\n"+"---------------------------------\n"+Monotremata5.Animal_Infos());


        System.out.println("\n\n-------------------------------------------------");
        System.out.println(" Displaying 5 Animals from the Theria Family");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        // 5 Theria Animals.
        Theria Theria1 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass");
        System.out.println("I am Theria 1 from the Theria Family\n"+"---------------------------------\n"+Theria1.Animal_Infos());

        Theria Theria2 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass");
        System.out.println("I am Theria 2 from the Theria Family\n"+"---------------------------------\n"+Theria2.Animal_Infos());

        Theria Theria3 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass");
        System.out.println("I am Theria 3 from the Theria Family\n"+"---------------------------------\n"+Theria3.Animal_Infos());

        Theria Theria4 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass");
        System.out.println("I am Theria 4 from the Theria Family\n"+"---------------------------------\n"+Theria4.Animal_Infos());

        Theria Theria5 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass");
        System.out.println("I am Theria 5 from the Theria Family\n"+"---------------------------------\n"+Theria5.Animal_Infos());


        System.out.println("\n\n-------------------------------------------------");
        System.out.println(" Displaying 5 Animals from the Marsupialia Family");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");


        // 5 Marsupialia Animals.
        Marsupialia Marsupialia1 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass");
        System.out.println("I am Marsupialia 1 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia1.Animal_Infos());

        Marsupialia Marsupialia2 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass");
        System.out.println("I am Marsupialia 2 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia2.Animal_Infos());

        Marsupialia Marsupialia3 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass");
        System.out.println("I am Marsupialia 3 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia3.Animal_Infos());

        Marsupialia Marsupialia4 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass");
        System.out.println("I am Marsupialia 4 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia4.Animal_Infos());

        Marsupialia Marsupialia5 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass");
        System.out.println("I am Marsupialia 5 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia5.Animal_Infos());


        System.out.println("\n\n-------------------------------------------------");
        System.out.println("Displaying 5 Animals from the Placentalia Family");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");

        // 5 Placentalia Animals.
        Placentalia Placentalia1 = new Placentalia(4, true, true, 10, 60.0, 1300, "Meat");
        Placentalia Placentalia2 = new Placentalia(4, true, true, 10, 60.0, 1300, "Meat");
        Placentalia Placentalia3 = new Placentalia(4, true, true, 10, 60.0, 1300, "Meat");
        Placentalia Placentalia4 = new Placentalia(4, true, true, 10, 60.0, 1300, "Meat");
        Placentalia Placentalia5 = new Placentalia(4, true, true, 10, 60.0, 1300, "Meat");


        // 5 Atlantogenata Animals.
        Atlantogenata Atlantogenata1 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk");
        Atlantogenata Atlantogenata2 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk");
        Atlantogenata Atlantogenata3 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk");
        Atlantogenata Atlantogenata4 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk");
        Atlantogenata Atlantogenata5 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk");

        
        // 5 Boreoeutheria Animals.
        Boreoeutheria Boreoeutheria1 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass");
        Boreoeutheria Boreoeutheria2 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass");
        Boreoeutheria Boreoeutheria3 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass");
        Boreoeutheria Boreoeutheria4 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass");
        Boreoeutheria Boreoeutheria5 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass");

        
        // 5 Afrotheria Animals.
        Afrotheria Afrotheria1 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish");
        Afrotheria Afrotheria2 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish");
        Afrotheria Afrotheria3 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish");
        Afrotheria Afrotheria4 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish");
        Afrotheria Afrotheria5 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish");
        

        // 5 Xenarthra Animals.
        Xenarthra Xenarthra1 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass");
        Xenarthra Xenarthra2 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass");
        Xenarthra Xenarthra3 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass");
        Xenarthra Xenarthra4 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass");
        Xenarthra Xenarthra5 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass");

        
        // 5 Theria Animals.
        Euarchontoglires Euarchontoglires1 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat");
        Euarchontoglires Euarchontoglires2 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat");
        Euarchontoglires Euarchontoglires3 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat");
        Euarchontoglires Euarchontoglires4 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat");
        Euarchontoglires Euarchontoglires5 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat");

        
        // 5 Laurasiatheria Animals.
        Laurasiatheria Laurasiatheria1 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits");
        Laurasiatheria Laurasiatheria2 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits");
        Laurasiatheria Laurasiatheria3 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits");
        Laurasiatheria Laurasiatheria4 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits");
        Laurasiatheria Laurasiatheria5 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits");
        
        
        // 5 Euarchonta Animals.
        Euarchonta Euarchonta1 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk");
        Euarchonta Euarchonta2 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk");
        Euarchonta Euarchonta3 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk");
        Euarchonta Euarchonta4 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk");
        Euarchonta Euarchonta5 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk");
        
        
        // 5 Glires Animals.
        Glires Glires1 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits");
        Glires Glires2 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits");
        Glires Glires3 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits");
        Glires Glires4 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits");
        Glires Glires5 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits");

        
        // 5 Scrotifera Animals.
        Scrotifera Scrotifera1 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk");
        Scrotifera Scrotifera2 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk");
        Scrotifera Scrotifera3 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk");
        Scrotifera Scrotifera4 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk");
        Scrotifera Scrotifera5 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk");
        
        
        // 5 Eulipotyphia Animals.
        Eulipotyphia Eulipotyphia1 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut");
        Eulipotyphia Eulipotyphia2 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut");
        Eulipotyphia Eulipotyphia3 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut");
        Eulipotyphia Eulipotyphia4 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut");
        Eulipotyphia Eulipotyphia5 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut");        
        
        
        // 5 Chirpotera Animals.
        Chirpotera Chirpotera1 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana");
        Chirpotera Chirpotera2 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana");
        Chirpotera Chirpotera3 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana");
        Chirpotera Chirpotera4 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana");
        Chirpotera Chirpotera5 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana");
        
        
        // 5 Euungulata Animals.
        Euungulata Euungulata1 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk");
        Euungulata Euungulata2 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk");
        Euungulata Euungulata3 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk");
        Euungulata Euungulata4 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk");
        Euungulata Euungulata5 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk");
        
        
        // 5 Ferae Animals.
        Ferae Ferae1 = new Ferae(4, true, true, 10, 60.0, 500, "Beans");
        Ferae Ferae2 = new Ferae(4, true, true, 10, 60.0, 500, "Beans");
        Ferae Ferae3 = new Ferae(4, true, true, 10, 60.0, 500, "Beans");
        Ferae Ferae4 = new Ferae(4, true, true, 10, 60.0, 500, "Beans");
        Ferae Ferae5 = new Ferae(4, true, true, 10, 60.0, 500, "Beans");
        
        
        // 5 Cetartiodactyla Animals.
        Cetartiodactyla Cetartiodactyla1 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass");
        Cetartiodactyla Cetartiodactyla2 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass");
        Cetartiodactyla Cetartiodactyla3 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass");
        Cetartiodactyla Cetartiodactyla4 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass");
        Cetartiodactyla Cetartiodactyla5 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass");
        
        
        // 5 Perissodactyla Animals.
        Perissodactyla Perissodactyla1 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass");
        Perissodactyla Perissodactyla2 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass");
        Perissodactyla Perissodactyla3 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass");
        Perissodactyla Perissodactyla4 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass");
        Perissodactyla Perissodactyla5 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass");
        
        
        // 5 Pholidota Animals.
        Pholidota Pholidota1 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak");
        Pholidota Pholidota2 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak");
        Pholidota Pholidota3 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak");
        Pholidota Pholidota4 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak");
        Pholidota Pholidota5 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak");

        
        // 5 Carnivora Animals.
        Carnivora Carnivora1 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat");
        Carnivora Carnivora2 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat");
        Carnivora Carnivora3 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat");
        Carnivora Carnivora4 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat");
        Carnivora Carnivora5 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat");


        /**
         * Question d:
         * 
         * Now you can do some creativity by changing the neurons, precision to understand, 
         * food habits, but you can’t change the legs, brains, birth date. 
         * Change these features for at least 20 animals and show how it was before and how it is now. 
         * From level 6 to 8(Considering Mammlia as level-1 and carnivora, cetartiodactyla are on level-8), 
         * animals can run and hunt for their food. Change at least 10 animals’ running speed, 
         * hunting process and hunting food type for those who are 6-8 level animals. 
         * Try changing at least 10 animals and show (reading from files; see next bullet) 
         * what they were and what they are now.
         */

      



         


    }
}