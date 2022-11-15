package TuermeVonHanoi;

public class TuermeHanoi {
    public static void solve_hanoi(int N, String from_peg, String to_peg, String spare_peg)
    {
        if (N<1) {
            return;
        }
        if (N>1) {
            solve_hanoi(N-1, from_peg, spare_peg, to_peg);
        }
        System.out.println("move from " + from_peg + " to " + to_peg);
        if (N>1) {
            solve_hanoi(N-1, spare_peg, to_peg, from_peg);
        }
    }
    public static void main(String[] args) {
        solve_hanoi(10, "abcd","dcba", "e" );
    }
}
