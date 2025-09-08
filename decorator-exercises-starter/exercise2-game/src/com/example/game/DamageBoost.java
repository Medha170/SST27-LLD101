package com.example.game;

public class DamageBoost extends CharacterDecorator {
    int boost;
    public DamageBoost(Character character, int boost) {
        super(character);
        this.boost = boost;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with damage " + character.getDamage() + boost + " with sprite " + character.getSprite());
    }

    @Override
    public int getDamage() {
        return character.getDamage() + boost;
    }

    
    
}
