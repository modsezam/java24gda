public class ComputerPrice {
    public static void main(String[] args) {
        System.out.println(">>> Task 8 - #datatypes");
        double priceMainBord = 234.34;
        double priceProcessor = 230.47;
        double priceRam = 123.87;
        double priceHardDisk = 239.98;
        double priceComputer;
        double priceMonitor = 309.89;

        System.out.println("price for main board = " + priceMainBord);
        System.out.println("price for processor = " + priceProcessor);
        System.out.println("price for ram = " + priceRam);
        System.out.println("price for harddisk = " + priceHardDisk);

        priceComputer = priceMainBord + priceProcessor + priceRam + priceHardDisk;
        System.out.println("\nPrice for computer [net] = " + priceComputer);
        System.out.println("Price for computer [net] = " + (Math.round((priceComputer)*100.))/100.);
        System.out.println("Price for computer and monitor [net] = " + (priceComputer + priceMonitor));
        System.out.println("Price for computer and monitor [net] = " + (Math.round((priceComputer + priceMonitor)*100.))/100. );
        System.out.println("Price for computer and monitor [gross with 23% VAT] = " + ((priceComputer + priceMonitor)*1.23));
        System.out.println("Price for computer and monitor [gross with 23% VAT] = " + (Math.round(((priceComputer + priceMonitor)*1.23)*100.))/100.);

    }

    public void getComputerPrice(){

    }

}
