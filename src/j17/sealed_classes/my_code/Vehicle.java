package j17.sealed_classes.my_code;

sealed interface Driveable permits Vehicle {

}

public sealed class Vehicle implements Driveable permits Car, Motorcycle {

}

sealed class Car extends Vehicle permits Ford, Volvo {

}

final class Ford extends Car {

}

final class Volvo extends Car {

}

sealed class Motorcycle extends Vehicle permits Kawasaki, Honda, Aprilia { }

final class Kawasaki extends Motorcycle { }

final class Honda extends Motorcycle { }

final class Aprilia extends Motorcycle { }