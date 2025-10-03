public class Math {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        System.out.println("the area of our triangle is going to be :" + findArea(a, b));
    }
    public static int findArea(int a, int b){
        int area = a * b;
        return area;
    }
}
