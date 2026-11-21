package org.example.solid.DIP;

public class Macbook {


    //here macbook depends on concrete classes
//    public WiredHeadphone headphone;
//    public WiredMouse mouse;
//
//    public Macbook(WiredHeadphone headphone, WiredMouse mouse) {
//        this.headphone = headphone;
//        this.mouse = mouse;
//    }




    public Headphone headphone;
    public Mouse mouse;

    public Macbook(Headphone headphone, Mouse mouse) {
        this.headphone = headphone;
        this.mouse = mouse;
    }
}
