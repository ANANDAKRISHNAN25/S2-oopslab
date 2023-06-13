public class product{
    int pcode;
    String pname;
    float price;
    product(int code, String name,float rate){
    pcode=code;
    pname=name;
    price=rate;
    }
    void display(){
        System.out.println(pcode+"\t\t"+pname+"\t"+price);
    }
    static void lowest(float p1, float p2, float p3){
        if(p1<p2&&p1<p3)
        {    
            System.out.println("Product 1 has the lowest price");
        }
        else if(p2<p1&&p2<p3){
            System.out.println("Product 2 has the lowest price");
        }
        else if(p3<p1&&p2>p3)
        {
            System.out.println("Product 3 has the lowest price");
    
        }
    }
    public static void main(String[] args) {
        product obj1=new product(1,"JAM     ",70);
        product obj2=new product(2,"PICKLE  ",60);
        product obj3=new product(3,"BIRIYANI",100);
        System.out.println("\nProduct Information\n\nProduct_Code\tProduct_Name\tProduct_Price");
        obj1.display();
        obj2.display();
        obj3.display();
        lowest(obj1.price,obj2.price,obj3.price);
    }
       
    }