package Assign2;

    abstract class Furniture
    {

        abstract void stress_test();
        abstract void fire_test();

    }

    class WooddenChairs extends Furniture

    {
        WooddenChairs()
        {

            System.out.println("--Woodden Chairs--");
        }

        @Override
        void stress_test() {
            System.out.println("bear normal stress");
        }

        @Override
        void fire_test() {
            System.out.println("catch fire easily");
        }
    }
    class WooddenTables extends Furniture

    {
        WooddenTables()
        {
            System.out.println("---Woodden Tables---");
        }


        @Override
        void stress_test() {
            System.out.println("bear heavy stress");
        }

        @Override
        void fire_test() {
            System.out.println("catch heavy fire easily");
        }
    }
    class MetalTables extends Furniture

    {
        MetalTables()
        {

            System.out.println("---Metallic Tables---");
        }
        @Override
        void stress_test() {
            System.out.println("beer heavy stress");
        }

        @Override
        void fire_test() {
            System.out.println("cant catch fire ");
        }
    }
    class MetalChairs extends Furniture

    {
        MetalChairs()
        {
            System.out.println("---Metallic Chairs---");
        }

        @Override
        void stress_test() {
            System.out.println("cant beer heavy stress");
        }

        @Override
        void fire_test() {
            System.out.println("cant catch fire");
        }
    }



    public class Nine {
        public static void main(String[] args) {
            Furniture f1;
            f1 = new WooddenChairs();
            f1.fire_test();
            f1.stress_test();


            f1 = new WooddenTables();
            f1.stress_test();
            f1.fire_test();


            f1 = new MetalChairs();
            f1.stress_test();
            f1.fire_test();

            f1 = new MetalTables();
            f1.stress_test();
            f1.fire_test();

        }
}
