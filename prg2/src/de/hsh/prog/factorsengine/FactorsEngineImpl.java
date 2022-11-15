package de.hsh.prog.factorsengine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class FactorsEngineImpl extends Thread implements FactorsEngine {

    public static HashMap<Long,
            TreeSet<Long>> hMap= new HashMap<>();
    public long numb;

    public FactorsEngineImpl() {numb= 0;}
    public FactorsEngineImpl(int n) {setNumb(n);}

    public void setNumb(long numb) {
        this.numb= numb;
        hMap.put(numb, new TreeSet<>());
        hMap.get(numb).add(numb);
        run();
    }

    @Override public void run() { // Hier wird die Teilermenge berechnet
        tMenge();
    }

    public synchronized void tMenge() {
        hMap.put(numb, new TreeSet<>());
        hMap.get(numb).add(numb);
        for (long i = 1; i <= numb/2; i++) {
            if (numb % i == 0) {
                hMap.get(numb).add(i);
            }
        }
    }

    public boolean startJob(long number) {
        this.numb= number;
        try {
            run();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean abortJob(long number) {
        return false;
    }

    public void shutdown() {

    }

    public long[] getRunningJobs() {
        return new long[]{0,01, 0,01};
    }

    public Double getProgress(long number) {
        return 0.0;
    }

    public long[] getFactors(long number) {
        Iterator<Long> it;
        int c = 0;
        long[] tmp = new long[hMap.get(number).size()];
            it = hMap.get(number).iterator();
            while (it.hasNext()) {
                tmp[c]=it.next();
                c++;
            }
        return tmp;
    }

    public long[] getFactorsIntermediateResult(long number) {
        return new long[]{0, 001, 0, 001};
    }
}
