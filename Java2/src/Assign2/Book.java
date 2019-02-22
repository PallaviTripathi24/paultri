package Assign2;

    interface LibraryManagmnt{

        public void bookName();
    }
    abstract class Library implements LibraryManagmnt{
        abstract void SubjName ();


    }

    public class Book extends Library {



        public void bookName() {
            System.out.println("ttn book");
        }

        public void SubjName()
        {

            System.out.println("Java2");
        }


        public static void main(String[] args) {
            System.out.println("library");
            LibraryManagmnt lib = new Book();
            lib.bookName();
            ((Book) lib).SubjName();



        }
}
