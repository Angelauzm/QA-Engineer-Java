public class Park {

    class Attraction {
        private String name;
        private String workingHours;
        private int cost;

        public Attraction(String name, String workingHours, int cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name + ", Время работы: " + workingHours + ", Стоимость: " + cost);
        }
    }

    private Attraction[] attractions;
    private int count;

    public Park(int size) {
        attractions = new Attraction[size];
        count = 0;
    }

    public void addAttraction(String name, String workingHours, int cost) {
        if (count < attractions.length) {
            attractions[count++] = new Attraction(name, workingHours, cost);
        } else {
            System.out.println("Невозможно добавить аттракцион: достигнуто максимальное количество");
        }
    }

    public void printAllAttractions() {
        for (int i = 0; i < count; i++) {
            attractions[i].printInfo();
        }
    }

    public static void main(String[] args) {

        Park park = new Park(3);
        park.addAttraction("Roller Coaster", "10:00-22:00", 300);
        park.addAttraction("Ferris Wheel", "09:00-21:00", 200);
        park.addAttraction("Haunted House", "11:00-20:00", 250);

        park.printAllAttractions();
    }
}

