public class Main {
    public static void main(String[] args) {
        Lamp mijnLamp = new Lamp();
        mijnLamp.setMerk("Luma");
        mijnLamp.setVermogen(30);

        String uitkomst = mijnLamp.toString();

        System.out.println(mijnLamp.toString());

    }
}