public class Jaeger {
    private String modelName;
    private String mark;
    private String status;
    private String bodyLanguage;
    private float weight;
    private float height;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка");
        } else {
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (mark == "") {
            System.out.println("Пустая строка");
        } else {
            this.mark = mark;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBodyLanguage() {
        return bodyLanguage;
    }

    public void setBodyLanguage(String bodyLanguage) {
        this.bodyLanguage = bodyLanguage;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight < 0) {
            System.out.println("Вес не может быть меньше 0");
        } else {
            this.weight = weight;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height < 0) {
            System.out.println("Рост не может быть меньше 0");
        } else {
            this.height = height;
        }
    }

    public Jaeger() {

    }

    public Jaeger(String modelName, String mark, String status, String bodyLanguage, float weight, float height) {
        this.modelName = modelName;
        this.mark = mark;
        this.status = status;
        this.bodyLanguage = bodyLanguage;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Model name: %s \nMark: %s \nStatus: %s \nBody Language: %s " +
                "\nWeight: %f \nHeight: %f \n", modelName, mark, status, bodyLanguage, weight, height);
    }

    public String move() {
        return "moving";
    }

    public String fire() {
        return "firing";
    }
}