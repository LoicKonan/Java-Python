
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
    int legs;
    boolean tails;
    boolean brain;
    int neurons;
    double precision;
    int birthDate;
    String fav_Foods;

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

    public void Eat() {}

    public void Walk() {}

    public void Sleep() {}

    public String Animal_Infos() 
    {

        return ("Number of Legs:             " + legs + "\n" 
                + "Tail?                     " + tails + "\n" 
                + "Brain?                    " + brain + "\n"
                + "Number of Neurons:        " + neurons + "\n" 
                + "Precision to understand:  " + precision
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
        File file = new File("Outfile.txt");

        PrintStream printing = new PrintStream(file);
        System.setOut(printing);

        /**
         * c. Create at least 5 animals from each family.
         */
        
        // 5 Mammalia Animals.
        Mammalia Mammalia1 = new Mammalia(4, true, true, 18, 50.0, 1500, "Grass");
        Mammalia Mammalia2 = new Mammalia(4, true, true, 20, 60.0, 1500, "Grass");
        Mammalia Mammalia3 = new Mammalia(4, true, true, 28, 50.0, 1500, "Grass");
        Mammalia Mammalia4 = new Mammalia(4, true, true, 85, 60.0, 1500, "Grass");
        Mammalia Mammalia5 = new Mammalia(4, true, true, 58, 80.0, 1500, "Grass");
        
        
        // 5 Monotremata Animals.
        Monotremata Monotremata1 = new Monotremata(4, true, true, 28, 10.0, 1300, "milk");
        Monotremata Monotremata2 = new Monotremata(4, true, true, 38, 50.0, 1300, "milk");
        Monotremata Monotremata3 = new Monotremata(4, true, true, 58, 60.0, 1300, "milk");
        Monotremata Monotremata4 = new Monotremata(4, true, true, 15, 80.0, 1300, "milk");
        Monotremata Monotremata5 = new Monotremata(4, true, true, 10, 60.0, 1300, "milk");


        // 5 Theria Animals.
        Theria Theria1 = new Theria(4, true, true, 10, 60.0, 1300, "milk");


        // 5 Marsupialia Animals.
        Marsupialia 

        
        // 5 Placentalia Animals.
        Placentalia 

        // 5 Atlantogenata Animals.
        Atlantogenata 
        
        // 5 Boreoeutheria Animals.
        Boreoeutheria 
        
        // 5 Afrotheria Animals.
        Afrotheria 
        
        // 5 Xenarthra Animals.
        Xenarthra 
        
        // 5 Theria Animals.
        Euarchontoglires 
        
        // 5 Laurasiatheria Animals.
        Laurasiatheria 
        
        
        // 5 Euarchonta Animals.
        Euarchonta 
        
        
        // 5 Glires Animals.
        Glires 
        
        // 5 Scrotifera Animals.
        Scrotifera 
        
        
        // 5 Eulipotyphia Animals.
        Eulipotyphia 
        
        
        
        // 5 Chirpotera Animals.
        Chirpotera 
        
        
        // 5 Euungulata Animals.
        Euungulata 
        
        
        // 5 Ferae Animals.
        Ferae 
        
        
        // 5 Cetartiodactyla Animals.
        Cetartiodactyla 
        
        
        // 5 Perissodactyla Animals.
        Perissodactyla 
        
        
        // 5 Pholidota Animals.
        Pholidota 
        
        // 5 Carnivora Animals.
        Carnivora 
    }
}