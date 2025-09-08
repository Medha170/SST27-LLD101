package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    int boost;
    public SpeedBoost(Character character, int boost) {
        super(character);
        this.boost = boost;
    }
    @Override
    public void move() {
        System.out.println("Moving at speed " + character.getSpeed() + boost + " with sprite " + character.getSprite());
    }
    
    @Override
    public int getSpeed() {
        return character.getSpeed() + boost;
    }
}
