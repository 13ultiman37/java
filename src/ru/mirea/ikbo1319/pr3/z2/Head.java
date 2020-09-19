package ru.mirea.ikbo1319.pr3.z2;

public class Head {
    String haircolor, eyecolor, name;

    public Head(String haircolor, String eyecolor, String name) {
        this.haircolor = haircolor;
        this.eyecolor = eyecolor;
        this.name = name;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
