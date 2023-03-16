package day1;

public class Task7 {
    public static void main(String[] args) throws IllegalAccessException {
        WeaponClip weaponClip = new WeaponClip(3);
        System.out.println("Weapon is loaded?" + weaponClip.isLoaded());
        weaponClip.loadBullet("1");
        weaponClip.loadBullet("2");
        weaponClip.loadBullet("3");
        System.out.println("Weapon is loaded?" + weaponClip.isLoaded());
        weaponClip.shot();
        weaponClip.shot();
        weaponClip.shot();
        System.out.println(weaponClip.isLoaded());
        weaponClip.shot();


        System.out.println();



    }
}
