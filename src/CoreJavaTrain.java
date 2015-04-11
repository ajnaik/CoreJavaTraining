/**
 * Created by Aby on 4/11/2015.
 */
public class CoreJavaTrain {

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        //Mobile m2 = new Mobile();
        int i;
        m1.init("HTC","ONE",200);

        m1.display();

        Mobile [] mobiles = new Mobile[5];

        for (i = 0;i < mobiles.length;i++){
            mobiles[i]= new Mobile();
            mobiles[i].init();
            mobiles[i].display();
        }
    }
}
