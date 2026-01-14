package org.example;

public class Cat extends Animal {

    private String catName;
    private int catAge;
            Cat(String c,int catAge){
                this.catName=c;
                this.catAge=catAge;

    }
    public void makeMjau() {
        System.out.println("Make Mjau   1");
        super.makeSound();
    }
    public void makeMjau (String s){
        System.out.println(s);
    }
public int returnAge(){
        return catAge;
};
            public String returnName(){
                return catName;
            }

    public void makeScratch() {
        System.out.println("Make scratch");
    }

    public void eatFood() {
        System.out.println("Cat: Eating food now");
    }
}
