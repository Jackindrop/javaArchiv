package RunAlgoMain;

import algos.QuicksortSimple;

import java.time.Duration;
import java.time.Instant;

import static RunAlgoMain.ArrayPacker.nNumbers;

public class execute {
    public static void main(String[] args) {
       // runtimeEnviroment.executeForceAlgo(3, new int[]{2000, 4000, 6000});

        QuicksortSimple qs = new QuicksortSimple(
                nNumbers(8));
        qs.sort();
    }
}

