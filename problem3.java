class SmartHome {
    public static void main(String[] args) {
        int lights = 0b000;


        lights |= 0b001;


        String light2Status = ((lights & 0b010) != 0) ? "ON" : "OFF";
        System.out.println("Light 2 is: " + light2Status);


        lights &= ~0b100;


        System.out.println("Final state of lights: " + String.format("%03d", Integer.parseInt(Integer.toBinaryString(lights))));
    }
}
//output
//"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=64239:C:\Users\durge\AppData\Local\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\durge\OneDrive\Desktop\LAB1\out\production\LAB1 SmartHome
//        Light 2 is: OFF
//        Final state of lights: 001
