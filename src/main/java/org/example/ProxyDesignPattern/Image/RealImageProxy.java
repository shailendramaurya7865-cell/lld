package org.example.ProxyDesignPattern.Image;

public class RealImageProxy implements Image {
    private RealImage realImage;
    private boolean authenticated;
    private boolean applyDesign;


    RealImageProxy(boolean authenticated, boolean applyDesign) {
        this.applyDesign = applyDesign;
        this.authenticated = authenticated;
    }

    @Override
    public void display() {
        if(!authenticated) {
            return;
        }
        if(applyDesign) {
            //call apply design service
        }
        if(null == realImage) {
            realImage = new RealImage();
        }

        realImage.display();
    }
}
