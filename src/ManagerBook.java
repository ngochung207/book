import java.util.Scanner;

public class ManagerBook {
    Book[] store = new Book[20];

    public ManagerBook() {
    }

    public void addNewBook(Book thisBook) {
        for(int i = 0; i < store.length; i++){
            if(store[i] == null){
                store[i] = thisBook;
                break;
            }
        }
    }

    public void editBookByIndex(int index){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban sua thong tin cua quyen sach: ");
        System.out.println(store[index].toString());
        System.out.println("Ten sach cu: " + store[index].getName());
        System.out.println("Ten sach moi:");
        store[index].setName(sc.nextLine());
        System.out.println("Ten tac gia cu: " + store[index].getAuthor());
        System.out.println("Ten tach gia moi:");
        store[index].setAuthor(sc.nextLine());
        System.out.println("Ten gia ban cu: " + store[index].getPrice());
        System.out.println("Ten gia ban moi:");
        store[index].setPrice(sc.nextInt());
        System.out.println("Ten so luong cu: " + store[index].getAmount());
        System.out.println("Ten so luong moi:");
        store[index].setAmount(sc.nextInt());
        System.out.println("Ten so can nang cu: " + store[index].getWeight());
        System.out.println("Ten so luong moi:");
        store[index].setWeight(sc.nextDouble());
    }

    public int getMaxPrice(){
        int maxValue = store[0].getPrice();
        for (Book i:store
             ) {
            if(i != null) {
                if (maxValue < i.getPrice()) {
                    maxValue = i.getPrice();
                }
            }
        }
        return maxValue;
    }

    public int getSumPrice(){
        int sum = 0;
        for (Book i: store
             ) {
            if(i != null) {
                sum += i.getTottalPrice();
            }
        }
        return sum;
    }

}
