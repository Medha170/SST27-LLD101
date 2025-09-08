package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public void move(){
        System.out.println("Moving with golden aura");
        character.move();
    }

    @Override
    public void attack(){
        System.out.println("Attacking with golden aura");
        character.attack();
    }

    @Override
    public String getSprite(){
        return "golden_aura_" + character.getSprite();
    }
    
}
