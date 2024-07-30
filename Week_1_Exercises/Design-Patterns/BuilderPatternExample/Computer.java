public class Computer {
    public final String RAM;
    public final String CPU;
    public final String Storage;

    
   public static class Builder {
     private String RAM;
     private String CPU;
     private String Storage;

     public Builder RAM(String RAM){
      this.RAM = RAM;
      return this;
     }

     public Builder CPU(String CPU){
      this.CPU = CPU;
      return this;
     }

     public Builder Storage(String Storage){
       this.Storage = Storage;
       return this;
     }

     public Computer build(){
      return new Computer(this);
     }
   }

   private Computer(Builder builder){
     this.RAM = builder.RAM;
     this.CPU = builder.CPU;
     this.Storage = builder.Storage;
   }

   public String toString() {
     String message = "Here is your computer configuration: " + (this.CPU == null ? "No CPU": this.CPU) + ", " + (this.RAM == null ? "No RAM": this.RAM) + ", " + (this.Storage == null ? "No Storage": this.Storage);
     return message;
   } 
}

