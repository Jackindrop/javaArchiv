package abschnitt_6u20;

public class Bruch {
    private int z, n;

    public Bruch(int z, int n) {
        this.z= z;
        if(checkN(n))
            this.n= n;
        else throw new IllegalArgumentException("err::1");
    }

    public void setZ(int z) {this.z = z;}
    public void setN(int n) {this.n = n;}

    public int getZ() {return this.z;}
    public int getN() {return this.n;}

    public boolean checkN(int cN) {
        return cN > 0;
    }
    public double zahl() {return (1.0*getZ()/getN());}

    @Override public boolean equals(Object other) {
        Bruch tmp= (Bruch) other;
        return zahl()== tmp.zahl();
    }
    @Override public int hashCode() {
        return java.util.Objects.hash(this.z, this.n);
    }
}
