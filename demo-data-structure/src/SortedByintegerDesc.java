//formula

import java.util.Comparator;

public class SortedByintegerDesc implements Comparator<Integer> {
  // if we return -1, means i1 go first.
  // if we return -1, mean i2 go first.
  @Override
  public int compare(Integer i1, Integer i2) {// recite below, for i1>i2, then i1 goes first, then -1
    if (i1>i2)
    return -1;
    return 1; // if not -1, then return 1, = put else in between

  }
  
}
