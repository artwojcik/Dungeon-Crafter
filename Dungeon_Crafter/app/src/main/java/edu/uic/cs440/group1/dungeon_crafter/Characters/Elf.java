package edu.uic.cs440.group1.dungeon_crafter.Characters;

import edu.uic.cs440.group1.dungeon_crafter.Models.Position;

/**
 * Created by Artur on 3/16/2018.
 */

public class Elf extends Player {
    public Elf(int strength, int intelligence, Position position,
               int playerId, boolean turn) {

        super(strength, intelligence, position, playerId, turn);
        setAttackRange(2);
    }

    @Override
    public void attack() {
        super.attack();
    }
}
