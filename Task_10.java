public class Task_10 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        String breed = args[2];

        dog.setName(name);
        dog.setAge(age);
        dog.setBreed(breed);

        System.out.println(dog.getDescription());
    }

    public static class Dog {
        private String name;
        private int age;
        private String breed;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getDescription() {
            String ageString = age == 1 ? "год" : age <= 4 ? "года" : "лет";
            return "Name of the dog: " + name + ", age: " + age + " " + ageString + ", breed: " + breed;
        }
    }
}
