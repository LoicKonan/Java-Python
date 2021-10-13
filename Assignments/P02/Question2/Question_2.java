
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
    int Running_Speed = 0;
    String Hunting_Process = "None";
    String fav_Foods;

    /**
     *  Constructor.
     * @param legs
     * @param brain
     * @param tails
     * @param neurons
     * @param precision
     * @param birthDate
     * @param fav_Foods
     * @param Running_Speed
     * @param Hunting_Process
     */
    Mammalia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
    String Hunting_Process) 
    {
        this.legs = legs;
        this.brain = brain;
        this.neurons = neurons;
        this.tails = tails;
        this.precision = precision;
        this.birthDate = birthDate;
        this.fav_Foods = fav_Foods;
        this.Hunting_Process = Hunting_Process;
        this.Running_Speed = Running_Speed;
    }

    /**
     * 
     * Setters and Getters Functions to access or to change any
     * attributes that we want.
     * 
     */

    public void set_Running_Speed(int Running_Speed) 
    {
        this.Running_Speed = Running_Speed;
    }

    public int get_Running_Speed() 
    {
        return Running_Speed;
    }

    public void set_Hunting_Process(String Hunting_Process) 
    {
        this.Hunting_Process = Hunting_Process;
    }

    public String get_Hunting_Process() 
    {
        return Hunting_Process;
    }

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
                + "Favorite Food:            " + fav_Foods + "\n"
                + "Running Speed:            " + Running_Speed + "\n"
                + "Hunting Process:          " + Hunting_Process + "\n"
                );
    }
}



