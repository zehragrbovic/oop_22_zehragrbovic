public class Task1 {
    
    public static void main(String[] args) {
        CivilService civil = new CivilService();

        System.out.println(civil.getDaysLeft());
        civil.work();
        System.out.println(civil.getDaysLeft());

        MilitaryService military = new MilitaryService(15);

        System.out.println(military.getDaysLeft());
        military.work();
        System.out.println(military.getDaysLeft());
    }

}
