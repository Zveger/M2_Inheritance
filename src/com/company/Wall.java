/* Module 2. Task 2
 * Classname: Rectangle
 *
 * Version 1
 *
 * Zviertsev Herman, NTU KhPI
 *
 *1. Create a child  from the class Rectangle.
 *2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */
package com.company;

public  class Wall extends Rectangle{

    String color;
    String material;
    boolean isPlaster;
    int pricePlasterPermeter;
    int priceForColoringForMeter;
    boolean isBase;
    int windowsAmount;
    int doorsAmount;

    public Wall(int id, int length, int width, String color, String material,
                boolean isPlaster, int pricePlasterPermeter,
                int priceForColoringForMeter, boolean isBase,
                int windowsAmount,  int doorsAmount) {
        super(id, length, width);
        this.color = color;
        this.material = material;
        this.isPlaster = isPlaster;
        this.pricePlasterPermeter = pricePlasterPermeter;
        this.priceForColoringForMeter = priceForColoringForMeter;
        this.isBase = isBase;
        this.windowsAmount = windowsAmount;
        this.doorsAmount = doorsAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isPlaster() {
        return isPlaster;
    }

    public void setPlaster(boolean plaster) {
        isPlaster = plaster;
    }

    public int getPricePlasterPermeter() {
        return pricePlasterPermeter;
    }

    public void setPricePlasterPermeter(int pricePlasterPermeter) {
        this.pricePlasterPermeter = pricePlasterPermeter;
    }

    public int getPriceForColoringForMeter() {
        return priceForColoringForMeter;
    }

    public void setPriceForColoringForMeter(int priceForColoringForMeter) {
        this.priceForColoringForMeter = priceForColoringForMeter;
    }

    public boolean isBase() {
        return isBase;
    }

    public void setBase(boolean base) {
        isBase = base;
    }

    public int getWindowsAmount() {
        return windowsAmount;
    }

    public void setWindowsAmount(int windowsAmount) {
        this.windowsAmount = windowsAmount;
    }

    public int getDoorsAmount() {
        return doorsAmount;
    }

    public void setDoorsAmount(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }

    public int getPlasterPrice(){

        return (int) super.getArea() * this.getPricePlasterPermeter();
    }
    public int getColorPrice(){

        return (int) super.getArea() * this.getPriceForColoringForMeter();
    }
    public int getholesAmount(){
        return this.doorsAmount + this.windowsAmount;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "length= " + super.getLength()+
                "width= " + super.getWidth()+
                "area= " + super.getArea()+

                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", isPlaster=" + isPlaster +
                ", pricePlasterPermeter=" + pricePlasterPermeter +
                ", priceForColoringForMeter=" + priceForColoringForMeter +
                ", isBase=" + isBase +
                ", windowsAmount=" + windowsAmount +
                "holes amount = " + this.getholesAmount() +
                "Coloring price = " + this.getColorPrice() +
                "Plaster price = " + this.getPlasterPrice()+
                 '}';
    }
}