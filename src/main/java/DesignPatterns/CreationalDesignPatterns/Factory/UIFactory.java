package DesignPatterns.CreationalDesignPatterns.Factory;

import DesignPatterns.CreationalDesignPatterns.Factory.Button.Button;
import DesignPatterns.CreationalDesignPatterns.Factory.DropDown.DropDown;
import DesignPatterns.CreationalDesignPatterns.Factory.Menu.Menu;

public interface UIFactory {

    Menu createMenu();
    Button createButton();
    DropDown createDropDown();

}

