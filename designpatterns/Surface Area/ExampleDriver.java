
public class ExampleDriver {
    

    public ExampleDriver() {
        double r = 0.1;
        double h = 2 * r;
        double volume = 0.85;
        double pi = Math.PI;

        double calcVolume = 0;
        double newHeight = 2 * r;
        double surfaceArea = 0;
        
        while (r <= 1.5) {
            while (calcVolume <= volume) {
                newHeight += 0.05;
                calcVolume = (pi * r * r *(newHeight - (2 * r)) + ((4/3) * pi * r * r * r));
            }
            //newHeight = volume / (pi * r * r);
            surfaceArea = (2 * pi * r * (newHeight - 2 * r)) + (4 * pi * r * r);
            r += 0.05;
        }
        System.out.println(surfaceArea);
    }

    public static void main(String[] args) {
        ExampleDriver driver = new ExampleDriver();
    }
    
}

