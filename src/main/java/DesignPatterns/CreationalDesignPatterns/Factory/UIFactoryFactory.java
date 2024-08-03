package DesignPatterns.CreationalDesignPatterns.Factory;

//This class is created to avoid failure of OCP in Flutter class.
//OCP is kind of violated here as well but somewhat hidden from client.
//This is Practical factory.

public class UIFactoryFactory {

    public static UIFactory createFactory(SupportedPlatform supportedPlatform){
        switch (supportedPlatform){
            case ANDROID -> {
                return new AndroidFactory();
            }
            case IOS -> {
                return new IOSFactory();
            }
        }

        return null;
    }
}
