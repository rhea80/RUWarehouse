package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile("deleteproduct.in");
        StdOut.setFile("deleteproduct.out");
        int number = StdIn.readInt();
        Warehouse w = new Warehouse(); 
	// Use this file to test deleteProduct

        for (int i = 0; i < number; i++){
            if(StdIn.readString().equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString(); 
                int initial = StdIn.readInt();
                int demand = StdIn.readInt();
                //Product yes = new Product(id, name, initial, day, demand);
                w.addProduct(id, name, initial, day, demand);


            }
            else {
               
                int id = StdIn.readInt(); 
                
                w.deleteProduct(id);


            }
        }
        StdOut.print(w);

    }
}