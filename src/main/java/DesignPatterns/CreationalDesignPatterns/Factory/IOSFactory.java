package DesignPatterns.CreationalDesignPatterns.Factory;

import DesignPatterns.CreationalDesignPatterns.Factory.Button.Button;
import DesignPatterns.CreationalDesignPatterns.Factory.Button.IOSButton;
import DesignPatterns.CreationalDesignPatterns.Factory.DropDown.DropDown;
import DesignPatterns.CreationalDesignPatterns.Factory.DropDown.IOSDropDown;
import DesignPatterns.CreationalDesignPatterns.Factory.Menu.IOSMenu;
import DesignPatterns.CreationalDesignPatterns.Factory.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
