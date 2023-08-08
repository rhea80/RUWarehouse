package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile("purchaseproduct.in");
        StdOut.setFile("purchaseproduct.out");

        int number = StdIn.readInt();
        Warehouse w = new Warehouse();

        for (int i = 0; i < number; i++){
            if(StdIn.readString().equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString(); 
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();

                w.addProduct(id, name, stock, day, demand);


            }
            else{
               
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                
                w.purchaseProduct(id, day, amount);


            }
        }
        StdOut.print(w);

        }
    }
