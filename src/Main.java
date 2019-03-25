public class Main {

    public static void main(String[] args) {
        Set set = new ArraySet();
        set.add("CA");
        set.add("US");
        set.add("MX");
        set.add("RU");
        set.add("US");
        set.add("MX");

        String item = (String)set.getFirst();
        System.out.println(item);

        while((item = (String)set.getNext()) != null){
            System.out.println(item);
        }

        if(set.remove("US")){
            System.out.println("Remove Success");
        }

        item=(String)set.getFirst();
        System.out.println(item);

        while((item=(String)set.getNext()) != null){
            System.out.println(item);
        }

        printSet(set);

    }

    private static void printSet(Set set) {
        String item=(String)set.getFirst();
        System.out.print(item);

        while((item=(String)set.getNext()) != null)
            System.out.print(", "+item);

    }
}
