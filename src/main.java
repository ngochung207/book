public class main {
    public static void main(String[] args) {
        Book sach_01 = new Book("Giao trinh toan cap 2","Van Nhu Cuong",200000,250,1.5);
        Book sach_02 = new Book("Bo de thi dai hoc","Van Nhu Cuong",400000,350,2.5);

        ManagerBook quanLySach = new ManagerBook();
        quanLySach.addNewBook(sach_01);
        quanLySach.addNewBook(sach_02);

        System.out.println(quanLySach.getMaxPrice());
        System.out.println(quanLySach.getSumPrice());
    }
}
