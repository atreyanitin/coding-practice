package com.corejava.enumpractice;

public enum Color {

	RED(1),
	GREEN(2),
	BLUE(3);

	int value;

	//anything other than private or package is not allowed.
	private Color(int v) {
		value = v;
	}

	public int getValue() {

		return value;
	}

	public String toString() {

		switch(this) {

			case RED:
					return  "This color is RED and  value = "+ getValue();


			case GREEN:
					return  "This color is GREEN and  value = "+ getValue();

			case BLUE:
					return  "This color is BLUE and  value = "+ getValue();


		}
		return "";


	}

}