class Monotremata extends Mammalia 
{
    Monotremata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
    String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Theria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
    String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Marsupialia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
    String Hunting_Process)  
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Placentalia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
    String Hunting_Process)  
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Atlantogenata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
    String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Boreoeutheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
    String Hunting_Process)   
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Afrotheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
    String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Xenarthra(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
    String Hunting_Process)  
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Euarchontoglires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
                    String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Laurasiatheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
                    String Hunting_Process)
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Euarchonta(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
                String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Glires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, int Running_Speed,
                String Hunting_Process)   
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Scrotifera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, 
                int Running_Speed, String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Eulipotyphia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, 
    int Running_Speed, String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Chirpotera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, 
    int Running_Speed, String Hunting_Process)  
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Euungulata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, 
    int Running_Speed, String Hunting_Process)   
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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

    Ferae(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, 
            int Running_Speed, String Hunting_Process)   
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Cetartiodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, 
    int Running_Speed, String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Perissodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, 
    int Running_Speed, String Hunting_Process) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Pholidota(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, 
    int Running_Speed, String Hunting_Process)   
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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
    Carnivora(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_Foods, 
    int Running_Speed, String Hunting_Process)   
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_Foods, Running_Speed, Hunting_Process);
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

        // 5 Mammalia Animals.
        Mammalia Mammalia1 = new Mammalia(4, true, true, 18, 50.0, 1500, "Grass", 0, null);
        System.out.println("My name is Mammalia 1 from the Mammalia Family\n"+"-------------------------------------------------\n"+Mammalia1.Animal_Infos());

        Mammalia Mammalia2 = new Mammalia(4, true, true, 20, 60.0, 1500, "Grass", 0, null);
        System.out.println("My name is Mammalia 2 from the Mammalia Family\n"+"-------------------------------------------------\n"+Mammalia2.Animal_Infos());

        Mammalia Mammalia3 = new Mammalia(4, true, true, 28, 50.0, 1500, "Grass", 0, null);
        System.out.println("My name is Mammalia 3 from the Mammalia Family\n"+"-------------------------------------------------\n"+Mammalia3.Animal_Infos());

        Mammalia Mammalia4 = new Mammalia(4, true, true, 85, 60.0, 1500, "Grass", 0, null);
        System.out.println("My name is Mammalia 4 from the Mammalia Family\n"+"-------------------------------------------------\n"+Mammalia4.Animal_Infos());

        Mammalia Mammalia5 = new Mammalia(4, true, true, 58, 80.0, 1500, "Grass", 0, null);
        System.out.println("My name is Mammalia 5 from the Mammalia Family\n"+"-------------------------------------------------\n"+Mammalia5.Animal_Infos());


        System.out.println("\n\n-------------------------------------------------");
        System.out.println("Displaying 5 Animals from the Monotremata Family");
        System.out.println("-------------------------------------------------\n");

        // 5 Monotremata Animals.
        Monotremata Monotremata1 = new Monotremata(4, true, true, 28, 10.0, 1300, "milk", 0, null);
        System.out.println("My name is Monotremata 1 from the Monotremata Family\n"+"-------------------------------------------\n"+Monotremata1.Animal_Infos());

        Monotremata Monotremata2 = new Monotremata(4, true, true, 38, 50.0, 1300, "milk", 0, null);
        System.out.println("My name is Monotremata 2 from the Monotremata Family\n"+"-------------------------------------------\n"+Monotremata2.Animal_Infos());

        Monotremata Monotremata3 = new Monotremata(4, true, true, 58, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Monotremata 3 from the Monotremata Family\n"+"-------------------------------------------\n"+Monotremata3.Animal_Infos());

        Monotremata Monotremata4 = new Monotremata(4, true, true, 15, 80.0, 1300, "milk", 0, null);
        System.out.println("My name is Monotremata 4 from the Monotremata Family\n"+"-------------------------------------------\n"+Monotremata4.Animal_Infos());

        Monotremata Monotremata5 = new Monotremata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Monotremata 5 from the Monotremata Family\n"+"-------------------------------------------\n"+Monotremata5.Animal_Infos());


        System.out.println("\n\n-------------------------------------------------");
        System.out.println(" Displaying 5 Animals from the Theria Family");
        System.out.println("-------------------------------------------------");

        // 5 Theria Animals.
        Theria Theria1 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass", 0, null);
        System.out.println("My name is Theria 1 from the Theria Family\n"+"-------------------------------------------------\n"+Theria1.Animal_Infos());;

        
        Theria Theria2 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass", 0, null);
        System.out.println("My name is Theria 2 from the Theria Family\n"+"---------------------------------\n"+Theria2.Animal_Infos());

        Theria Theria3 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass", 0, null);
        System.out.println("My name is Theria 3 from the Theria Family\n"+"---------------------------------\n"+Theria3.Animal_Infos());

        Theria Theria4 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass", 0, null);
        System.out.println("My name is Theria 4 from the Theria Family\n"+"---------------------------------\n"+Theria4.Animal_Infos());

        Theria Theria5 = new Theria(4, true, true, 10, 60.0, 1250, "Green Grass", 0, null);
        System.out.println("My name is Theria 5 from the Theria Family\n"+"---------------------------------\n"+Theria5.Animal_Infos());


        System.out.println("\n\n-------------------------------------------------");
        System.out.println(" Displaying 5 Animals from the Marsupialia Family");
        System.out.println("-------------------------------------------------");


        // 5 Marsupialia Animals.
        Marsupialia Marsupialia1 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Marsupialia 1 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia1.Animal_Infos());

        Marsupialia Marsupialia2 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Marsupialia 2 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia2.Animal_Infos());

        Marsupialia Marsupialia3 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Marsupialia 3 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia3.Animal_Infos());

        Marsupialia Marsupialia4 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Marsupialia 4 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia4.Animal_Infos());

        Marsupialia Marsupialia5 = new Marsupialia(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Marsupialia 5 from the Marsupialia Family\n"+"---------------------------------\n"+Marsupialia5.Animal_Infos());


        System.out.println("\n\n-------------------------------------------------");
        System.out.println("Displaying 5 Animals from the Placentalia Family");
        System.out.println("-------------------------------------------------");

        // 5 Placentalia Animals.
        Placentalia Placentalia1 = new Placentalia(4, true, true, 10, 60.0, 1300, "Meat", 0, null);
        System.out.println("My name is Placentalia 1 from the Placentalia Family\n"+"---------------------------------\n"+Placentalia1.Animal_Infos());

        Placentalia Placentalia2 = new Placentalia(4, true, true, 20, 60.0, 1300, "Meat", 0, null);
        System.out.println("My name is Placentalia 2 from the Placentalia Family\n"+"---------------------------------\n"+Placentalia2.Animal_Infos());

        Placentalia Placentalia3 = new Placentalia(4, true, true, 30, 60.0, 1300, "Meat", 0, null);
        System.out.println("My name is Placentalia 3 from the Placentalia Family\n"+"---------------------------------\n"+Placentalia3.Animal_Infos());

        Placentalia Placentalia4 = new Placentalia(4, true, true, 40, 60.0, 1300, "Meat", 0, null);
        System.out.println("My name is Placentalia 4 from the Placentalia Family\n"+"---------------------------------\n"+Placentalia4.Animal_Infos());

        Placentalia Placentalia5 = new Placentalia(4, true, true, 60, 60.0, 1300, "Meat", 0, null);
        System.out.println("My name is Placentalia 5 from the Placentalia Family\n"+"---------------------------------\n"+Placentalia5.Animal_Infos());



        System.out.println("\n\n-------------------------------------------------");
        System.out.println("Displaying 5 Animals from the Atlantogenata Family");
        System.out.println("-------------------------------------------------");

        // 5 Atlantogenata Animals.
        Atlantogenata Atlantogenata1 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Atlantogenata 1 from the Atlantogenata Family\n"+"---------------------------------\n"+Atlantogenata1.Animal_Infos());

        Atlantogenata Atlantogenata2 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Atlantogenata 2 from the Atlantogenata Family\n"+"---------------------------------\n"+Atlantogenata2.Animal_Infos());

        Atlantogenata Atlantogenata3 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Atlantogenata 3 from the Atlantogenata Family\n"+"---------------------------------\n"+Atlantogenata3.Animal_Infos());

        Atlantogenata Atlantogenata4 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Atlantogenata 4 from the Atlantogenata Family\n"+"---------------------------------\n"+Atlantogenata4.Animal_Infos());

        Atlantogenata Atlantogenata5 = new Atlantogenata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Atlantogenata 5 from the Atlantogenata Family\n"+"---------------------------------\n"+Atlantogenata5.Animal_Infos());


        
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("Displaying 5 Animals from the Boreoeutheria Family");
        System.out.println("-------------------------------------------------");

        // 5 Boreoeutheria Animals.
        Boreoeutheria Boreoeutheria1 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Boreoeutheria 1 from the Boreoeutheria Family\n"+"---------------------------------\n"+Boreoeutheria1.Animal_Infos());

        Boreoeutheria Boreoeutheria2 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Boreoeutheria 2 from the Boreoeutheria Family\n"+"---------------------------------\n"+Boreoeutheria2.Animal_Infos());

        Boreoeutheria Boreoeutheria3 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Boreoeutheria 3 from the Boreoeutheria Family\n"+"---------------------------------\n"+Boreoeutheria3.Animal_Infos());

        Boreoeutheria Boreoeutheria4 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Boreoeutheria 4 from the Boreoeutheria Family\n"+"---------------------------------\n"+Boreoeutheria4.Animal_Infos());

        Boreoeutheria Boreoeutheria5 = new Boreoeutheria(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Boreoeutheria 5 from the Boreoeutheria Family\n"+"---------------------------------\n"+Boreoeutheria5.Animal_Infos());


        
        // 5 Afrotheria Animals.
        Afrotheria Afrotheria1 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish", 0, null);
        System.out.println("My name is Afrotheria 1 from the Afrotheria Family\n"+"---------------------------------\n"+Afrotheria1.Animal_Infos());

        Afrotheria Afrotheria2 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish", 0, null);
        Afrotheria Afrotheria3 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish", 0, null);
        Afrotheria Afrotheria4 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish", 0, null);
        Afrotheria Afrotheria5 = new Afrotheria(4, true, true, 10, 60.0, 1300, "Fish", 0, null);
        

        // 5 Xenarthra Animals.
        Xenarthra Xenarthra1 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        System.out.println("My name is Xenarthra 1 from the Xenarthra Family\n"+"---------------------------------\n"+Xenarthra1.Animal_Infos());

        Xenarthra Xenarthra2 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        Xenarthra Xenarthra3 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        Xenarthra Xenarthra4 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass", 0, null);
        Xenarthra Xenarthra5 = new Xenarthra(4, true, true, 10, 60.0, 1300, "Grass", 0, null);

        
        // 5 Theria Animals.
        Euarchontoglires Euarchontoglires1 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat", 0, null);
        System.out.println("My name is Euarchontoglires 1 from the Euarchontoglires Family\n"+"---------------------------------\n"+Euarchontoglires1.Animal_Infos());

        Euarchontoglires Euarchontoglires2 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat", 0, null);
        Euarchontoglires Euarchontoglires3 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat", 0, null);
        Euarchontoglires Euarchontoglires4 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat", 0, null);
        Euarchontoglires Euarchontoglires5 = new Euarchontoglires(4, true, true, 10, 60.0, 1300, "Meat", 0, null);

        
        // 5 Laurasiatheria Animals.
        Laurasiatheria Laurasiatheria1 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);
        System.out.println("My name is Laurasiatheria 1 from the Laurasiatheria Family\n"+"---------------------------------\n"+Laurasiatheria1.Animal_Infos());

        
        Laurasiatheria1.set_neurons(20);
        Laurasiatheria1.set_precision(50);
        Laurasiatheria1.set_fav_Foods("Birds");

        System.out.println("I now the new version of Laurasiatheria 1 from the Carnivora Family\n"+"---------------------------------\n"+Laurasiatheria1.Animal_Infos());

        Laurasiatheria Laurasiatheria2 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);
        Laurasiatheria Laurasiatheria3 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);
        Laurasiatheria Laurasiatheria4 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);
        Laurasiatheria Laurasiatheria5 = new Laurasiatheria(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);
        
        
        // 5 Euarchonta Animals.
        Euarchonta Euarchonta1 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Euarchonta 1 from the Euarchonta Family\n"+"---------------------------------\n"+Euarchonta1.Animal_Infos());

        Euarchonta1.set_neurons(20);
        Euarchonta1.set_precision(50);
        Euarchonta1.set_fav_Foods("Birds");

        System.out.println("I now the new version of Euarchonta 1 from the Carnivora Family\n"+"---------------------------------\n"+Euarchonta1.Animal_Infos());

        Euarchonta Euarchonta2 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        Euarchonta Euarchonta3 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        Euarchonta Euarchonta4 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        Euarchonta Euarchonta5 = new Euarchonta(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        
        
        // 5 Glires Animals.
        Glires Glires1 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);
        System.out.println("My name is Glires 1 from the Glires Family\n"+"---------------------------------\n"+Glires1.Animal_Infos());

        Glires1.set_neurons(20);
        Glires1.set_precision(50);
        Glires1.set_fav_Foods("Birds");
        Glires1.set_Running_Speed(45);
        Glires1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Glires1.Animal_Infos());

        Glires Glires2 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);
        Glires Glires3 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);
        Glires Glires4 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);
        Glires Glires5 = new Glires(4, true, true, 10, 60.0, 1300, "Fruits", 0, null);

        
        // 5 Scrotifera Animals.
        Scrotifera Scrotifera1 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Scrotifera 1 from the Scrotifera Family\n"+"---------------------------------\n"+Scrotifera1.Animal_Infos());

        Scrotifera1.set_neurons(20);
        Scrotifera1.set_precision(50);
        Scrotifera1.set_fav_Foods("Birds");

        Scrotifera1.set_Running_Speed(45);
        Scrotifera1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Scrotifera1.Animal_Infos());

        Scrotifera Scrotifera2 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        Scrotifera Scrotifera3 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        Scrotifera Scrotifera4 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        Scrotifera Scrotifera5 = new Scrotifera(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        
        
        // 5 Eulipotyphia Animals.
        Eulipotyphia Eulipotyphia1 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut", 0, null);
        System.out.println("My name is Eulipotyphia 1 from the Eulipotyphia Family\n"+"---------------------------------\n"+Eulipotyphia1.Animal_Infos());

        Eulipotyphia1.set_neurons(20);
        Eulipotyphia1.set_precision(50);
        Eulipotyphia1.set_fav_Foods("Birds");

        Eulipotyphia1.set_Running_Speed(45);
        Eulipotyphia1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Eulipotyphia1.Animal_Infos());

        Eulipotyphia Eulipotyphia2 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut", 0, null);
        Eulipotyphia Eulipotyphia3 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut", 0, null);
        Eulipotyphia Eulipotyphia4 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut", 0, null);
        Eulipotyphia Eulipotyphia5 = new Eulipotyphia(4, true, true, 10, 60.0, 1300, "Peanut", 0, null);        
        
        
        // 5 Chirpotera Animals.
        Chirpotera Chirpotera1 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana", 0, null);
        System.out.println("My name is Chirpotera 1 from the Chirpotera Family\n"+"---------------------------------\n"+Chirpotera1.Animal_Infos());

        Chirpotera1.set_neurons(20);
        Chirpotera1.set_precision(50);
        Chirpotera1.set_fav_Foods("Birds");

        Chirpotera1.set_Running_Speed(45);
        Chirpotera1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Chirpotera1.Animal_Infos());

        Chirpotera Chirpotera2 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana", 0, null);
        Chirpotera Chirpotera3 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana", 0, null);
        Chirpotera Chirpotera4 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana", 0, null);
        Chirpotera Chirpotera5 = new Chirpotera(4, true, true, 10, 60.0, 1300, "Banana", 0, null);
        
        
        // 5 Euungulata Animals.
        Euungulata Euungulata1 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        System.out.println("My name is Euungulata 1 from the Euungulata Family\n"+"---------------------------------\n"+Euungulata1.Animal_Infos());

        Euungulata1.set_neurons(20);
        Euungulata1.set_precision(50);
        Euungulata1.set_fav_Foods("Birds");

        Euungulata1.set_Running_Speed(45);
        Euungulata1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Euungulata1.Animal_Infos());

        Euungulata Euungulata2 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        Euungulata Euungulata3 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        Euungulata Euungulata4 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        Euungulata Euungulata5 = new Euungulata(4, true, true, 10, 60.0, 1300, "milk", 0, null);
        
        
        // 5 Ferae Animals.
        Ferae Ferae1 = new Ferae(4, true, true, 10, 60.0, 500, "Beans", 0, null);
        System.out.println("My name is Ferae 1 from the Ferae Family\n"+"---------------------------------\n"+Ferae1.Animal_Infos());

        Ferae1.set_neurons(20);
        Ferae1.set_precision(50);
        Ferae1.set_fav_Foods("Birds");

        Ferae1.set_Running_Speed(45);
        Ferae1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Ferae1.Animal_Infos());

        Ferae Ferae2 = new Ferae(4, true, true, 10, 60.0, 500, "Beans", 0, null);
        Ferae Ferae3 = new Ferae(4, true, true, 10, 60.0, 500, "Beans", 0, null);
        Ferae Ferae4 = new Ferae(4, true, true, 10, 60.0, 500, "Beans", 0, null);
        Ferae Ferae5 = new Ferae(4, true, true, 10, 60.0, 500, "Beans", 0, null);
        
        
        // 5 Cetartiodactyla Animals.
        Cetartiodactyla Cetartiodactyla1 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass", 0, null);
        System.out.println("My name is Cetartiodactyla 1 from the Cetartiodactyla Family\n"+"---------------------------------\n"+Cetartiodactyla1.Animal_Infos());

        Cetartiodactyla1.set_neurons(20);
        Cetartiodactyla1.set_precision(50);
        Cetartiodactyla1.set_fav_Foods("Birds");

        Cetartiodactyla1.set_Running_Speed(45);
        Cetartiodactyla1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Cetartiodactyla1.Animal_Infos());

        Cetartiodactyla Cetartiodactyla2 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass", 0, null);
        Cetartiodactyla Cetartiodactyla3 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass", 0, null);
        Cetartiodactyla Cetartiodactyla4 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass", 0, null);
        Cetartiodactyla Cetartiodactyla5 = new Cetartiodactyla(4, true, true, 10, 60.0, 1300, "Green Grass", 0, null);
        
        
        // 5 Perissodactyla Animals.
        Perissodactyla Perissodactyla1 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass", 0, null);
        System.out.println("My name is Perissodactyla 1 from the Perissodactyla Family\n"+"---------------------------------\n"+Perissodactyla1.Animal_Infos());

        Perissodactyla1.set_neurons(20);
        Perissodactyla1.set_precision(50);
        Perissodactyla1.set_fav_Foods("Birds");
        Perissodactyla1.set_Running_Speed(45);
        Perissodactyla1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Perissodactyla1.Animal_Infos());

        Perissodactyla Perissodactyla2 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass", 0, null);
        Perissodactyla Perissodactyla3 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass", 0, null);
        Perissodactyla Perissodactyla4 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass", 0, null);
        Perissodactyla Perissodactyla5 = new Perissodactyla(4, true, true, 10, 60.0, 800, "Green Grass", 0, null);
        
        
        // 5 Pholidota Animals.
        Pholidota Pholidota1 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak", 0, null);
        System.out.println("My name is Pholidota1 1 from the Pholidota Family\n"+"---------------------------------\n"+Pholidota1.Animal_Infos());

        Pholidota1.set_neurons(20);
        Pholidota1.set_precision(50);
        Pholidota1.set_fav_Foods("Birds");
        Pholidota1.set_Running_Speed(45);
        Pholidota1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Pholidota1.Animal_Infos());

        Pholidota Pholidota2 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak", 0, null);
        Pholidota Pholidota3 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak", 0, null);
        Pholidota Pholidota4 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak", 0, null);
        Pholidota Pholidota5 = new Pholidota(4, true, true, 10, 60.0, 100, "Steak", 0, null);

        /**
         * d. Now you can do some creativity by changing the neurons, precision to understand, food
        habits, but you can’t change the legs, brains, birth date. Change these features for at
        least 20 animals and show how it was before and how it is now. From level 6 to
        8(Considering Mammlia as level-1 and carnivora, cetartiodactyla are on level-8), animals
        can run and hunt for their food. Change at least 10 animals’ running speed, hunting
        process and hunting food type for those who are 6-8 level animals. Try changing at least
        10 animals and show (reading from files; see next bullet) what they were and what they
        are now.
         */

        // 5 Carnivora Animals.
        Carnivora Carnivora1 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat", 0, null);
        System.out.println("My name is Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Carnivora1.Animal_Infos());

        Carnivora1.set_neurons(20);
        Carnivora1.set_precision(50);
        Carnivora1.set_fav_Foods("Birds");
        Carnivora1.set_Running_Speed(45);
        Carnivora1.set_Hunting_Process("Aggressive");

        System.out.println("I now the new version of Carnivora 1 from the Carnivora Family\n"+"---------------------------------\n"+Carnivora1.Animal_Infos());


        Carnivora Carnivora2 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat", 0, null);
        Carnivora Carnivora3 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat", 0, null);
        Carnivora Carnivora4 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat", 0, null);
        Carnivora Carnivora5 = new Carnivora(4, true, true, 10, 60.0, 2300, "Meat", 0, null);

      



         


    }
}