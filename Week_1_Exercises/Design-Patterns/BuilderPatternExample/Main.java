public class Main {
    public static void main(String[] args) {

        // computer 1
        Computer.Builder builder1 = new Computer.Builder();
        builder1.RAM("8 GB RAM").Storage("128 GB SSD Storage").CPU("Intel Core i7-12700K processor");
        Computer computer1 = builder1.build();
        System.out.println(computer1.toString());
        

        // Computer2
        Computer.Builder builder2 = new Computer.Builder();
        builder2.RAM("16 GB RAM");
        Computer computer2 = builder2.build();
        System.out.println(computer2.toString());

        // Computer 3
        Computer.Builder builder3= new Computer.Builder();
        builder3.Storage("256 GB SSD Storage").CPU("Intel Core i5-12800K processor");
        Computer computer3=builder3.build();
        System.out.println(computer3.toString());

        //computer 4
        Computer.Builder builder4=new Computer.Builder();
        builder4.CPU("Intel Core i8-12800K processor").RAM("8 GB RAM");
        Computer computer4=builder4.build();
        System.out.println(computer4.toString());

        //computer5
        Computer.Builder builder5=new Computer.Builder();
        builder5.Storage("512 GB SSD Storage");
        Computer computer5=builder5.build();
        System.out.println(computer5.toString());
    }
}
