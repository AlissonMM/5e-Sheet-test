package com;


public class Character{
    private int Bstr, Bdex, Bcon, Binte, Bwis, Bcha, str, dex, con, inte, wis, cha, hp, ac, age, height, weight, lvl = 1, pro;
    private String eyes, skin, hair, name;

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBstr() {
        return Bstr;
    }

    public void setBstr(int bstr) {
        Bstr = bstr;
    }

    public int getBdex() {
        return Bdex;
    }

    public void setBdex(int bdex) {
        Bdex = bdex;
    }

    public int getBcon() {
        return Bcon;
    }

    public void setBcon(int bcon) {
        Bcon = bcon;
    }

    public int getBinte() {
        return Binte;
    }

    public void setBinte(int binte) {
        Binte = binte;
    }

    public int getBwis() {
        return Bwis;
    }

    public void setBwis(int bwis) {
        Bwis = bwis;
    }

    public int getBcha() {
        return Bcha;
    }

    public void setBcha(int bcha) {
        Bcha = bcha;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getPro() {
        return pro;
    }

    public void setPro(int pro) {
        this.pro = pro;
    }

     
    
    public void human(){
        this.str++;
        this.dex++;
        this.con++;
        this.inte++;
        this.wis++;
        this.cha++;
    }

    public void hillDwarf(){
        this.con += 2;
        this.wis++;
    }

    public void mountainDwarf(){
        this.con+=2;
        this.str+=2;
    }

    public void highElf(){
        this.dex += 2;
        this.inte++;
    }

    public void woodElf(){
        this.dex += 2;
        this.wis++;
    }

    public void drow(){
        this.dex += 2;
        this.cha++;
    }

    public void halflingLightFoot(){
        this.dex += 2;
        this.cha++;
    }

    public void halflingStout(){
        this.dex += 2;
        this.con++;
    }

    public void dragonborn(){
        this.str += 2;
        this.cha++;
    }

    public void forestGnome(){
        this.inte+=2;
        this.dex++;
    }

    public void rockGnome(){
        this.inte+=2;
        this.con++;
    }

    public void halfElf(){
        this.cha+=2;
    }

    public void halfOrc(){
        this.str+=2;
        this.con++;
    }

    public void Orc(){
        this.str+=2;
        this.con++;
        this.inte-=2;
    }

    public void tiefling(){
        this.inte++;
        this.cha+=2;
    }

    public void bugbear(){
        this.str+=2;
        this.dex++;
    }

    public void goblin(){
        this.dex+=2;
        this.con++;
    }

    public void hobgoblin(){
        this.con+=2;
        this.inte++;
    }

    public void kobold(){
        this.dex+=2;
        this.str-=2;
    }

    public void yuanTiPureBlood(){
        this.cha+=2;
        this.inte++;
    }

    public void aasimarProtector(){
        this.cha +=2;
        this.wis++;
    }

    public void aasimarScourge(){
        this.cha +=2;
        this.con++;
    }

    public void aasimarFallen(){
        this.cha +=2;
        this.str++;
    }

    public void firbolg(){
        this.wis+=2;
        this.str++;
    }

    public void goliath(){
        this.str+=2;
        this.con++;
    }

    public void lizardFolk(){
        this.con+=2;
        this.con++;
    }
    
    public void tabaxi(){
        this.dex+=2;
        this.cha++;
    }

    public void triton(){
        this.str++;
        this.con++;
        this.cha++;
    }
}