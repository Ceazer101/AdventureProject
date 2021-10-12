package com.company;

public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private String enemyWeaponName;
    private int enemyHealth;


    public Enemy(String enemyName, String enemyDescription, String enemyWeaponName, int enemyHealth){
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.enemyWeaponName = enemyWeaponName;
        this.enemyHealth = enemyHealth;


    }
    public String getEnemyName(){
        return enemyName;
    }
    public String getEnemyDescription(){
        return enemyDescription;
    }
    public String getEnemyWeaponName(){
        return enemyWeaponName;
    }
    public int getEnemyHealth(){
        return enemyHealth;
    }
    public void setEnemyHealth(int enemyHealth){
        this.enemyHealth = enemyHealth;
    }
    public int hitByPlayer(){
        return enemyHealth;
    }
    public void attackPlayer(){

    }

    @Override
    public String toString() {
        return enemyName + ", " + enemyDescription + ", equipped with a " + enemyWeaponName + ", " + enemyHealth + "HP";
    }
}
