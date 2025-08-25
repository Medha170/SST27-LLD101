class Aviary{
    public void release(FlyableInteface flyer){ 
        flyer.fly();
        System.out.println("Released");
    }
}