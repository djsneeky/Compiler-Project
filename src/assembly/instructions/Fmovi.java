package assembly.instructions;

public class Fmovi extends Instruction {
    
    public Fmovi(String src, String dest) {
        super();
        this.dest = dest;
        this.src1 = src;
        this.oc = OpCode.FMOVI;
    }

    public String toString() {
        return this.oc + " " + this.dest + ", " + this.src1;
    }
}
