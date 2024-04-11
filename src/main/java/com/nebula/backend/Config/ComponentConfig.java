package com.nebula.backend.Config;

import com.nebula.backend.Document.Component;
import com.nebula.backend.Repository.ComponentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ComponentConfig {

    @Bean
    CommandLineRunner runner(ComponentRepository repository){
        return args -> {
            // save demo data after start

            ArrayList<String> componentId = new ArrayList<>();
            ArrayList<Component> component = new ArrayList<>();

            for (int i = 1; i <= 100; i++) {
                componentId.add("C" + String.format("%04d", i));
            }

            component.add(new Component(
                    componentId.get(0),
                    "Light Sensor",
                    "Light sensor module is used to detect the intensity of light. It has both analog output pin and digital output pin labeled as AO and DO respectively on the board. This sensor module is designed to detect and measure various physical properties, such as temperature, humidity, pressure, light intensity and more.",
                    "https://static.cytron.io/image/cache/catalog/products/SN-LIGHT-MOD/SN-LIGHT-MOD-a-800x800.jpg",
                    "https://arduinogetstarted.com/images/tutorial/arduino-light-sensor-wiring-diagram.jpg",
                    List.of("K0001"),
                    List.of("Connect the LDR to the analog input pin 0 on the Arduino board.", "Connect the VCC leg on the sensor to the 5V pin of the Arduino board.", "Connect the GRD leg on the sensor to the GND pin of the Arduino board.", "A connection diagram is provided to illustrate the connections."),
                    List.of("When there is light, the resistance of LDR becomes low according to the intensity of light.","This means when the light level decreases, the resistance of the LDR increases.", "The resistance of LDR is inversely proportional to the intensity of light.","Light sensors are a type of photodetector (also called photosensor) that detect light.","Different types of light sensors can be used to measure illuminance, respond to changes in the amount of light received, or convert light to electricity."),
                    List.of("The light sensor module has both analog and digital output pins.","It can be used to detect the intensity of light.","The sensitivity of the sensor can be adjusted using a potentiometer."),
                    List.of("The working voltage of the light sensor module is between 3.3V and 5V DC.","The detection angle is about 60 degrees.","The sensor can detect light intensity ranging from 500 to 10,000 lux."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(1),
                    "Temperature Sensor",
                    "Temperature sensor module is used to detect the temperature. It has both analog output pin and digital output pin labeled as AO and DO respectively on the board. This sensor module is designed to detect and measure various physical properties, such as temperature, humidity, pressure, light intensity and more.",
                    "https://rathyelectronics.com/wp-content/uploads/2020/10/temp.jpg",
                    "https://www.hackatronic.com/wp-content/uploads/2021/09/Arduino-with-temperature-sensor-1-1.jpg",
                    List.of("K0001"),
                    List.of("Connect the temperature sensor to the analog input pin 0 on the Arduino board.", "Connect the VCC leg on the sensor to the 5V pin of the Arduino board.", "Connect the GRD leg on the sensor to the GND pin of the Arduino board.", "A connection diagram is provided to illustrate the connections."),
                    List.of("The temperature sensor module consists of a thermistor whose resistance changes according to the temperature.","The resistance of the thermistor decreases as the temperature increases.","The resistance of the thermistor increases as the temperature decreases.","The resistance of the thermistor is inversely proportional to the temperature."),
                    List.of("The temperature sensor module has both analog and digital output pins.","It can be used to detect the temperature.","The sensitivity of the sensor can be adjusted using a potentiometer."),
                    List.of("The working voltage of the temperature sensor module is between 3.3V and 5V DC.","The detection angle is about 60 degrees.","The sensor can detect temperature ranging from -55 to 125 degrees Celsius."),
                    List.of("S0001","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(2),
                    "Motion sensor",
                    "Motion sensors are devices used to detect and measure movement. They are commonly used in home and business security systems, but can also be found in phones, paper towel dispensers, game consoles, and virtual reality systems.",
                    "https://alphatronic.lk/wp-content/uploads/2020/09/HC-SR501-Pyroelectric-Infrared-Motion-Sensor-PIR-1.png",
                    "https://www.circuitbasics.com/wp-content/uploads/2020/06/Motion-Detector-Wiring-Diagram-with-5-Volt-Relay-2-BEST.png",
                    List.of("K0002" ),
                    List.of("The specific instructions for connecting a motion sensor to a circuit will depend on the type of motion sensor being used and the circuit being built. Generally, motion sensors will have pins or wires for connecting to power (usually 5V or 3.3V), ground, and a digital input pin on a microcontroller (such as an Arduino). It's important to consult the datasheet for the specific motion sensor being used and follow the manufacturer's instructions."),
                    List.of("Motion sensors typically consist of three major components: a sensor, an embedded computer, and hardware. Active sensors have both a transmitter and receiver, and detect motion by measuring changes in the amount of sound and radiation reflecting back into the receiver. Passive sensors, on the other hand, detect motion based on a perceived increase of radiation in its environment. The most widely used type of passive motion sensor is the passive infrared (PIR) sensor, which detects the infrared radiation emitted naturally from the human body."),
                    List.of("Motion sensors can be customized to perform highly specific functions, such as activating floodlights, triggering audible alarms, activating switches, and even alerting the police.", "There are different types of motion sensors, including active and passive sensors, and different technologies used to detect motion, such as ultrasonic, microwave, and thermographic sensors."),
                    List.of("There is no specific statistic related to motion sensors as a whole, as their use and effectiveness will depend on the specific application and environment they are used in.", "However, motion sensors are widely used in home and business security systems, and have been shown to be effective in deterring burglars and intruders."),
                    List.of("S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(3),
                    "Magnetic field Sensor",
                    "Magnetic field sensors are electronic devices that detect and measure magnetic fields around permanent magnets, current conductors, and electrical devices. As the world becomes increasingly electrified, there is a growing demand for improved positional and current sensing.",
                    "https://cdn2.webdamdb.com/md_AzLb70QIwZ65.png?1535466152",
                    "https://giovanniorgantini.files.wordpress.com/2015/04/schematic_bb.png",
                    List.of("K0010" ),
                    List.of("To operate a sink sensor like the Honeywell 2SS52M, an external power supply should be connected to the sink through a resistor. When no magnetic field is detected, the sink works as an open switch and no current flows from the power supply to the device.", "When a magnetic field is detected, the sink acts as a closed switch and some current flows from the external power supply to the device. To determine if the device is sensing a magnetic field, measure the voltage across the resistor. If it is zero, there is no external magnetic field present (apart from the Earth's magnetic field). If a strong enough magnetic field is placed close to the sensor, a voltage should be measurable."),
                    List.of("The Honeywell 2SS52M is a digital magnetoresistive sensor that detects magnetic fields oriented parallel to the longest side of its package (indicated by the white arrow on the device).", "The sensor is omnipolar, meaning that the orientation of the magnetic field doesn't matter – either a south-north or north-south alignment triggers the device. When the external magnetic field in a given direction is strong enough, the device works as a sink for current. Sink sensors have an output mode that is different from source sensors.", "To operate a sink sensor, an external power supply must be connected to the sink through a resistor."),
                    List.of("The Honeywell 2SS52M is a compact device with three pins – GND, VCC, and an output pin.", "It is highly sensitive to magnetic fields and can detect them even when they are weak.", "The sensor is compatible with a variety of electronic devices and can be used in many different applications, such as position sensing, current sensing, and rotational sensing."),
                    List.of("Unfortunately, as a language model, I do not have access to real-time statistics on the Honeywell 2SS52M or other magnetic field sensors.", "However, I can tell you that there are many different types of magnetic field sensors available on the market, each with their own unique features and specifications.", "When choosing a sensor, it is important to consider factors such as sensitivity, accuracy, and response time to ensure that it is well-suited for your specific application."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(4),
                    "Gravity Sensor",
                    "A gravity sensor, also known as an accelerometer, is a sensor that measures acceleration, tilt, and vibration in a particular direction. It can be used to determine the device's relative orientation in space or to detect anything under the ground that creates a mass difference in civil engineering.",
                    "https://m.media-amazon.com/images/I/51cJGNBobQL.jpg",
                    "https://circuitdigest.com/sites/default/files/circuitdiagram_mic/Interfacing-Gravity-Infrared-CO2-Sensor-with-Arduino.jpg",
                    List.of("K0002" ),
                    List.of("To use a gravity sensor with Arduino, you need to connect the sensor to the Arduino board and write a program to read the sensor data. Depending on the type of sensor you have, you may need to connect it to the board using pins or a shield. Once you have the sensor data, you can use it to control other parts of your project."),
                    List.of("The gravity sensor calculates its values using more than one hardware sensor and provides a three-dimensional vector indicating the direction and magnetic of gravity. The sensor measures the force of acceleration, which can be interpreted as the direction and magnitude of gravity. The sensor uses a piezoelectric material that generates a voltage proportional to the acceleration it experiences."),
                    List.of("Measurement range: Gravity sensors have a measurement range that specifies the minimum and maximum acceleration values that the sensor can detect.", "Sensitivity: Gravity sensors have a sensitivity that specifies the smallest change in acceleration that the sensor can detect.", "Resolution: The resolution of a gravity sensor is the smallest difference between two acceleration values that the sensor can distinguish.", "Sampling rate: The sampling rate of a gravity sensor is the frequency at which the sensor takes measurements.", "Communication protocol: Gravity sensors typically communicate with a microcontroller or other device using a digital communication protocol such as I2C or SPI.", "Power consumption: The power consumption of a gravity sensor is an important consideration for battery-powered applications.", "Noise level: Gravity sensors are subject to noise from various sources, including temperature variations and electromagnetic interference."),
                    List.of("Limited range", "Limited sensitivity", "Limited accuracy", "Cross-axis sensitivity", "Temperature sensitivity", "Power consumption", "Size and cos"),
                    List.of("S0002","S0003","S0004"))
            );

            component.add(new Component(
                    componentId.get(5),
                    "Moistur Sensor",
                    "A moisture sensor is an electronic device that is used to measure the water content of soil. It helps farmers to determine when and how much to water their crops. The moisture sensor works by measuring the electrical conductivity of the soil, which changes with the amount of water present in it." ,
                    "https://www.waveshare.com/media/catalog/product/cache/1/image/800x800/9df78eab33525d08d6e5fb8d27136e95/m/o/moisture-sensor-1.jpg",
                    "https://circuitdigest.com/sites/default/files/inlineimages/u4/Soil-Moisture-Sensor-with-Arduino-Connection.png",
                    List.of("K0001"),
                    List.of("To connect the moisture sensor to a circuit, follow these steps:", "Connect two pins from the sensor to the pins on the amplifier circuit using hookup wires.", "Connect the VCC from the amplifier to the 3.3V pin on the Arduino and the GND pin to the GND pin on the Arduino.", "Connect the Analog Data Pin to the A0 pin on the Arduino."),
                    List.of("A resistor soil moisture sensor works by using the relationship between electrical resistance and water content to gauge the moisture levels of the soil. The two probes of the sensor allow the current to pass through the soil, which gives the resistance value to measure the moisture value. The amplifier circuit amplifies the small signal from the sensor and provides a stable output for the microcontroller to read."),
                    List.of("Some common features of a moisture sensor include:", "Easy to use and install", "Can be integrated with microcontrollers", "Can measure the water content of soil in real-time", "Can save water and increase crop yield", "Can help prevent over-watering and under-watering of plants"),
                    List.of("The accuracy of the moisture sensor can vary depending on the type of sensor used and the soil conditions.","However, a good quality moisture sensor can provide an accuracy of up to +/- 2% VWC (volumetric water content).", "The lifespan of a moisture sensor can range from a few months to several years, depending on the type of sensor and its usage."),
                    List.of("S0001","S0002","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(6),
                    "vibration Sensor",
                    "A vibration sensor,also known as a piezoelectric sensor,has many types that are used to measure the accelaration, pressure, vibration changes of a device or system.It can be used alongside an arduino or Raspberry Pi through the miniaturized or MEMS vibration sensor modules that are common nowadays.A vibration sensor is an electronic device that is used to detect vibrations in a machine or equipment. It helps in identifying any continuous vibration or jerks that could lead to damages in critical machines or expensive equipment. The SW-420 vibration sensor is a cheap and dedicated sensor that detects vibration using LM393 comparator and provides digital output.",
                    "https://tronic.lk/assets/uploads/6b363d125f7c54266e572858f2b6b6e9.png",
                    "https://projects.arduinocontent.cc/eeaf3fac-a331-4f39-aaf4-f9b3864b63f7.jpeg",
                    List.of("K0002" ),
                    List.of("Connect one pin of vibration sensor to Arduino Analog pin A0 and the other to 5V Pin.", "Now connect the buzzet,one pin to Arduino pin 8 and the other to GND."+"To connect the SW-420 vibration sensor module to an Arduino, follow these steps:"+
                            "Connect the VCC pin of the module to the 5V pin on the Arduino." +
                            "Connect the GND pin of the module to the GND pin on the Arduino." +
                            "Connect the DO pin of the module to any digital pin on the Arduino, such as D2.\n" +
                            "Connect a LED to the digital pin D13 and GND."),
                    List.of("The SW-420 vibration sensor module uses an LM393 comparator to detect vibrations over a threshold point and provide digital data. When the vibration is detected, the sensor provides logic high output, and when there is no vibration, the sensor provides logic low output. The potentiometer available on the module can be used to control the threshold point of the vibration." + "\n"),
                    List.of("Some common features of the SW-420 vibration sensor module include:" +
                            "Cheap and dedicated vibration sensor" +
                            "LM393 comparator used to detect vibration" +
                            "Potentiometer available to control threshold point\n" +
                            "Digital output provided when vibration is detected"),
                    List.of("The accuracy of the vibration sensor can vary depending on the type of sensor used and the environment it is used in." +
                            "However, a good quality vibration sensor can provide accurate results and help in identifying any continuous vibration or jerks that could lead to damages in critical machines or expensive equipment." +
                            "The lifespan of a vibration sensor can range from a few months to several years, depending on the type of sensor and its usage.\n"),
                    List.of("S0005"))
            );


            component.add(new Component(
                    componentId.get(7),
                    "Pressure Sensor",
                    "A pressure sensor is a device that measures pressure and converts it into an electrical signal that can be displayed, recorded, or transmitted. They are used in a variety of applications, including industrial, automotive, medical, and aerospace industries.",
                    "https://5.imimg.com/data5/WI/UY/MY-3069658/pressure-sensor-500x500.jpg",
                    "https://i0.wp.com/www.teachmemicro.com/wp-content/uploads/2021/07/arduino-pressure-sensor-schematic.png?ssl=1",
                    List.of("K0011"),
                    List.of("The method of connecting a pressure sensor to a circuit may vary depending on the specific type of sensor and circuit. However, in general, pressure sensors are connected to an electrical circuit through wires or pins, and the output signal is sent to a microcontroller or display unit."),
                    List.of("Pressure sensors work by detecting the pressure exerted on them and converting it into an electrical signal." + "There are several types of pressure sensors, including strain gauge, piezoelectric, capacitive, and resonant.\n"+ "Each type operates on a different principle to measure pressure."),
                    List.of("Pressure sensors can vary in their features, depending on the specific type and application."+ "Some common features include pressure range, accuracy, response time, and output signal type (analog or digital)."+ "Additionally, some sensors may be designed for specific environments, such as high temperatures or corrosive substances.\n"),
                    List.of("According to the World Health Organization, prolonged exposure to high levels of electromagnetic fields can be harmful to human health."+
                            "Therefore, EMF sensors are useful in detecting and monitoring these fields to help ensure the safety of people in the environment.\n"+
                            "EMF sensors are widely used in the fields of medicine, research, and industry to detect and measure electromagnetic fields."),
                    List.of("S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(8),
                    "Electrical fields Sensor",
                    "An Electromagnetic Field (EMF) Sensor is an electronic device that detects the presence of electromagnetic fields in a particular area. These fields can be generated by electrical appliances, power lines, or other sources of electrical energy. The EMF sensor can measure the strength of these fields and provide a reading that indicates the level of radiation present in the environment.",
                    "https://content.instructables.com/FNR/IQLM/FV15TO8Z/FNRIQLMFV15TO8Z.jpg?auto=webp&fit=bounds&frame=1&height=1024&width=1024auto=webp&frame=1&height=150",
                    "https://hackster.imgix.net/uploads/image_file/file/161534/be721bba15820a8063130b29dcd5d6ff.png",
                    List.of("K0010"),
                    List.of("To connect an EMF Sensor to a circuit, you need to connect the following components:"+ "The ground pin of the Arduino to the negative (-) rail of the breadboard.\n"+ "Connect a 10k resistor from D11 to the antenna wire. Connect the positive (+) rail of the breadboard to the A0 pin of the Arduino through a 220 resistor."),
                    List.of("The 10k resistor connected to D11 helps to reduce the current flowing through the antenna wire to a safe level. The 220-ohm resistor connected to the A0 pin helps to protect the Arduino analog input from being damaged by excessive current."),
                    List.of("Some of the key features of an EMF Sensor include:"+
                            "Detects the presence of electromagnetic fields in a particular area"+
                            "Measures the strength of the fields and provides a reading that indicates the level of radiation present"+
                            "Can be used to identify issues with power lines and electrical wiring\n"+
                            "Easy to connect to an Arduino or other microcontroller"),
                    List.of("According to the World Health Organization, prolonged exposure to high levels of electromagnetic fields can be harmful to human health."+
                            "Therefore, EMF sensors are useful in detecting and monitoring these fields to help ensure the safety of people in the environment.\n"+
                            "EMF sensors are widely used in the fields of medicine, research, and industry to detect and measure electromagnetic fields."),
                    List.of("S0001","S0003","S0004"))
            );


            component.add(new Component(
                    componentId.get(9),
                    "Accelerometer and Gyroscope Sensor",
                    "To understand how accelerometers work,imagine a ball inside a 3D cube."+

                            "Assuming that the cube is in outer space,where everything is weightless,the ball will simply float in the center of the cibe."+
                            "Now assume that each wall represents a specific axis."+
                            "If we suddenly move the box to the left with acceleration 1g (a simple G-force 1g is equivalent to gravitational acceleration 9.8m/s2), the ball will undoubtedly hit the wall X.\n"+
                            "If we measure the force the ball exerts on the wall X,we can obtain an output value of 1g along the X axis.",
                    "https://robotist.in/wp-content/uploads/2021/06/601005A-300x300.jpg",
                    "https://projects.arduinocontent.cc/99308ee4-70e9-4a3f-85b0-b555ed8cce68.png"+"Let's see what happens when we place thar cube on Earth."+
                            "The ball will simply fall on the wall Z,exerting a force of 1g as shown in the diagram below."+ "https://github.com/RPSTD/component101/raw/main/AccelerometerAndGyroscopeSensor/IMG/Accelerometer-Working-Illustration-Gravitation-Force.jpg"+"In this case,the gravity box isn't moving,but we still get a 1g reading on the Z axis."+
                            "This is because gravity (which actually a form of acceleration) is pulling the ball downward with a force of 1g." +
                            "While this module does not exactly reprent how a real-world accelerometer sensor is built,it is often useful in understanding why an accelerometer's output signal is typically specified in + or - g,or why an accelerometer reads 1g in the z-axis at rest,or what accelerometer reading you can expect at different orientations." +
                            "In the real world,accelerometers are based on Micro-Electro-Mechanical Systems(MEMS fabrication technology)." +
                            "\n" +
                            "So,let's find out how a MEMS accelerometer works.",
                    List.of("K0002"),
                    List.of("A MEMS(Micro-Electro-Mechanical System) accelerometer is a micro-machined strure built on top of a silicom wafer."+ "https://github.com/RPSTD/component101/raw/main/AccelerometerAndGyroscopeSensor/IMG/MEMS-Accelerometer-Working.gif"+

                            "This structure is suspended by polysilicon springs."+

                            "It allows the structure to deflect when accelerated along the X,Y and Z axes.\n"+

                            "The sensor process this changes in capacitance and converts it into an analog output voltage."),
                    List.of("While accelerometers measure linear acceleration,gyroscopes,measure angular rotation.\n"+
                            "To accomplish this,they measure the force generated by the Coriolis Effect."),
                    List.of("The light sensor module has both analog and digital output pins.","It can be used to detect the intensity of light.","The sensitivity of the sensor can be adjusted using a potentiometer."),
                    List.of("The working voltage of the light sensor module is between 3.3V and 5V DC.","The detection angle is about 60 degrees.","The sensor can detect light intensity ranging from 500 to 10,000 lux."),
                    List.of("S0002"))
            );

            component.add(new Component(
                    componentId.get(10),
                    "Active Piezo Buzzer Module",
                    "The Active Piezo Buzzer Module is a type of piezoelectric buzzer that only requires a DC voltage to produce sound. This makes it easy to use in electronics projects, such as alarms or notifications, or even programmed to produce musical notes when connected to an Arduino.",
                    "https://cdn-reichelt.de/bilder/web/xxl_ws/A300/KY-012.png",
                    "https://startingelectronics.org/tutorials/arduino/modules/active-buzzer/active-buzzer-basic-test.jpg",
                    List.of("K0001","K0006" ),
                    List.of("To connect an Active Piezo Buzzer Module to an Arduino circuit, follow these steps:"+
                            "Connect the positive (red) wire of the buzzer to a digital pin on the Arduino."+
                            "Connect the negative (black) wire of the buzzer to a GND pin on the Arduino. Here's an example circuit diagram:\n"+ "yaml Copy code +5V | - | Digital Pin | Buzzer | GND"),
                    List.of("The Active Piezo Buzzer Module contains a coil of wire connected to the buzzer's pins, surrounded by a round magnet. A thin metal film with a metal weight attached to the top sits above the round magnet and wire coil. When pulses of current are applied to the wire coil, magnetic inductance causes the metal weight and metal film to vibrate up and down. The vibration of the metal film produces sound waves."),
                    List.of("Some features of the Active Piezo Buzzer Module include:"+
                            "Only requires a DC voltage to produce sound."+
                            "Can be used in a variety of electronics projects, such as alarms, notifications, or programmed to produce musical notes.\n"+
                            "Easy to connect to an Arduino circuit."),
                    List.of("Some technical specifications of the Active Piezo Buzzer Module include:"+
                            "Operating Voltage: 3-5V DC"+
                            "Sound Output: >85dB"+
                            "Resonant Frequency: 2300 ± 300 Hz"+
                            "Operating Current: <30mA"+
                            "Operating Temperature: -20°C to +70°C"+
                            "Size: 12mm x 9mm x 7.5mm"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(11),
                    "Breadboard Power Supply Module",
                    "The breadboard power supply module is a useful component that provides 5V, 3.3V or both power requirements to breadboard related projects. It has two independent channels of power output and can be easily connected to any DC power supply unit that has a 6.5-12V DC power output from a barrel jack. This module also offers a push switch to turn ON and OFF the entire power supply module.",
                    "https://nilambaraelectronics.com/wp-content/uploads/2021/06/breadboard-power-module-1.jpg",
                    "https://i.stack.imgur.com/FQ9yS.jpg",
                    List.of("K0007"),
                    List.of("The module can be easily connected to a circuit by following these steps:"+
                            "Connect the DC power supply unit to the barrel jack input of the module."+
                            "Select the desired voltage level (5V, 3.3V, or OFF) using the jumper on the left side of the module.\n"+
                            "Connect the GND, 5V, and 3.3V output pins of the module to the appropriate components on the breadboard using the onboard berg male header."),
                    List.of("The breadboard power supply module consists of a DC-DC converter that converts the input voltage to the desired output voltage level. The voltage level can be selected using the jumper on the left side of the module. The module also includes a push switch to turn ON and OFF the entire power supply module and a power LED to indicate input power availability status."),
                    List.of("Two independent channels of power output for breadboards."+
                            "Output voltage can be independently configured for 3.3V, 0V, and 5V operations."+
                            "ON-OFF switch available."+
                            "USB (Type-A) input available."+
                            "DC Barrel jack input available.+" +
                            "Onboard power LED.\n"+
                            "Maximum output current of 700mA."),
                    List.of("Input voltage range: 6.5V-12V."+
                            "Output voltage: 5V, 3.3V (adjustable via jumper).\n"+
                            "Dimension: 53mm x 33mm."),
                    List.of("S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(12),
                    "FingerPrint Sensor",
                    "A fingerprint sensor is an electronic device that captures and reads the unique pattern of ridges and valleys on the surface of a fingertip to authenticate a person's identity.",
                    "https://ce8dc832c.cloudimg.io/v7/_cdn_/D6/9C/80/00/0/575853_1.jpg?width=640&height=480&wat=1&wat_url=_tme-wrk_%2Ftme_new.png&wat_scale=100p&ci_sign=6f29c5c8852d0d326d01f49ad4494f56e5deea44",
                    "https://europe1.discourse-cdn.com/arduino/optimized/4X/e/b/7/eb7593aeea4eff93774b70b62a1840442e39c29a_2_683x500.jpeg",
                    List.of("K0001"),
                    List.of("The fingerprint sensor module requires a power supply of 3.3V and maximum current supply of 60mA. It communicates with a microcontroller through serial communication using the TX and RX pins. The GND pin is connected to the ground of the circuit."),
                    List.of("The fingerprint sensor module captures an image of a person's fingerprint using either an optical or capacitive sensor. An optical sensor uses light to illuminate the finger and capture the fingerprint image, while a capacitive sensor uses an electric current to sense the ridges and valleys on the fingertip. Once the fingerprint image is captured, it is processed and compared to the registered fingerprints stored in the module's memory to authenticate the person's identity."),
                    List.of("Supply voltage: 3.3V"+
                            "Maximum current supply: 60mA"+
                            "Resolution: 500dpi"+
                            "Maximum fingerprint imaging time: 1s"+"\n"+

                            "All registered fingerprints are stored in the module's memory."),
                    List.of("The fingerprint sensor module has a resolution of 500dpi and can capture and process a fingerprint image in as little as 1 second.\n"+ "The accuracy of the sensor can vary depending on the quality of the image and the number of registered fingerprints in its memory."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(13),
                    "Flamem IR Sensor",
                    "A Flame Sensor or Flame Detector is a device designed to detect and respond to the presence of a flame fire. The IR Flame Sensor is a simple yet effective way to detect fire and is commonly used in commercial buildings and factories.",
                    "https://www.heelectronicslk.com/wp-content/uploads/2021/05/Ir-F-he-1.jpg",
                    "https://electropeak.com/learn/wp-content/uploads/2020/10/Flame-Sensor-Circuit.jpg",
                    List.of("K0011" ),
                    List.of("The Flame Sensor module has three pins: VCC, GND, and Dout. Connect VCC and GND to a 3.3V-5V power supply and ground, respectively. The Dout pin is the digital output and should be connected to a digital input pin on a microcontroller or other digital device."),
                    List.of("The Flame Sensor module consists of an IR photodiode (IR receiver), resistor, capacitor, potentiometer, and LM393 comparator in an integrated circuit. When a fire burns, it emits a small amount of infrared light which is received by the IR receiver. The LM393 comparator is used to check for a change in voltage across the IR receiver. If a fire is detected, the output pin (Dout) will give 0V (LOW), and if there is no fire, the output pin will be 5V (HIGH). The sensitivity of the sensor can be adjusted by varying the onboard potentiometer."),
                    List.of("Detects infrared light with a wavelength ranging from 700nm to 1000nm"+
                            "Detection angle of about 60 degrees"+
                            "Sensitivity can be adjusted by varying the onboard potentiometer"+
                            "Working voltage is between 3.3V and 5V DC, with a digital output"+
                            "Logic high on output indicates the presence of flame or fire"+
                            "Logic low on output indicates the absence of flame or fire"),
                    List.of("Some common applications of the Flame Sensor include hydrogen stations, combustion monitors for burners, oil and gas pipelines, automotive manufacturing facilities, nuclear facilities, aircraft hangars, and turbine enclosures."),
                    List.of("S0001","S0002","S0003"))
            );

            component.add(new Component(
                    componentId.get(14),
                    "GPSNEO6m Module",
                    "The GSM NEO 6m Module is a GPS (Global Positioning System) module that can receive and process signals from navigation satellites orbiting the earth to determine its location. This module is compact and packed with features, making it a popular choice for DIY projects that require accurate positioning information.",
                    "https://i0.wp.com/randomnerdtutorials.com/wp-content/uploads/2017/10/NEO-GPS-1.jpg?resize=670%2C526&quality=100&strip=all&ssl=1",
                    "https://hackster.imgix.net/uploads/attachments/345206/schematics-gps-arduino-module_fk9PnyryPm.png?auto=compress&w=1600&h=1200&fit=min&fm=jpg",
                    List.of("K0001","K0002" ),
                    List.of("To connect the NEO-6M GPS module to an Arduino circuit, you need to connect the module's four pins to the corresponding pins on the Arduino. The GND pin goes to the Arduino's GND pin, the TxD pin goes to the Arduino's RX pin, the RxD pin goes to the Arduino's TX pin, and the VCC pin goes to the Arduino's 5V pin."),
                    List.of("The NEO-6M GPS module works by receiving signals from navigation satellites orbiting the earth. Once the module receives signals from at least three GPS satellites, it can determine its location using a process called trilateration. The GPS chip inside the module is responsible for tracking up to 22 satellites over 50 channels and achieving the highest level of tracking sensitivity in the industry. The module also comes with a 3.3V LDO regulator, a rechargeable battery, and an EEPROM for retaining critical data."),
                    List.of("The NEO-6M GPS module has several features that make it a popular choice for DIY projects, including:"+
                            "High tracking sensitivity of -161 dBm"+
                            "Ability to track up to 22 satellites over 50 channels"+
                            "2.5m horizontal position accuracy"+
                            "5 location updates per second"+
                            "Time-To-First-Fix of less than 1 second"+
                            "3.3V LDO regulator for stable power supply"+
                            "Battery and EEPROM for retaining critical data"+
                            "Patch antenna with -161 dBm sensitivity"),
                    List.of("The NEO-6M GPS module consumes only 45mA current and has a MICREL's MIC5205 Ultra-Low Dropout 3V3 regulator."+
                            "The HK24C32 Two Wire serial EEPROM is 4KB in size and is connected via 12C to the NEO-6M chip."+
                            "The module's patch antenna has a sensitivity of -161 dBm."+
                            "The GPS chip inside the module can track up to 22 satellites over 50 channels and achieve the industry's highest level of tracking sensitivity.\n"+
                            "The module can perform 5 location updates in a second with 2.5m horizontal position accuracy, and it has a Time-To-First-Fix of less than 1 second"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(15),
                    "SIM800L GSM Module",
                    "The SIM800L GSM module is a versatile and compact device that allows users to connect to a global GSM network using any 2G SIM card. It can be used for a range of tasks, such as making phone calls, sending SMS messages, connecting to the internet via GPRS, and even receiving FM radio broadcasts.\n"+
                            "This module is ideal for embedded projects due to its small form factor and low power requirements, making it an excellent choice for IoT and other battery-powered applications.",
                    "https://digitalelectronics.lk/wp-content/uploads/2022/02/Sim-800L.jpg",
                    "https://europe1.discourse-cdn.com/arduino/optimized/4X/d/3/f/d3f242ec600b851a330108d436ee27325b09cedf_2_689x500.png",
                    List.of("K0003" ),
                    List.of("All of the necessary data pins on the SIM800L GSM chip are broken out to a 0.1'' pitch header, including the pins for communication with a microcontroller over the UART.","To connect it to a circuit, you can use the following pinout:"+
                            "VCC: Connect to a power source ranging from 3.4V to - 4.4V, such as a LiPo battery."+
                            "GND: Connect to ground."+
                            "RST: Can be used to perform a hard reset of the module."+
                            "RxD: Used to send commands to the module."+
                            "TxD: Used to receive data from the module."+
                            "NET: Connect to an external antenna or use the helical antenna that comes with the module."+
                            "RING: Can be used as an interrupt-out pin for when a call or SMS message is received."+
                            "DTR: Can be used to activate/deactivate sleep mode."+
                            "MIC: Used for connecting a differential microphone."+
                            "SPK: Used for connecting a differential speaker."),
                    List.of("The SIM800L GSM module uses a UART interface to communicate with a microcontroller, allowing it to send and receive commands and data."," It requires an external antenna to connect to a cellular network, and a 2G SIM card to operate.\n"+
                            "The module can be powered by a range of voltages between 3.4V and 4.4V, making it an ideal choice for battery-powered applications."," It also features a range of pins for connecting external components, such as a microphone or speaker."),
                    List.of("Connect to any global GSM network with any 2G SIM card."+
                            "Make and receive voice calls using an external speaker and electronic microphone."+
                            "Send and receive SMS messages."+
                            "Send and receive GPRS data.\n"+
                            "Scan and receive FM radio broadcasts."),
                    List.of("The SIM800L GSM module is a small and compact device, measuring just 24mm x 24mm x 3mm."+
                            "It requires a power supply of between 3.4V and 4.4V, and can be connected to a microcontroller using a UART interface with baud rates ranging from 1200bps to 115200bps."+
                            "The module features an LED status indicator that blinks at different rates depending on the module's state, making it easy to diagnose any issues with the device.\n"+
                            "It also has a range of pins for connecting external components, such as a microphone or speaker."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(16),
                    "MQ2 Gas Sensor",
                    "The MQ2 gas sensor is a widely used MOS (Metal Oxide Semiconductor) sensor that can detect various types of gases including LPG, Smoke, Alcohol, Propane, Hydrogen, Methane and Carbon Monoxide. It is often used in gas leakage detection devices in homes, industries, and automobiles.",
                    "https://nilambaraelectronics.com/wp-content/uploads/2020/10/MQ-2.jpg",
                    "https://lastminuteengineers.com/wp-content/uploads/arduino/Arduino-Wiring-MQ2-Gas-Sensor-Digital-Output.png",
                    List.of("K0011" ),
                    List.of("The MQ2 gas sensor operates on 5V DC and has four pins - VCC, GND, A0, and D0. To use the sensor, connect the VCC and GND pins to a 5V power supply and ground respectively. The A0 pin outputs an analog signal which can be connected to an analog input pin on a microcontroller such as Arduino. The D0 pin outputs a digital signal which can be connected to a digital input pin on a microcontroller."),
                    List.of("The MQ2 gas sensor has a sensing element made of Aluminum Oxide (Al2O3) based ceramic with a Tin Dioxide (SnO2) coating. When the SnO2 semiconductor layer is heated to a high temperature, oxygen is adsorbed on the surface. In the presence of reducing gases, the absorbed oxygen reacts with the gases, lowering the potential barrier and allowing current to flow through the sensor. The sensor also has a heating system composed of a Nickel-Chromium coil and an Aluminum Oxide-based ceramic which ensures that the sensor area is continuously heated to the working temperature."),
                    List.of("Can detect various types of gases including LPG, Smoke, Alcohol, Propane, Hydrogen, Methane and Carbon Monoxide."+
                            "Operates on 5V DC and consumes approximately 800mW."+
                            "Provides both analog and digital outputs."+
                            "Has a sensitivity adjustment potentiometer for the digital output.\n"+
                            "Includes power and status LEDs."),
                    List.of("Load resistance: 20K ohm"+
                            "Heater resistance: 33 ohm"+
                            "Sensing resistance: 10K ohm - 60K ohm"+
                            "Concentration range: 200 - 10000 ppm\n"+
                            "Preheat time: over 24 hours"),
                    List.of("S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(17),
                    "High Sensitivity Microphone sensor",
                    "The high sensitivity microphone sensor is an Arduino-compatible module that can detect sound intensity and output it as either a digital or analog signal. It features a sensitive microphone and a potentiometer that allows the user to adjust the sensitivity threshold of the module.",
                    "https://arduinomodules.info/wp-content/uploads/KY-037_high_sensitivity_sound_detection_module.jpg",
                    "https://osoyoo.com/wp-content/uploads/2017/07/circuit-sound-sensor-analog.jpg",
                    List.of("K0009" ),
                    List.of("The sensor has 4 pins that can be connected to an Arduino board. The VCC pin should be connected to the 5V pin on the Arduino, the GND pin to the ground pin, the D0 pin to any digital input pin on the Arduino, and the A0 pin to any analog input pin on the Arduino."),
                    List.of("The sensor has three functional components on its circuit board. The front sensor unit physically measures the environmental sound and outputs it as an analog signal to the second unit, the amplifier. This amplifier increases the signal depending on the resistance set on the rotary potentiometer and sends it to the analog output of the module. The third unit represents a comparator, which switches the digital output and the LED when the signal falls below a certain value. The value (and thus the sensitivity of the module) can be adjusted via the rotary potentiometer."),
                    List.of("Detect sound intensity"+
                            "Pair with SD Card to create a simple audio recorder"+
                            "Digital and analog output\n"+
                            "Sensitivity threshold can be adjusted via potentiometer"),
                    List.of("Sensitivity: Adjustable via trimpot"+
                            "Operating Voltage: 0-5.0V DC (Analog)"+
                            "Supply Voltage: 5.0V DC"+
                            "Additional Features: Digital Threshold Comparator"+
                            "Color: Red"+
                            "Material: PCB\n"+
                            "Dimensions: Length 43mm, Width 16mm, Height 13mm"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(18),
                    "High Voltage Relay Module",
                    "The high voltage relay module is an Arduino-compatible device that allows you to control high voltage devices with your Arduino. With the help of a relay, you can operate a device that uses 110V to 240V AC, using the 3.3V or 5V DC supplied by your Arduino.",
                    "https://anchor-electronics.com/wp-content/uploads/Switch-MateHV-sq.jpg",
                    "https://osoyoo.com/wp-content/uploads/2017/08/1channel-relay-fritzing-1.jpg",
                    List.of("K0006" ),
                    List.of("The low voltage side of the relay has three pins - GND, VCC, and S. These pins will connect to your Arduino board. The high voltage side of the relay has three screw terminals - NC, NO, and C. These terminals will connect to your high voltage device."),
                    List.of("A relay is an electrically operated switch. It allows a circuit of one voltage or current to be operated by a circuit of a different voltage or current. In the case of the high voltage relay module, the low voltage side of the relay is connected to your Arduino, and the high voltage side of the relay is connected to your high voltage device."),
                    List.of("The high voltage relay module comes with the following features:"+
                            "It is an Arduino-compatible device"+
                            "It allows you to control high voltage devices with your Arduino"+
                            "It comes with a pre-mounted relay and screw terminals for easy connection"+
                            "The low voltage side of the relay has three pins - GND, VCC, and S\n"+
                            "The high voltage side of the relay has three screw terminals - NC, NO, and C"),
                    List.of("There are various types of high voltage relay modules available in the market."+
                            "The one mentioned in this tutorial is a 5V relay module.\n"+
                            "It can handle up to 10A current and 250V AC voltage. The module comes with a pre-mounted SRD-05VDC-SL-C relay."),
                    List.of("S0001","S0002"))
            );

            component.add(new Component(
                    componentId.get(19),
                    "Humidity sensor",
                    "A humidity sensor is a device that detects and measures the relative humidity of the air or the amount of water vapor present in gas mixtures. It works by detecting changes that alter electrical current or temperature in the air.",
                    "https://etechrobot.com/wp-content/uploads/2021/04/ETR148-HumiditySensor.png",
                    "https://www.circuitbasics.com/wp-content/uploads/2015/10/Arduino-DHT11-Tutorial-3-Pin-DHT11-Wiring-Diagram.png",
                    List.of("K0001" ),
                    List.of("The VCC pin of the humidity sensor is connected to the 5V pin and the GND pin is connected to the GND. The signal pin is connected to the analog input port A0 on the microcontroller."),
                    List.of("There are three basic types of humidity sensors - capacitive, resistive, and thermal."+
                            "Capacitive humidity sensors measure the change in capacitance between two electrodes caused by the adsorption of water molecules."+
                            "Resistive humidity sensors measure the change in resistance of a material due to water absorption or desorption.\n"+
                            "Thermal humidity sensors measure the change in temperature of a surface caused by the evaporation or condensation of water."),
                    List.of("Humidity sensors have a range of features including measurement range, sensitivity, accuracy, response time, and stability.\n"+
                            "They can also have built-in temperature sensors and can operate over a range of temperatures and humidity levels."),
                    List.of("Humidity sensors have a range of measurement ranges, sensitivities, and accuracies. For example, a typical capacitive humidity sensor might have a measurement range of 0-100% RH, a sensitivity of 0.5% RH, and an accuracy of +/-2% RH.\n"+
                            "The response time and stability of a humidity sensor can also vary depending on the type and manufacturer."),
                    List.of("S0001","S0002","S0003"))
            );

            component.add(new Component(
                    componentId.get(20),
                    "Infrared(IR) Transmitter",
                    "Infrared (IR) communication systems are widely used in remote control applications. They typically consist of an IR transmitter and an IR receiver, which use an encoder and decoder to send and receive data. In this article, we'll take a closer look at the IR transmitter and receiver, the IR signal modulation technique, and the IR transmission protocols.",
                    "https://static-01.daraz.lk/p/dea411fc1633b22ffbdb89ea12addea0.jpg",
                    "https://arduinomodules.info/wp-content/uploads/Arduino_KY-005_Keyes_Infrared_transmitter_module_connection_diagram-1024x568.png",
                    List.of("K0001"),
                    List.of("To connect a breakout board mounted IR receiver to an Arduino, simply connect the VCC and GND pins to the corresponding pins on the Arduino.\n"+
                            "The OUT pin should be connected to an input pin on the Arduino."),
                    List.of("IR signal modulation is used to prevent ambient IR light noise from interfering with the IR signal. The modulated IR signal is a series of IR light pulses switched on and off at a high frequency known as the carrier frequency. The carrier frequency used by most transmitters is 38kHz, and the receiver diode has a band-pass filter to let through IR at that frequency. The IR transmission protocol defines the pattern in which the modulated IR signal is converted to binary. Each keypress on the remote generates a unique hexadecimal code, which the receiving microcontroller uses to decipher which key was pressed."),
                    List.of("IR transmitter produces light in the IR spectrum"+
                            "IR receiver converts IR light into an electrical signal"+
                            "IR signal modulation is used to prevent ambient IR light noise from interfering with the IR signal"+
                            "The carrier frequency used by most transmitters is 38kHz"+
                            "IR transmission protocol defines the pattern in which the modulated IR signal is converted to binary\n"+
                            "Each keypress on the remote generates a unique hexadecimal code"),
                    List.of("Most transmitters use a carrier frequency of 38kHz"+
                            "The NEC protocol is the most common type in Arduino projects\n"+
                            "Different remotes send different codes for keypresses"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(21),
                    "Joystick Module",
                    "The Joystick Module is a popular input device that is commonly used in retro gaming, robot control, and remote-controlled (RC) cars. The module has two potentiometers connected together, one for the vertical movement (Y-axis) and the other for the horizontal movement (X-axis), which work together to control the position of the joystick. Additionally, the joystick module also comes with a select switch that can be used to select different options.",
                    "https://digitalelectronics.lk/wp-content/uploads/2022/02/jt2.jpg",
                    "https://exploreembedded.com/wiki/images/5/5f/0_Joystick_with_Arduino_bb.png",
                    List.of("K0005"),
                    List.of("To use the joystick module with an Arduino board, you can connect the VRx pin to A0 and the VRy pin to A1 analog inputs, respectively. Additionally, the GND and +5V pins of the module need to be connected to the GND and +5V pins of the Arduino board."),
                    List.of("The joystick module consists of two potentiometers, one for the X-axis and the other for the Y-axis. These potentiometers work like voltage dividers and produce an output voltage that is proportional to the position of the joystick. The Arduino board, which has an analog-to-digital converter (ADC) with a resolution of 10 bits, reads these voltages and converts them into digital values that range from 0 to 1023. By reading these values, the Arduino board can determine the position of the joystick."),
                    List.of("The Joystick Module is a versatile input device that can be used for a wide range of applications. Some of its key features include:"+
                            "Two potentiometers for X and Y-axis control"+
                            "Select switch for different options"+
                            "Easy to use and connect to Arduino boards\n"+
                            "Provides accurate position control"),
                    List.of("The Joystick Module is a popular input device among hobbyists and makers."+
                            "It is widely available and affordable, making it accessible to anyone who wants to use it.\n"+
                            "Its ease of use and versatility have made it a popular choice for controlling robots, RC cars, and retro games."),
                    List.of("S0004"))
            );

            component.add(new Component(
                    componentId.get(22),
                    "Keypad",
                    "Keypads are a type of input device that allows users to enter data into a system by pressing buttons in a specific pattern. They are commonly used in security systems, door locks, and other applications that require user input. In this tutorial, we will discuss how to connect a keypad to an Arduino and how it works.",
                    "https://tronic.lk/assets/uploads/c42bb8acedc74b2f5ab27090a5a32e67.jpg",
                    "https://i1.wp.com/miliohm.com/wp-content/uploads/2021/12/Schematic-keypad.jpg?fit=2132%2C1576&ssl=1",
                    List.of("K0005"),
                    List.of("To connect the keypad to an Arduino, follow the circuit diagram shown above, depending on whether you have a 3X4 or 4X4 keypad. The rows and columns of the keypad are connected to digital pins on the Arduino board."),
                    List.of("When a button on the keypad is pressed, it closes the switch between a column and a row trace, allowing current to flow between a column pin and a row pin. The Arduino detects which button is pressed by detecting the row and column pin that's connected to the button. This is done by first setting all column pins to HIGH and all row pins to LOW. When a button is pressed, the column pin is pulled LOW, and the Arduino then switches each one of the row pins HIGH to detect which column pin returns to HIGH."),
                    List.of("The keypad is a low-cost and easy-to-use input device that can be integrated into a variety of projects.\n"+
                            "It provides a simple and intuitive way for users to enter data into a system without the need for a separate keyboard or other input device."),
                    List.of("There are many different types of keypads available, ranging from simple 3X4 and 4X4 keypads to more complex matrix keypads with a larger number of buttons.\n" +
                            "The cost and complexity of the keypad will depend on its size, the number of buttons, and the features it provides. Keypads are commonly used in a wide range of applications, from security systems and door locks to electronic projects and DIY devices."),
                    List.of("S0001"))
            );

            component.add(new Component(
                    componentId.get(23),
                    "Knock Sensor",
                    "A Knock Sensor or a Vibration Sensor is a simple electronic device that detects vibrations or shocks from tapping or knocking it. It is commonly used in automotive engines to detect engine knocking or detonation, but can also be used in other applications such as security systems or home automation.",
                    "https://www.bosch-motorsport.de/content/downloads/Raceparts/Images/jpg/69007627__Web.jpg",
                    "https://docs.arduino.cc/static/38a0a06c5017e61a7bac15556071f0c3/29114/circuit.png",
                    List.of("K0011" ),
                    List.of("To interface the Knock Sensor Module with an Arduino Uno, connect the GND pin to the GND pin on the Arduino, the +5V pin to the 5V pin on the Arduino, and the S pin to any digital input pin on the Arduino."),
                    List.of("The output pin of the sensor (connected to one end of the switch) is pulled HIGH with the help of a 10K ohm pull-up resistor. Under normal conditions, i.e. when there is no shock or vibration, the output of the Knock Sensor Module is HIGH. When the sensor detects any vibrations or knocks, the vibrating spring (i.e. switch) closes and the output of the sensor becomes LOW."),
                    List.of("Several types of Knock Sensors are available in the market, with the cheaper ones being called KY-031 Knock Sensors.\n"+
                            "They are small in size, easy to use, and can be used in a variety of applications."),
                    List.of("As a passive electronic device, the Knock Sensor Module does not consume much power and has a long lifespan.\n"+
                            "Its sensitivity can be adjusted using a potentiometer on the module, allowing it to detect different levels of vibration or shock."),
                    List.of("S0005"))
            );

            component.add(new Component(
                    componentId.get(24),
                    "Laser Module",
                    "A laser module is a device that emits a focused beam of coherent light. It is commonly used as a laser pointer, and is compatible with microcontrollers such as Arduino, Raspberry PI, and ESP32. The laser module consists of a laser diode and a lens or other optical element that focuses the beam.",
                    "https://tronic.lk/assets/uploads/c4e77429d74d721c72d0c28aca3c7b1b.jpg",
                    "https://electropeak.com/learn/wp-content/uploads/2021/01/5v-650nm-Laser-Head-Sensor-Module-circuit.jpg",
                    List.of("K0001","K0002" ),
                    List.of("Connect the signal pin (S) of the laser module to pin 13 on the Arduino and the ground (-) to GND. The middle pin on the module is not used. Here is the connection diagram."),
                    List.of("The laser diode is an electronic component that produces laser light through the process of stimulated emission. The emitted light is coherent and focused by a lens or other optical element. The laser module emits a dot-shaped, red laser beam."),
                    List.of("Operating voltage of 5V"+
                            "Output power of 5mW"+
                            "Wavelength of 650nm"+
                            "Operating current of <40mA"+
                            "Working temperature range of -10C to 40C\n"+
                            "Board dimensions of 18.5mm X 15mm"),
                    List.of("Operating Voltage: 5V"+
                            "Output Power: 5mW"+
                            "Wavelength: 650nm"+
                            "Operating Current: <40mA"+
                            "Working Temperature: -10C to 40C\n"+
                            "Board Dimensions: 18.5mm X 15mm"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(25),
                    "Liquid crystal displays (LCDs)",
                    "An LCD character display is a type of display that can output individual ASCII characters with fixed size. It consists of rectangular areas composed of a 5x8 pixel grid, with each pixel able to light up individually. The number of rectangular areas defines the size of the LCD, with the most popular being the 16x2 LCD.",
                    "https://www.mdpi.com/crystals/crystals-12-01672/article_deploy/html/images/crystals-12-01672-g001.png",
                    "https://docs.arduino.cc/static/7d7b6e99f40c7e55f2e9c6175c6db5b5/260cd/LCD_Base_bb_Fritz.png",
                    List.of("K0004" ),
                    List.of("The 16x2 LCD has 16 pins, with the first one being the ground pin and the second one being the VCC pin that connects to the 5V pin on the Arduino board. The V0 pin can be attached to a potentiometer for controlling the contrast of the display."+
                            "The RS pin is used for selecting whether to send commands or data to the LCD. The P/W pin selects the mode for reading or writing to the LCD, with the write mode being used for sending commands and data to the LCD.\n"+
                            "The E pin enables writing to the registers or the next 8 pins from D0 to D7. The last two pins, A and K, are for the LED backlight."),
                    List.of("The LCD character display consists of rectangular areas that compose a 5x8 pixel grid. Each pixel can light up individually, allowing the display of characters within each grid. The 16x2 LCD has two rows with 16 rectangular areas or characters.\n"+
                            "The RS pin selects whether to send commands or data to the LCD.The P/W pin selects the mode for reading or writing to the LCD, and the E pin enables writing to the registers or the next 8 pins from D0 to D7."),
                    List.of("Ability to output individual ASCII characters with fixed size"+
                            "Rectangular areas composed of a 5x8 pixel grid"+
                            "Popular sizes include 16x2, 16x4, 20x4"+
                            "Different background and text colors available\n"+
                            "Pinout includes 16 pins, with the first one being the ground pin and the second one being the VCC pin"),
                    List.of("Pinout: 16 pins"+
                            "Size: Popular sizes include 16x2, 16x4, 20x4"+
                            "Pixel grid: 5x8\n"+
                            "Contrast control: Through a potentiometer attached to the V0 pin"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(26),
                    "Load Cell Sensor",
                    "A load cell is a transducer capable of translating pressure or force into an electrical signal. Load cells are used to measure weight and can be found in various devices such as weighing machines, lifts, and cars. There are three types of load cells: hydraulic, pneumatic, and strain gauge based.",
                    "https://static-01.daraz.lk/p/ccc57f2eb5685e7a81bdf50263fdb238.jpg_750x750.jpg_.webp",
                    "https://europe1.discourse-cdn.com/arduino/original/4X/8/8/0/880be9cf6041077aa41d22b71ccfbbab684a7856.png",
                    List.of("K0011" ),
                    List.of("Load cells can be interfaced with an HX711 load cell amplifier module and an Arduino to measure weight."),
                    List.of("A strain gauge is a sensor that changes its resistance depending on the pressure exerted on it. Load cells based on strain gauges work by using the strain gauge to relate the force to an electrical signal (voltage) that can be measured. However, the resistance changes can be very small and require amplification. The Wheatstone bridge is a simple circuit that can detect these small variations in resistance."),
                    List.of("Load cells come in different materials, sizes, and mechanical configurations, which gives each load cell different sensitivities and maximum and minimum measuring capacities."),
                    List.of(" "),
                    List.of("S0001","S0002","S0003","S0004"))
            );

            component.add(new Component(
                    componentId.get(27),
                    "Logic Level Shifter",
                    "Logic level shifters are essential components for interfacing devices with different logic voltages. This tutorial aims to explain the basics of logic level shifting, the methods of implementing a level shifter, and the importance of using a level shifter to prevent damage to the devices.",
                    "https://europe1.discourse-cdn.com/arduino/optimized/4X/4/b/6/4b6b7d6497b4ebd673cfdf9286ab01169a32e241_2_500x500.jpeg",
                    "https://europe1.discourse-cdn.com/arduino/original/4X/4/3/1/431f4a8c4b64a31bbefecfe1727e5a4003541797.jpeg",
                    List.of("K0007" ),
                    List.of("To connect devices with different logic voltages, a level shifter circuit is required. There are several methods for implementing a level shifter, including a potential divider circuit and a bi-directional level shifter. The bi-directional level shifter is the recommended method for stable and reliable communication between devices."),
                    List.of("A level shifter circuit consists of MOSFETs and resistors. MOSFETs are used as switches to allow or block the flow of current between the devices. The resistors are used to adjust the voltage levels to the appropriate values."),
                    List.of("Using a level shifter provides the following features:"+

                            "Enables communication between devices with different logic voltages"+
                            "Prevents damage to the devices\n"+
                            "Provides stable and reliable communication between the devices"),
                    List.of("The level shifter circuit has been widely used in electronic projects and is essential for interfacing between devices with different logic voltages.\n"+
                            "It is a simple and cost-effective solution that can prevent damage to the devices and ensure stable communication."),
                    List.of("S0001","S0002","S0003"))
            );

            component.add(new Component(
                    componentId.get(28),
                    "MKR1000 Wifi Module",
                    "The MKR1000 Wi-Fi Module is an Arduino board designed to provide makers with a practical and cost-effective solution to add Wi-Fi connectivity to their projects. It has a powerful 32-bit processor, low power Wi-Fi with a Cryptochip for secure communication, and the ease of use of Arduino Software for code development and programming.",
                    "https://cdn11.bigcommerce.com/s-am5zt8xfow/images/stencil/1280x1280/products/1662/4021/api9jzufm__67315.1554992909.jpg?c=2",
                    "https://duino4projects.com/wp-content/uploads/2019/04/arduino-mkr1000-projects.jpg",
                    List.of("K0001" ),
                    List.of("The MKR1000 board can be connected to a circuit using a micro USB cable, which is used to connect the board to a computer. The board is shipped with male strip headers that are not mounted, allowing the user to adapt the board to their project by easily soldering them."),
                    List.of("The MKR1000 board includes a Li-Po charging circuit that allows it to run on battery power or external 5V, with automatic switching between the two sources. It runs at 3.3V and has a maximum voltage tolerance of 3.3V for its I/O pins, making it different from most Arduino boards. While output to 5V digital devices is possible, bidirectional communication with 5V devices requires proper level shifting. Li-Po batteries are charged at 4.2V with a current that is usually half of the nominal capacity (C/2), and the board is programmed with a charging time of 4 hours, after which it goes into automatic sleep mode."),
                    List.of("32-bit computational power"+
                            "Low power Wi-Fi with a Cryptochip for secure communication"+
                            "Ease of use of Arduino Software (IDE) for code development and programming"+
                            "Li-Po charging circuit for battery power or external 5V, with automatic switching"+
                            "8 digital I/O pins, 4 PWM digital I/O pins, 6 analog input pins, and 1 analog output pin"+
                            "256KB flash memory and 32KB SRAM\n"+
                            "Clock speed of 48MHz"),
                    List.of("In 2019, an estimated 3 billion Wi-Fi compatible devices were manufactured worldwide, which is approximately 0.4 devices per person per year."+
                            "The MKR1000 board is recommended to be used with a Li-Po battery of at least 700mAh capacity, as smaller cells may overheat, develop internal gasses, and explode, setting the surroundings on fire.\n"+
                            "The charging current for the specialized chip used in the board is 350mAh, and the chip is programmed with a maximum charging time of 4 hours, limiting the amount of charge to 1400mAh per charging round."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(29),
                    "MOSFET Module",
                    "The IRF520 MOSFET Driver Module is a PWM-based module that is used to control the speed of DC motors. It is a versatile and easy-to-use module that converts a constant input voltage to a variable voltage. By changing the voltage across the DC motor, the motor's speed can be controlled.",
                    "https://alphatronic.lk/wp-content/uploads/2020/09/IRF520-MOSFET-Driver-Module1.png",
                    "https://electropeak.com/learn/wp-content/uploads/2020/12/IRF520-MOSFET-Driver-Circuit-1.jpg",
                    List.of("K0007" ),
                    List.of("The IRF520 MOSFET Driver Module can be connected to a circuit in the following way:"+

                            "Connect the VCC pin to a 5V power supply."+
                            "Connect the GND pin to ground."+
                            "Connect the SIG pin to the PWM input signal."+
                            "Connect the Vin pin to the input voltage (between 5-24V).\n"+
                            "Connect the Out pin to the motor."),
                    List.of("The main component of the IRF520 MOSFET Driver Module is the IRF520 MOSFET (Metal-Oxide-Semiconductor Field-Effect Transistor). The MOSFET is a type of transistor that is commonly used to switch electronic signals. It works by controlling the flow of electrons through a channel that is formed by a voltage applied to a metal gate. In this module, the MOSFET is used as a switch to control the voltage applied to the DC motor. By using PWM, the module can control the duty cycle of the signal, which in turn controls the voltage applied to the motor."),
                    List.of("PWM-based DC motor speed control."+
                            "Converts constant input voltage to variable voltage."+
                            "Input voltage range: 5-24V."+
                            "Maximum current: 5A.\n"+
                            "Requires a heat sink for high currents."),
                    List.of("Maximum input voltage: 24V"+
                            "Maximum current: 5A"+
                            "PWM frequency: 5-20kHz\n"+
                            "Dimensions: 32mm x 22mm x 15mm"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(30),
                    "Magnetic Dry Reed Switch",
                    "The KY-021 Magnetic Reed Switch module is a switch that gets closed when exposed to a magnetic field, sending a digital signal. It is commonly used in mechanical systems as proximity sensors and is compatible with popular microcontrollers like Arduino, Raspberry Pi, and ESP32",
                    "https://m.media-amazon.com/images/I/71e-CJl5XZL._AC_UF1000,1000_QL80_.jpg",
                    "https://cdn.sparkfun.com/assets/learn_tutorials/5/1/9/example_circuit_bb-2.png",
                    List.of("K0010" ),
                    List.of("Connect the module's Power line (middle) and ground (-) to +5V and GND respectively. Connect signal (S) to pin 2 on the Arduino."),
                    List.of("This module consists of a small reed switch actuated by a magnetic field, a 10K ohms resistor, and 3 male header pins. When the switch is exposed to a magnetic field, it closes and completes the circuit, allowing current to flow through it. The 10K ohms resistor is used to limit the current through the switch and to protect it from damage."),
                    List.of("Normally open switch that gets closed when exposed to a magnetic field."+
                            "Digital output signal.\n"+
                            "Compatible with popular microcontrollers like Arduino, Raspberry Pi, and ESP32."),
                    List.of("Operating voltage: 3.3V~5V."+
                            "Output type: Digital.\n"+
                            "Board size: 18.5mm x 15mm."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(31),
                    "Metal Touch Sensor",
                    "The KY-036 metal touch sensor module is a simple and easy-to-use touch sensor that detects electrical conductivity. It is widely used in various applications such as touch screens, security systems, and power tools. This module has an on-board touch sensor, which consists of a potentiometer, six resistors, and two LEDs.",
                    "https://microchip.lk/wp-content/uploads/2019/10/A0066.jpg",
                    "https://arduinomodules.info/wp-content/uploads/Arduino_KY-036_metal_touch_sensor_connection_diagram-1024x690.png",
                    List.of("K0005" ),
                    List.of("The KY-036 touch sensor module can be easily interfaced with an Arduino or other microcontrollers. The module has four pins: digital signal, VCC +V, ground, and analog signal.\n"+
                            "The digital signal pin can be connected to a digital pin on the microcontroller, and the analog signal pin can be connected to an analog input pin. - The VCC +V pin should be connected to a 3.3V or 5V power supply, and the ground pin should be connected to the ground of the microcontroller"),
                    List.of("The KY-036 touch sensor module features a Darlington and PN transistor, which are controlled by an LM393 comparator IC that consists of two comparators. When the bar wire over the transistor is touched, the signal is controlled by the comparator. The 50Hz AC signal in a modern home or office is injected into a high-gain amplifier, and the output of this amplifier is connected to the comparator. The AC signal is then converted to a square wave. The sensitivity of the sensor can be adjusted by adjusting the trimmer."),
                    List.of("The KY-036 touch sensor module has the following features:"+

                            "Power supply: 3.3V or 5V"+
                            "Adjustable sensitivity"+
                            "Analog and digital "+
                            "Packaging: antistatic sealed bag"+
                            "Dimensions: 34x16 mm\n"+
                            "Built-in LEDs to indicate power and detection"),
                    List.of("The resistors used in the KY-036 touch sensor module are as follows:"+

                            "R1: 10 kΩ"+
                            "R2: 100 kΩ"+
                            "R3: 150 Ω"+
                            "R4: 1 kΩ"+
                            "R5: 1 kΩ"+
                            "R6: 100 kΩ"+

                            "The resistors are used to limit the current from burning the module. The LED L1 in the module lights up to show if the module is working properly, and the LED L2 lights up every time the sensor is touched.\n"+
                            "The sensor can be used in various applications such as touch screens, security systems, and power tools."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(32),
                    "Push Button Module",
                    "The push button module is an Arduino compatible sensor that allows you to control your Arduino project with the press of a button. It is a simple input device that can be used in a variety of projects.",
                    "https://www.circuittest.com/Media/400/push-04.jpg",
                    "https://arduinomodules.info/wp-content/uploads/Arduino_KY-004_Keyes_Key_Switch_module_connection-diagram-1024x507.png",
                    List.of("K0001" ),
                    List.of("To connect the push button module to an Arduino circuit, follow these steps:"+

                            "Connect the VCC pin to the 5V pin on the Arduino."+
                            "Connect the GND pin to the GND pin on the Arduino.\n"+
                            "Connect the OUT pin to any digital pin on the Arduino."),
                    List.of("The push button module consists of a simple push button switch that can be used to provide digital input to an Arduino. When the button is pressed, it connects the OUT pin to the GND pin, causing a digital signal of 0 to be sent to the connected digital pin on the Arduino. When the button is released, the connection is broken and a digital signal of 1 is sent to the connected digital pin."),
                    List.of("Push button switch suitable for Arduino projects"+
                            "Digital switch output (0 and 1)"+
                            "Compatible with a variety of Arduino boards\n"+
                            "Simple and easy to use"),
                    List.of("The push button module has a black PCB board and is made of high-quality PCB material."+
                            "It provides a digital switch output of 0 and 1, and can be connected to any digital pin on an Arduino board.\n"+
                            "The module is a simple and cost-effective solution for adding push button input to your Arduino projects."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(33),
                    "pH Sensor",
                    "A pH sensor is an essential instrument used to measure the quality of water, which is crucial for various applications. pH sensors can measure the acidity and alkalinity of water and other solutions, making them useful in monitoring water quality. In this article, we will discuss the working principle, types, and specifications of pH sensors.",
                    "https://alphatronic.lk/wp-content/uploads/2021/11/Liquid-Ph-Sensor1.png",
                    "https://europe1.discourse-cdn.com/arduino/original/4X/d/c/d/dcde6ee2c060c5a64749e93bd38cad122fef7f29.png",
                    List.of("K0011" ),
                    List.of("To connect a pH sensor to an Arduino module, a circuit diagram is shown."+
                            "The pH sensor is connected to the Arduino module through the signal conversion board.\n"+
                            "The pH sensor connector is connected to the sensor probe, pH limit setting, Analog reading Offsets, and six IO pins."),
                    List.of("The pH sensor works on the principle of ion exchange, where the hydrogen ions in the test solution exchange with positively charged ions on the glass bulb of the sensor. This creates an electrochemical potential across the bulb, which is measured by the electronic amplifier and transformed into pH units using the Nernst equation. The reference electrode is made of a metallic conductor that is insensitive to the pH of the solution, and a porous ceramic membrane allows the electrolyte solution to interact with the test solution."),
                    List.of("PH sensors can detect pH levels between 0 and 14 and are useful in assessing the quality of both soil and water."+
                            "There are different types of pH sensors available, including combination, differential, lab-grade, and process pH sensors.\n"+
                            "The specifications of a typical pH sensor include voltage, current, concentration range, temperature, response time, stability time, power consumption, size, and weight."),
                    List.of("Voltage: 5V"+
                            "Current: 5-10mA"+
                            "Concentration range: pH 0-14"+
                            "Temperature: 0-60 Degree Celsius"+
                            "Response time: <=5s"+
                            "Stability time: <=120s"+
                            "Power consumption: <=0.5W"+
                            "Size: 42mm X 32mm X 20mm\n"+
                            "Weight: 25g"),
                    List.of("S0005"))
            );

            component.add(new Component(
                    componentId.get(34),
                    "Photo Resistor Sensor",
                    "A photoresistor is a type of semiconductor device that changes its resistance as the light intensity in its surroundings changes. This sensor is used in a variety of applications, including automatic streetlights, cameras, and other electronic devices.",
                    "https://osoyoo.com/wp-content/uploads/2017/09/14.jpg",
                    "https://arduinomodules.info/wp-content/uploads/Arduino_KY-018_Keyes_photoresistor_module_connection_diagram-1024x552.png",
                    List.of("K0005" ),
                    List.of("To control an LED using a photoresistor, we need to set the threshold value in the microcontroller code to turn the LED on and off. The hardware assembly includes connecting the photoresistor with the analog pin A0 of the Arduino Uno and connecting the LED with the digital pin 5 of the Arduino Uno. The photoresistor is also connected to the 5V and Ground pins of the Arduino Uno."),
                    List.of("When the light intensity increases in the surroundings of the photoresistor, electrons in the valence shell break the bonds and become free electrons, creating holes and allowing the flow of electricity. The resistance of the resistor is high when the light intensity is low, and there is no current flow. However, when the light intensity increases, the current starts to flow, causing the resistance to decrease."),
                    List.of("The photoresistor is a simple and inexpensive sensor that is used to detect the presence of light. It is easy to interface with microcontrollers and is commonly used in various applications, including automatic lighting systems and light meters."),
                    List.of("The resistance value of a photoresistor typically ranges from a few hundred ohms to several megohms, depending on the intensity of light in its surroundings. They can be found in various sizes and shapes, such as round or square, and are available with different sensitivities to light."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(35),
                    "Position sensor",
                    "A position sensor is a device that detects and measures the physical position or displacement of an object. These sensors are used in a variety of applications where it is essential to monitor the movement, location, or alignment of objects or systems. Position sensors provide valuable data for control systems, automation, and feedback mechanisms. There are several types of position sensors, each designed for specific applications and measurement requirements.",
                    "https://www.semiconductorforu.com/wp-content/uploads/2022/07/position.jpg",
                    "https://www.electroniclinic.com/wp-content/uploads/2021/05/angle-sensor-with-arduino.jpg",
                    List.of("K0002" ),
                    List.of("Position sensors can be connected to a circuit in different ways depending on the specific sensor being used and the application it is being used for.\n"+
                            "In general, most position sensors will have at least two connections, which are typically power and ground. The output of the sensor may be analog or digital, depending on the type of sensor used. -Wiring a Linear Potentiometer Position Sensor A linear potentiometer position sensor is a type of variable resistor that changes resistance as the object being measured moves linearly."),
                    List.of("Linear Potentiometer Position Sensor Circuit Diagram"+
                            "Connect the GND pin on the linear potentiometer to the GND pin on the Arduino."+
                            "Connect the VCC pin on the linear potentiometer to the 5V pin on the Arduino."+
                            "Connect the wiper pin on the linear potentiometer to an analog input pin on the Arduino (e.g., A0)."+
                            "Add a 10k resistor between the wiper pin and the VCC pin on the potentiometer to create a voltage divider."+
                            "Upload the code to the Arduino that will read the analog voltage on the analog input pin and convert it to a position measurement.\n"+
                            "Wiring a Rotary Encoder Position Sensor A rotary encoder position sensor is a type of sensor that measures the rotation of an object."),
                    List.of("Rotary Encoder Position Sensor Circuit Diagram"+

                            "pin 1 = Vdd - 5v dc"+
                            "pin 2 = Ground"+
                            "pin 3 = _SS, is a 5v tolerant digital input"+
                            "pin 4 = SCLK, is a 5v tolerant digital input"+
                            "pin 5 = MOSI, is a 5v tolerant digital input/output"+
                            "pin 6 = Ground"+
                            "pin 7 = Vdig"+
                            "pin 8 = Ground"+
                            "note: pin 1 and pin 7 connect with Ground with capacitor. This is a basic circuit diagram and the actual connections may vary depending on the specific sensor being used and the application it is being used for.\n"+
                            "Always refer to the datasheet or manufacturer's instructions for the correct wiring and usage of the sensor."),
                    List.of(" "),
                    List.of("S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(36),
                    "Pulse Sensor",
                    "The Pulse Sensor is a simple and easy-to-use heart-rate sensor for Arduino. It can be clipped onto the earlobe or fingertip and measures the heart rate by detecting the changes in blood volume and capillary blood flow.",
                    "https://digitalelectronics.lk/wp-content/uploads/2022/02/Heart-rate-Sensor.jpg",
                    "https://lastminuteengineers.com/wp-content/uploads/arduino/Wiring-Connecting-Pulse-Sensor-with-Arduino.png",
                    List.of("K0001" ),
                    List.of("The Pulse Sensor operates from a 3.3 to 5.5V DC voltage supply. It has three pins - VCC, GND, and Signal. Connect the VCC pin to a 3.3V or 5V pin on the Arduino, the GND pin to a GND pin on the Arduino, and the Signal pin to the A0 pin on the Arduino."),
                    List.of("The Pulse Sensor works based on the photoplethysmography (PPG) technique, which measures the changes in blood volume by shining a light into the skin and detecting the amount of light absorbed or reflected by the blood vessels. The green LED in the Pulse Sensor illuminates the skin and the ambient light photosensor detects the changes in the reflected light. The MCP6001 Op-Amp IC and the R/C filter network amplify and filter the signal to obtain a clean and accurate heart rate measurement."),
                    List.of("Plug-and-play heart-rate sensor for Arduino"+
                            "Easy to use and clip onto the earlobe or fingertip"+
                            "Uses PPG technique to measure changes in blood volume and capillary blood flow"+
                            "Green LED illuminates the skin and ambient light photosensor adjusts brightness"+
                            "MCP6001 Op-Amp IC and R/C filter network amplify and filter the signal\n"+
                            "Works with a 3.3 to 5.5V DC voltage supply"),
                    List.of("The Pulse Sensor can measure heart rate (BPM) ranging from 30 to 250 beats per minute (BPM) with an accuracy of +/- 2 BPM."+
                            "The sampling rate is 500 Hz, and the resolution is 10 bits.\n"+
                            "The Pulse Sensor can be used in a wide range of applications, including fitness monitoring, health tracking, and biometric authentication"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(37),
                    "QR Reader",
                    "A QR code (Quick Response code) is a two-dimensional barcode that is capable of storing more data than traditional barcodes. A barcode scanner is used to read and decode the data stored in the barcode. The Maikrt Embedded QR code barcode scanning module is a small 1D/2D codes reader that can be embedded in any device for scanning code to identify other items.",
                    "https://i.ytimg.com/vi/hBErrpE2-ls/maxresdefault.jpg",
                    "https://how2electronics.com/wp-content/uploads/2021/11/Arduino-Barcode-QR-Code-Scanner-Reader.jpg",
                    List.of("K0008"),
                    List.of("The Maikrt Embedded QR code barcode scanning module can be interfaced with a microcontroller or a computer through its USB and TTL interfaces. The module has a 9 pin 4 wire terminal line that can be connected to a microcontroller. The red wire is the VCC (+5V) pin, black is the GND. The green and white wires are the TX and RX pins."),
                    List.of("The Maikrt Embedded QR code barcode scanning module consists of a lens, a source of light, and a light sensor that can translate optical impulses into electrical signals."+
                            "The module uses an intelligent image recognition algorithm for reading QR or Barcode data. It can easily capture barcodes 1D,2D on labels, paper and mobile phone or computer displays.\n"+
                            "The module has both USB and TTL interfaces for direct interfacing with a computer or a microcontroller."),
                    List.of("Small size and can be embedded in any device"+
                            "Uses intelligent image recognition algorithm for reading QR or Barcode data"+
                            "Can capture barcodes 1D,2D on labels, paper and mobile phone or computer displays"+
                            "Has both USB and TTL interfaces for direct interfacing with a computer or a microcontroller\n"+
                            "High sensitivity and accuracy"),
                    List.of(" "),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(38),
                    "RGB SMD Module",
                    "The KY-009 RGB Full color LED module is a compact and versatile device that allows you to emit a range of colors by mixing red, green, and blue light. The color of the LED can be adjusted using PWM and is compatible with popular electronics platforms like Arduino, Raspberry Pi, and ESP32.",
                    "https://arduinomodules.info/wp-content/uploads/KY-009_RGB_full_color_LED_SMD_arduino_module.jpg",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQOHQRJGRrHdnqbwV7pY_sfFbW76nzh-KWbSZQ_4rsdB8IDWUF2OroSfesjk3kn9iyXrU&usqp=CAU",
                    List.of("K0006" ),
                    List.of("To connect the KY-009 module to an Arduino circuit, follow these steps:"+

                            "Connect the red pin (R) to Pin 9 on the Arduino."+
                            "Connect the green pin (G) to Pin 10 on the Arduino."+
                            "Connect the blue pin (B) to Pin 11 on the Arduino."+
                            "Connect the ground pin (-) to GND on the Arduino."+
                            "Use resistors between the board and the Arduino to prevent LED burnout."+
                            "Refer to the following table for the recommended resistors to use"+

                            "KY-009	  Breadboard	        Arduino"+
                            "R	      180 ohm resistor	    Pin 9"+
                            "G	      110 ohm resistor	    Pin 10\n"+
                            "B	      110 ohm resistor	    Pin 11"),

                    List.of("The KY-009 module consists of a 5050 SMD LED that emits different colors by mixing red, green, and blue light. The color of the LED can be adjusted using PWM, which controls the brightness of each color component. By adjusting the duty cycle of each PWM signal, different colors can be generated."),
                    List.of("Compact and versatile module that can emit a range of colors"+
                            "Adjustable color using PWM"+
                            "Compatible with popular electronics platforms like - - Arduino, Raspberry Pi, and ESP32"+
                            "Consists of a 5050 SMD LED and 4 male header pins"+
                            "Operating voltage: 5V max, Red 1.8V2.4V, Green 2.8V3.6V, Blue 2.8V~3.6V"+
                            "Forward current: 20mA~30mA"+
                            "Operating temperature: -25C to 85C\n"+
                            "Board dimensions: 18.5mm x 15mm"),
                    List.of("The KY-009 module operates at a maximum voltage of 5V and requires a forward current of 20mA~30mA."+
                            "The module can operate in temperatures ranging from -25C to 85C and has a board size of 18.5mm x 15mm.\n"+
                            "Using the recommended resistors, the module can be safely connected to an Arduino circuit to prevent LED burnout."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(39),
                    "Rain Sensor",
                    "The rain sensor module is used to detect rainwater and is widely used in weather monitoring systems, smart irrigation systems, and home automation systems. It consists of a rain board module and a control board module that work together to detect and convert analog values to digital values.",
                    "https://static-01.daraz.lk/p/c701003eb1a99bb3ad2758739b6e55b9.jpg",
                    "https://circuitdigest.com/sites/default/files/inlineimages/u4/Rain-Detection-Sensor-with-Arduino.png",
                    List.of("K0001","K0002" ),
                    List.of("The rain board module is connected to the control board module, which is then connected to the Arduino board. The VCC and ground pins of the control board are connected to the 5V and ground pins of the Arduino, respectively. The D0 and A0 pins of the control board are connected to any digital and analog pins of the Arduino, respectively. The buzzer can be connected to any digital pin of the Arduino."),
                    List.of("The rain board module consists of two copper tracks that offer high resistance to the supply voltage under dry conditions. As the wetness on the board increases, the resistance gradually decreases, resulting in a decrease in the output voltage of the module. The control board module controls the sensitivity and converts the analog output to digital output. If the analog value is below the threshold value of the control board, the output is digital high."),
                    List.of("The rain sensor module is easy to use and provides accurate detection of rainwater."+
                            "It is small in size and can be easily integrated into any circuit.\n"+
                            "It requires minimal power and is compatible with a wide range of microcontrollers."),
                    List.of("The rain sensor module is widely used in weather monitoring systems, smart irrigation systems, and home automation systems."+
                            "It is a popular choice among hobbyists and DIY enthusiasts due to its low cost and ease of use.\n"+
                            "With its accurate detection of rainwater, the rain sensor module helps in conserving water and preventing floods in low-lying areas."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(40),
                    "Read Switch Module",
                    "The Mini Reed Switch Module is a mechanical switch that can be activated by a magnet when it is in proximity to the switch. It is commonly used in home security systems where it can detect when a window or door is opened.",
                    "https://arduinomodules.info/wp-content/uploads/KY-025_Reed_switch_module_arduino.jpg",
                    "https://arduinomodules.info/wp-content/uploads/Arduino_KY-025_Keyes_Reed_Switch_module_connection_diagram-1024x662.png",
                    List.of("K00011" ),
                    List.of("The GND pin of the module should be connected to the ground of the external circuit, and the 'S' output pin should be connected to an input pin of the microcontroller or other electronic device. The third unmarked pin in the center is connected to a 10K pull-up resistor, which can be tied to VCC or enabled as an internal pullup on the input pin."),
                    List.of("Reed switches are mechanical switches that are activated by a magnetic field. When a magnet is brought close to the glass envelope, the magnetic field pulls the metallic switch contacts together, closing the switch. This change in state can be detected by an MCU."),
                    List.of("The Mini Reed Switch Module is a single-pole single-throw (SPST) switch with normally open (NO) contacts."+
                            "The output is high when the switch is open and is grounded (low) when the contacts are closed.\n"+
                            "The module is small and easy to integrate into a variety of electronic projects."),
                    List.of("The module typically operates at a voltage of 5V and has a maximum current rating of 0.5A."+
                            "The pull-up resistor connected to the unmarked pin has a resistance of 10K ohms.\n"+
                            "The module is sensitive to magnetic fields and can detect the presence of a magnet from a distance of a few millimeters."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(41),
                    "Rotary Encoder Module",
                    "Rotary encoders are a type of position sensor that convert the angular position (rotation) of a knob into an output signal that can be used to determine which direction the knob is turned. There are two types of rotary encoders: absolute and incremental. Absolute encoders report the exact position of the knob in degrees, whereas incremental encoders report the number of increments the shaft has moved.",
                    "https://digitalelectronics.lk/wp-content/uploads/2022/02/Rotary-Encoder-Module-KY-040-Brick-Sensor.jpg",
                    "https://www.diyengineers.com/wp-content/uploads/2021/05/Rotary-Encoder-Connection-to-Arduino.png",
                    List.of("K0001","K0002" ),
                    List.of("The pinout of the rotary encoder module is as follows:"+

                            "GND is the ground connection."+
                            "VCC is the positive supply voltage, which is typically between 3.3 and 5V."+
                            "SW is the output of the push button switch (active low)."+
                            "When the knob is depressed, the voltage goes LOW."+
                            "DT (Output B) is similar to CLK output, but it lags behind CLK by a 90-degree phase shift. This output is used to determine the direction of rotation."+

                            "CLK (Output A) is the primary output pulse used to determine the amount of rotation. Each time the knob is turned in either direction by just one detent (click), the CLK output goes through one cycle of going HIGH and then LOW. To wire a rotary encoder to an Arduino, connect the following pins:"+

                            "Rotary Encoder CLK pin to Arduino Digital Pin 2"+
                            "Rotary Encoder DT pin to Arduino Digital Pin 3"+
                            "Rotary Encoder SW pin to Arduino Digital Pin 4"+
                            "Rotary Encoder + pin to Arduino 5V\n"+
                            "Rotary Encoder GND pin to Arduino GND"),
                    List.of("When you turn the knob, A and B make contact with common ground pin C in a specific order depending on which direction you turn the knob. When they make contact with common ground, two signals are 90 degrees out of phase because one pin makes contact with common ground before the other. This is referred to as quadrature encoding."+

                            "By monitoring when each pin connects or disconnects from ground, we can determine the direction in which the knob is being rotated. This can be accomplished by simply observing the state of B when A's state changes. When A changes state:"+
                            "If B!=A, then the knob is turned clockwise.\n"+
                            "If B=A, the knob is turned counterclockwise."),
                    List.of("Rotary encoders are the modern digital equivalent of potentiometers and are more versatile."+
                            "Rotary encoders can rotate 360 degrees without stopping, whereas potentiometers can only rotate 3/4 of the circle."+
                            "Potentiometers are used in situations where you need to know the exact position of the knob.\n"+
                            "Rotary encoders, on the other hand, are used in situations where you need to know the change in position rather than the exact position."),
                    List.of("We are surrounded by rotary encoders without even realizing it, as they are used in so many everyday items, from printers and cameras to CNC machines and robots.\n"+
                            "The most common application of a rotary encoder is the volume knob on a car radio."),
                    List.of("S0001"))
            );

            component.add(new Component(
                    componentId.get(42),
                    "Soil Moisture Sensor",
                    "This sensor measures the volumetric content of water in soil and gives us the moisture level.",
                    "https://digitalelectronics.lk/wp-content/uploads/2022/02/soil-moisture-sensor.jpg",
                    "https://media.geeksforgeeks.org/wp-content/uploads/20221120221715/SoilMoistureLevelCircuit.png"+"This sensor gives us both analog and digital output.",
                    List.of("K0001" ),
                    List.of("The soil moisture sensor consists of two probes that are used to measure the volumetric content of water."+
                            "When there is water, the soil will conduct more electricity,which means that there will be less resistance."+
                            "Dry soil conducts electricity poorly, so when there is less water,then the soil will conduct less electricity,which means that there will be more resistance.\n"+
                            "This sensor can be connected in analog and digital modes.First, we will connect it in analog mode,and then digital."),
                    List.of("The specifications of the FC-28 soil moisture sensor are as follows."+
                            "Input Voltage:3.3V to 5V"+
                            "Output Voltage:0 to 4.2V"+
                            "Output Current:35mA"+
                            "Output Signal:both analog and digital"),
                    List.of("The FC-28 soil moisture sensor has four pins." +
                            "VCC:power" +
                            "A0:Analog Output" +
                            "D0: Digital Output" +
                            "GND: Ground"+

                            "The module also contains a potentiometer,which will set the threshold value." +
                            "This threshold value will be compared by the LM393 comparator.\n" +
                            "The output LED will light up and down according to this threshold value."),
                    List.of(" "),
                    List.of("S0005"))
            );

            component.add(new Component(
                    componentId.get(43),
                    "Sound sensor",
                    "A Sound Sensor is an electronic device that detects sound waves in a particular area. The sensor uses a microphone to detect sound and sends the output to an op-amp, which amplifies the signal and converts it to a digital or analog output. The sound level set point can be adjusted using a potentiometer on the module.",
                    "https://alphatronic.lk/wp-content/uploads/2020/09/Sound-Sensor-Module-3-4-Pin1.png",
                    "https://content.instructables.com/FEB/JD9I/IUSLRPGM/FEBJD9IIUSLRPGM.jpg?auto=webp&fit=bounds&frame=1&width=1024",
                    List.of("K0009" ),
                    List.of("To connect a Sound Sensor to a circuit, you need to connect the following components:"+
                            "The VCC pin of the module to the positive (+) rail of the breadboard."+
                            "The GND pin of the module to the negative (-) rail of the breadboard."+
                            "The DOUT pin of the module to a digital input pin of the Arduino."+
                            "The AOUT pin of the module to an analog input pin of the Arduino."+
                            "The theory behind the components\n"+
                            "The microphone detects sound waves and converts them to an analog signal, which is fed into an op-amp for amplification and conversion to a digital or analog output. The potentiometer on the module allows you to adjust the sound level set point."),
                    List.of("Some of the key features of a Sound Sensor include:"+

                            "Detects sound waves in a particular area"+
                            "Converts the signal to a digital or analog output"+
                            "Adjustable sound level set point via a potentiometer"+
                            "Can be used for a variety of applications, such as turning lights on and off with clapping or detecting the presence of sound in an environment"),
                    List.of("Sound sensors are widely used in the fields of security, automation, and entertainment."+
                            "They can be used to detect and monitor sound levels in an environment, which can be useful in ensuring the safety and security of people and property.\n"+
                            "Sound sensors are also used in the entertainment industry for recording and amplifying sound."),
                    List.of(" "),
                    List.of("S0001","S0002","S0003"))
            );

            component.add(new Component(
                    componentId.get(44),
                    "Tilt Sensor",
                    "Tilt sensors are transducers that produce an electrical signal proportional to the degree of inclination with respect to one or more axes. These sensors play a critical role in several applications such as off-road vehicles, portable computers, robotics devices, aviation instruments, etc. One of the critical applications of tilt sensors is in the aviation industry, where they assist pilots in navigating through the obstacles during the flight.",
                    "https://nilambaraelectronics.com/wp-content/uploads/2019/09/HTB1vsEMgrsTMeJjy1zeq6AOCVXas.jpg",
                    "https://circuitdigest.com/sites/default/files/circuitdiagram_mic/Interfacing-circuit-diagram-of-Tilt-Sensor-with-Arduino.png",
                    List.of("K0002" ),
                    List.of("Tilt sensors are connected to a circuit using digital output pins. These pins produce an electrical signal that varies with the angular movement of the sensor. Tilt sensors are compatible with an operating voltage of 3.3V5V, and they have a sensitivity range of 1545 degrees."),
                    List.of("Tilt sensors consist of a rolling ball with a conductive plate beneath it. When the sensor is powered, the rolling ball falls to the bottom of the sensor to form an electrical connection. When the sensor is tilted, the rolling ball does not fall to the bottom, and the current cannot flow between the two end terminals of the sensor. Thus, the degree of tilt is directly proportional to the electrical output signal of the sensor."),
                    List.of("Tilt sensors produce an electrical signal proportional to the degree of inclination with respect to one or more axes." +
                            "These sensors are used to measure slope and tilt within a limited range of motion." +
                            "Tilt sensors are available in different types, such as force balance sensor, MEMS sensor, and fluid-filled sensor." +
                            "These sensors are compatible with an operating voltage of 3.3V5V, and they have a sensitivity range of 1545 degrees." +
                            "Applications of Tilt Sensor"+
                            "Cameras "+
                            "Video Cameras"+
                            "Aircraft Flight Control"+
                            "Construction Equipment"+
                            "Robotic Technology"+
                            "Automobile Air Bags"+
                            "Video Game "+
                            "Studying Human Movement"+
                            "Thermostats"+
                            "Automobile Security "),
                    List.of("I/O Pins	        Digital Output"+
                            "Length x Width	    30mm x 16mm"+
                            "Operating Voltage  3.3V~5V\n"+
                            "Sensitivity	    15~45 degrees"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(45),
                    "Touch Sensor",
                    "The TTP223B touch sensor module is a compact and low-cost sensor commonly used to detect touch and control devices. It works similar to a button and has a simple working principle.",
                    "https://www.heelectronicslk.com/wp-content/uploads/2021/11/Touch-Sensor-Module-HE2.jpg",
                    "https://arduinogetstarted.com/images/cover/arduino-touch-sensor.jpg",
                    List.of("K0001","K0002" ),
                    List.of("Connect the SIG pin to a digital pin of the Arduino board, the VCC pin to the power pin of the Arduino board (2.0-5.5V DC), and the GND pin to the GND of the Arduino board."),
                    List.of("The touch sensor uses a resistive touch technology, which consists of two conductive layers and a non-conductive layer. When pressure is applied to the surface, the outside conductive layer and the inner layer get in contact, producing changes in voltage. The change in capacitance is used to detect the touch. It is made up of an electrode film which is on top of a glass panel. The glass panel has a printed circuit pattern which is conductive in nature."),
                    List.of("The touch sensor is cost-efficient, compact, and consumes low power." +
                            "It can be easily integrated with microcontrollers to control devices in touch detection." +
                            "It goes into low power mode if no one touches the sensor for a few seconds."),
                    List.of("The touch sensor module has only three pins and supports 2.0-5.5V DC power supply." +
                            "It is commonly used in various electronic projects, including robotics, home automation, and interactive displays." +
                            "However, it requires proper pressure to detect touch."),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );

            component.add(new Component(
                    componentId.get(46),
                    "Tracking Sensor",
                    "The KY-033 Line Tracking Sensor is a simple device that tracks black lines against a white background or white lines against a black background. It is also known as a hunt sensor or line following sensor. This sensor uses IR technology to detect the lines and can be easily interfaced with microcontrollers like Arduino.",
                    "https://arduinomodules.info/wp-content/uploads/KY-033_line_tracking_sensor_module.jpg",
                    "https://www.electroniclinic.com/wp-content/uploads/2021/05/line-sensor-with-arduino-interfacig-ky-033-line-tracking-Sensor.jpg",
                    List.of("K0002" ),
                    List.of("To connect the KY-033 Line Tracking Sensor to a circuit, follow these steps:\n"+

                            "Connect the output pin of the sensor with digital pin 8 of the Arduino." +
                            "Connect the ground of the sensor with the ground of the Arduino." +
                            "Connect the VCC pin of the sensor with the 5V pin of the Arduino."),
                    List.of("The KY-033 Line Tracking Sensor consists of IR technology that uses a built-in receiver and transmitter to sense IR energy and detect the obstacle in front of the sensor module. The sensor returns the status of the IR light reflected from the surface." +
                            "When the sensor is on a black surface, all of the radiation that is transmitted gets absorbed by the surface, and nothing is reflected onto the sensor, resulting in a zero output signal. When it is on a white surface, all the radiation that is transmitted off the transmitter is being detected by the receiver, and then we get a positive signal or digital one." +
                            "The sensor has a knob that can be adjusted from one to three to adjust the sensitivity of the line tracking sensor."),
                    List.of("Some of the features of the KY-033 Line Tracking Sensor are:\n"+

                            "Working voltage: DC 3.3V-5V" +
                            "Working Current: >=20mA" +
                            "Operating Temperature: -10C~+50C" +
                            "Detection distance: 2-40cm" +
                            "IO interface: 3-Wire interfaces" +
                            "Output Signal: TTL level" +
                            "Adjustment: adjust multi-turn resistance." +
                            "Effective angle: 35`"),
                    List.of("The KY-033 Line Tracking Sensor has integrated onboard a line tracker, onboard built-in potentiometer which will be used to adjust the direction range, one micrometer, four resistors, and one LED. The potentiometer is used to calibrate the sensor. The sensor has very good ambient response even in complete darkness. The resistor R1 used in this module is 1.5K ohms, resistor R3 is 10K ohms, resistor R4 is 220 ohms, and resistor R5 is 10K ohms, and the main reason for using the resistor is to limit current circulating inside the module. The blue LED on the module blinks when the sensor detects an obstacle."),
                    List.of("S0003"))
            );

            component.add(new Component(
                    componentId.get(47),
                    "Two Color LED Module",
                    "The two color LED module is a light emitting diode that can emit two different colors of light, typically red and green. It is commonly used in electronic projects that require status indicators or display functions. In this module, the two LEDs are connected back to back, and their anodes are connected to separate pins. By controlling the voltage and duty cycle of each pin using PWM, you can create various colors and shades.",
                    "https://arduinomodules.info/wp-content/uploads/ky-011_two_color_led_module.jpg",
                    "https://arduinomodules.info/wp-content/uploads/Arduino_KY-029_Dual_color_LED_module_connection_diagram-1024x472.png",
                    List.of("K0006" ),
                    List.of("The two color LED module has three pins: GND, RED, and GREEN. The GND pin should be connected to the ground of the circuit. The RED and GREEN pins should be connected to two separate digital output pins of the microcontroller or Arduino board. Here is a wiring diagram for connecting the two color LED module to an Arduino Uno."),
                    List.of("The two color LED module is a type of light emitting diode, which is a semiconductor device that emits light when a voltage is applied. In this module, two LEDs of different colors are connected back to back, and their anodes are connected to separate pins. When a positive voltage is applied to the anode of one LED, it emits light of one color (e.g., green), and when the voltage is applied to the anode of the other LED, it emits light of the other color (e.g., red). By varying the voltage and duty cycle of each pin using PWM, you can control the intensity of each color and create various colors and shades."),
                    List.of("Two color LED module can emit two different colors of light, typically red and green" +
                            "Both LEDs are connected back to back, and their anodes are connected to separate pins" +
                            "Can be controlled using PWM to create various colors and shades" +
                            "Common cathode configuration"),
                    List.of("Operating Voltage: 2.0V - 2.5V" +
                            "Forward Current (Green): 20mA" +
                            "Forward Voltage (Green): 2.0V - 2.5V" +
                            "Forward Current (Red): 20mA" +
                            "Forward Voltage (Red): 2.0V - 2.5V" +
                            "Reverse Voltage: 5V" +
                            "Power Dissipation: 100mW" +
                            "Operating Temperature: -40°C to +80°C"),
                    List.of("S0001","S0005"))
            );

            component.add(new Component(
                    componentId.get(48),
                    "Ultrasonic Distance Sensor",
                    "The HC-SR04 ultrasonic distance sensor is a commonly used sensor for measuring distances from 2cm to 400cm (about an inch to 13 feet). It works based on the principle of sending and receiving ultrasonic sound waves, similar to SONAR used in submarines. The sensor is affordable, easy to use, and provides accurate distance measurements with a high resolution of 3mm.",
                    "https://thepihut.com/cdn/shop/products/ultrasonic-distance-sensor-hc-sr04-the-pi-hut-100284-1118255996_800x.jpg?v=1646101268",
                    "https://media.geeksforgeeks.org/wp-content/uploads/20221112194103/UltrasonicDistancecircuit.jpg",
                    List.of("K0001" ),
                    List.of("To connect the HC-SR04 ultrasonic distance sensor to an Arduino or other microcontroller, you need to connect the VCC and GND pins to the 5V and GND pins on the board respectively. You also need to connect the Trig and Echo pins to any digital input/output pins on the board."),
                    List.of("The HC-SR04 ultrasonic distance sensor works by sending an ultrasonic sound wave at a frequency of 40000Hz, which travels through the air and bounces back to the sensor when it encounters an obstacle or object. The sensor then calculates the distance based on the travel time of the sound wave and the speed of sound."),
                    List.of("The HC-SR04 ultrasonic distance sensor has the following features:\n"+

                            "Operating voltage: 5V DC" +
                            "Operating current: 15mA" +
                            "Operating frequency: 40kHz" +
                            "Minimum range: 2cm/1 inch" +
                            "Maximum range: 400cm/13 feet" +
                            "Accuracy: 3mm" +
                            "Measuring angle: 15 degrees" +
                            "Dimension: 45 x 20 x 15mm"),
                    List.of("The HC-SR04 ultrasonic distance sensor is a widely used sensor in robotics, automation, and other applications that require accurate distance measurements." +
                            "It is easy to use, affordable, and provides accurate measurements with a high resolution of 3mm."),
                    List.of("S0003","S0004"))
            );

            component.add(new Component(
                    componentId.get(49),
                    "Water Level Sensor",
                    "A water level sensor is a device used to detect and measure the water level in a tank or other container. It can be used in various applications, such as monitoring water levels in aquariums, controlling water pumps, or detecting flooding in a basement.",
                    "https://m.media-amazon.com/images/I/51djfksMBML._AC_UF1000,1000_QL80_.jpg",
                    "https://circuitdigest.com/sites/default/files/inlineimages/u4/Water-Level-Sensor-with-Arduino-UNO-Connection-Diagram.jpg",
                    List.of("K0001","K0002" ),
                    List.of("The water level sensor has three pins: VCC, GND, and S (signal). To connect it to an Arduino circuit, you need to connect the VCC pin to the 3.3V or 5V pin on the Arduino, the GND pin to the GND pin on the Arduino, and the S pin to an analog input pin on the Arduino. Here's an example wiring diagram."),
                    List.of("The water level sensor works by using interlaced copper traces to form a variable resistor. The resistance varies based on how much the traces are exposed to water. The more water the sensor is immersed in, the better the conductivity and the lower the resistance. The less water the sensor is immersed in, the poorer the conductivity and the higher the resistance. The sensor generates an output voltage proportional to the resistance, which can be measured by an Arduino or other microcontroller to determine the water level."),
                    List.of("10 exposed copper traces (5 power and 5 sense)" +
                            "Interlaced design with one sense trace between every two power traces" +
                            "Variable resistor design based on water immersion" +
                            "Analog output signal" +
                            "Can be powered from 3.3V to 5V"),
                    List.of("There are various types and models of water level sensors available on the market, with different features, specifications, and prices. Some common statistics that you may consider when choosing a water level sensor include:\n"+

                            "Input voltage range: 3.3V to 5V" +
                            "Output voltage range: 0V to VCC" +
                            "Sensitivity: typically around 20-200 mV per inch of water level change" +
                            "Accuracy: depends on the model and calibration, but usually within a few percent" +
                            "Response time: varies depending on the immersion depth and the design of the sensor, but usually within a few seconds to a few minutes" +
                            "Operating temperature range: depends on the model and the environment, but usually between -10°C to 85°C"),
                    List.of("S0001","S0002","S0003","S0004","S0005"))
            );


            for (int i = 0; i < component.size(); i++) {
                int finalI = i;
                repository.findByComponentId(componentId.get(i)).ifPresentOrElse(
                        value -> System.out.println("Component already exists "+ componentId.get(finalI)),
                        () -> repository.insert(component.get(finalI))
                );
            }
        };
    }
}