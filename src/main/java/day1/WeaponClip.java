package day1;

import java.util.Stack;

public class WeaponClip {
    private final Stack<String> weaponClip = new Stack<>();
    private final  int maxNumberOfBullet;

    public WeaponClip(int clipCapacity) {
        maxNumberOfBullet  = clipCapacity;

    }
    public void loadBullet(String bullet) throws IllegalAccessException
    {
        if(maxNumberOfBullet == weaponClip.size()){
            throw new IllegalAccessException("Clip is fill");

        }
        weaponClip.push(bullet);
    }
    public boolean isLoaded(){
        return !weaponClip.empty();
    }
    public void shot (){
        if (!isLoaded() ){
            System.out.println("Clip is empty");
        } else {
            System.out.println(weaponClip.pop());
        }


    }
}
