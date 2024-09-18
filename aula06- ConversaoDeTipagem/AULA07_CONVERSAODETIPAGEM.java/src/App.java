public class App {
    public static void main(String[] args) throws Exception {
        String st, st2, st3,st4;
        float real, real2;
        int inteiro, inteiro2;

        //string para real
        st="1.2";
        real = (float) (new Float(st).floatValue());
        System.out.println("string para real: " + real);

        // real para string 
        real2= 1.3f;
        st2 = new Float(real2).toString();
        System.out.println("Real para String: " + st2);

        //String para inteiro 
        st3 = "15";
        inteiro2 = Integer.parseInt(st3)+1;
        System.out.println("String para inteiro: " + inteiro2);

        //Inteiro para String
        inteiro2 = 25;
        st4 = Integer.toString(inteiro2);
        System.out.println("inteiro para string: " + st4);

    }
}
