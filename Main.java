public class Main {

  public static void main(String[] args) {

    Integer[] list = {3, 1, 4, 5, 2};
    Sorter<Integer> bs = new SelectionSort<Integer>(list);
    list = bs.sort();

    for(int i = 0; i < list.length; i++) {
      System.out.print(list[i]+" ");
    }
    System.out.println();

  }

}
