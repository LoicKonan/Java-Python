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
class Mammalia
{
    int legs;
    boolean tails;
    boolean brain;
    int neurons;
    double precision;
    int birthDate;
    String fav_Foods;
    
    public void eat(){}
    public void walk(){}
    public void sleep(){}
    public void give_birth(){}

    Mammalia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id)
    {
        this.legs = legs;
        this.brain = brain;
        this.neurons = neurons;
        this.tails = tails;
        this.precision = precision;
        this.birthDate = birthDate;
        this.fav_Foods = fav_id;
    }
}

class Monotremata extends Mammalia
{

    Monotremata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}
class Theria extends Mammalia
{

    Theria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Marsupialia extends Theria
{

    Marsupialia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Placentalia extends Theria
{

    Placentalia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Atlantogenata extends Placentalia
{

    Atlantogenata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Boreoeutheria extends Placentalia
{

    Boreoeutheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Afrotheria extends Atlantogenata
{

    Afrotheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Xenarthra extends Atlantogenata
{

    Xenarthra(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Euarchontoglires extends Boreoeutheria
{

    Euarchontoglires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_id) 
            {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Laurasiatheria extends Boreoeutheria
{

    Laurasiatheria(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_id) 
            {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Euarchonta extends Euarchontoglires
{

    Euarchonta(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Glires extends Euarchontoglires
{

    Glires(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Scrotifera extends Laurasiatheria
{

    Scrotifera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Eulipotyphia extends Laurasiatheria
{

    Eulipotyphia(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Chirpotera extends Scrotifera
{

    Chirpotera(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Euungulata extends Scrotifera
{

    Euungulata(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Ferae extends Scrotifera
{

    Ferae(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Cetartiodactyla extends Euungulata
{

    Cetartiodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_id) 
            {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Perissodactyla extends Euungulata
{

    Perissodactyla(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate,
            String fav_id) 
            {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Pholidota extends Ferae
{

    Pholidota(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

class Carnivora extends Ferae
{

    Carnivora(int legs, boolean brain, boolean tails, int neurons, double precision, int birthDate, String fav_id) 
    {
        super(legs, brain, tails, neurons, precision, birthDate, fav_id);
        //TODO Auto-generated constructor stub
    }
}

//class Perivora extends perissodactyla, carnivora {}


public class Question_2 
{
    public static void main(String[] args) 
    {
        Theria Theria1 = new Theria();
        Theria Boreoeutheria1 = new Boreoeutheria();
        Theria Xenarthra1 = new Xenarthra();
        Theria Glires1 = new Glires();
        Theria Ferae1 = new Ferae();
    }
}