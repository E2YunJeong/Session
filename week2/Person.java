public class Person {
    private float height;
    private float weight;

    public float getBMI(){
        float BMI = this.weight / ((this.height/100) * (this.height/100));
        return BMI;
    }

    public void say(){
        System.out.println("응애");
    }

    public Person(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

}
