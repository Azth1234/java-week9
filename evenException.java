public class evenException {
    static void division(int n) throws Exception{
        if(n%2==0){
            throw new Exception("Invalid Input: even number");
        }
        else{
            System.out.println("Valid number:"+n);
        }
    }
    public static void main(String[] args){
        try {
            division(4);
        } catch (Exception e) {
            System.out.println("[Exception Occurred] "+e.getMessage());;
        }
    }
}
