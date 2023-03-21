public class Task_11 {
    public static void main(String[] args) {
        String type = args[0];

        String name = args[1];
        int age = Integer.parseInt(args[2]);
        double weight = Double.parseDouble(args[3]);

        if (type.equals("animal")){
            Animal animal =
                    new Animal(name, age, weight);
            System.out.println(animal.getDescription());
        }

        if (type.equals("cat")){
            String breed = args[4];
            String color = args[5];
            Cat cat = new Cat(name, age, weight, breed, color);
            System.out.println(cat.getDescription());
        }
    }

    public static class Animal {
        private final String name;
        private final int age;
        private final double weight;

        public Animal(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        public String getDescription() {
            String ageString = age == 1 ? "год" : age <= 4 ? "года" : "лет";
            return "An animal named " + name + ", age " + age + " " + ageString + ", weight " + weight + " kg";
        }
    }

    public static class Cat extends Animal {
        private final String breed;
        private final String color;

        public Cat(String name, int age, double weight, String breed, String color) {
            super(name, age, weight);
            this.breed = breed;
            this.color = color;
        }

        @Override
        public String getDescription() {
            return "A cat named " + getName() + ", age " + getAge()
                    + ", weight " + getWeight() + " kg, breed " + breed + ", color " + color;
        }
    }
}
