package org.example.withOutPathern;
public class Student {
        private String name;
        private int grade;
        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
        public void giveReward() {
            switch (grade) {
                case 1:
                    System.out.println(name + ", ánimo para la próxima y un abrazo.");
                    break;
                case 2:
                    System.out.println(name + ", ánimo para la próxima, un abrazo y un caramelo.");
                    break;
                case 3:
                    System.out.println(name + ", ánimo, un abrazo y un chocolate.");
                    break;
                case 4:
                    System.out.println(name + ", felicitaciones, un abrazo, un cuaderno nuevo y un chocolate.");
                    break;
                case 5:
                    System.out.println(name + ", felicitaciones, un helado, un cuaderno nuevo, un abrazo y un chocolate.");
                    break;
                default:
                    System.out.println(name + ", la nota ingresada no es válida.");
                    break;
            }
        }
    }