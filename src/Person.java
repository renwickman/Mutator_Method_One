public class Person{
    public int age;
    public int wisdom;
    public int fitness;

    public Person(int inputAge){
        this.age = inputAge;
        this.wisdom = inputAge * 5;
        this.fitness = 100 - inputAge;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setWisdom(int newWisdom){
        this.wisdom = newWisdom;
    }

    public void setFitness(int newFitness){
        this.fitness = newFitness;
    }

    public void hasBirthday(){
        //Complete this method
        this.setAge(age + 1);
        this.setWisdom(wisdom + 5);
        this.setFitness(fitness - 3);
    }
}