package FRQS;
import java.util.Random;


public class PasswordCZ {


    private static Random random = new Random();

    private String prefix;

    private static int passwordsGenerated =0;

    private int length;

    public PasswordCZ(int length,String prefix) {

        this.prefix = prefix;

        this.length = length;

    }

    public PasswordCZ(int length) {

        this.prefix = "A";

        this.length = length;

    }

    public String pwGen(){

        String pwd= this.prefix+".";

        for(int i=1;i<=this.length;i++){

            pwd+=random.nextInt(10);

        }

        passwordsGenerated+=1;

        return pwd;

    }

    public int pwCount(){

        return passwordsGenerated;

    }

    public static void main(String[] args) {

        PasswordCZ pw1 = new PasswordCZ(4,"chs");

        System.out.println(pw1.pwCount());

        System.out.println(pw1.pwGen());

        System.out.println(pw1.pwGen());

        System.out.println(pw1.pwCount());

        PasswordCZ pw2 = new PasswordCZ(6);

        System.out.println(pw2.pwCount());

        System.out.println(pw2.pwGen());

        System.out.println(pw2.pwCount());

        System.out.println(pw1.pwCount());

    }

}

