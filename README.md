# dependency
A sample example of how dependency injection works

Visit the Car.kt file. Project was obviously written in Kotlin because I love the language

You will notice an Engine, which has two subclasses. Those are GasEngine and ElectricEngine. The idea is that a car requires an Engine. Any Engine, whether it's gas or electric. I can also make another type of engine. I can make 100 others, the Car class will still function fine. Here's why

Every engine I create must have Engine as its parent class. By doing that, I won't have to constantly create a new Car class like GasCar or ElectricCar or MagicCar. You get the idea. If I need 100 different cars, I would have to create 100 other Car classes, and that's a nightmare. Instead, I have one Car class, and you, the developer, inject whatever engine you like. The car has 2 functions: accelerate and brake. Just like in real life. I do not care what engine I use. When I press accelerate, I'd like to go faster, and when I press brake, I'd like to slow down. Simple. 

Another big plus is testing. This makes testing far easier because I can add in a mocked engine. I can make a FakeEngine class, and use that for testing. Lets suppose DI wasn't used. Testing would be harder because I can't mock the engine
