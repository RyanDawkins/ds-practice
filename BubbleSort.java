public class BubbleSort<T extends Comparable>{

  private T[] list;

  public BubbleSort(T[] list) {
    this.list = list;
  }

  public T[] sort() {
    return this.bubbleSort(this.list.length);
  }

  public T[] bubbleSort(int endPos) {

    if(endPos == 0) {
      return this.list;
    }

    boolean sorted = true;
    for(int i = 1; i < endPos; i++) {
      int comparison = this.list[i-1].compareTo(this.list[i]);
      if(comparison > 0) {
        sorted = false;

        T temp = this.list[i];
        this.list[i] = this.list[i-1];
        this.list[i-1] = temp;
      }
    }
    return this.bubbleSort(endPos-1);
  }

}
