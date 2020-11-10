package ru.mirea.ikbo1319.pr16;

import java.util.ArrayList;

public class Game {
    public void motion(ArrayList<Integer> first, ArrayList<Integer> second) {

        if (first.get(0) > second.get(0)) {
            if(second.get(0) != 0) {
                first.add(first.get(0));
                first.add(second.get(0));
            }
            else {
                second.add(first.get(0));
                second.add(second.get(0));
            }
        }

        else {
            if(first.get(0) != 0) {
                second.add(first.get(0));
                second.add(second.get(0));
            }
            else{
                first.add(first.get(0));
                first.add(second.get(0));
            }
        }
    }

    public ArrayList<Integer> res(ArrayList<Integer> player) {
        ArrayList<Integer> help = new ArrayList<>();
        for (int i = 1; i < player.size(); i++) {
            help.add(player.get(i));
        }
        return help;
    }
}