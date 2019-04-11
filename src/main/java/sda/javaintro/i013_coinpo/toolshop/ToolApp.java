package sda.javaintro.i013_coinpo.toolshop;

public class ToolApp {
    public static void main(String[] args) {

        Hammer hammer1 = new Hammer("de21", 34.5, 34);
        Hammer hammer2 = new Hammer("de23", 44.5, 44);
        Hammer hammer3 = new Hammer("de23", 54.5, 54);
        Saw saw1 = new Saw("df500", 34, 10);
        Saw saw2 = new Saw("df500", 44, 20);

        Tool[] tools = {hammer1, hammer2, hammer3, saw1, saw2};

        for (int i = 0; i < tools.length; i++) {
            Tool tool = tools[i];
            System.out.println(tool.getDetail());
        }


    }
}
