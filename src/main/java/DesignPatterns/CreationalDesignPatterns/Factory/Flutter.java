package DesignPatterns.CreationalDesignPatterns.Factory;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme(){
        System.out.println("Theme set");
    }

    public UIFactory createFactory(){
        return UIFactoryFactory.createFactory(supportedPlatform);
    }

}
