package Gb.company;

public class Main {

    public static void main(String[] args) {
	Box<Apple> box1 = new Box();
    Box<Orange> box2 = new Box();



        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();

        box2.addFruitToBox(orange1);
        box2.addFruitToBox(orange2);
        box2.addFruitToBox(orange3);
        box2.addFruitToBox(orange4);
        box2.addFruitToBox(orange5);
        box2.addFruitToBox(orange6);

        box1.addFruitToBox(apple1);
        box1.addFruitToBox(apple2);
        box1.addFruitToBox(apple3);
        box1.addFruitToBox(apple4);

        System.out.println(box1.getWeightOfBox());
        System.out.println(box2.getWeightOfBox());

        System.out.println(box1.compare(box2));
    }

    static void changeArray(Object[] array, int firstIndex, int secondIndex){
        Object element = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex]=element;

    }

}
