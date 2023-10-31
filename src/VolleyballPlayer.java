public class VolleyballPlayer implements Restable, Trainable {
    //Да се създаде клас VolleyballPlayer с полета: име, възраст, позиция, умения (от 1 до 10), кондиция (от 1
    //до 5). И метод train(), който увеличава уменията му с 1 и намаля кондицията с 1. Ако кондицията е 1 -
    //не може да тренира. И метод rest(), който увеличава кондицията му с 1.
    protected String Name;
    protected int age;
    protected String position;
    protected int skills;
    protected int condition;

    public String getName() { return Name; }
    public int getAge() {
        return age;
    }
    public String getPosition() {
        return position;
    }
    public int getCondition() {
        return condition;
    }
    public VolleyballPlayer(String name, int age, String position, int skills, int condition) {
        Name = name;
        this.age = age;
        this.position = position;
        setSkills(skills);
        setCondition(condition);
    }
    public VolleyballPlayer(String name, int age, String position) {
        Name = name;
        this.age = age;
        this.position = position;
        this.skills = 10;
        this.condition = 5;
    }
    public void setSkills(int skills) {
        if (skills < 1 || skills > 10) {
            throw new IllegalArgumentException("Уменията трябва да са в диапазона [1 до 10].");
        }
        this.skills = skills;
    }

    public void setCondition(int condition) {
        if (condition < 1 || condition > 5) {
            throw new IllegalArgumentException("Кондицията трябва да е в диапазона [1 до 5].");
        }
        this.condition = condition;
    }
    public int getSkills() {
        return skills;
    }
    @Override
    public void rest() {
        this.condition ++;
        if (condition>10){
            this.condition = 10;
            System.out.println("Condition is in Maximum (10).");
        }
    }

    @Override
    public void train() {
        if (condition == 1) {
            throw new IllegalStateException("Играчът не може да тренира поради лоша кондиция в момента.");
        }
        setSkills(skills += 1);
        setCondition(condition -= 1);
    }

    @Override
    public String toString() {
        return "\n VolleyballPlayer{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", skills=" + skills +
                ", condition=" + condition +
                '}';
    }
}
