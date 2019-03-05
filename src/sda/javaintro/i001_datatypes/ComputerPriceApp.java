package sda.javaintro.i001_datatypes;

/*
lesson 1
date 23.02.2019
content of i007_task_encapsulation (in Polish):

8. W osobnej klasie ComputerPriceApp, w metodzie main() napisz program obliczający cenę komputera na podstawie jego
części. Program ma wypisać na konsolę osobno cenę samego komputera: płyta główna, procesor, pamięć RAM,
dysk twardy i osobno cenę komputera i monitora. W cenie należy uwzględnić podatek VAT = 23%.

lesson 2
date 24.02.2019
content of i007_task_encapsulation (in Polish):
2. Przenieś kod zapisany w metodach main() klas FahrenheitConverter i ComputerPrice do osobnych metod, np.:
convertToCelsius(double temperatureInFahrenheit), getComputerPrice()
4. W klasie ComputerPrice wydziel metody getComputerPrice(), getMonitorPrice() i getComputerAndMonitorPrice(),
ostatnia z metod ma korzystać z dwóch pierwszych. Zmienną VAT ustaw jako pole klasy ComputerPrice.

 */


public class ComputerPriceApp {
    public static void main(String[] args) {

        System.out.println(">>> Task 8 - #i001_datatypes");

        ComputerPrice cP = new ComputerPrice();

        cP.setPriceHardDisk(34.57);
        cP.setPriceMainBord(345.67);
        cP.setPriceProcessor(98.43);
        cP.setPriceRam(98.23);
        cP.setPriceMonitor(34.87);

        System.out.println("price for main board = " + cP.getPriceMainBord());
        System.out.println("price for processor = " + cP.getPriceProcessor());
        System.out.println("price for ram = " + cP.getPriceRam());
        System.out.println("price for harddisk = " + cP.getPriceHardDisk());

        System.out.println("\nPrice for computer [net] = " + cP.getComputerPrice());
        System.out.println("Price for computer [net] = " + (Math.round((cP.getComputerPrice())*100.))/100.);
        System.out.println("Price for computer and monitor [net] = " + (cP.getComputerPrice() + cP.getPriceMonitor()));
        System.out.println("Price for computer and monitor [net] = " + (Math.round((cP.getComputerPrice() + cP.getPriceMonitor())*100.))/100. );
        System.out.println("Price for computer and monitor [gross with 23% VAT] = " + (cP.getComputerAndMonitorPrice() + cP.getComputerPriceVat() + cP.getPriceMonitorVat()));
        System.out.println("Price for computer and monitor [gross with 23% VAT] = " + (Math.round((cP.getComputerAndMonitorPrice()*1.23)*100.))/100.);

    }



}
