public class SelectionSort<T extends Comparable> implements Sorter {

  private T[] list;

  public SelectionSort(T[] list) {
    this.list = list;
  }

  public T[] sort() {
    return this.select(0);
  }

  public T[] select(int startPos) {

    if(startPos == this.list.length) {
      return this.list;
    }

    T smallest = this.list[startPos];
    int smallestPos = startPos;
    for(int i = startPos; i < this.list.length-1; i++) {
      if(smallest.compareTo(this.list[i+1]) > 0) {
        smallest = this.list[i+1];
        smallestPos = i+1;
      }
    }

    smallest = this.list[smallestPos];
    this.list[smallestPos] = this.list[startPos];
    this.list[startPos] = smallest;

    return this.select(startPos+1);

  }

}
