public class Lesson_3 {
   public static void main(String[] args) {
        // Создаем животных
        Dog bobik = new Dog("Бобик");
        Cat barsik = new Cat("Барсик");

        // Проверяем действия животных
        bobik.run(150);
        bobik.swim(10);
        barsik.run(200);
        barsik.swim(1);

        // Создаем массив котов и миску с едой
        Cat[] cats = {new Cat("Мурка"), new Cat("Васька"), new Cat("Пушок")};
        FoodBowl bowl = new FoodBowl(10);

        // Коты пытаются покушать
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        // Выводим информацию о сытости котов
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isHungry());
        }

        // Добавляем еду в миску
        bowl.addFood(5);
        System.out.println("В миске теперь " + bowl.getFoodAmount() + " еды.");
    }
}

class Animal {
    private String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance <= getMaxRunDistance()) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= getMaxSwimDistance()) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    protected int getMaxRunDistance() {
        return 0; // Базовый класс не может бежать
    }

    protected int getMaxSwimDistance() {
        return 0; // Базовый класс не может плавать
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    protected int getMaxRunDistance() {
        return 500;
    }

    @Override
    protected int getMaxSwimDistance() {
        return 10;
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean hungry = true;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    protected int getMaxRunDistance() {
        return 200;
    }

    @Override
    protected int getMaxSwimDistance() {
        return 0; // Коты не умеют плавать
    }

    public void eat(FoodBowl bowl) {
        if (bowl.getFoodAmount() >= 1 && hungry) {
            bowl.eatFood(1);
            hungry = false;
            System.out.println(getName() + " покушал из миски.");
        } else {
            System.out.println(getName() + " не стал есть.");
        }
    }

    public boolean isHungry() {
        return hungry;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void eatFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
        } else {
            System.out.println("В миске не хватает еды.");
        }
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

}
