public class Main {

    public static void main(String[] args) {
        Bag bag = new ArrayBag();
        bag.add("CA");
        bag.add("US");
        bag.add("MX");
        bag.add("RU");
        bag.add("US");
        bag.add("MX");

        String item = (String)bag.getFirst();
        System.out.println(item);

        while((item = (String)bag.getNext()) != null)
            System.out.println(item);


        if(bag.remove("US")){
            System.out.println("Remove Success");
        }

        item=(String)bag.getFirst();
        System.out.println(item);

        while((item=(String)bag.getNext()) != null)
            System.out.println(item);

        bag.removeAllItem("MX");

        item=(String)bag.getFirst();
        System.out.println(item);

        while((item=(String)bag.getNext()) != null)
            System.out.println(item);

        printBag(bag);

    }

    private static void printBag(Bag bag) {
        String item=(String)bag.getFirst();
        System.out.print(item);

        while((item=(String)bag.getNext()) != null)
            System.out.print(", "+item);

    }

}
