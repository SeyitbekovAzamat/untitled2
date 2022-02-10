package com.company;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossDefenseType;
    public void printInfo(){
        System.out.println("Boss info: bossHealth-" +this.bossHealth+"bossDamage"+this.bossDamage+"bossDefenseType"+this.bossDefenseType);
    }

    public Boss(int bossHealth , int bossDamage, String bossDefenseType) {
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage(String bossDefenseType) {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDefenseType() {
        return bossDefenseType;
    }

    public void setBossDefenseType(String bossDefenseType) {
        this.bossDefenseType = bossDefenseType;
    }
}
