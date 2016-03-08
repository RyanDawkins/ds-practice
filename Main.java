public class Main {

  public static void main(String[] args) {

    Integer[] list = {3, 1, 4, 5, 2};
    BubbleSort bs = new BubbleSort(list);
    list = (Integer[]) bs.sort();

    for(int i = 0; i < list.length; i++) {
      System.out.print(list[i]+" ");
    }
    System.out.println();

  }

}
