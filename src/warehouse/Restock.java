package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile("restock.in");
        StdOut.setFile("restock.out");
        int number = StdIn.readInt();
        Warehouse house = new Warehouse();
       // Product yay = new Product(StdIn.readInt(), StdIn.readString(),StdIn.readInt(), StdIn.readInt(), StdIn.readInt());
        for (int i = 0; i < number; i++){
            if(StdIn.readString().equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString(); 
                int initial = StdIn.readInt();
                int demand = StdIn.readInt();
                Product yes = new Product(id, name, initial, day, demand);
                house.addProduct(id, name, initial, day, demand);


            }
            else{
               
                int id = StdIn.readInt();
              
                int demand = StdIn.readInt(); 
                
                house.restockProduct(id, demand);


            }
        }
        StdOut.print(house);
    }
}