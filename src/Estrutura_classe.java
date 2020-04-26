public class Estrutura_classe {
    static int i;

    public static void main(String[] a) {
        for (new Estrutura_classe().i = 10; new Estrutura_classe().i < 100;
             new Estrutura_classe().i++) {
            System.out.println(i);
        }
    }
}

//class Test {
//    static int x = 15;
//
//    public static void main(String[] x) {
//        x = 200;
//        System.out.println(x);
//    }
//}

class X {
    int j = -100;

    X(int i) {
        if (i >= 1)
            return;
        j = i;
    }

    void getJ() {
        System.out.println("o valor de J: " + this.j);
    }

    public static void main(String[] args) {
        X x = new X(1);
        x.getJ();
    }
}

interface Authentication {
    final int PASSWORD_LENGTH = 8;

    void authenticate(String login, String password);
}