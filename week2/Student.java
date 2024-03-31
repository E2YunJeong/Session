public class Student extends Person{
    private String name;

    public Student(float height, float weight, String name) {
        super(height, weight);
        // 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출할 때 사용
        // 자식 클래스의 생성자 내에서 무조건 첫번째 줄에 위치해야 함
        // super() 사용 x -> 부모 클래스의 기본생성자 호출
        // 단, 부모 클래스에 기본생성자가 정의되어 있지 않으면 에러 발생
        this.name = name;
    }

    public void printIntro(){
        System.out.println(this.name + "의 키는 " + this.getHeight() + "cm 이고, 몸무게는 " + this.getWeight() + "이므로 BMI수치는 " + this.getBMI() + "입니다.");
    }

    public void say(){
        System.out.println("안녕");
    }
}
