package DesignPatterns.CreationalDesignPatterns.Factory;

import DesignPatterns.CreationalDesignPatterns.Factory.Button.Button;
import DesignPatterns.CreationalDesignPatterns.Factory.DropDown.DropDown;
import DesignPatterns.CreationalDesignPatterns.Factory.Menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory factory = flutter.createFactory();
        Menu menu = factory.createMenu();
        Button button = factory.createButton();
        DropDown dropDown = factory.createDropDown();

    }
}
