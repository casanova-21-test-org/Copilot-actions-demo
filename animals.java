class Animal {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    makeSound() {
        console.log("Generic animal sound");
    }
}

class Dog extends Animal {
    constructor(name, age) {
        super(name, age);
    }

    makeSound() {
        console.log("Woof!");
    }
}

class Cat extends Animal {
    constructor(name, age) {
        super(name, age);
    }

    makeSound() {
        console.log("Meow!");
    }
}

// Example usage:
const dog = new Dog("Buddy", 3);
dog.makeSound(); // Woof!

const cat = new Cat("Whiskers", 2);
cat.makeSound(); // Meow!