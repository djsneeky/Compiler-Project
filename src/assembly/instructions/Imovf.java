package assembly.instructions;

public class Imovf extends Instruction {
    
    public Imovf(String src, String dest) {
        super();
        this.dest = dest;
        this.src1 = src;
        this.oc = OpCode.IMOVF;
    }

    public String toString() {
        return this.oc + " " + this.dest + ", " + this.src1;
    }
}
