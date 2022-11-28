package com.java.programs;

public class CouplingInJava {

        public static void main(String args[]) {
            Box b = new Box(3, 3, 3);
            System.out.println(b.volume);

    }

    static class Box {
        public int volume;
        Box(int length, int width, int height) {
            this.volume = length * width * height;
        }
    }
}


