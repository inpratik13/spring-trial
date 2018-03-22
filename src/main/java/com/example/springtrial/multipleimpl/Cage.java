package com.example.springtrial.multipleimpl;

public interface Cage<T extends Animal> {
	public String getName();

	public T getAnimal();
}
