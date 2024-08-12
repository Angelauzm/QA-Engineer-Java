public class Lesson_3 {
    static class Animal {
        String name;
        int distanceRunLimit;
        int distanceSwimLimit;
        boolean isHungry = true;

        public Animal(String name) {
            this.name = name;
        }

        public void run(int distance) {
            if (distance <= distanceRunLimit) {
                System.out.println("Животное пробежало " + distance + " м.");
            } else {
                System.out.println("Животное не смогло пробежать такое расстояние");
            }
        }

        public void swim(int distance) {
            if (distance <= distanceSwimLimit) {
                System.out.println("Животное проплыло " + distance + " м.");
            } else {
                System.out.println("Животное не смогло проплыть такое расстояние");
            }
        }

        public  void eat(int foodAmount) {
            if (foodAmount >= 0) {
                isHungry = false;
                System.out.println("Еды хватило, животное наелось");
            } else {
                System.out.println("Еды не хватило (");
            }
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            super(name);
            distanceRunLimit = 200;
            distanceSwimLimit = 0;
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            super(name);
            distanceRunLimit = 500;
            distanceSwimLimit = 10;
        }
    }

    static class Bowl {
        int foodAmount;

        public void addFood(int amount) {
            foodAmount += amount;
        }

        public int getFoodAmount() {
            return foodAmount;
        }
    }


        public static void main(String[] args) {
            Bowl bowl = new Bowl();
            bowl.addFood(20);

            Cat cat1 = new Cat("Масяня");
            Cat cat2 = new Cat("Царапка");
            Dog dog = new Dog("Шарик");

            System.out.println("Первое животное: " + cat1.name);
            cat1.run(160);
            cat1.swim(150);

            System.out.println("Второе животное: " + cat2.name);
            cat2.run(300);
            cat2.swim(0);

            System.out.println("Третье животное: " + dog.name);
            dog.run(30);
            dog.swim(356);

            Animal[] animals = {cat1, cat2, dog};

            for (Animal animal : animals) {
                animal.eat(bowl.getFoodAmount());
                System.out.println("Животное с именем " + animal.name +  " голодно: " + animal.isHungry);
        }
    }
}
