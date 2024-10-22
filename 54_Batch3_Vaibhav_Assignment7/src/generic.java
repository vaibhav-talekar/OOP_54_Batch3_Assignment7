public class generic {
    public static <T> void printarray( T[] a ){
        for(T item: a){

            System.out.printf("%s",item);
            System.out.println();
        }
    }
    public static void main(String args[]){
        Integer[] arr1 = {0,1,2,3,4,5};
        String[] arr2 = {"oops","generic","method"};
        Character[] arr3 = {'O','p','p','s'};

        printarray(arr1);
        printarray(arr2);
        printarray(arr3);


    }
}
