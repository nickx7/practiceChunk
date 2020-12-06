public class dailyByte{
    public static void main(String[] args){
        dailyByte obj1 = new dailyByte();
        System.out.println("The first Daily Byte Test $" +obj1.func(10101010));
    }

    public int func(int x){
        int sum=100000000;
        return sum+x;
    }
}