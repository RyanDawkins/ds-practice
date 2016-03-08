public class BubbleSort{

  private Comparable[] list;

  public BubbleSort(Comparable[] list) {
    this.list = list;
  }

  public Comparable[] sort() {
    return this.bubbleSort(this.list.length);
  }

  public Comparable[] bubbleSort(int endPos) {

    if(endPos == 0) {
      return this.list;
    }

    boolean sorted = true;
    for(int i = 1; i < endPos; i++) {
      int comparison = this.list[i-1].compareTo(this.list[i]);
      if(comparison > 0) {
        sorted = false;

        Comparable temp = this.list[i];
        this.list[i] = this.list[i-1];
        this.list[i-1] = temp;
      }
    }
    return this.bubbleSort(endPos-1);
  }

}
