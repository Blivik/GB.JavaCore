package Gb.company;

import java.util.ArrayList;

public class Box<T extends Fruits>  {
   ArrayList <T> boxes;


    public Box() {
        boxes = new ArrayList<>();
        
    }

    public double getWeightOfBox(){
        return boxes.get(0).getWeight() * boxes.size();
    }

    public boolean compare(Box<?> box) {
        if (this.getWeightOfBox() > box.getWeightOfBox()) {
            return true;
        } else {
            return false;
        }
    }
    public void addFruitToBox(T t){

        boxes.add(t);
    }
    public void changeBox(Box<? super T> anotherBox){
       if (! boxes.isEmpty()){
          for (T boxes : boxes){
              anotherBox.addFruitToBox(boxes);
          }
          boxes.clear();
       }

    }
}
