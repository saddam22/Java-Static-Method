
package StaticMethod;


public class StaticMethod {
    
    int rollno;
    String name;
    static String company = "WANBAHJAHKAS";
    
    static void change(){
    company = "Wan";
    }
    StaticMethod(int r, String n){
    
        rollno = r;
        name = n;
    }
    void display(){
        System.out.println(company + " " + rollno + " " + name);
    }
    
    public static void main(String[] args) {
        
        StaticMethod.change();
        
        StaticMethod s1 = new StaticMethod(1, " = Peaceful Life");
        StaticMethod s2 = new StaticMethod(2, " = Tournament");
        StaticMethod s3 = new StaticMethod(3, " = Sornolota IT");
        
        s1.display();
        s2.display();
        s3.display();
    }
}
