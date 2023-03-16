package day1.Storage1;

public class Task4 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("0" , "value0_1");
        storage.addToStorage("0" , "value0_2");
       storage.addToStorage("1" , "value1_1");
       storage.addToStorage("1" , "value0_1");
       storage.addToStorage("2" , "value2_1");
        System.out.println("printValues");
        storage.printValue("0");
        storage.findValue("value0_1");
        

    }

}
