class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger("Bracer Phoenix", "Mark-5", "Destroyed",
                "Mobile Artillery", 2.128f, 70.91f);

        jaegerOne.setModelName("Guardian Bravo");
        jaegerOne.setMark("Mark-6");
        jaegerOne.setStatus("Active");
        jaegerOne.setBodyLanguage("Counter Striker");
        jaegerOne.setWeight(1.975f);
        jaegerOne.setHeight(73.21f);

        jaegerOne.move();
        jaegerOne.fire();

        System.out.println(jaegerOne);
        System.out.println(jaegerTwo);
        System.out.println(jaegerOne.getModelName() + " " + jaegerOne.move());
        System.out.println(jaegerOne.getModelName() + " " + jaegerOne.fire());
        System.out.println(jaegerTwo.getModelName() + " " + jaegerTwo.move());
        System.out.println(jaegerTwo.getModelName() + " " + jaegerTwo.fire());
        jaegerOne.setStatus("Destroyed");
        System.out.println(jaegerOne.getModelName() + " " + jaegerOne.getStatus());
        System.out.println("");
        jaegerTwo.setModelName("AAAAAAAAA");
        System.out.println(jaegerTwo);

    }
}