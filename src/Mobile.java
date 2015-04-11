/**
 * Created by Aby on 4/10/2015.
 */
public class Mobile {
    private String company;
    private String model;
    private int price;

    void init(){
        company = "unknown";
        model = "unknown";
        price = 0;

    }

    void init(String c, String m, int p){
        company = c;
        model = m;
        price = p;
    }

    void display(){
        if(company != null) {
            System.out.println("Company Name: " + company);
            System.out.println("Model: " + model);
            System.out.println("Price :" + price);
        }
        else{
            System.out.println("Please Init");
        }

    }

}
