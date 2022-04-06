public class Mainnn extends Abstrak {

    @Override
    void bersuara() {
        System.out.println("Abstrak bersuara");
    }

    @Override
    void berkembangbiak() {
        System.out.println("Abstrak berkembangbiak");
    }

    @Override
    void jalan(){
        System.out.println("Abstrak jalan");
    }
    public static void main(String[] args) {
        
        Mainnn m = new Mainnn();
        m.bersuara();
        m.berkembangbiak();
        m.jalan();
    }
        
}    