package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.external.BccIuser;
import com.xworkz.abstraction.external.Government;
import com.xworkz.abstraction.external.OperatingSystem;
import com.xworkz.abstraction.external.*;
import com.xworkz.abstraction.internal.*;

public class Runner {
    public static void main(String[] args) {
        Icc icc=new IndianCricketTeamIccImpl();
        BccIuser bcci=new BccIuser(icc);
        bcci.execute();
        System.out.println("****************************************");

        Constitution constitution=new CitizenConstituionImpl();
        Government government=new Government(constitution);
        government.execute();
        System.out.println("****************************************");

        Laptop laptop=new OSImpl();
        OperatingSystem os=new OperatingSystem(laptop);
        os.execute();
        System.out.println("****************************************");

        Television tv = new TelevisionImpl();
        TelevisionUser tvUser = new TelevisionUser(tv);
        tvUser.execute();
        System.out.println("****************************************");

        Refrigerator refrigerator = new RefrigeratorImpl();
        RefrigeratorUser refrigeratorUser = new RefrigeratorUser(refrigerator);
        refrigeratorUser.execute();
        System.out.println("****************************************");

        Microwave microwave = new MicrowaveImpl();
        MicrowaveUser microwaveUser = new MicrowaveUser(microwave);
        microwaveUser.execute();
        System.out.println("****************************************");

        WashingMachine washingMachine = new WashingMachineImpl();
        WashingMachineUser washingMachineUser = new WashingMachineUser(washingMachine);
        washingMachineUser.execute();
        System.out.println("****************************************");

        Appliance appliance = new ApplianceImpl();
        ApplianceUser applianceUser = new ApplianceUser(appliance);
        applianceUser.execute();
        System.out.println("****************************************");

        Smartphone smartphone = new SmartphoneImpl();
        SmartphoneUser smartphoneUser = new SmartphoneUser(smartphone);
        smartphoneUser.execute();
        System.out.println("****************************************");

        VacuumCleaner vacuumCleaner = new VacuumCleanerImpl();
        VacuumCleanerUser vacuumCleanerUser = new VacuumCleanerUser(vacuumCleaner);
        vacuumCleanerUser.execute();
        System.out.println("****************************************");

        AirConditioner airConditioner = new AirConditionerImpl();
        AirConditionerUser airConditionerUser = new AirConditionerUser(airConditioner);
        airConditionerUser.execute();
        System.out.println("****************************************");

        WaterHeater waterHeater = new WaterHeaterImpl();
        WaterHeaterUser waterHeaterUser = new WaterHeaterUser(waterHeater);
        waterHeaterUser.execute();
        System.out.println("****************************************");

        CoffeeMachine coffeeMachine = new CoffeeMachineImpl();
        CoffeeMachineUser coffeeMachineUser = new CoffeeMachineUser(coffeeMachine);
        coffeeMachineUser.execute();
        System.out.println("****************************************");

        Toaster toaster = new ToasterImpl();
        ToasterUser toasterUser = new ToasterUser(toaster);
        toasterUser.execute();
        System.out.println("****************************************");

        Blender blender = new BlenderImpl();
        BlenderUser blenderUser = new BlenderUser(blender);
        blenderUser.execute();
        System.out.println("****************************************");

        Fan fan = new FanImpl();
        FanUser fanUser = new FanUser(fan);
        fanUser.execute();
        System.out.println("****************************************");

        Printer printer = new PrinterImpl();
        PrinterUser printerUser = new PrinterUser(printer);
        printerUser.execute();
        System.out.println("****************************************");

        Router router = new RouterImpl();
        RouterUser routerUser = new RouterUser(router);
        routerUser.execute();
        System.out.println("****************************************");

        Speaker speaker = new SpeakerImpl();
        SpeakerUser speakerUser = new SpeakerUser(speaker);
        speakerUser.execute();
        System.out.println("****************************************");

        Projector projector = new ProjectorImpl();
        ProjectorUser projectorUser = new ProjectorUser(projector);
        projectorUser.execute();
        System.out.println("****************************************");

        Dishwasher dishwasher = new DishwasherImpl();
        DishwasherUser dishwasherUser = new DishwasherUser(dishwasher);
        dishwasherUser.execute();
        System.out.println("****************************************");

        HairDryer hairDryer = new HairDryerImpl();
        HairDryerUser hairDryerUser = new HairDryerUser(hairDryer);
        hairDryerUser.execute();
        System.out.println("****************************************");

        Iron iron = new IronImpl();
        IronUser ironUser = new IronUser(iron);
        ironUser.execute();
        System.out.println("****************************************");

        Clock clock = new ClockImpl();
        ClockUser clockUser = new ClockUser(clock);
        clockUser.execute();
        System.out.println("****************************************");

        Calculator calculator = new CalculatorImpl();
        CalculatorUser calculatorUser = new CalculatorUser(calculator);
        calculatorUser.execute();
        System.out.println("****************************************");

        Camera camera = new CameraImpl();
        CameraUser cameraUser = new CameraUser(camera);
        cameraUser.execute();
        System.out.println("****************************************");

        Monitor monitor = new MonitorImpl();
        MonitorUser monitorUser = new MonitorUser(monitor);
        monitorUser.execute();
        System.out.println("****************************************");

        Keyboard keyboard = new KeyboardImpl();
        KeyboardUser keyboardUser = new KeyboardUser(keyboard);
        keyboardUser.execute();
        System.out.println("****************************************");

        Mouse mouse = new MouseImpl();
        MouseUser mouseUser = new MouseUser(mouse);
        mouseUser.execute();
        System.out.println("****************************************");

        Tablet tablet = new TabletImpl();
        TabletUser tabletUser = new TabletUser(tablet);
        tabletUser.execute();
        System.out.println("****************************************");

        Drone drone = new DroneImpl();
        DroneUser droneUser = new DroneUser(drone);
        droneUser.execute();
        System.out.println("****************************************");

        Flashlight flashlight = new FlashlightImpl();
        FlashlightUser flashlightUser = new FlashlightUser(flashlight);
        flashlightUser.execute();
        System.out.println("****************************************");

        Thermostat thermostat = new ThermostatImpl();
        ThermostatUser thermostatUser = new ThermostatUser(thermostat);
        thermostatUser.execute();
        System.out.println("****************************************");

        SmartWatch smartWatch = new SmartWatchImpl();
        SmartWatchUser smartWatchUser = new SmartWatchUser(smartWatch);
        smartWatchUser.execute();
        System.out.println("****************************************");

        ElectricKettle electricKettle = new ElectricKettleImpl();
        ElectricKettleUser electricKettleUser = new ElectricKettleUser(electricKettle);
        electricKettleUser.execute();
        System.out.println("****************************************");

        Juicer juicer = new JuicerImpl();
        JuicerUser juicerUser = new JuicerUser(juicer);
        juicerUser.execute();
        System.out.println("****************************************");

        MixerGrinder mixerGrinder = new MixerGrinderImpl();
        MixerGrinderUser mixerGrinderUser = new MixerGrinderUser(mixerGrinder);
        mixerGrinderUser.execute();
        System.out.println("****************************************");

        DeepFreezer deepFreezer = new DeepFreezerImpl();
        DeepFreezerUser deepFreezerUser = new DeepFreezerUser(deepFreezer);
        deepFreezerUser.execute();
        System.out.println("****************************************");

        PowerBank powerBank = new PowerBankImpl();
        PowerBankUser powerBankUser = new PowerBankUser(powerBank);
        powerBankUser.execute();
        System.out.println("****************************************");

        GameConsole gameConsole = new GameConsoleImpl();
        GameConsoleUser gameConsoleUser = new GameConsoleUser(gameConsole);
        gameConsoleUser.execute();
        System.out.println("****************************************");

        Shaver shaver = new ShaverImpl();
        ShaverUser shaverUser = new ShaverUser(shaver);
        shaverUser.execute();
        System.out.println("****************************************");

        SmokeDetector smokeDetector = new SmokeDetectorImpl();
        SmokeDetectorUser smokeDetectorUser = new SmokeDetectorUser(smokeDetector);
        smokeDetectorUser.execute();
        System.out.println("****************************************");

        GPSNavigator gpsNavigator = new GPSNavigatorImpl();
        GPSNavigatorUser gpsNavigatorUser = new GPSNavigatorUser(gpsNavigator);
        gpsNavigatorUser.execute();
        System.out.println("****************************************");

        SecurityCamera securityCamera = new SecurityCameraImpl();
        SecurityCameraUser securityCameraUser = new SecurityCameraUser(securityCamera);
        securityCameraUser.execute();
        System.out.println("****************************************");

        Humidifier humidifier = new HumidifierImpl();
        HumidifierUser humidifierUser = new HumidifierUser(humidifier);
        humidifierUser.execute();
        System.out.println("****************************************");

        AirPurifier airPurifier = new AirPurifierImpl();
        AirPurifierUser airPurifierUser = new AirPurifierUser(airPurifier);
        airPurifierUser.execute();
        System.out.println("****************************************");

        SmartLock smartLock = new SmartLockImpl();
        SmartLockUser smartLockUser = new SmartLockUser(smartLock);
        smartLockUser.execute();
        System.out.println("****************************************");

        SmartBulb smartBulb = new SmartBulbImpl();
        SmartBulbUser smartBulbUser = new SmartBulbUser(smartBulb);
        smartBulbUser.execute();
        System.out.println("****************************************");

        SmartTV smartTV = new SmartTVImpl();
        SmartTVUser smartTVUser = new SmartTVUser(smartTV);
        smartTVUser.execute();
        System.out.println("****************************************");

        EReader eReader = new EReaderImpl();
        EReaderUser eReaderUser = new EReaderUser(eReader);
        eReaderUser.execute();
        System.out.println("****************************************");

        VRHeadset vrHeadset = new VRHeadsetImpl();
        VRHeadsetUser vrHeadsetUser = new VRHeadsetUser(vrHeadset);
        vrHeadsetUser.execute();
        System.out.println("****************************************");
    }
}
