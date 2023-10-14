public class Person{

    public String name;
    public int age;
    public int grade;

    Person() {
//        this.name = name;
//        this.age = age;
//        this.grade = grade;
    };

    public static boolean isAlpha(String s) {
        if(s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!( c >= 'A' && c <= 'Z' ) && !( c >= 'a' && c <= 'z' ) && !(c == ' ' || c == '-')) {
                return false;
            }
        }
        return true;
    }

    public static boolean inRange0(int i) {
        if(i > 30 && i <200){
            return true;
        }
        return false;
    }

    public static boolean inRange1(int i) {
        if(i >= 1 && i <=5){
            return true;
        }
        return false;
    }

    void setAge(int age){
        if (inRange0(age)){
            this.age = age;
        }
    }

    void setName(String name) {
        if(isAlpha(name)){
            this.name = name;
        }
    }

    void setGrade(int grade){
        if (inRange1(grade)){
            this.grade = grade;
        }
    }
}
