import java.util.Stack;

public class TowerOfHanoi {

  Stack<Integer> pegA;
  Stack<Integer> pegB;
  Stack<Integer> pegC;
  int amountOfDisks;
  int ithMove;

  TowerOfHanoi(int amountOfDisks) {
    this.amountOfDisks = amountOfDisks;
    pegA = new Stack<Integer>();
    pegB = new Stack<Integer>();
    pegC = new Stack<Integer>();
    ithMove = 0;
    for (int i = amountOfDisks; i > 0; i--) {
      pegA.push(i);

    }
  }

  public void play() {
    move(pegA.size(), pegA, pegC, pegB);
  }

  // recursion
  public void move(int n, Stack fromPeg, Stack toPeg, Stack avalilablePeg) {
    if (n == 1) {
      toPeg.push(fromPeg.pop());
      ithMove++;
      showTowerOfHanoi();
      return;
    }
    move(n - 1, fromPeg, avalilablePeg, toPeg);
    move(1, fromPeg, toPeg, avalilablePeg);
    move(n - 1, avalilablePeg, toPeg, fromPeg);
  }

  public void showTowerOfHanoi() {
    int max;
    if (pegA.size() >= pegB.size() && pegA.size() >= pegC.size()) {
      max = pegA.size();
    } else if (pegB.size() >= pegA.size() && pegB.size() >= pegC.size()) {
      max = pegB.size();
    } else {
      max = pegC.size();
    }
    for (int i = max; i >= 0; i--) {
      if (pegA.size() - 1 >= i) {
        System.out.print(pegA.elementAt(i) + "  ");
      } else {
        System.out.print("   ");
      }
      if (pegB.size() - 1 >= i) {
        System.out.print(pegB.elementAt(i) + "  ");
      } else {
        System.out.print("   ");
      }
      if (pegC.size() - 1 >= i) {
        System.out.print(pegC.elementAt(i) + "  ");
      } else {
        System.out.print("   ");
      }
      System.out.println("");
    }
    System.out.println("Move" + ithMove + "-----");
  }

  public static void main(String[] args) {
    TowerOfHanoi th1 = new TowerOfHanoi(4);
    TowerOfHanoi th2 = new TowerOfHanoi(6);
    TowerOfHanoi th3 = new TowerOfHanoi(10);
    // for (int i = th.pegA.size()-1; i >=0 ; i--) {
    // System.out.println(th.pegA.elementAt(i)); //1 2 3 4 small on top
    // }
    th1.play();
    th2.play();
    th3.play();
  }
}